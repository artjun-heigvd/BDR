package gg.jte.generated.precompiled;
import podweb.models.User;
import podweb.models.Badge;
import podweb.models.Playlist;
import java.util.ArrayList;
public final class JteuserGenerated {
	public static final String JTE_NAME = "user.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,10,10,13,13,15,15,15,17,19,19,19,19,19,19,20,20,20,23,26,28,28,31,31,31,32,32,32,33,33,33,36,36,40,44,45,45,48,48,48,49,49,49,52,52,56,56,56,57,57,57,5,6,7,8,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Object loggedUser, User user, ArrayList<Badge> badges, ArrayList<Playlist> playlists) {
		jteOutput.writeContent("\n");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n        <div class=\"container mx-auto my-8\">\n            <h1 class=\"text-3xl font-bold text-center mb-6\">");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(user.firstname);
				jteOutput.writeContent("'s Profile</h1>\n\n            ");
				jteOutput.writeContent("\n            <div class=\"user-info text-lg mb-6\">\n                <p><strong>User:</strong> ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.firstname);
				jteOutput.writeContent(" ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.lastname);
				jteOutput.writeContent("</p>\n                <p><strong>Registration Date:</strong> ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.registration_date());
				jteOutput.writeContent("</p>\n            </div>\n\n            ");
				jteOutput.writeContent("\n            <div class=\"user-badges mb-8\">\n                <h2 class=\"text-2xl font-semibold mb-4\">Badges</h2>\n                ");
				jteOutput.writeContent("\n                <div class=\"grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4\">\n                    ");
				for (Badge badge : badges) {
					jteOutput.writeContent("\n                        <div class=\"p-4 bg-white rounded-md shadow-md\">\n                            <div class=\"badge-info\">\n                                <h2 class=\"text-lg font-semibold\">");
					jteOutput.setContext("h2", null);
					jteOutput.writeUserContent(badge.name);
					jteOutput.writeContent("</h2>\n                                <p class=\"text-gray-600\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(badge.description);
					jteOutput.writeContent("</p>\n                                <p class=\"text-gray-600\">Points: ");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(badge.points);
					jteOutput.writeContent("</p>\n                            </div>\n                        </div>\n                    ");
				}
				jteOutput.writeContent("\n                </div>\n            </div>\n\n            ");
				jteOutput.writeContent("\n            <div class=\"user-playlists\">\n                <h2 class=\"text-2xl font-semibold mb-4\">Playlists</h2>\n                <ul class=\"space-y-4\">\n                    ");
				jteOutput.writeContent("\n                    ");
				for (Playlist playlist : playlists) {
					jteOutput.writeContent("\n                        <li class=\"p-4 bg-white rounded-md shadow-md\">\n                            <div class=\"playlist-info\">\n                                <h2 class=\"text-lg font-semibold\">");
					jteOutput.setContext("h2", null);
					jteOutput.writeUserContent(playlist.name);
					jteOutput.writeContent("</h2>\n                                <p class=\"text-gray-600\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(playlist.description);
					jteOutput.writeContent("</p>\n                            </div>\n                        </li>\n                    ");
				}
				jteOutput.writeContent("\n                </ul>\n            </div>\n        </div>\n    ");
			}
		}, loggedUser);
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Object loggedUser = (Object)params.get("loggedUser");
		User user = (User)params.get("user");
		ArrayList<Badge> badges = (ArrayList<Badge>)params.get("badges");
		ArrayList<Playlist> playlists = (ArrayList<Playlist>)params.get("playlists");
		render(jteOutput, jteHtmlInterceptor, loggedUser, user, badges, playlists);
	}
}
