package br.ufba.dcc.mestrado.computacao.ohloh.data.account;

import java.sql.Timestamp;

import br.ufba.dcc.mestrado.computacao.ohloh.data.kudoskore.OhLohKudoScore;
import br.ufba.dcc.mestrado.computacao.xstream.converters.NullableDoubleConverter;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter;

@XStreamAlias("account")
public class OhLohAccount {

	/**
	 * The unique ID for the Account.
	 */
	private String id;
	
	/**
	 * The public name for this Account.
	 */
	private String name;
	
	private String about;
	
	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("created_at")
	private Timestamp createdAt;
	
	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("updated_at")
	private Timestamp updatedAt;
	
	@XStreamAlias("homepage_url")
	private String homepageURL;
	
	@XStreamAlias("avatar_url")
	private String avatarURL;
	
	@XStreamAlias("email_sha1")
	private String emailSHA1;
	
	@XStreamAlias("posts_count")
	private Long postsCount;
	
	private String location;
	
	@XStreamAlias("country_code")
	private String countryCode;
	
	@XStreamConverter(value=NullableDoubleConverter.class)
	private Double latitude;
	
	@XStreamConverter(value=NullableDoubleConverter.class)
	private Double longitude;
	
	@XStreamAlias("kudo_score")
	private OhLohKudoScore ohLohKudoScore;
	
	private String url;
	
	@XStreamAlias("html_url")
	private String htmlURL;
	
	private String login;
	
	@XStreamAlias("twitter_account")
	private String twitterAccount;

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

	public String getHomepageURL() {
		return homepageURL;
	}

	public void setHomepageURL(String homepageURL) {
		this.homepageURL = homepageURL;
	}

	public String getAvatarURL() {
		return avatarURL;
	}

	public void setAvatarURL(String avatarURL) {
		this.avatarURL = avatarURL;
	}

	public String getEmailSHA1() {
		return emailSHA1;
	}

	public void setEmailSHA1(String emailSHA1) {
		this.emailSHA1 = emailSHA1;
	}

	public Long getPostsCount() {
		return postsCount;
	}

	public void setPostsCount(Long postsCount) {
		this.postsCount = postsCount;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public OhLohKudoScore getOhLohKudoScore() {
		return ohLohKudoScore;
	}

	public void setOhLohKudoScore(OhLohKudoScore ohLohKudoScore) {
		this.ohLohKudoScore = ohLohKudoScore;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTwitterAccount() {
		return twitterAccount;
	}

	public void setTwitterAccount(String twitterAccount) {
		this.twitterAccount = twitterAccount;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
	
	
}
