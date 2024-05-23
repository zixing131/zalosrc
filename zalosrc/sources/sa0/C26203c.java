package sa0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import vg.C28212v6;

/* renamed from: sa0.c */
/* loaded from: classes6.dex */
public class C26203c {

    /* renamed from: s */
    public Rect f124528s;

    /* renamed from: w */
    public C28212v6 f124532w;

    /* renamed from: a */
    public int f124510a = -2013265920;

    /* renamed from: b */
    public EnumC26202b f124511b = EnumC26202b.TOP;

    /* renamed from: c */
    public Drawable f124512c = null;

    /* renamed from: d */
    public int f124513d = 0;

    /* renamed from: e */
    public Drawable f124514e = null;

    /* renamed from: f */
    public String f124515f = "";

    /* renamed from: g */
    public String f124516g = "";

    /* renamed from: h */
    public int f124517h = -1;

    /* renamed from: i */
    public int f124518i = 18;

    /* renamed from: j */
    public int f124519j = 17;

    /* renamed from: k */
    public int f124520k = 0;

    /* renamed from: l */
    public int f124521l = 14;

    /* renamed from: m */
    public int f124522m = 3;

    /* renamed from: n */
    public boolean f124523n = false;

    /* renamed from: o */
    public View f124524o = null;

    /* renamed from: p */
    public int f124525p = 0;

    /* renamed from: q */
    public int f124526q = 0;

    /* renamed from: r */
    public boolean f124527r = false;

    /* renamed from: t */
    public boolean f124529t = true;

    /* renamed from: u */
    public EnumC26201a f124530u = EnumC26201a.RECTANGLE;

    /* renamed from: v */
    public View f124531v = null;

    /* renamed from: x */
    public boolean f124533x = true;

    /* renamed from: y */
    public boolean f124534y = true;

    /* renamed from: z */
    public boolean f124535z = true;

    /* renamed from: A */
    public boolean f124504A = false;

    /* renamed from: B */
    public boolean f124505B = false;

    /* renamed from: C */
    public boolean f124506C = false;

    /* renamed from: D */
    public EnumC26202b f124507D = null;

    /* renamed from: E */
    public int f124508E = 270;

    /* renamed from: F */
    public String f124509F = null;

    /* renamed from: a */
    public static C26203c m134769a(Context context) {
        C26203c c26203c = new C26203c();
        c26203c.f124510a = 0;
        c26203c.f124514e = AbstractC1388a.m6964f(context, AbstractC16803z.bubble_tooltip_bg);
        c26203c.f124512c = AbstractC1388a.m6964f(context, AbstractC16803z.bubble_tooltip_arrowup);
        c26203c.f124517h = -1;
        c26203c.f124518i = 16;
        c26203c.f124530u = EnumC26201a.NONE;
        return c26203c;
    }

    /* renamed from: b */
    public void m134770b(C28212v6 c28212v6, Context context) {
        if (c28212v6 != null) {
            this.f124515f = c28212v6.f131581g;
            this.f124516g = c28212v6.f131582h.toString();
            if (TextUtils.isEmpty(this.f124515f) && !TextUtils.isEmpty(c28212v6.f131583i)) {
                try {
                    int identifier = context.getResources().getIdentifier(c28212v6.f131583i, "string", context.getPackageName());
                    if (identifier != 0) {
                        this.f124515f = context.getResources().getString(identifier);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            this.f124532w = c28212v6;
            int i11 = c28212v6.f131590p;
            if (i11 == 0) {
                this.f124533x = true;
                this.f124534y = true;
                this.f124535z = true;
            } else if (i11 == 1) {
                this.f124533x = false;
                this.f124534y = false;
                this.f124535z = false;
            } else if (i11 == 2) {
                this.f124533x = true;
                this.f124534y = false;
                this.f124535z = false;
            } else if (i11 == 3) {
                this.f124533x = false;
                this.f124534y = false;
                this.f124535z = true;
                this.f124504A = true;
            }
            this.f124509F = c28212v6.f131577c;
        }
    }
}
