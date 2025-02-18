package gg.jte.generated.precompiled;
public final class JtemenuGenerated {
	public static final String JTE_NAME = "menu.jte";
	public static final int[] JTE_LINE_INFO = {5,5,5,5,5,5,5,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<div>\n    <a href=\"/\"><button>Podcasts</button></a>\n    <a href=\"/ranking\"><button>Ranking</button></a>\n    <a href=\"/search\"><button>Search</button></a>\n    <a href=\"/users\"><button>Users</button></a>\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
