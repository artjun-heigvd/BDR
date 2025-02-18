package gg.jte.generated.precompiled;
import podweb.models.Podcast;
import podweb.models.User;
import java.util.ArrayList;
public final class JtepodcastsGenerated {
	public static final String JTE_NAME = "podcasts.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,7,7,10,10,13,13,14,14,15,15,17,17,17,17,17,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Object loggedUser, ArrayList<Podcast> podcasts) {
		jteOutput.writeContent("\n    ");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1>Podcasts</h1>\n    <div class=\"flex flex-wrap\">\n        ");
				for (Podcast podcast : podcasts) {
					jteOutput.writeContent("\n        ");
					gg.jte.generated.precompiled.JtepodcastsquareGenerated.render(jteOutput, jteHtmlInterceptor, podcast, false);
					jteOutput.writeContent("\n        ");
				}
				jteOutput.writeContent("\n    </div>\n    ");
			}
		}, loggedUser);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Object loggedUser = (Object)params.get("loggedUser");
		ArrayList<Podcast> podcasts = (ArrayList<Podcast>)params.get("podcasts");
		render(jteOutput, jteHtmlInterceptor, loggedUser, podcasts);
	}
}
