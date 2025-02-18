package gg.jte.generated.precompiled;
import podweb.models.Podcast;
public final class JtepodcastsquareGenerated {
	public static final String JTE_NAME = "podcast-square.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,5,5,5,6,6,6,7,7,10,10,10,10,13,13,13,13,13,13,13,13,13,14,14,14,16,16,16,17,17,17,22,22,23,23,24,24,26,26,26,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Podcast podcast, boolean withDetails) {
		jteOutput.writeContent("\n");
		if (withDetails) {
			jteOutput.writeContent("\n<h2>");
			jteOutput.setContext("h2", null);
			jteOutput.writeUserContent(podcast.title);
			jteOutput.writeContent("</h2>\n");
		}
		jteOutput.writeContent("\n<div class=\"flex space-x-4\">\n\n    <a href=\"/podcasts/");
		jteOutput.setContext("a", "href");
		jteOutput.writeUserContent(podcast.id);
		jteOutput.setContext("a", null);
		jteOutput.writeContent("\" class=\"\">\n\n        <div class=\"mx-2 my-1 w-64 hover:bg-blue-100 p-1\">\n            <img");
		var __jte_html_attribute_0 = podcast.image;
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" src=\"");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" alt=\"\" class=\"w-full\">\n            <p class=\"font-bold line-clamp-1 mt-1 mb-2\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(podcast.title);
		jteOutput.writeContent("</p>\n            <div class=\"flex text-gray-600\">\n                <p class=\"flex-1\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(podcast.author);
		jteOutput.writeContent("</p>\n                <p class=\"\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(podcast.episodes_count);
		jteOutput.writeContent("</p>\n            </div>\n        </div>\n    </a>\n\n    ");
		if (withDetails) {
			jteOutput.writeContent("\n    <div class=\"mt-5 text-sm text-gray-800\">");
			jteOutput.writeUnsafeContent(podcast.description);
			jteOutput.writeContent("</div>\n    ");
		}
		jteOutput.writeContent("\n\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Podcast podcast = (Podcast)params.get("podcast");
		boolean withDetails = (boolean)params.get("withDetails");
		render(jteOutput, jteHtmlInterceptor, podcast, withDetails);
	}
}
