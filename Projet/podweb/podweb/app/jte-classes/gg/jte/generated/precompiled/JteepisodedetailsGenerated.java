package gg.jte.generated.precompiled;
import podweb.models.Episode;
import podweb.models.Podcast;
import podweb.models.User;
import podweb.models.Listen;
public final class JteepisodedetailsGenerated {
	public static final String JTE_NAME = "episode-details.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,12,12,12,12,12,13,13,13,13,13,13,13,13,13,13,13,13,15,15,21,21,21,23,23,25,29,29,29,31,31,31,31,32,39,39,39,39,40,49,49,50,50,53,53,53,53,58,58,58,58,83,83,83,83,89,89,89,89,89,89,89,89,89,101,101,114,114,114,5,6,7,8,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Episode episode, boolean withDetails, boolean logged, Listen listen) {
		jteOutput.writeContent("\n<div class=\"my-3\">\n    <div class=\"flex items-center\">\n        <a href=\"/episodes/");
		jteOutput.setContext("a", "href");
		jteOutput.writeUserContent(episode.id);
		jteOutput.setContext("a", null);
		jteOutput.writeContent("\" class=\"flex-1\">\n            <p class=\" font-bold my-2 text-2xl line-clamp-1 podcast-link-title\"");
		var __jte_html_attribute_0 = episode.title;
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" title=\"");
			jteOutput.setContext("p", "title");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("p", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(episode.title);
		jteOutput.writeContent("</p>\n        </a>\n        ");
		if (logged && listen != null) {
			jteOutput.writeContent("\n        <div class=\"flex mx-3 space-x-2 items-center text-lg font-bold\">\n            <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-10 h-10\">\n                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M21 12a9 9 0 1 1-18 0 9 9 0 0 1 18 0Z\" />\n                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15.91 11.672a.375.375 0 0 1 0 .656l-5.603 3.113a.375.375 0 0 1-.557-.328V8.887c0-.286.307-.466.557-.327l5.603 3.112Z\" />\n            </svg>\n            <span>");
			jteOutput.setContext("span", null);
			jteOutput.writeUserContent(listen.listening_count);
			jteOutput.writeContent("</span>\n        </div>\n        ");
		}
		jteOutput.writeContent("\n        <span class=\"flex items-center mr-2\">\n            ");
		jteOutput.writeContent("\n            <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-10 h-10 mr-2\">\n                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M12 6v6h4.5m4.5 0a9 9 0 1 1-18 0 9 9 0 0 1 18 0Z\" />\n              </svg>\n            <span class=\"font-bold text-lg\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent("   " + episode.duration());
		jteOutput.writeContent("</span>\n        </span>\n        <a href=\"/episodes/");
		jteOutput.setContext("a", "href");
		jteOutput.writeUserContent(episode.id);
		jteOutput.setContext("a", null);
		jteOutput.writeContent("/#play\" class=\"hover:bg-orange-300 rounded-sm p-1\">\n            ");
		jteOutput.writeContent("\n            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" fill=\"currentColor\" class=\"w-10 h-10\">\n                <path fill-rule=\"evenodd\"\n                    d=\"M4.5 5.653c0-1.427 1.529-2.33 2.779-1.643l11.54 6.347c1.295.712 1.295 2.573 0 3.286L7.28 19.99c-1.25.687-2.779-.217-2.779-1.643V5.653Z\"\n                    clip-rule=\"evenodd\" />\n            </svg>\n        </a>\n        <a href=\"/episodes/");
		jteOutput.setContext("a", "href");
		jteOutput.writeUserContent(episode.id);
		jteOutput.setContext("a", null);
		jteOutput.writeContent("\" class=\"hover:bg-blue-300 rounded-sm p-1\">\n            ");
		jteOutput.writeContent("\n            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" fill=\"currentColor\" class=\"w-10 h-10\">\n                <path fill-rule=\"evenodd\"\n                    d=\"M4.848 2.771A49.144 49.144 0 0 1 12 2.25c2.43 0 4.817.178 7.152.52 1.978.292 3.348 2.024 3.348 3.97v6.02c0 1.946-1.37 3.678-3.348 3.97a48.901 48.901 0 0 1-3.476.383.39.39 0 0 0-.297.17l-2.755 4.133a.75.75 0 0 1-1.248 0l-2.755-4.133a.39.39 0 0 0-.297-.17 48.9 48.9 0 0 1-3.476-.384c-1.978-.29-3.348-2.024-3.348-3.97V6.741c0-1.946 1.37-3.68 3.348-3.97ZM6.75 8.25a.75.75 0 0 1 .75-.75h9a.75.75 0 0 1 0 1.5h-9a.75.75 0 0 1-.75-.75Zm.75 2.25a.75.75 0 0 0 0 1.5H12a.75.75 0 0 0 0-1.5H7.5Z\"\n                    clip-rule=\"evenodd\" />\n            </svg>\n        </a>\n    </div>\n\n    <div class=\"text-gray-600 flex-1 block line-clamp-6\">");
		jteOutput.writeUnsafeContent(episode.description.replace("\\n", ""));
		jteOutput.writeContent("</div>\n    ");
		if (withDetails) {
			jteOutput.writeContent("\n        <div\n            x-data=\"{\n                eid: ");
			jteOutput.setContext("div", "x-data");
			jteOutput.writeUserContent( episode.id );
			jteOutput.setContext("div", null);
			jteOutput.writeContent(",\n                play: false,\n                progress: 0,\n                duration: 0,\n                latestProgress: 0,\n                logged: ");
			jteOutput.setContext("div", "x-data");
			jteOutput.writeUserContent(logged);
			jteOutput.setContext("div", null);
			jteOutput.writeContent(",\n                done: false,\n                sendProgress: () => {\n                    if ($data.logged == false || $data.latestProgress == $data.progress) return;\n                    fetch('/episodes/' + $data.eid + '/progression',\n                        {\n                            method: 'POST',\n                            body: 'progression='+ Math.floor($data.progress)\n                        }\n                    );\n                    $data.latestProgress = $data.progress;\n                },\n                saveProgress(e) {\n                    $data.progress = e.target.currentTime;\n                    if ($data.progress + 1 > $data.duration) {\n                        if ($data.done == false && $data.duration > 0){\n                            $data.sendProgress();\n                            $data.done = true;\n                        }\n                    } else {\n                        $data.done = false;\n                    }\n                },\n                setup() {\n                    setInterval($data.sendProgress, 1000 * 15);\n                    $refs.el.currentTime = ");
			jteOutput.setContext("div", "x-data");
			jteOutput.writeUserContent(listen != null ? listen.progression : 3);
			jteOutput.setContext("div", null);
			jteOutput.writeContent(" - 3;\n                    if ($refs.el.currentTime < 0) $refs.el.currentTime = 0;\n                }\n            }\"\n            x-init=\"setup()\"\n        >\n            <audio");
			var __jte_html_attribute_1 = episode.audio_url;
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" src=\"");
				jteOutput.setContext("audio", "src");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("audio", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent("\n                @play=\"play = true\" \n                @pause=\"play = false\" \n                @timeupdate=\"saveProgress($event)\" \n                preload=\"metadata\"\n                @seeked=\"sendProgress()\"\n                @durationchange=\"duration = $event.target.duration\"\n                controls\n                class=\"w-full my-3 border-blue-600 border rounded-md bg-blue-100\" x-ref=\"el\">\n            </audio>\n\n        </div>\n    ");
		}
		jteOutput.writeContent("\n</div>\n\n<style>\n    .podcast-link-title {\n        cursor: pointer;\n        margin-right: 1rem;\n    }\n\n    .podcast-link-title:hover {\n        color: blue;\n    }\n</style>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Episode episode = (Episode)params.get("episode");
		boolean withDetails = (boolean)params.getOrDefault("withDetails", false);
		boolean logged = (boolean)params.getOrDefault("logged", false);
		Listen listen = (Listen)params.getOrDefault("listen", null);
		render(jteOutput, jteHtmlInterceptor, episode, withDetails, logged, listen);
	}
}
