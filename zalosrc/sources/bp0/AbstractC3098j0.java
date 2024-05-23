package bp0;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import ho0.AbstractC20110a;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import zm.voip.service.AbstractC32273e3;

/* renamed from: bp0.j0 */
/* loaded from: classes7.dex */
public abstract class AbstractC3098j0 {
    /* renamed from: a */
    public static TextureViewRenderer m15578a(Context context, boolean z11, String str) {
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context, str);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        textureViewRenderer.setMirror(z11);
        return textureViewRenderer;
    }

    /* renamed from: b */
    public static void m15579b(View view) {
        if (view != null) {
            try {
                view.clearFocus();
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m15580c(TextureViewRenderer textureViewRenderer) {
        try {
            try {
                textureViewRenderer.init(AbstractC32273e3.m155748Q().m155829N().getEglBaseContext());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        } catch (Exception unused) {
            textureViewRenderer.release();
        }
    }
}
