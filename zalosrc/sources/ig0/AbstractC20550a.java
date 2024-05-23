package ig0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ig0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC20550a {
    /* renamed from: a */
    public static String m106804a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile("(?<=youtube.com/watch\\?v=|youtube.com/videos/|youtube.com/embed/|youtu.be/|youtube.com/v/|youtube-nocookie.com/v/|youtube.com/e/|youtube.com/watch\\?v%3D|youtube.com/watch\\?feature=player_embedded&v=)[^#\\&\\?\\n]*").matcher(str);
            if (!matcher.find()) {
                return null;
            }
            return matcher.group();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static void m106805b(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
