package com.mdh.core;

import org.apache.commons.net.ftp.FTPFile;
import org.springframework.integration.file.filters.FileListFilter;

import java.util.ArrayList;
import java.util.List;

public class FtpFilter implements FileListFilter<FTPFile> {
	List<FTPFile> result = new ArrayList<FTPFile>();

	public List<FTPFile> filterFiles(FTPFile[] files) {
		for (FTPFile file : files) {
			String name = file.getName();
			System.out.println(name);

			result.add(file);
		}

		return result;
	}
}
