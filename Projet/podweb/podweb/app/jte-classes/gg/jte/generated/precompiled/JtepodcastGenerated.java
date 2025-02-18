package gg.jte.generated.precompiled;
import podweb.models.Episode;
import podweb.models.Podcast;
import podweb.models.User;
import java.util.ArrayList;
public final class JtepodcastGenerated {
	public static final String JTE_NAME = "podcast.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,9,9,12,12,13,13,17,17,18,18,19,19,21,21,21,21,21,5,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Podcast podcast, Object loggedUser, ArrayList<Episode> episodes) {
		jteOutput.writeContent("\n    ");
		gg.jte.generated.precompiled.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    ");
				gg.jte.generated.precompiled.JtepodcastsquareGenerated.render(jteOutput, jteHtmlInterceptor, podcast, true);
				jteOutput.writeContent("\n\n    <h3 class=\"\">Episodes</h3>\n    <div class=\"\">\n        ");
				for (Episode episode : episodes) {
					jteOutput.writeContent("\n            ");
					gg.jte.generated.precompiled.JteepisodedetailsGenerated.render(jteOutput, jteHtmlInterceptor, episode, false, false, null);
					jteOutput.writeContent("\n        ");
				}
				jteOutput.writeContent("\n\n        ");
			}
		}, loggedUser);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Podcast podcast = (Podcast)params.get("podcast");
		Object loggedUser = (Object)params.get("loggedUser");
		ArrayList<Episode> episodes = (ArrayList<Episode>)params.get("episodes");
		render(jteOutput, jteHtmlInterceptor, podcast, loggedUser, episodes);
	}
}
