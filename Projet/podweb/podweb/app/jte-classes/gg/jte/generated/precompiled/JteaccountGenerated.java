package gg.jte.generated.precompiled;
import podweb.models.User;
public final class JteaccountGenerated {
	public static final String JTE_NAME = "account.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,5,5,5,6,6,8,8,11,11,12,12,12,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Object user) {
		jteOutput.writeContent("\n<div>\n    ");
		if (user instanceof User u) {
			jteOutput.writeContent("\n    <span class=\"text-lg mr-5 font-bold\">");
			jteOutput.writeUnsafeContent(u.link());
			jteOutput.writeContent("</span>\n    <a href=\"/logout\"><button>Logout</button></a>\n    ");
		} else {
			jteOutput.writeContent("\n    <div class=\"bg-red-200\"></div>\n    <a href=\"/login\"><button>Login</button></a>\n    ");
		}
		jteOutput.writeContent("\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Object user = (Object)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
