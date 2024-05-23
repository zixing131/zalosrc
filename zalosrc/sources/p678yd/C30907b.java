package p678yd;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: yd.b */
/* loaded from: classes3.dex */
public final class C30907b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final RenderScript f142535a;

    /* renamed from: yd.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C30907b(RenderScript renderScript) {
        AbstractC19074t.m100208f(renderScript, "rs");
        this.f142535a = renderScript;
    }

    /* renamed from: b */
    private final boolean m150159b(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config != Bitmap.Config.ALPHA_8 && config != Bitmap.Config.ARGB_4444 && config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Bad input bitmap type: ");
            sb2.append(config);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Bitmap m150160a(int i11, Bitmap bitmap) {
        AbstractC19074t.m100208f(bitmap, "original");
        if (!m150159b(bitmap)) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f142535a, bitmap);
        RenderScript renderScript = this.f142535a;
        AbstractC19074t.m100207e(createFromBitmap, "input");
        Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
        RenderScript renderScript2 = this.f142535a;
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript2, Element.U8_4(renderScript2));
        create.setRadius(i11);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(bitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        create.destroy();
        AbstractC19074t.m100207e(bitmap, "outputBitmap");
        return bitmap;
    }
}
