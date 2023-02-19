package bai13;

import java.util.Date;

public class Certificate {
	String certID;
	String certName;
	String certRank;
	String certDate;
	
	public Certificate(String certID, String certName, String certRank, String certDate) {
		this.certID = certID;
		this.certName = certName;
		this.certRank = certRank;
		this.certDate = certDate;
	}

	public String getCertID() {
		return certID;
	}

	public void setCertID(String certID) {
		this.certID = certID;
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertRank() {
		return certRank;
	}

	public void setCertRank(String certRank) {
		this.certRank = certRank;
	}

	public String getCertDate() {
		return certDate;
	}

	public void setCertDate(String certDate) {
		this.certDate = certDate;
	}
}
