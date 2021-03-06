package br.ufba.dcc.mestrado.computacao.ohloh.data.kudo;

import java.sql.Timestamp;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter;

@XStreamAlias("kudo")
public class OhLohKudo {

	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("created_at")
	private Timestamp createdAt;
	
	@XStreamAlias("sender_account_id")
	private String senderAccountId;
	
	@XStreamAlias("sender_account_name")
	private String senderAccountName;
	
	@XStreamAlias("receiver_account_id")
	private String receiverAccountId;
	
	@XStreamAlias("receiver_account_name")
	private String receiverAccountName;
	
	@XStreamAlias("project_id")
	private String projectId;
	
	@XStreamAlias("project_name")
	private String projectName;
	
	@XStreamAlias("contributor_id")
	private String contributorId;
	
	@XStreamAlias("contributor_name")
	private String contributorName;

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getSenderAccountId() {
		return senderAccountId;
	}

	public void setSenderAccountId(String senderAccountId) {
		this.senderAccountId = senderAccountId;
	}

	public String getSenderAccountName() {
		return senderAccountName;
	}

	public void setSenderAccountName(String senderAccountName) {
		this.senderAccountName = senderAccountName;
	}

	public String getReceiverAccountId() {
		return receiverAccountId;
	}

	public void setReceiverAccountId(String receiverAccountId) {
		this.receiverAccountId = receiverAccountId;
	}

	public String getReceiverAccountName() {
		return receiverAccountName;
	}

	public void setReceiverAccountName(String receiverAccountName) {
		this.receiverAccountName = receiverAccountName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getContributorId() {
		return contributorId;
	}

	public void setContributorId(String contributorId) {
		this.contributorId = contributorId;
	}

	public String getContributorName() {
		return contributorName;
	}

	public void setContributorName(String contributorName) {
		this.contributorName = contributorName;
	}
	
	
	
}
