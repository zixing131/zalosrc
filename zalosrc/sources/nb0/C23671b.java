package nb0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ib0.C20500d;
import me0.AbstractC23093i;

/* renamed from: nb0.b */
/* loaded from: classes6.dex */
public class C23671b extends MetricAffectingSpan {

    /* renamed from: B */
    public String f114663B;

    /* renamed from: C */
    public int f114664C;

    /* renamed from: D */
    Typeface f114665D;

    /* renamed from: E */
    C20500d.a f114666E;

    /* renamed from: p */
    public String f114667p;

    /* renamed from: r */
    public int f114669r;

    /* renamed from: s */
    public int f114670s;

    /* renamed from: u */
    boolean f114672u;

    /* renamed from: v */
    KeyEventCallbackC17462c f114673v;

    /* renamed from: w */
    int f114674w;

    /* renamed from: z */
    boolean f114677z;

    /* renamed from: q */
    public boolean f114668q = false;

    /* renamed from: t */
    public boolean f114671t = true;

    /* renamed from: x */
    int f114675x = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.bg_btn_postfeed_attachment);

    /* renamed from: y */
    int f114676y = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.transparent);

    /* renamed from: A */
    public boolean f114662A = false;

    public C23671b(int i11, String str, int i12, int i13, String str2, int i14, boolean z11, boolean z12) {
        Typeface typeface;
        int i15;
        this.f114667p = "";
        this.f114663B = str;
        this.f114664C = i11;
        this.f114669r = i12;
        this.f114670s = i13;
        this.f114667p = str2;
        this.f114674w = i14;
        this.f114677z = z11;
        if (C13778s1.m76960a()) {
            Context appContext = MainApplication.getAppContext();
            if (z12) {
                i15 = 9;
            } else {
                i15 = 5;
            }
            this.f114665D = C13718q1.m76694c(appContext, i15);
            return;
        }
        if (z12) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        this.f114665D = typeface;
    }

    /* renamed from: a */
    private static void m124001a(Paint paint, Typeface typeface) {
        int style;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            style = 0;
        } else {
            style = typeface2.getStyle();
        }
        int i11 = style & (~typeface.getStyle());
        if ((i11 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i11 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public void m124002b(Context context) {
        int i11 = this.f114664C;
        if (i11 != 1) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 3 && this.f114662A) {
                        C20500d.a aVar = this.f114666E;
                        if (aVar != null) {
                            aVar.mo70060f(this.f114663B);
                            return;
                        }
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f114663B));
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    try {
                        context.startActivity(intent);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
                C20500d.a aVar2 = this.f114666E;
                if (aVar2 != null) {
                    aVar2.mo80103a(this.f114663B);
                    return;
                }
                return;
            }
            C20500d.a aVar3 = this.f114666E;
            if (aVar3 != null) {
                aVar3.mo80168b(this.f114663B);
                return;
            }
            return;
        }
        C20500d.a aVar4 = this.f114666E;
        if (aVar4 != null) {
            aVar4.mo35612c(this.f114663B);
        }
    }

    /* renamed from: c */
    public void m124003c(Context context) {
        this.f114672u = true;
        if (!AbstractC23093i.m118471x()) {
            KeyEventCallbackC17462c m118462o = AbstractC23093i.m118462o(context, this.f114667p);
            this.f114673v = m118462o;
            if (m118462o != null) {
                m118462o.mo13822K();
            }
        }
        this.f114672u = false;
    }

    /* renamed from: d */
    public void m124004d(C20500d.a aVar) {
        this.f114666E = aVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i11;
        textPaint.setUnderlineText(this.f114677z);
        if (this.f114668q) {
            i11 = this.f114675x;
        } else {
            i11 = this.f114676y;
        }
        textPaint.bgColor = i11;
        textPaint.setColor(this.f114674w);
        m124001a(textPaint, this.f114665D);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m124001a(textPaint, this.f114665D);
    }
}
