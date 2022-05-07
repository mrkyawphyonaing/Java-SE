package com.eduraka;

import java.time.LocalDate;

public class Person {

		private String name;
		private int mark;
		private LocalDate checkDate;

		private String subject;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getMark() {
			return mark;
		}
		public void setMark(int mark) {
			this.mark = mark;
		}
		
		public LocalDate getCheckDate() {
			return checkDate;
		}
		public void setCheckDate(LocalDate checkDate) {
			this.checkDate = checkDate;
		}

		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
}
