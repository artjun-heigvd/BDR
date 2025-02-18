package gg.jte.generated.precompiled;
public final class JtecommentformGenerated {
	public static final String JTE_NAME = "comment-form.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,6,6,6,9,9,9,9,9,9,9,9,9,9,9,9,11,11,11,12,12,12,12,12,13,13,13,13,13,13,13,13,13,14,14,14,14,14,14,14,14,14,15,15,15,15,15,18,18,18,18,18,22,22,24,24,24,24,0,1,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Boolean respond, int episodeId, int shift, boolean logged, Integer parent_id) {
		jteOutput.writeContent("\n");
		var css = respond ? "mt-2 ml-4" : "mt-10";
		jteOutput.writeContent("\n\n\n<form class=\"");
		jteOutput.setContext("form", "class");
		jteOutput.writeUserContent(css);
		jteOutput.setContext("form", null);
		jteOutput.writeContent(" bg-slate-200 rounded-md p-2\" style=\"margin-left: ");
		jteOutput.setContext("form", "style");
		jteOutput.writeUserContent(shift);
		jteOutput.setContext("form", null);
		jteOutput.writeContent("px\" method=\"post\" action=\"/episodes/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(episodeId);
		jteOutput.setContext("form", null);
		jteOutput.writeContent("/comments\">\n    <div class=\"flex\">\n        <h4 type=\"text\" class=\"flex-1\">");
		jteOutput.setContext("h4", null);
		jteOutput.writeUserContent(respond ? "Respond to comment" : "Leave a comment");
		jteOutput.writeContent("</h4>\n        <input");
		var __jte_html_attribute_0 = !logged;
		if (__jte_html_attribute_0) {
		jteOutput.writeContent(" disabled");
		}
		jteOutput.writeContent(" type=\"number\" min=\"0\" max=\"5\" name=\"note\" class=\"w-16 mx-4 h-5\">\n        <input type=\"hidden\" name=\"episode_id\"");
		var __jte_html_attribute_1 = episodeId;
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n        <input type=\"hidden\" name=\"parent_id\"");
		var __jte_html_attribute_2 = parent_id;
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n        <button type=\"submit\"");
		var __jte_html_attribute_3 = !logged;
		if (__jte_html_attribute_3) {
		jteOutput.writeContent(" disabled");
		}
		jteOutput.writeContent(">Send</button>\n    </div>\n\n    <textarea name=\"content\"");
		var __jte_html_attribute_4 = !logged;
		if (__jte_html_attribute_4) {
		jteOutput.writeContent(" disabled");
		}
		jteOutput.writeContent(" type=\"text\" class=\"w-full p-1\" placeholder=\"Write a comment\"></textarea>\n    <br>\n</form>\n\n");
		if (logged == false) {
			jteOutput.writeContent("\n<span class=\"text-red-500\">Please login before commenting...</span>\n");
		}
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Boolean respond = (Boolean)params.getOrDefault("respond", false);
		int episodeId = (int)params.get("episodeId");
		int shift = (int)params.get("shift");
		boolean logged = (boolean)params.get("logged");
		Integer parent_id = (Integer)params.getOrDefault("parent_id", null);
		render(jteOutput, jteHtmlInterceptor, respond, episodeId, shift, logged, parent_id);
	}
}
