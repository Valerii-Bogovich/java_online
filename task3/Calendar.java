package by.epam.jonline.basics_of_oop.task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendar {
	private List<Date> dateList;
	
	

	public Calendar() {
		dateList = new ArrayList<Date>();
	}

	public Calendar(List<Date> dateList) {
		
		this.dateList = dateList;
	}
	
	
	
	public List<Date> getDateList() {
		return dateList;
	}

	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((dateList == null) ? 0 : dateList.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
	}
	



		public class Date {
			private int day;
			private int month;
			private int year;
			
			
			
			public Date() {
				day = 1;
				month = 1;
				year = 1;
			}
	
	
	
			public Date(int day, int month, int year) {
				
				this.day = day;
				this.month = month;
				this.year = year;
			}



			@Override
			public String toString() {
				return "Date : " + day + "."  + month + "."  + year + ".";
			}
			
			
			
		}
		
		public class Weekend extends Date {
			private boolean isFree = true;
		}
		
		public class Holiday extends Date {
			private boolean isFree = true;
		}
		
		public class WeekDay extends Date {
			private boolean isFree = false;
		}
		
	
	
	
}
