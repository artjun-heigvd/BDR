package gg.jte.generated.precompiled;
import podweb.models.Comment;
import podweb.models.Episode;
import podweb.models.User;
import podweb.models.Listen;
import java.util.ArrayList;
import java.util.Map;
public final class JteepisodeGenerated {
	public static final String JTE_NAME = "episode.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,7,7,7,14,14,14,16,19,19,20,20,22,22,22,23,23,25,25,28,28,30,30,31,31,32,32,33,33,34,34,34,34,36,36,36,36,36,38,38,45,45,47,54,54,55,55,55,55,56,56,56,56,63,63,66,66,66,69,69,72,72,74,74,75,75,75,75,75,7,8,9,10,11,12,12,12,12};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Map<Integer, User> authors, ArrayList<Comment> comments, Episode episode, Object loggedUser, Listen listen, Map<Integer, Integer> commentsLevelById) {
		jteOutput.writeContent("\n");
		var logged = loggedUser instanceof User;
		jteOutput.writeContent("\n\n");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n");
				gg.jte.generated.precompiled.JteepisodedetailsGenerated.render(jteOutput, jteHtmlInterceptor, episode, true, logged, listen);
				jteOutput.writeContent("\n\n<h2 class=\"mt-10\">Comments (");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(comments.size());
				jteOutput.writeContent(")</h2>\n");
				if (comments.isEmpty()) {
					jteOutput.writeContent("\n<div class=\"flex flex-wrap\">\n    <h4 class=\"text-blue-500\">");
					jteOutput.writeUnsafeContent("No comments here ! :-(");
					jteOutput.writeContent("</h4>\n</div>\n<br>\n");
				}
				jteOutput.writeContent("\n\n");
				var loggedUserId = logged ? ((User) loggedUser).id : -1;
				jteOutput.writeContent("\n");
				var PIXEL_SHIFT = 40;
				jteOutput.writeContent("\n");
				for (Comment c: comments) {
					jteOutput.writeContent("\n    ");
					var shift = PIXEL_SHIFT * (commentsLevelById.get(c.id) -1); 
					jteOutput.writeContent("\n    <div class=\"my-5\" style=\"margin-left: ");
					jteOutput.setContext("div", "style");
					jteOutput.writeUserContent(shift);
					jteOutput.setContext("div", null);
					jteOutput.writeContent("px\" x-data=\"{form: false}\">\n        <div class=\"flex items-center\">\n            <div class=\"flex-1 text-gray-600\">By ");
					jteOutput.writeUnsafeContent(authors.get(c.user_id).link());
					jteOutput.writeContent(" on ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(c.date());
					jteOutput.writeContent("</div>\n            <div class=\"text-gray-800 flex items-center\">\n                ");
					for (int i = 0; i < c.note; i++) {
						jteOutput.writeContent("\n                <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\"\n                    fill=\"currentColor\" class=\"w-6 h-6 text-blue-600\">\n                    <path fill-rule=\"evenodd\"\n                        d=\"M10.788 3.21c.448-1.077 1.976-1.077 2.424 0l2.082 5.006 5.404.434c1.164.093 1.636 1.545.749 2.305l-4.117 3.527 1.257 5.273c.271 1.136-.964 2.033-1.96 1.425L12 18.354 7.373 21.18c-.996.608-2.231-.29-1.96-1.425l1.257-5.273-4.117-3.527c-.887-.76-.415-2.212.749-2.305l5.404-.434 2.082-5.005Z\"\n                        clip-rule=\"evenodd\" />\n                </svg>\n                ");
					}
					jteOutput.writeContent("\n\n                ");
					jteOutput.writeContent("\n                <span @click=\"form = !form\" class=\"ml-4 hover:bg-blue-200 p-1\">\n                    <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" fill=\"currentColor\" class=\"w-6 h-6\">\n                        <path fill-rule=\"evenodd\" d=\"M9.53 2.47a.75.75 0 0 1 0 1.06L4.81 8.25H15a6.75 6.75 0 0 1 0 13.5h-3a.75.75 0 0 1 0-1.5h3a5.25 5.25 0 1 0 0-10.5H4.81l4.72 4.72a.75.75 0 1 1-1.06 1.06l-6-6a.75.75 0 0 1 0-1.06l6-6a.75.75 0 0 1 1.06 0Z\" clip-rule=\"evenodd\" />\n                      </svg>\n                </span>\n\n                ");
					if (logged && loggedUserId == c.user_id) {
						jteOutput.writeContent("\n                <form action=\"/comments/");
						jteOutput.setContext("form", "action");
						jteOutput.writeUserContent(c.id);
						jteOutput.setContext("form", null);
						jteOutput.writeContent("/delete\" method=\"post\">\n                    <button type=\"submit\" href=\"/comments/");
						jteOutput.setContext("button", "href");
						jteOutput.writeUserContent(c.id);
						jteOutput.setContext("button", null);
						jteOutput.writeContent("/delete\" class=\"ml-2 hover:bg-blue-200 p-1\">\n                        <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" fill=\"currentColor\" class=\"w-6 h-6\">\n                            <path fill-rule=\"evenodd\" d=\"M16.5 4.478v.227a48.816 48.816 0 0 1 3.878.512.75.75 0 1 1-.256 1.478l-.209-.035-1.005 13.07a3 3 0 0 1-2.991 2.77H8.084a3 3 0 0 1-2.991-2.77L4.087 6.66l-.209.035a.75.75 0 0 1-.256-1.478A48.567 48.567 0 0 1 7.5 4.705v-.227c0-1.564 1.213-2.9 2.816-2.951a52.662 52.662 0 0 1 3.369 0c1.603.051 2.815 1.387 2.815 2.951Zm-6.136-1.452a51.196 51.196 0 0 1 3.273 0C14.39 3.05 15 3.684 15 4.478v.113a49.488 49.488 0 0 0-6 0v-.113c0-.794.609-1.428 1.364-1.452Zm-.355 5.945a.75.75 0 1 0-1.5.058l.347 9a.75.75 0 1 0 1.499-.058l-.346-9Zm5.48.058a.75.75 0 1 0-1.498-.058l-.347 9a.75.75 0 0 0 1.5.058l.345-9Z\" clip-rule=\"evenodd\" />\n                            </svg>\n                    </button>\n                </form>\n\n                ");
					}
					jteOutput.writeContent("\n            </div>\n        </div>\n        <div class=\"my-2\">");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(c.content);
					jteOutput.writeContent("</div>\n    \n        <div x-show=\"form\">\n            ");
					gg.jte.generated.precompiled.JtecommentformGenerated.render(jteOutput, jteHtmlInterceptor, true, episode.id, PIXEL_SHIFT, logged, c.id);
					jteOutput.writeContent("\n        </div>\n    </div>\n");
				}
				jteOutput.writeContent("\n\n");
				gg.jte.generated.precompiled.JtecommentformGenerated.render(jteOutput, jteHtmlInterceptor, false, episode.id, 0, logged, null);
				jteOutput.writeContent("\n");
			}
		}, loggedUser);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Map<Integer, User> authors = (Map<Integer, User>)params.get("authors");
		ArrayList<Comment> comments = (ArrayList<Comment>)params.get("comments");
		Episode episode = (Episode)params.get("episode");
		Object loggedUser = (Object)params.get("loggedUser");
		Listen listen = (Listen)params.get("listen");
		Map<Integer, Integer> commentsLevelById = (Map<Integer, Integer>)params.get("commentsLevelById");
		render(jteOutput, jteHtmlInterceptor, authors, comments, episode, loggedUser, listen, commentsLevelById);
	}
}
