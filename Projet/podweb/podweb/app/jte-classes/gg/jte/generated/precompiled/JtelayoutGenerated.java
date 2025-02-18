package gg.jte.generated.precompiled;
import podweb.models.User;
import gg.jte.Content;
public final class JtelayoutGenerated {
	public static final String JTE_NAME = "layout.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,4,4,4,22,22,23,23,26,26,30,30,33,33,35,39,39,39,46,46,46,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, Object loggedUser) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"fr\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Podweb</title>\n    <link rel=\"stylesheet\" href=\"/out.css\">\n    <script defer src=\"https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js\"></script>\n</head>\n\n<body class=\"font-sans antialiased\">\n\n    <div class=\"min-h-screen bg-gray-100\">\n\n        ");
		jteOutput.writeContent("\n        ");
		if (true) {
			jteOutput.writeContent("\n        <header class=\"bg-white shadow flex\">\n            <div class=\"flex-1 max-w-7xl mx-auto py-6 px-4 sm:px-6 lg:px-8\">\n                ");
			gg.jte.generated.precompiled.JtemenuGenerated.render(jteOutput, jteHtmlInterceptor);
			jteOutput.writeContent("\n            </div>\n\n            <div class=\"max-w-7xl mx-auto py-6 px-4 sm:px-6 lg:px-8\">\n                ");
			gg.jte.generated.precompiled.JteaccountGenerated.render(jteOutput, jteHtmlInterceptor, loggedUser);
			jteOutput.writeContent("\n            </div>\n        </header>\n        ");
		}
		jteOutput.writeContent("\n\n        ");
		jteOutput.writeContent("\n        <main>\n            <div class=\"py-4 sm:py-8\">\n                <div class=\"max-w-7xl mx-auto px-2 sm:px-6 lg:px-8\">\n                    ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n                </div>\n            </div>\n        </main>\n    </div>\n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		Object loggedUser = (Object)params.get("loggedUser");
		render(jteOutput, jteHtmlInterceptor, content, loggedUser);
	}
}
