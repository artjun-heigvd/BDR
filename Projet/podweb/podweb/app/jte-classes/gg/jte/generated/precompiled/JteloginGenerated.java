package gg.jte.generated.precompiled;
import podweb.models.Episode;
import podweb.models.Podcast;
import podweb.models.User;
import java.util.ArrayList;
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,7,7,10,10,22,22,24,24,26,26,26,26,26,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, boolean error) {
		jteOutput.writeContent("\n");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n<div class=\"w-64 m-auto\">\n\n    <h1>Login</h1>\n    <form action=\"/login\" method=\"post\">\n        <label for=\"\">Email</label>\n        <input class=\"block my-3\" type=\"email\" name=\"email\">\n        <label for=\"\">Password</label>\n        <input class=\"block my-3\" type=\"password\" name=\"password\">\n        <button type=\"submit\">Submit</button>\n    </form>\n\n    ");
				if (error) {
					jteOutput.writeContent("\n    <p class=\"text-red-600\">Login error</p>\n    ");
				}
				jteOutput.writeContent("\n</div>\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		boolean error = (boolean)params.get("error");
		render(jteOutput, jteHtmlInterceptor, error);
	}
}
