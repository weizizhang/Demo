package com.example.app.demo.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	@DateTimeFormat(iso=ISO.DATE_TIME)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime t;

}
