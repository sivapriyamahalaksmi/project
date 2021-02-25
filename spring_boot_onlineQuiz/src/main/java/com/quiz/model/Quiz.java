package com.quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
		public String category;
		private String qa;
		private String aw1;
		private String aw2;
		private String aw3;
		private String aw4;
		private String res;
		
		public Quiz() {
			// TODO Auto-generated constructor stub
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getQa() {
			return qa;
		}
		public void setQa(String qa) {
			this.qa = qa;
		}
		public String getAw1() {
			return aw1;
		}
		public void setAw1(String aw1) {
			this.aw1 = aw1;
		}
		public String getAw2() {
			return aw2;
		}
		public void setAw2(String aw2) {
			this.aw2 = aw2;
		}
		public String getAw3() {
			return aw3;
		}
		public void setAw3(String aw3) {
			this.aw3 = aw3;
		}
		public String getAw4() {
			return aw4;
		}
		public void setAw4(String aw4) {
			this.aw4 = aw4;
		}
		public String getRes() {
			return res;
		}
		public void setRes(String res) {
			this.res = res;
		}
		@Override
		public String toString() {
			return "Quiz [category=" + category + ", qa=" + qa + ", aw1=" + aw1 + ", aw2=" + aw2 + ", aw3=" + aw3
					+ ", aw4=" + aw4 + ", res=" + res + "]";
		}
		public Quiz(String category, String qa, String aw1, String aw2, String aw3, String aw4, String res) {
			super();
			this.category = category;
			this.qa = qa;
			this.aw1 = aw1;
			this.aw2 = aw2;
			this.aw3 = aw3;
			this.aw4 = aw4;
			this.res = res;
		}
		public Quiz(String qa, String aw1, String aw2, String aw3, String aw4, String res) {
			super();
			this.qa = qa;
			this.aw1 = aw1;
			this.aw2 = aw2;
			this.aw3 = aw3;
			this.aw4 = aw4;
			this.res = res;
		}
		public Quiz(String qa, String aw1, String aw2, String aw3, String aw4) {
			super();
			this.qa = qa;
			this.aw1 = aw1;
			this.aw2 = aw2;
			this.aw3 = aw3;
			this.aw4 = aw4;
		}
		
		
		

}
