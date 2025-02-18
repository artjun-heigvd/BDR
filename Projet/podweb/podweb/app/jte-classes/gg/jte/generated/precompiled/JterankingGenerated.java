package gg.jte.generated.precompiled;
import podweb.models.RankedPodcast;
import java.util.ArrayList;
public final class JterankingGenerated {
	public static final String JTE_NAME = "ranking.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,6,6,9,9,14,14,17,17,17,17,19,19,19,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,24,24,24,25,25,25,27,27,27,32,32,36,36,36,110,110,110,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Object loggedUser, ArrayList<RankedPodcast> rankedPodcasts) {
		jteOutput.writeContent("\n");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"container mx-auto p-8\">\n        <h1 class=\"text-4xl font-bold text-center mb-12 text-gray-800\">Podcast Ranking</h1>\n        <div class=\"podcast-listing max-w-4xl mx-auto bg-white shadow-lg rounded-lg\">\n            <ul class=\"divide-y divide-gray-200\">\n                ");
				for (RankedPodcast podcast : rankedPodcasts) {
					jteOutput.writeContent("\n\n                    <li class=\"podcast-ranking flex items-center py-4 px-6 hover:bg-gray-50 transition-colors\">\n                        <a href=\"/podcasts/");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(podcast.id);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"\n                           class=\"flex items-center py-4 px-6 w-full h-full text-current no-underline\">\n                            <span class=\"rank text-2xl font-bold text-indigo-600 mr-4\">");
					jteOutput.setContext("span", null);
					jteOutput.writeUserContent(rankedPodcasts.indexOf(podcast) + 1);
					jteOutput.writeContent(".</span>\n                            <div class=\"podcast-image mr-6\">\n                                <img");
					var __jte_html_attribute_0 = podcast.image;
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
						jteOutput.writeContent(" src=\"");
						jteOutput.setContext("img", "src");
						jteOutput.writeUserContent(__jte_html_attribute_0);
						jteOutput.setContext("img", null);
						jteOutput.writeContent("\"");
					}
					var __jte_html_attribute_1 = podcast.title;
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
						jteOutput.writeContent(" alt=\"");
						jteOutput.setContext("img", "alt");
						jteOutput.writeUserContent(__jte_html_attribute_1);
						jteOutput.setContext("img", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(" class=\"rounded-full\">\n                            </div>\n                            <div class=\"podcast-info flex-grow\">\n                                <h4 class=\"text-xl font-semibold\">");
					jteOutput.setContext("h4", null);
					jteOutput.writeUserContent(podcast.title);
					jteOutput.writeContent("</h4>\n                                <p class=\"authors\">Authors: <span class=\"text-gray-600\">");
					jteOutput.setContext("span", null);
					jteOutput.writeUserContent(podcast.author);
					jteOutput.writeContent("</span></p>\n                                <p class=\"listenings\">Listenings: <span\n                                            class=\"text-gray-600\">");
					jteOutput.setContext("span", null);
					jteOutput.writeUserContent(podcast.listenings_total);
					jteOutput.writeContent("</span></p>\n                            </div>\n                        </a>\n                    </li>\n\n                ");
				}
				jteOutput.writeContent("\n            </ul>\n        </div>\n    </div>\n");
			}
		}, loggedUser);
		jteOutput.writeContent("\n<style>\n    body {\n        background-color: #f7fafc;\n        font-family: 'Helvetica', 'Arial', sans-serif;\n    }\n\n    .container {\n        box-sizing: border-box;\n    }\n\n    .podcast-listing {\n        overflow: hidden;\n    }\n\n    .podcast-ranking {\n        align-items: center;\n        transition: background-color 0.3s ease-in-out;\n    }\n\n    .podcast-ranking:hover {\n        background-color: #f9fafb;\n    }\n\n    .rank {\n        width: 30px;\n        color: #4f46e5;\n    }\n\n    .podcast-image {\n        flex-shrink: 0;\n        margin-right: 20px;\n    }\n\n    .podcast-image img {\n        width: 80px;\n        height: 80px;\n        object-fit: cover;\n    }\n\n    .podcast-info h4 {\n        color: #1a202c;\n        margin: 0 0 4px;\n    }\n\n    .podcast-info p {\n        margin: 0;\n        font-size: 0.875rem;\n    }\n\n    .authors span, .listenings span {\n        font-weight: 500;\n    }\n\n    .hover\\:bg-gray-50:hover {\n        background-color: #f9fafb;\n    }\n\n    .text-indigo-600 {\n        color: #4f46e5;\n    }\n\n    .text-gray-600 {\n        color: #4a5568;\n    }\n\n    .divide-y > li:not(:first-child) {\n        border-top: 1px solid #e2e8f0;\n    }\n\n    .divide-gray-200 > li {\n        border-color: #e2e8f0;\n    }\n</style>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Object loggedUser = (Object)params.get("loggedUser");
		ArrayList<RankedPodcast> rankedPodcasts = (ArrayList<RankedPodcast>)params.get("rankedPodcasts");
		render(jteOutput, jteHtmlInterceptor, loggedUser, rankedPodcasts);
	}
}
