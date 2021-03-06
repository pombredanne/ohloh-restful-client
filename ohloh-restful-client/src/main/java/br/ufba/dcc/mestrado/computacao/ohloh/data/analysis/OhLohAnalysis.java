package br.ufba.dcc.mestrado.computacao.ohloh.data.analysis;

import java.sql.Timestamp;
import java.util.List;

import br.ufba.dcc.mestrado.computacao.ohloh.data.factoid.OhLohFactoid;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ISO8601SqlTimestampConverter;

@XStreamAlias(OhLohAnalysis.NODE_NAME)
public class OhLohAnalysis  {

	public final static String NODE_NAME = "analysis";
	
	private String id;
	private String url;
	
	@XStreamAlias("project_id")
	private String projectId;
	
	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("updated_at")
	private Timestamp updatedAt;
	
	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("logged_at")
	private Timestamp loggedAt;

	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("min_month")
	private Timestamp minMonth;
	
	@XStreamConverter(value=ISO8601SqlTimestampConverter.class)
	@XStreamAlias("max_month")
	private Timestamp maxMonth;
	
	@XStreamAlias("twelve_month_contributor_count")
	private Integer twelveMonthContributorCount;
	
	@XStreamAlias("total_code_lines")
	private Integer totalCodeLines;
	
	@XStreamAlias("factoids")
	private List<OhLohFactoid> ohLohFactoids;
	
	@XStreamAlias("languages")
	private OhLohAnalysisLanguages ohLohAnalysisLanguages;
	
	@XStreamAlias("main_language_id")
	private Integer mainLanguageId;
	
	@XStreamAlias("main_language_name")
	private String mainLanguageName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Timestamp getLoggedAt() {
		return loggedAt;
	}

	public void setLoggedAt(Timestamp loggedAt) {
		this.loggedAt = loggedAt;
	}

	public Timestamp getMinMonth() {
		return minMonth;
	}

	public void setMinMonth(Timestamp minMonth) {
		this.minMonth = minMonth;
	}

	public Timestamp getMaxMonth() {
		return maxMonth;
	}

	public void setMaxMonth(Timestamp maxMonth) {
		this.maxMonth = maxMonth;
	}

	public Integer getTwelveMonthContributorCount() {
		return twelveMonthContributorCount;
	}

	public void setTwelveMonthContributorCount(Integer twelveMonthContributorCount) {
		this.twelveMonthContributorCount = twelveMonthContributorCount;
	}

	public Integer getTotalCodeLines() {
		return totalCodeLines;
	}

	public void setTotalCodeLines(Integer totalCodeLines) {
		this.totalCodeLines = totalCodeLines;
	}

	public List<OhLohFactoid> getFactoids() {
		return ohLohFactoids;
	}

	public void setFactoids(List<OhLohFactoid> ohLohFactoids) {
		this.ohLohFactoids = ohLohFactoids;
	}

	public Integer getMainLanguageId() {
		return mainLanguageId;
	}

	public void setMainLanguageId(Integer mainLanguageId) {
		this.mainLanguageId = mainLanguageId;
	}

	public String getMainLanguageName() {
		return mainLanguageName;
	}

	public void setMainLanguageName(String mainLanguageName) {
		this.mainLanguageName = mainLanguageName;
	}

	public OhLohAnalysisLanguages getLanguages() {
		return ohLohAnalysisLanguages;
	}

	public void setLanguages(OhLohAnalysisLanguages ohLohAnalysisLanguages) {
		this.ohLohAnalysisLanguages = ohLohAnalysisLanguages;
	}
	
	
}
