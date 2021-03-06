package com.mdh.core.member.service;

import junit.framework.TestSuite;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.io.File;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;

public class FtpOutboundChannelAdapterSample {

	private static final Logger LOGGER = LoggerFactory.getLogger(FtpOutboundChannelAdapterSample.class);

	private final File baseFolder = new File("target" + File.separator + "toSend");

	@Test
	public void runDemo() throws Exception{

		ConfigurableApplicationContext ctx =
				new ClassPathXmlApplicationContext("classpath:/spring/config/context-integration.xml");

		MessageChannel ftpChannel = ctx.getBean("ftpChannel", MessageChannel.class);

		baseFolder.mkdirs();

		final File fileToSendA = new File(baseFolder, "a.txt");
		final File fileToSendB = new File(baseFolder, "b.txt");

		final InputStream inputStreamA = FtpOutboundChannelAdapterSample.class.getResourceAsStream("/a.txt");
		final InputStream inputStreamB = FtpOutboundChannelAdapterSample.class.getResourceAsStream("/b.txt");

		FileUtils.copyInputStreamToFile(inputStreamA, fileToSendA);
		FileUtils.copyInputStreamToFile(inputStreamB, fileToSendB);

		assertTrue(fileToSendA.exists());
		assertTrue(fileToSendB.exists());

		final Message<File> messageA = MessageBuilder.withPayload(fileToSendA).build();
		final Message<File> messageB = MessageBuilder.withPayload(fileToSendB).build();

		ftpChannel.send(messageA);
		ftpChannel.send(messageB);

		Thread.sleep(2000);

		//assertTrue(new File(TestSuite.FTP_ROOT_DIR + File.separator + "a.txt").exists());
		//assertTrue(new File(TestSuite.FTP_ROOT_DIR + File.separator + "b.txt").exists());

		LOGGER.info("Successfully transferred file 'a.txt' and 'b.txt' to a remote FTP location.");
		ctx.close();
	}

	@After
	public void cleanup() {
		FileUtils.deleteQuietly(baseFolder);
	}
}
