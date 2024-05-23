package vg;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.zing.zalo.p077ui.widget.AbstractC13560a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import org.json.JSONObject;

/* renamed from: vg.z3 */
/* loaded from: classes3.dex */
public abstract class AbstractC28245z3 {

    /* renamed from: a */
    public static int f131681a = Integer.MAX_VALUE;

    /* renamed from: b */
    public static int f131682b = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m142218a(CharSequence charSequence, Drawable.Callback callback) {
        if (charSequence != null && (charSequence instanceof Spanned)) {
            Spanned spanned = (Spanned) charSequence;
            for (AbstractC13560a abstractC13560a : (AbstractC13560a[]) spanned.getSpans(0, spanned.length(), AbstractC13560a.class)) {
                if (abstractC13560a.getDrawable() != null && abstractC13560a.getDrawable().getCallback() == callback) {
                    abstractC13560a.mo76014e();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m142219b(CharSequence charSequence, Drawable.Callback callback) {
        if (charSequence != null && (charSequence instanceof Spanned)) {
            Spanned spanned = (Spanned) charSequence;
            for (AbstractC13560a abstractC13560a : (AbstractC13560a[]) spanned.getSpans(0, spanned.length(), AbstractC13560a.class)) {
                abstractC13560a.m76012c(callback);
                abstractC13560a.mo76013d();
            }
        }
    }

    /* renamed from: c */
    public static void m142220c(JSONObject jSONObject) {
        f131681a = jSONObject.optInt("playInMsg", Integer.MAX_VALUE);
        f131682b = jSONObject.optInt(ZMediaPlayer.OPTION_PLAYER_KEY_NUMBER_OF_LOOP, Integer.MAX_VALUE);
    }
}
