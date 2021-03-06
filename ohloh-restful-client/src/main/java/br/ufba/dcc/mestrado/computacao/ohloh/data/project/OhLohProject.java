package br.ufba.dcc.mestrado.computacao.ohloh.data.project;

import java.sql.Timestamp;
import java.util.List;

import br.ufba.dcc.mestrado.computacao.ohloh.data.analysis.OhLohAnalysis;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter;

@XStreamAlias(OhLohProject.NODE_NAME)
public class OhLohProject {

	public final static String NODE_NAME = "project";
	
	private String id;
	private String name;
	private String url;
	
	@XStreamAlias("html_url")
	private String htmlURL;
	
	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("created_at")
	private Timestamp createdAt;
	
	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("updated_at")
	private Timestamp updatedAt;
	
	private String description;
	
	@XStreamAlias("homepage_url")
	private String homepageURL;
	
	@XStreamAlias("download_url")
	private String downloadURL;
	
	@XStreamAlias("url_name")
	private String urlName;
	
	@XStreamAlias("medium_logo_url")
	private String mediumLogoURL;
	
	@XStreamAlias("small_logo_url")
	private String smallLogoURL;
	
	@XStreamAlias("user_count")
	private Integer userCount;
	
	@XStreamAlias("average_rating")
	private Double averageRating;

	@XStreamAlias("rating_count")
	private Integer ratingCount;
	
	@XStreamAlias("analysis_id")
	private Integer analysisId;
	
	private OhLohAnalysis analysis;
	
	@XStreamAlias("licenses")
	private List<OhLohLicense> ohLohLicenses;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHtmlURL() {
		return htmlURL;
	}

	public void setHtmlURL(String htmlURL) {
		this.htmlURL = htmlURL;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHomepageURL() {
		return homepageURL;
	}

	public void setHomepageURL(String homepageURL) {
		this.homepageURL = homepageURL;
	}

	public String getDownloadURL() {
		return downloadURL;
	}

	public void setDownloadURL(String downloadURL) {
		this.downloadURL = downloadURL;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getMediumLogoURL() {
		return mediumLogoURL;
	}

	public void setMediumLogoURL(String mediumLogoURL) {
		this.mediumLogoURL = mediumLogoURL;
	}

	public String getSmallLogoURL() {
		return smallLogoURL;
	}

	public void setSmallLogoURL(String smallLogoURL) {
		this.smallLogoURL = smallLogoURL;
	}

	public Integer getUserCount() {
		return userCount;
	}

	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Integer getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}

	public Integer getAnalysisId() {
		return analysisId;
	}

	public void setAnalysisId(Integer analysisId) {
		this.analysisId = analysisId;
	}

	public OhLohAnalysis getAnalysis() {
		return analysis;
	}

	public void setAnalysis(OhLohAnalysis analysis) {
		this.analysis = analysis;
	}

	public List<OhLohLicense> getOhLohLicenses() {
		return ohLohLicenses;
	}

	public void setOhLohLicenses(List<OhLohLicense> ohLohLicenses) {
		this.ohLohLicenses = ohLohLicenses;
	}
	
	
	
}
