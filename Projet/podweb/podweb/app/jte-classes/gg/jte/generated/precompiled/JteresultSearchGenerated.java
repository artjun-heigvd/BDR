package gg.jte.generated.precompiled;
import podweb.models.Episode;
import podweb.models.EpisodeSearch;
import java.util.ArrayList;
public final class JteresultSearchGenerated {
	public static final String JTE_NAME = "resultSearch.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,8,8,11,11,14,14,14,14,14,14,14,14,14,18,18,19,19,19,20,20,25,25,27,27,29,29,29,29,31,31,31,35,35,35,35,39,39,39,39,39,39,39,39,39,44,44,44,45,45,46,46,46,51,51,53,53,54,54,54,88,88,88,4,5,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Object loggedUser, ArrayList<EpisodeSearch> episodes, String query) {
		jteOutput.writeContent("\n");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1>Search</h1>\n    <form class=\"flex\" action=\"/search\" method=\"GET\">\n        <input");
				var __jte_html_attribute_0 = query;
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" name=\"q\" class=\"p-1 w-full flex-1\"\n               placeholder=\"Search in title, description and author texts!\">\n        <button type=\"submit\" class=\"ml-3\">Search</button>\n    </form>\n    ");
				if (episodes.isEmpty() && query != "") {
					jteOutput.writeContent("\n        <h4 class=\"\">");
					jteOutput.setContext("h4", null);
					jteOutput.writeUserContent("Aucun! Cherche autre chose!!!");
					jteOutput.writeContent("</h4>\n    ");
				} else if (!episodes.isEmpty()) {
					jteOutput.writeContent("\n\n        <h3 class=\"\">Episodes trouvés : </h3>\n        <br>\n        <div class=\"\">\n            ");
					for (EpisodeSearch episode : episodes) {
						jteOutput.writeContent("\n\n                ");
						gg.jte.generated.precompiled.JteepisodedetailsGenerated.render(jteOutput, jteHtmlInterceptor, episode, false, false, null);
						jteOutput.writeContent("\n\n                <a href=\"/podcasts/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(episode.podcast_id);
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">\n                    <h4>Information sur le podcast : <span\n                                class=\"text-blue-500 hover:text-blue-600 transition duration-200\">");
						jteOutput.setContext("span", null);
						jteOutput.writeUserContent(episode.podcast_title);
						jteOutput.writeContent("</span>\n                    </h4>\n                </a>\n                <div class=\"podcast-block\">\n                    <a href=\"/podcasts/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(episode.podcast_id);
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\" class=\"\">\n                    <div>\n\n\n                            <img");
						var __jte_html_attribute_1 = episode.podcast_image;
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
							jteOutput.writeContent(" src=\"");
							jteOutput.setContext("img", "src");
							jteOutput.writeUserContent(__jte_html_attribute_1);
							jteOutput.setContext("img", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" class=\"w-100 h-100\" alt=\"Image du podcast\">\n\n                    </div>\n                    </a>\n                    <div>\n                        <p class=\"text-xl font-bold\">");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(episode.podcast_title);
						jteOutput.writeContent("</p>\n                        <p class=\"text-justify\">");
						jteOutput.writeUnsafeContent(episode.podcast_description.replace("\\n", ""));
						jteOutput.writeContent("</p>\n                        <p class=\"text-sm\">");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(episode.podcast_author);
						jteOutput.writeContent("</p>\n                    </div>\n                </div>\n                <br>\n                <br>\n            ");
					}
					jteOutput.writeContent("\n        </div>\n    ");
				}
				jteOutput.writeContent("\n");
			}
		}, loggedUser);
		jteOutput.writeContent("\n\n<style>\n    .podcast-block {\n        background-color: #f2f2f2;\n        padding: 20px;\n        margin-bottom: 20px;\n        border: 1px solid #ccc;\n        border-radius: 10px;\n    }\n\n    .podcast-block:not(:last-child) {\n        margin-bottom: 0;\n    }\n\n    .podcast-block div {\n        display: flex;\n        flex-direction: column;\n        align-items: center;\n        justify-content: center;\n    }\n\n    .podcast-block img {\n        width: 100px;\n        height: 100px;\n        margin-bottom: 20px;\n        align-self: center;\n    }\n\n    .podcast-block p {\n        margin-bottom: 20px;\n    }\n\n\n</style>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Object loggedUser = (Object)params.get("loggedUser");
		ArrayList<EpisodeSearch> episodes = (ArrayList<EpisodeSearch>)params.get("episodes");
		String query = (String)params.get("query");
		render(jteOutput, jteHtmlInterceptor, loggedUser, episodes, query);
	}
}
