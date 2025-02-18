package gg.jte.generated.precompiled;
import podweb.models.Episode;
import podweb.models.EpisodeSearch;
import podweb.models.User;
import java.util.ArrayList;
public final class JteusersGenerated {
	public static final String JTE_NAME = "users.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,8,8,11,11,14,14,16,16,18,18,20,20,20,20,20,5,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ArrayList<User> users, Object loggedUser) {
		jteOutput.writeContent("\n");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1>Users of Podweb</h1>\n    <ul>\n        ");
				for (User user : users) {
					jteOutput.writeContent("\n        <li class=\"list-disc ml-3\">\n            ");
					jteOutput.writeUnsafeContent(user.link());
					jteOutput.writeContent("\n        </li>\n        ");
				}
				jteOutput.writeContent("\n    </ul>\n");
			}
		}, loggedUser);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ArrayList<User> users = (ArrayList<User>)params.get("users");
		Object loggedUser = (Object)params.get("loggedUser");
		render(jteOutput, jteHtmlInterceptor, users, loggedUser);
	}
}
