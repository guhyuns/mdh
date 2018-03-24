package com.mdh.core;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

public class TriggerJobLauncher {
	@Autowired(required = false)
	JobLauncher jobLauncher;

	public void launch(File file) throws Exception {
		System.out.println("test:" + file.getName());
	}
}
