package p1;

import java.util.Objects;

public class Review  {
	
	private String userName;
	private int point;
	private String comment;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Review(String userName, int point, String comment) {
		super();
		this.userName = userName;
		this.point = point;
		this.comment = comment;
	}








	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, point, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Review)
		{
			Review r = (Review)obj;
			boolean a = r.userName.equals(this.getUserName());
			boolean b = r.point==this.getPoint();
			boolean c = r.comment.equals(this.getComment());
			
			
			return a && b && c ;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Review [userName=" + userName + ", point=" + point + ", comment=" + comment + "]";
	}
	
	
	
	

}
