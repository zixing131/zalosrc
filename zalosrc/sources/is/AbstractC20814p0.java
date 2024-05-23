package is;

import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import ao.InterfaceC2259a;
import ao.InterfaceC2266h;
import ao.InterfaceC2267i;
import au.C2343e;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3013n3;
import bo.C3014o;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import bo.C3063z0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.C8289h1;
import com.zing.zalo.feed.components.C8362q0;
import com.zing.zalo.feed.components.C8406v1;
import com.zing.zalo.feed.components.FeedBackgroundView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.CustomTypefaceSpan;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10880s;
import com.zing.zalo.social.controls.C10884w;
import com.zing.zalo.social.controls.C10886y;
import com.zing.zalo.social.controls.C10887z;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.C20832y0;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kd0.C21693c;
import kd0.C21697g;
import l30.AbstractC22055v0;
import l80.C22122a0;
import l80.C22124b0;
import l80.C22126c0;
import me0.AbstractC23028c0;
import me0.AbstractC23093i;
import me0.AbstractC23118k2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23170p;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p248iy.AbstractC20887g;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p398oo.C24380u;
import p489rn.C25866f0;
import p588vw.C28652r;
import p615wn.C29105a;
import p716zh.C31839a6;
import p716zh.C31845ac;
import p716zh.C31877d;
import p716zh.C31890dc;
import p716zh.C32002l4;
import p716zh.C32049o6;
import p716zh.C32145v4;
import th.AbstractC26683d;
import ui0.C27280g;
import vg.AbstractC28236y3;
import vg.AbstractC28245z3;
import vg.C28100j3;

/* renamed from: is.p0 */
/* loaded from: classes4.dex */
public abstract class AbstractC20814p0 {

    /* renamed from: a */
    static KeyEventCallbackC17462c f102271a = null;

    /* renamed from: b */
    static Bitmap f102272b = null;

    /* renamed from: c */
    public static float f102273c = 0.6f;

    /* renamed from: is.p0$a */
    /* loaded from: classes4.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C3977j f102274l1;

        /* renamed from: m1 */
        final /* synthetic */ ImageView f102275m1;

        a(C3977j c3977j, ImageView imageView) {
            this.f102274l1 = c3977j;
            this.f102275m1 = imageView;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            try {
                if (c3979l.m18839c() != null) {
                    this.f102274l1.setImageInfo(c3979l, false);
                    this.f102275m1.setImageBitmap(c3979l.m18839c());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: is.p0$b */
    /* loaded from: classes4.dex */
    public class b extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ C3020p0 f102276c;

        b(C3020p0 c3020p0) {
            this.f102276c = c3020p0;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            int i11;
            super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            if (this.f102276c.f12058q == 108) {
                i11 = 500066;
            } else {
                i11 = 0;
            }
            if (c3979l != null && c23995f != null && i11 != 0) {
                AbstractC20887g.m109247y(i11, 0L, 0L, c23995f.m125661l());
            }
        }
    }

    /* renamed from: is.p0$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ WeakReference f102277a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f102278b;

        /* renamed from: c */
        final /* synthetic */ C3020p0 f102279c;

        /* renamed from: d */
        final /* synthetic */ boolean f102280d;

        /* renamed from: e */
        final /* synthetic */ String f102281e;

        /* renamed from: f */
        final /* synthetic */ View f102282f;

        /* renamed from: g */
        final /* synthetic */ Context f102283g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC2266h f102284h;

        /* renamed from: i */
        final /* synthetic */ int f102285i;

        c(WeakReference weakReference, WeakReference weakReference2, C3020p0 c3020p0, boolean z11, String str, View view, Context context, InterfaceC2266h interfaceC2266h, int i11) {
            this.f102277a = weakReference;
            this.f102278b = weakReference2;
            this.f102279c = c3020p0;
            this.f102280d = z11;
            this.f102281e = str;
            this.f102282f = view;
            this.f102283g = context;
            this.f102284h = interfaceC2266h;
            this.f102285i = i11;
        }

        /* renamed from: d */
        public static /* synthetic */ void m108685d(Context context, TextView textView, C3020p0 c3020p0, InterfaceC2266h interfaceC2266h, int i11) {
            AbstractC20814p0.m108666r(context.getApplicationContext(), textView, c3020p0.f12023C.f12115f);
            if (interfaceC2266h != null) {
                interfaceC2266h.mo11993Kw(i11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null && c20096c.m104491c() == 50001) {
                ToastUtils.m89262j();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                TextView textView = (TextView) this.f102277a.get();
                TextView textView2 = (TextView) this.f102278b.get();
                if (textView != null && textView2 != null && (obj instanceof JSONObject)) {
                    JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("translations");
                    if (jSONArray.length() > 0) {
                        String string = jSONArray.getJSONObject(0).getString("translatedText");
                        if (!TextUtils.isEmpty(this.f102279c.f12023C.f12115f) && this.f102279c.f12023C.f12115f.toString().equals(string)) {
                            return;
                        }
                        this.f102279c.m14466A0(string, this.f102280d);
                        if (textView2.getText().toString().equals(this.f102281e)) {
                            this.f102282f.post(new Runnable() { // from class: is.q0

                                /* renamed from: p */
                                public final /* synthetic */ Context f102321p;

                                /* renamed from: q */
                                public final /* synthetic */ TextView f102322q;

                                /* renamed from: r */
                                public final /* synthetic */ C3020p0 f102323r;

                                /* renamed from: s */
                                public final /* synthetic */ InterfaceC2266h f102324s;

                                /* renamed from: t */
                                public final /* synthetic */ int f102325t;

                                public /* synthetic */ RunnableC20816q0(Context context, TextView textView3, C3020p0 c3020p0, InterfaceC2266h interfaceC2266h, int i11) {
                                    r1 = context;
                                    r2 = textView3;
                                    r3 = c3020p0;
                                    r4 = interfaceC2266h;
                                    r5 = i11;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC20814p0.c.m108685d(r1, r2, r3, r4, r5);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: is.p0$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ WeakReference f102286a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f102287b;

        /* renamed from: c */
        final /* synthetic */ C3020p0 f102288c;

        /* renamed from: d */
        final /* synthetic */ boolean f102289d;

        /* renamed from: e */
        final /* synthetic */ String f102290e;

        /* renamed from: f */
        final /* synthetic */ Context f102291f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC2266h f102292g;

        /* renamed from: h */
        final /* synthetic */ int f102293h;

        d(WeakReference weakReference, WeakReference weakReference2, C3020p0 c3020p0, boolean z11, String str, Context context, InterfaceC2266h interfaceC2266h, int i11) {
            this.f102286a = weakReference;
            this.f102287b = weakReference2;
            this.f102288c = c3020p0;
            this.f102289d = z11;
            this.f102290e = str;
            this.f102291f = context;
            this.f102292g = interfaceC2266h;
            this.f102293h = i11;
        }

        /* renamed from: d */
        public static /* synthetic */ void m108687d(Context context, C21697g c21697g, C3020p0 c3020p0, InterfaceC2266h interfaceC2266h, int i11) {
            AbstractC20814p0.m108668s(context.getApplicationContext(), c21697g, c3020p0.f12023C.f12115f);
            if (interfaceC2266h != null) {
                interfaceC2266h.mo11993Kw(i11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null && c20096c.m104491c() == 50001) {
                ToastUtils.m89262j();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C21697g c21697g = (C21697g) this.f102286a.get();
                C21697g c21697g2 = (C21697g) this.f102287b.get();
                if (c21697g != null && c21697g2 != null && (obj instanceof JSONObject)) {
                    JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("translations");
                    if (jSONArray.length() > 0) {
                        String string = jSONArray.getJSONObject(0).getString("translatedText");
                        if (!TextUtils.isEmpty(this.f102288c.f12023C.f12115f) && this.f102288c.f12023C.f12115f.toString().equals(string)) {
                            return;
                        }
                        this.f102288c.m14466A0(string, this.f102289d);
                        if (c21697g2.m111973m1().toString().equals(this.f102290e)) {
                            AbstractC19444a.m101695c(new Runnable() { // from class: is.r0

                                /* renamed from: p */
                                public final /* synthetic */ Context f102332p;

                                /* renamed from: q */
                                public final /* synthetic */ C21697g f102333q;

                                /* renamed from: r */
                                public final /* synthetic */ C3020p0 f102334r;

                                /* renamed from: s */
                                public final /* synthetic */ InterfaceC2266h f102335s;

                                /* renamed from: t */
                                public final /* synthetic */ int f102336t;

                                public /* synthetic */ RunnableC20818r0(Context context, C21697g c21697g3, C3020p0 c3020p0, InterfaceC2266h interfaceC2266h, int i11) {
                                    r1 = context;
                                    r2 = c21697g3;
                                    r3 = c3020p0;
                                    r4 = interfaceC2266h;
                                    r5 = i11;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC20814p0.d.m108687d(r1, r2, r3, r4, r5);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: is.p0$e */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a */
        int f102294a;

        /* renamed from: b */
        int f102295b;

        public e(int i11, int i12) {
            this.f102294a = i11;
            this.f102295b = i12;
        }
    }

    /* renamed from: is.p0$f */
    /* loaded from: classes4.dex */
    public enum f {
        BY_WORD,
        BY_CHARACTER
    }

    /* renamed from: A */
    public static void m108593A() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = f102271a;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            f102271a.dismiss();
        }
        f102271a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:5:0x0010, B:7:0x002d, B:11:0x00bc, B:13:0x00c2, B:14:0x00c8, B:16:0x00ce, B:18:0x00db, B:19:0x00e1, B:21:0x00e7, B:23:0x00f4, B:25:0x00f8, B:27:0x00fe, B:29:0x0104, B:31:0x0108, B:34:0x010f, B:37:0x0147, B:39:0x0151, B:41:0x0162, B:43:0x0177, B:45:0x017b, B:47:0x017f, B:48:0x0183, B:50:0x0189, B:52:0x01a1, B:58:0x003a, B:60:0x0043, B:61:0x0051, B:63:0x0057, B:65:0x006d, B:66:0x0075, B:68:0x007b, B:69:0x0087, B:71:0x00ab), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:5:0x0010, B:7:0x002d, B:11:0x00bc, B:13:0x00c2, B:14:0x00c8, B:16:0x00ce, B:18:0x00db, B:19:0x00e1, B:21:0x00e7, B:23:0x00f4, B:25:0x00f8, B:27:0x00fe, B:29:0x0104, B:31:0x0108, B:34:0x010f, B:37:0x0147, B:39:0x0151, B:41:0x0162, B:43:0x0177, B:45:0x017b, B:47:0x017f, B:48:0x0183, B:50:0x0189, B:52:0x01a1, B:58:0x003a, B:60:0x0043, B:61:0x0051, B:63:0x0057, B:65:0x006d, B:66:0x0075, B:68:0x007b, B:69:0x0087, B:71:0x00ab), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0162 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:5:0x0010, B:7:0x002d, B:11:0x00bc, B:13:0x00c2, B:14:0x00c8, B:16:0x00ce, B:18:0x00db, B:19:0x00e1, B:21:0x00e7, B:23:0x00f4, B:25:0x00f8, B:27:0x00fe, B:29:0x0104, B:31:0x0108, B:34:0x010f, B:37:0x0147, B:39:0x0151, B:41:0x0162, B:43:0x0177, B:45:0x017b, B:47:0x017f, B:48:0x0183, B:50:0x0189, B:52:0x01a1, B:58:0x003a, B:60:0x0043, B:61:0x0051, B:63:0x0057, B:65:0x006d, B:66:0x0075, B:68:0x007b, B:69:0x0087, B:71:0x00ab), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m108594A0(C3020p0 c3020p0, C21697g c21697g, int i11, C21697g c21697g2, int i12, Context context, InterfaceC10867f interfaceC10867f) {
        CharSequence charSequence;
        ArrayList arrayList;
        C3013n3 c3013n3;
        boolean z11;
        C3025q0 c3025q0;
        if (c3020p0 != null && c21697g != null) {
            try {
                c21697g.m111959G1("");
                c21697g.m111953A1(c3020p0.f12037Q);
                c21697g.m89106L().m89030N(i11);
                CharSequence m14528u = c3020p0.m14528u();
                if (!c3020p0.m14482K() && !c3020p0.m14477G()) {
                    charSequence = null;
                    if (!TextUtils.isEmpty(m14528u)) {
                        Iterator it = c3020p0.f12029I.iterator();
                        while (it.hasNext()) {
                            C10866e c10866e = (C10866e) it.next();
                            c10866e.m56371O(true);
                            c10866e.m56369M(interfaceC10867f);
                        }
                        Iterator it2 = c3020p0.f12030J.iterator();
                        while (it2.hasNext()) {
                            C10866e c10866e2 = (C10866e) it2.next();
                            c10866e2.m56371O(true);
                            c10866e2.m56369M(interfaceC10867f);
                        }
                        C3025q0 c3025q02 = c3020p0.f12023C;
                        if (c3025q02 != null) {
                            c3013n3 = c3025q02.f12097F;
                        } else {
                            c3013n3 = null;
                        }
                        if (c3013n3 != null && c3013n3.m14430a() && (c3025q0 = c3020p0.f12023C) != null && c3025q0.f12096E != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        CharSequence m152970f = C31839a6.m152970f(m14528u, c3020p0.m14531w(true, false), z11, interfaceC10867f);
                        C31839a6.m152970f(c3020p0.m14527t(), c3020p0.m14531w(false, false), z11, interfaceC10867f);
                        c21697g.m111955C1(C10887z.m56529k());
                        C28100j3 c28100j3 = new C28100j3(1);
                        c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                        c21697g.setTag(AbstractC6918a0.tag_callback_span_listener, interfaceC10867f);
                        c21697g.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                        c21697g.mo44614b1(0);
                        c21697g.m111959G1(m152970f);
                    }
                    if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                        m108662p(context, c21697g, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                    }
                    if (c21697g2 == null) {
                        c21697g2.m111953A1(1);
                        c21697g2.m111959G1("");
                        c21697g2.m89106L().m89030N(i12);
                        if (!TextUtils.isEmpty(charSequence)) {
                            C3003l3 c3003l3 = c3020p0.f12059r;
                            if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    C10866e.m56359e((C10866e) it3.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                                }
                            }
                            c21697g2.m111955C1(C10880s.m56519f());
                            c21697g2.m111959G1(charSequence);
                            return;
                        }
                        return;
                    }
                    return;
                }
                CharSequence charSequence2 = "- ";
                if (c3020p0.m14482K()) {
                    charSequence2 = TextUtils.concat("- ", c3020p0.f12059r.f11958c);
                }
                if (c3020p0.m14477G()) {
                    CharSequence m14728g = c3020p0.f12023C.f12111b.m14728g();
                    if (!TextUtils.isEmpty(c3020p0.f12023C.f12111b.m14730i())) {
                        m14728g = c3020p0.f12023C.f12111b.m14730i();
                    }
                    if (c3020p0.m14482K()) {
                        m14728g = TextUtils.concat(" ", m14728g);
                    }
                    CharSequence concat = TextUtils.concat(charSequence2, m14728g);
                    double m153170b = c3020p0.f12023C.f12111b.m153170b();
                    double m153169a = c3020p0.f12023C.f12111b.m153169a();
                    C10866e m14729h = c3020p0.f12023C.f12111b.m14729h();
                    if (m14729h != null) {
                        m14729h.m56378V(C25866f0.m133448H(interfaceC10867f, "", m153170b, m153169a));
                    }
                    charSequence = concat;
                } else {
                    charSequence = charSequence2;
                }
                if (!TextUtils.isEmpty(m14528u)) {
                }
                if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                }
                if (c21697g2 == null) {
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: B */
    private static String m108595B(String str, String str2, int i11, int i12, int i13, boolean z11) {
        Pair m108616L0 = m108616L0(str, str2, i11, i12, f.BY_WORD, i13, z11);
        String str3 = (String) m108616L0.first;
        if (((Integer) m108616L0.second).intValue() > i11) {
            if (str3.endsWith("…")) {
                str3 = str3.replace("…", "");
            }
            str3 = (String) m108616L0(str3, str2, i11, i12, f.BY_CHARACTER, i13, z11).first;
        }
        if (TextUtils.isEmpty(str3)) {
            return "";
        }
        return str3;
    }

    /* renamed from: B0 */
    public static void m108596B0(C3020p0 c3020p0, TextView textView, boolean z11, Context context, InterfaceC10867f interfaceC10867f) {
        CharSequence charSequence;
        ArrayList arrayList;
        if (textView == null) {
            return;
        }
        try {
            textView.setText("");
            textView.setVisibility(8);
            if (c3020p0 == null) {
                return;
            }
            if (z11) {
                charSequence = c3020p0.m14528u();
            } else {
                charSequence = c3020p0.f12023C.f12110a;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Iterator it = c3020p0.f12029I.iterator();
                while (it.hasNext()) {
                    ((C10866e) it.next()).m56369M(interfaceC10867f);
                }
                Iterator it2 = c3020p0.f12030J.iterator();
                while (it2.hasNext()) {
                    C10866e c10866e = (C10866e) it2.next();
                    c10866e.m56369M(interfaceC10867f);
                    c10866e.m56372P(0);
                    c10866e.m56374R(c3020p0.f12058q);
                }
                CharSequence m152970f = C31839a6.m152970f(charSequence, c3020p0.m14531w(z11, false), false, interfaceC10867f);
                C3003l3 c3003l3 = c3020p0.f12059r;
                if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C10866e.m56359e((C10866e) it3.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                    }
                }
                if (AbstractC23304d.f113420o2) {
                    if (c3020p0.m14493X()) {
                        textView.setMovementMethod(CustomMovementMethod.m56305e());
                    } else {
                        textView.setMovementMethod(C10886y.m56528k());
                        C28100j3 c28100j3 = new C28100j3(1);
                        c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                        textView.setTag(AbstractC6918a0.tag_callback_span_listener, interfaceC10867f);
                        textView.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                    }
                }
                textView.setVisibility(0);
                textView.setText(m152970f);
                if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                    m108660o(context, textView, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:3:0x0002, B:5:0x0021, B:7:0x0033, B:8:0x0036, B:17:0x0013), top: B:1:0x0000 }] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float m108597C(int i11, float f11, float f12, C31890dc c31890dc, CharSequence charSequence, TextPaint textPaint, C21697g c21697g, TextView textView) {
        float f13;
        float lineSpacingExtra;
        float f14;
        Typeface m153062r0;
        StaticLayout staticLayout;
        try {
            if (c21697g != null) {
                textPaint.setTextSize(c21697g.m111977q1());
                lineSpacingExtra = c21697g.m111970j1();
            } else if (textView != null) {
                textPaint.setTextSize(textView.getTextSize());
                lineSpacingExtra = textView.getLineSpacingExtra();
            } else {
                f13 = 0.0f;
                f14 = f11 * f12;
                m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
                if (m153062r0 != null) {
                    textPaint.setTypeface(m153062r0);
                }
                staticLayout = new StaticLayout(charSequence, textPaint, i11, AbstractC22055v0.m115165y(c31890dc.f146515u), 1.0f, f13, true);
                float height = staticLayout.getHeight() / f14;
                if (staticLayout.getHeight() <= f14) {
                    return height;
                }
                return f12;
            }
            f13 = lineSpacingExtra;
            f14 = f11 * f12;
            m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
            if (m153062r0 != null) {
            }
            staticLayout = new StaticLayout(charSequence, textPaint, i11, AbstractC22055v0.m115165y(c31890dc.f146515u), 1.0f, f13, true);
            float height2 = staticLayout.getHeight() / f14;
            if (staticLayout.getHeight() <= f14) {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return f12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:6:0x0015, B:9:0x0025, B:11:0x002b, B:12:0x0034, B:14:0x003a, B:15:0x0041, B:17:0x0050, B:19:0x0054, B:20:0x0058, B:22:0x005e, B:24:0x006b, B:26:0x0070, B:27:0x0074, B:29:0x007a, B:31:0x008c, B:34:0x0095, B:37:0x00a0, B:39:0x00a4, B:40:0x00a8, B:42:0x00ae, B:49:0x00c0, B:45:0x00c9, B:52:0x00d2, B:54:0x00d6, B:57:0x00dd, B:59:0x00e7, B:61:0x00ed, B:63:0x00f3, B:64:0x011a, B:68:0x0131, B:70:0x0137, B:72:0x0162, B:74:0x016c, B:76:0x017d, B:78:0x0181, B:79:0x0185, B:81:0x018b, B:83:0x01a6, B:85:0x01ad, B:87:0x01b2, B:90:0x01be, B:92:0x01c7, B:93:0x01d7, B:97:0x01ce, B:98:0x01d3, B:100:0x014a, B:101:0x0159, B:102:0x0113), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:6:0x0015, B:9:0x0025, B:11:0x002b, B:12:0x0034, B:14:0x003a, B:15:0x0041, B:17:0x0050, B:19:0x0054, B:20:0x0058, B:22:0x005e, B:24:0x006b, B:26:0x0070, B:27:0x0074, B:29:0x007a, B:31:0x008c, B:34:0x0095, B:37:0x00a0, B:39:0x00a4, B:40:0x00a8, B:42:0x00ae, B:49:0x00c0, B:45:0x00c9, B:52:0x00d2, B:54:0x00d6, B:57:0x00dd, B:59:0x00e7, B:61:0x00ed, B:63:0x00f3, B:64:0x011a, B:68:0x0131, B:70:0x0137, B:72:0x0162, B:74:0x016c, B:76:0x017d, B:78:0x0181, B:79:0x0185, B:81:0x018b, B:83:0x01a6, B:85:0x01ad, B:87:0x01b2, B:90:0x01be, B:92:0x01c7, B:93:0x01d7, B:97:0x01ce, B:98:0x01d3, B:100:0x014a, B:101:0x0159, B:102:0x0113), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cc  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m108598C0(C3020p0 c3020p0, TextView textView, TextView textView2, TextView textView3, FeedBackgroundView feedBackgroundView, boolean z11, boolean z12, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2266h interfaceC2266h, boolean z13, boolean z14, int i11) {
        ?? r14;
        int i12;
        CharSequence m14528u;
        ArrayList arrayList;
        if (textView == null) {
            return;
        }
        try {
            textView.setText("");
            textView.setVisibility(8);
            feedBackgroundView.setVisibility(8);
            if (c3020p0 == null) {
                return;
            }
            if (c3020p0.m14482K()) {
                c3020p0.f12059r.mo14398k();
            }
            if (c3020p0.m14477G()) {
                c3020p0.f12023C.f12111b.m14726e();
            }
            boolean m108641e0 = m108641e0(i11);
            CharSequence m108603F = m108603F(c3020p0, z11, interfaceC10867f, m108641e0);
            if (TextUtils.isEmpty(m108603F)) {
                r14 = 0;
            } else {
                ArrayList arrayList2 = c3020p0.f12029I;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C10866e c10866e = (C10866e) it.next();
                        c10866e.m56371O(z12);
                        c10866e.m56369M(interfaceC10867f);
                    }
                }
                ArrayList arrayList3 = c3020p0.f12030J;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        C10866e c10866e2 = (C10866e) it2.next();
                        c10866e2.m56371O(z12);
                        c10866e2.m56369M(interfaceC10867f);
                        if (c3020p0.m14498b0()) {
                            c10866e2.m56372P(1);
                            c10866e2.m56374R(c3020p0.f12058q);
                        } else {
                            c10866e2.m56372P(0);
                            c10866e2.m56374R(c3020p0.f12058q);
                        }
                    }
                }
                ArrayList arrayList4 = c3020p0.f12031K;
                if (arrayList4 != null) {
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        C10866e c10866e3 = (C10866e) it3.next();
                        c10866e3.m56371O(z12);
                        c10866e3.m56369M(interfaceC10867f);
                        if (c3020p0.m14498b0()) {
                            c10866e3.m56372P(1);
                            c10866e3.m56374R(c3020p0.f12058q);
                        } else {
                            c10866e3.m56372P(0);
                            c10866e3.m56374R(c3020p0.f12058q);
                        }
                    }
                }
                C3025q0 c3025q0 = c3020p0.f12023C;
                CharSequence m152970f = C31839a6.m152970f(m108603F, c3020p0.m14531w(z11, m108641e0), (c3025q0 == null || c3025q0.f12096E == 0) ? false : true, interfaceC10867f);
                if (z12 && !c3020p0.m14493X() && c3020p0.f12058q != 24) {
                    textView.setMovementMethod(C10886y.m56528k());
                    C28100j3 c28100j3 = new C28100j3(1);
                    c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                    textView.setTag(AbstractC6918a0.tag_callback_span_listener, interfaceC10867f);
                    textView.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                } else {
                    textView.setMovementMethod(CustomMovementMethod.m56305e());
                }
                textView.setVisibility(0);
                feedBackgroundView.setVisibility(0);
                textView.setText(m152970f);
                if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                    if (z13 && textView3 != null && AbstractC23309i.m121528Ve()) {
                        r14 = 0;
                        m108670t(context, textView, textView2, textView3, c3020p0, z11, interfaceC2266h);
                    } else {
                        r14 = 0;
                        m108660o(context, textView, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                    }
                } else {
                    r14 = 0;
                    textView.setOnLongClickListener(null);
                }
            }
            if (textView2 != 0) {
                CharSequence m108615L = m108615L(c3020p0, interfaceC10867f);
                if (!TextUtils.isEmpty(m108615L)) {
                    textView2.setMovementMethod(CustomMovementMethod.m56305e());
                    textView2.setVisibility(r14);
                    textView2.setText(m108615L);
                    C3003l3 c3003l3 = c3020p0.f12059r;
                    if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C10866e.m56359e((C10866e) it4.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                        }
                    }
                } else {
                    i12 = 8;
                    textView2.setVisibility(8);
                    if (textView3 != null) {
                        textView3.setVisibility(i12);
                    }
                    if (z13 && !TextUtils.isEmpty(c3020p0.f12023C.f12115f) && textView3 != null) {
                        m108666r(context, textView3, c3020p0.f12023C.f12115f);
                    }
                    if (m108641e0) {
                        m14528u = z11 ? c3020p0.m14528u() : c3020p0.f12023C.f12110a;
                    } else {
                        m14528u = c3020p0.m14526s();
                    }
                    C3013n3 c3013n3 = c3020p0.f12023C.f12097F;
                    C31890dc m153044X = C31845ac.m152996J().m153044X();
                    feedBackgroundView.setTypeRender(r14);
                    feedBackgroundView.m43642n(m153044X, r14);
                    feedBackgroundView.setTag(1090453510, String.valueOf(c3020p0.f12023C.f12096E));
                    feedBackgroundView.m43638j(c3013n3, m14528u);
                    C31845ac.m152996J().m153057o0(c3020p0.f12023C.f12096E, new C31845ac.e() { // from class: is.b0

                        /* renamed from: a */
                        public final /* synthetic */ WeakReference f102139a;

                        /* renamed from: b */
                        public final /* synthetic */ CharSequence f102140b;

                        /* renamed from: c */
                        public final /* synthetic */ C3013n3 f102141c;

                        /* renamed from: d */
                        public final /* synthetic */ boolean f102142d;

                        /* renamed from: e */
                        public final /* synthetic */ int f102143e;

                        public /* synthetic */ C20786b0(WeakReference weakReference, CharSequence m14528u2, C3013n3 c3013n32, boolean z142, int i112) {
                            r1 = weakReference;
                            r2 = m14528u2;
                            r3 = c3013n32;
                            r4 = z142;
                            r5 = i112;
                        }

                        @Override // p716zh.C31845ac.e
                        /* renamed from: a */
                        public final void mo39491a(int i13, String str, C31890dc c31890dc) {
                            AbstractC20814p0.m108633a0(r1, r2, r3, r4, r5, i13, str, c31890dc);
                        }
                    });
                    m108618M0(c3020p0);
                }
            }
            i12 = 8;
            if (textView3 != null) {
            }
            if (z13) {
                m108666r(context, textView3, c3020p0.f12023C.f12115f);
            }
            if (m108641e0) {
            }
            C3013n3 c3013n32 = c3020p0.f12023C.f12097F;
            C31890dc m153044X2 = C31845ac.m152996J().m153044X();
            feedBackgroundView.setTypeRender(r14);
            feedBackgroundView.m43642n(m153044X2, r14);
            feedBackgroundView.setTag(1090453510, String.valueOf(c3020p0.f12023C.f12096E));
            feedBackgroundView.m43638j(c3013n32, m14528u2);
            C31845ac.m152996J().m153057o0(c3020p0.f12023C.f12096E, new C31845ac.e() { // from class: is.b0

                /* renamed from: a */
                public final /* synthetic */ WeakReference f102139a;

                /* renamed from: b */
                public final /* synthetic */ CharSequence f102140b;

                /* renamed from: c */
                public final /* synthetic */ C3013n3 f102141c;

                /* renamed from: d */
                public final /* synthetic */ boolean f102142d;

                /* renamed from: e */
                public final /* synthetic */ int f102143e;

                public /* synthetic */ C20786b0(WeakReference weakReference, CharSequence m14528u2, C3013n3 c3013n322, boolean z142, int i112) {
                    r1 = weakReference;
                    r2 = m14528u2;
                    r3 = c3013n322;
                    r4 = z142;
                    r5 = i112;
                }

                @Override // p716zh.C31845ac.e
                /* renamed from: a */
                public final void mo39491a(int i13, String str, C31890dc c31890dc) {
                    AbstractC20814p0.m108633a0(r1, r2, r3, r4, r5, i13, str, c31890dc);
                }
            });
            m108618M0(c3020p0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: D */
    public static String m108599D(int i11) {
        try {
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(1);
            if (i11 < 1000) {
                return i11 + "";
            }
            double d11 = i11;
            double d12 = 1000000000;
            if (d11 >= d12) {
                if (d11 % d12 >= 1.0E8d) {
                    return numberFormat.format(d11 / d12) + "B";
                }
                return ((int) (d11 / d12)) + "B";
            }
            double d13 = 1000000;
            if (d11 >= d13) {
                if (d11 % d13 >= 100000.0d) {
                    return numberFormat.format(d11 / d13) + "M";
                }
                return ((int) (d11 / d13)) + "M";
            }
            double d14 = 1000;
            if (d11 % d14 >= 100.0d) {
                return numberFormat.format(d11 / d14) + "K";
            }
            return ((int) (d11 / d14)) + "K";
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return i11 + "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: is.j0.<init>(java.lang.ref.WeakReference, java.lang.CharSequence, int, bo.n3, boolean, java.lang.ref.WeakReference, java.lang.CharSequence, com.zing.zalo.feed.components.q0):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: D0 */
    public static void m108600D0(bo.C3020p0 r15, com.zing.zalo.feed.components.C8362q0 r16, boolean r17, kd0.C21697g r18, kd0.C21697g r19, boolean r20, ao.InterfaceC2266h r21, boolean r22, com.zing.zalo.social.controls.InterfaceC10867f r23, boolean r24, int r25) {
        /*
            r0 = r15
            r12 = r16
            r13 = r18
            if (r0 == 0) goto L99
            if (r12 != 0) goto Lb
            goto L99
        Lb:
            boolean r14 = m108641e0(r25)     // Catch: java.lang.Exception -> L2f
            l80.c0 r2 = r16.m44809s1()     // Catch: java.lang.Exception -> L2f
            r10 = 1
            r1 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r11 = r23
            m108677w0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L2f
            if (r13 == 0) goto L31
            r1 = 8
            r13.mo44614b1(r1)     // Catch: java.lang.Exception -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L96
        L31:
            if (r14 == 0) goto L3b
            java.lang.CharSequence r1 = r15.m14526s()     // Catch: java.lang.Exception -> L2f
        L37:
            r3 = r1
            r1 = r23
            goto L47
        L3b:
            if (r17 == 0) goto L42
            java.lang.CharSequence r1 = r15.m14528u()     // Catch: java.lang.Exception -> L2f
            goto L37
        L42:
            bo.q0 r1 = r0.f12023C     // Catch: java.lang.Exception -> L2f
            java.lang.CharSequence r1 = r1.f12110a     // Catch: java.lang.Exception -> L2f
            goto L37
        L47:
            java.lang.CharSequence r8 = m108615L(r15, r1)     // Catch: java.lang.Exception -> L2f
            bo.q0 r1 = r0.f12023C     // Catch: java.lang.Exception -> L2f
            bo.n3 r5 = r1.f12097F     // Catch: java.lang.Exception -> L2f
            zh.ac r1 = p716zh.C31845ac.m152996J()     // Catch: java.lang.Exception -> L2f
            zh.dc r1 = r1.m153044X()     // Catch: java.lang.Exception -> L2f
            r2 = 0
            r12.m44804I1(r2)     // Catch: java.lang.Exception -> L2f
            r12.m44797B1(r1, r2)     // Catch: java.lang.Exception -> L2f
            bo.q0 r1 = r0.f12023C     // Catch: java.lang.Exception -> L2f
            int r1 = r1.f12096E     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L2f
            r2 = 1090453510(0x40ff0006, float:7.968753)
            r12.setTag(r2, r1)     // Catch: java.lang.Exception -> L2f
            r4 = r25
            r12.m44815y1(r5, r3, r4)     // Catch: java.lang.Exception -> L2f
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L2f
            r7.<init>(r13)     // Catch: java.lang.Exception -> L2f
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L2f
            r2.<init>(r12)     // Catch: java.lang.Exception -> L2f
            zh.ac r10 = p716zh.C31845ac.m152996J()     // Catch: java.lang.Exception -> L2f
            bo.q0 r1 = r0.f12023C     // Catch: java.lang.Exception -> L2f
            int r11 = r1.f12096E     // Catch: java.lang.Exception -> L2f
            is.j0 r13 = new is.j0     // Catch: java.lang.Exception -> L2f
            r1 = r13
            r4 = r25
            r6 = r24
            r9 = r16
            r1.<init>()     // Catch: java.lang.Exception -> L2f
            r10.m153057o0(r11, r13)     // Catch: java.lang.Exception -> L2f
            m108618M0(r15)     // Catch: java.lang.Exception -> L2f
            goto L99
        L96:
            ho0.AbstractC20110a.m104539h(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: is.AbstractC20814p0.m108600D0(bo.p0, com.zing.zalo.feed.components.q0, boolean, kd0.g, kd0.g, boolean, ao.h, boolean, com.zing.zalo.social.controls.f, boolean, int):void");
    }

    /* renamed from: E */
    private static int m108601E(List list, int i11) {
        e eVar;
        int i12;
        Iterator it = list.iterator();
        while (it.hasNext() && i11 > (i12 = (eVar = (e) it.next()).f102294a)) {
            if (i11 < eVar.f102295b) {
                return i12;
            }
        }
        return i11;
    }

    /* renamed from: E0 */
    public static void m108602E0(Context context, C3063z0 c3063z0, AspectRatioImageView aspectRatioImageView, int i11, float f11, boolean z11, C23528a c23528a) {
        if (c3063z0 == null) {
            return;
        }
        try {
            String str = c3063z0.m153169a() + "_" + c3063z0.m153170b();
            aspectRatioImageView.setVisibility(0);
            aspectRatioImageView.setImageDrawable(AbstractC28236y3.m142196g(context));
            aspectRatioImageView.setShowLoading(true);
            aspectRatioImageView.setTag(str);
            C32049o6.f147573a.m154648d(c3063z0, i11, f11, c23528a, new C32049o6.a() { // from class: is.g0

                /* renamed from: b */
                public final /* synthetic */ String f102194b;

                public /* synthetic */ C20796g0(String str2) {
                    r2 = str2;
                }

                @Override // p716zh.C32049o6.a
                /* renamed from: a */
                public final void mo44791a(C3979l c3979l, boolean z12) {
                    AbstractC20814p0.m108637c0(AspectRatioImageView.this, r2, c3979l, z12);
                }
            }, z11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: F */
    public static CharSequence m108603F(C3020p0 c3020p0, boolean z11, InterfaceC10867f interfaceC10867f, boolean z12) {
        CharSequence charSequence;
        try {
            if (z12) {
                charSequence = c3020p0.m14526s();
            } else if (z11) {
                charSequence = c3020p0.m14528u();
            } else {
                charSequence = c3020p0.f12023C.f12110a;
            }
            return charSequence;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: F0 */
    public static void m108604F0(C3020p0 c3020p0, C21697g c21697g, boolean z11, boolean z12, Context context, InterfaceC10867f interfaceC10867f) {
        ArrayList arrayList;
        if (c21697g == null) {
            return;
        }
        try {
            c21697g.m111959G1("");
            c21697g.mo44614b1(8);
            if (c3020p0 == null) {
                return;
            }
            CharSequence m108607H = m108607H(c3020p0, z12, interfaceC10867f, false);
            if (!TextUtils.isEmpty(m108607H)) {
                Iterator it = c3020p0.f12029I.iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    c10866e.m56371O(true);
                    c10866e.m56369M(interfaceC10867f);
                }
                Iterator it2 = c3020p0.f12030J.iterator();
                while (it2.hasNext()) {
                    C10866e c10866e2 = (C10866e) it2.next();
                    c10866e2.m56371O(true);
                    c10866e2.m56369M(interfaceC10867f);
                    if (c3020p0.m14498b0()) {
                        c10866e2.m56372P(1);
                        c10866e2.m56374R(c3020p0.f12058q);
                    } else {
                        c10866e2.m56372P(0);
                        c10866e2.m56374R(c3020p0.f12058q);
                    }
                }
                CharSequence m152970f = C31839a6.m152970f(m108607H, c3020p0.m14531w(z12, false), false, interfaceC10867f);
                C3003l3 c3003l3 = c3020p0.f12059r;
                if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C10866e.m56359e((C10866e) it3.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                    }
                }
                if (!c3020p0.m14493X()) {
                    c21697g.m111955C1(C10887z.m56529k());
                    C28100j3 c28100j3 = new C28100j3(1);
                    c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                    c21697g.m89129Y0(Integer.valueOf(AbstractC6918a0.tag_callback_span_listener));
                    c21697g.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                } else {
                    c21697g.m111955C1(C10880s.m56519f());
                }
                c21697g.mo44614b1(0);
                if (z11) {
                    m108664q(m152970f, c21697g, (int) TypedValue.applyDimension(1, 53.0f, c21697g.getContext().getResources().getDisplayMetrics()));
                } else {
                    c21697g.m111959G1(m152970f);
                }
                m108678x(c21697g.m111973m1(), c21697g);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: G */
    public static CharSequence m108605G(C3020p0 c3020p0, boolean z11, boolean z12, C21697g c21697g) {
        CharSequence charSequence;
        try {
            charSequence = m108603F(c3020p0, z11, null, z12);
        } catch (Exception e11) {
            e = e11;
            charSequence = "";
        }
        try {
            return C20832y0.f102396a.m108878f(c3020p0, new C20832y0.a(charSequence, c21697g.m111977q1(), C13718q1.m76694c(c21697g.getContext(), 7)), AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(16.0f) * 2.0f));
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.m104539h(e);
            return charSequence;
        }
    }

    /* renamed from: G0 */
    public static void m108606G0(RobotoTextView robotoTextView, String str, String str2, String str3) {
        if (robotoTextView == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str3) && str3.equals("action.follow.oa") && C21927m.m114302u().m114318P(str)) {
                    robotoTextView.setText("");
                    robotoTextView.setVisibility(8);
                } else {
                    robotoTextView.setVisibility(0);
                    robotoTextView.setText(str2);
                }
            } else {
                robotoTextView.setText("");
                robotoTextView.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: H */
    public static CharSequence m108607H(C3020p0 c3020p0, boolean z11, InterfaceC10867f interfaceC10867f, boolean z12) {
        CharSequence charSequence;
        CharSequence charSequence2 = "";
        try {
            if (z12) {
                charSequence = c3020p0.m14526s();
            } else if (z11) {
                charSequence = c3020p0.m14528u();
            } else {
                charSequence = c3020p0.f12023C.f12110a;
            }
            charSequence2 = charSequence;
            if (!TextUtils.isEmpty(charSequence2) && (c3020p0.m14482K() || c3020p0.m14477G())) {
                SpannableString spannableString = new SpannableString(" - ");
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC21196a.TextColor2)), 0, 2, 0);
                charSequence2 = TextUtils.concat(charSequence2, spannableString);
            }
            if (c3020p0.m14482K()) {
                charSequence2 = TextUtils.concat(charSequence2, c3020p0.f12059r.f11958c);
            }
            if (c3020p0.m14477G()) {
                CharSequence m14728g = c3020p0.f12023C.f12111b.m14728g();
                if (c3020p0.m14482K()) {
                    m14728g = TextUtils.concat(" ", m14728g);
                }
                charSequence2 = TextUtils.concat(charSequence2, m14728g);
                double m153170b = c3020p0.f12023C.f12111b.m153170b();
                double m153169a = c3020p0.f12023C.f12111b.m153169a();
                C10866e m14729h = c3020p0.f12023C.f12111b.m14729h();
                if (m14729h != null) {
                    m14729h.m56378V(C25866f0.m133448H(interfaceC10867f, "", m153170b, m153169a));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return charSequence2;
    }

    /* renamed from: H0 */
    public static void m108608H0(C22126c0 c22126c0, String str, String str2, String str3) {
        if (c22126c0 == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str3) && str3.equals("action.follow.oa") && C21927m.m114302u().m114318P(str)) {
                    c22126c0.m111959G1("");
                    c22126c0.mo44614b1(8);
                } else {
                    c22126c0.mo44614b1(0);
                    c22126c0.m111959G1(str2);
                }
            } else {
                c22126c0.m111959G1("");
                c22126c0.mo44614b1(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: I */
    private static int m108609I(int i11, int i12, boolean z11) {
        int i13 = 1;
        if (C24380u.f117739a.m127515h() && i12 == 0 && !z11 && i11 != 1) {
            i13 = 2;
        }
        return (i13 * (C8406v1.f45768u1 + (AbstractC23222t7.f112566j * 2))) + (C8406v1.f45767t1 - AbstractC23222t7.f112566j);
    }

    /* renamed from: I0 */
    public static void m108610I0(C3000l0 c3000l0, int i11, TextView textView, View view, InterfaceC10867f interfaceC10867f) {
        try {
            if (c3000l0.m14297H0() && textView != null && view != null) {
                C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                C3003l3.c cVar = m14324b0.f12060s;
                if (cVar != null && cVar.f11959d != null) {
                    textView.setVisibility(0);
                    view.setVisibility(0);
                    int i12 = c3000l0.f11860I;
                    if (i12 > 0) {
                        textView.setLines(i12);
                    }
                    textView.setText(cVar.f11958c);
                    Iterator it = cVar.f11959d.iterator();
                    while (it.hasNext()) {
                        C10866e.m56359e((C10866e) it.next(), c3000l0.f11895q, m14324b0.f12022B.f12280b, cVar.f11956a, m14324b0.f12058q, interfaceC10867f);
                    }
                    textView.setMovementMethod(CustomMovementMethod.m56305e());
                    return;
                }
                textView.setVisibility(8);
                view.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: J */
    public static int m108611J() {
        int i11 = AbstractC23304d.f113329T;
        if (i11 <= 0) {
            return AbstractC23136l9.m118742r(72.0f);
        }
        return i11;
    }

    /* renamed from: J0 */
    public static void m108612J0(C3000l0 c3000l0, int i11, C22126c0 c22126c0, C16719g c16719g, InterfaceC10867f interfaceC10867f) {
        try {
            if (c3000l0.m14297H0() && c22126c0 != null && c16719g != null) {
                C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                C3003l3.c cVar = m14324b0.f12060s;
                if (cVar != null && cVar.f11959d != null) {
                    c22126c0.mo44614b1(0);
                    c16719g.mo44614b1(0);
                    int i12 = c3000l0.f11860I;
                    if (i12 > 0) {
                        c22126c0.m111953A1(i12);
                    }
                    c22126c0.m111959G1(cVar.f11958c);
                    Iterator it = cVar.f11959d.iterator();
                    while (it.hasNext()) {
                        C10866e.m56359e((C10866e) it.next(), c3000l0.f11895q, m14324b0.f12022B.f12280b, cVar.f11956a, m14324b0.f12058q, interfaceC10867f);
                    }
                    c22126c0.m111955C1(C10880s.m56519f());
                    return;
                }
                c22126c0.mo44614b1(8);
                c16719g.mo44614b1(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: K */
    public static float m108613K(int i11) {
        return (i11 == 2 || i11 == 3) ? 0.6f : 1.0f;
    }

    /* renamed from: K0 */
    public static CharSequence m108614K0(CharSequence charSequence, int i11) {
        try {
            String charSequence2 = charSequence.toString();
            if (i11 >= 0 && i11 <= charSequence2.length()) {
                int i12 = i11 - 5;
                if (i12 < 0) {
                    i12 = 0;
                }
                int i13 = i11 + 5;
                if (i13 > charSequence2.length()) {
                    i13 = charSequence2.length();
                }
                String substring = charSequence2.substring(i12, i13);
                Matcher matcher = Pattern.compile("[^\\x00-\\x7F]", 66).matcher(new String(substring.getBytes("UTF-8"), "UTF-8"));
                ArrayList arrayList = new ArrayList();
                while (matcher.find()) {
                    arrayList.add(matcher.group());
                }
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                int i15 = 0;
                while (i14 < arrayList.size()) {
                    String str = (String) arrayList.get(i14);
                    int indexOf = substring.indexOf(str, i15);
                    int length = str.length() + indexOf;
                    arrayList2.add(new e(indexOf, length));
                    i14++;
                    i15 = length;
                }
                return charSequence.subSequence(0, i12 + m108601E(arrayList2, i11 - i12));
            }
            throw new IllegalStateException("Index out of bounds!");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return charSequence.subSequence(0, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:5:0x000b, B:8:0x0034, B:10:0x003a, B:11:0x0048, B:13:0x004e, B:15:0x005c, B:16:0x0068, B:18:0x008c, B:22:0x0015), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:5:0x000b, B:8:0x0034, B:10:0x003a, B:11:0x0048, B:13:0x004e, B:15:0x005c, B:16:0x0068, B:18:0x008c, B:22:0x0015), top: B:2:0x0002 }] */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence m108615L(C3020p0 c3020p0, InterfaceC10867f interfaceC10867f) {
        CharSequence charSequence = "";
        try {
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (!c3020p0.m14482K()) {
            if (c3020p0.m14477G()) {
            }
            if (c3020p0.m14482K()) {
                charSequence = TextUtils.concat(charSequence, c3020p0.f12059r.f11958c);
            }
            if (c3020p0.m14477G()) {
                CharSequence m14728g = c3020p0.f12023C.f12111b.m14728g();
                if (c3020p0.m14482K()) {
                    m14728g = TextUtils.concat(" ", m14728g);
                }
                charSequence = TextUtils.concat(charSequence, m14728g);
                double m153170b = c3020p0.f12023C.f12111b.m153170b();
                double m153169a = c3020p0.f12023C.f12111b.m153169a();
                C10866e m14729h = c3020p0.f12023C.f12111b.m14729h();
                if (m14729h != null) {
                    m14729h.m56378V(C25866f0.m133448H(interfaceC10867f, "", m153170b, m153169a));
                }
            }
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(" - ");
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC21196a.TextColor2)), 0, 2, 0);
        charSequence = TextUtils.concat("", spannableString);
        if (c3020p0.m14482K()) {
        }
        if (c3020p0.m14477G()) {
        }
        return charSequence;
    }

    /* renamed from: L0 */
    private static Pair m108616L0(String str, String str2, int i11, int i12, f fVar, int i13, boolean z11) {
        Typeface defaultFromStyle;
        String str3;
        StaticLayout staticLayout;
        String str4;
        int lineCount;
        f fVar2;
        StaticLayout.Builder obtain;
        TextPaint textPaint = new TextPaint(1);
        float m118736p = AbstractC23136l9.m118736p(AbstractC16802y.f85297f4);
        if (C13778s1.m76966g()) {
            m118736p *= C13778s1.m76962c();
        }
        textPaint.setTextSize(m118736p);
        textPaint.setColor(C23212s8.m119606n(AbstractC21196a.TextColor1));
        if (C13778s1.m76960a()) {
            if (C13778s1.m76960a()) {
                defaultFromStyle = C13718q1.m76694c(MainApplication.getAppContext(), 7);
            } else {
                defaultFromStyle = Typeface.defaultFromStyle(1);
            }
        } else {
            defaultFromStyle = Typeface.defaultFromStyle(1);
        }
        Typeface typeface = defaultFromStyle;
        int m108617M = m108617M(i12, i13, z11);
        String str5 = str;
        String str6 = str5;
        do {
            if (!TextUtils.isEmpty(str2)) {
                str3 = str5 + " " + str2;
            } else {
                str3 = str5;
            }
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new CustomTypefaceSpan("", typeface), 0, str5.length(), 34);
            if (Build.VERSION.SDK_INT >= 23) {
                obtain = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, m108617M);
                staticLayout = obtain.build();
                str4 = "";
            } else {
                str4 = "";
                staticLayout = new StaticLayout(spannableString, textPaint, m108617M, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            lineCount = staticLayout.getLineCount();
            fVar2 = f.BY_WORD;
            if (fVar == fVar2) {
                str6 = str5;
                str5 = m108645g0(str5);
            } else if (fVar == f.BY_CHARACTER) {
                str5 = m108643f0(str6);
                str6 = str5;
            }
            if (!TextUtils.isEmpty(str5)) {
                str5 = str5 + "…";
                if (lineCount <= i11) {
                    break;
                }
            } else {
                break;
            }
        } while (str6.length() > 1);
        String str7 = str5;
        if (fVar == fVar2) {
            str7 = str6;
        } else if (fVar != f.BY_CHARACTER) {
            str7 = str4;
        }
        return new Pair(str7, Integer.valueOf(lineCount));
    }

    /* renamed from: M */
    private static int m108617M(int i11, int i12, boolean z11) {
        int m108609I;
        int i13;
        int i14;
        int m118722k0 = AbstractC23136l9.m118722k0();
        int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.feed_header_avatar_margin_right);
        int m118736p2 = AbstractC23136l9.m118736p(AbstractC16802y.feed_header_avatar_margin_left);
        int m118736p3 = AbstractC23136l9.m118736p(AbstractC16802y.avt_M);
        int m118742r = AbstractC23136l9.m118742r(2.0f) * 2;
        int i15 = C8406v1.f45766s1;
        int i16 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 4) {
                    if (i11 == 6) {
                        m118722k0 = AbstractC23136l9.m118681V() - AbstractC23136l9.m118742r(110.0f);
                        m118736p2 = AbstractC23136l9.m118736p(AbstractC16802y.chat_feed_avatar_margin);
                        m118736p = AbstractC23136l9.m118736p(AbstractC16802y.chat_feed_avatar_margin);
                        m118736p3 = AbstractC23136l9.m118736p(AbstractC16802y.ava1_border);
                        i14 = AbstractC23136l9.m118742r(3.0f);
                        return (((((m118722k0 - i16) - m118736p) - m118736p2) - m118736p3) - m118742r) - i14;
                    }
                    i14 = 0;
                    return (((((m118722k0 - i16) - m118736p) - m118736p2) - m118736p3) - m118742r) - i14;
                }
                m118722k0 = AbstractC23136l9.m118722k0();
                i13 = AbstractC23136l9.m118736p(AbstractC16802y.feed_header_user_name_detail_margin_right);
                i16 = i13;
                i14 = 0;
                return (((((m118722k0 - i16) - m118736p) - m118736p2) - m118736p3) - m118742r) - i14;
            }
            m118722k0 = C20801j.m108534b();
            m108609I = m108609I(i11, i12, z11);
        } else {
            m118722k0 = AbstractC23136l9.m118722k0();
            m108609I = m108609I(i11, i12, z11);
        }
        i13 = m108609I + i15;
        i16 = i13;
        i14 = 0;
        return (((((m118722k0 - i16) - m118736p) - m118736p2) - m118736p3) - m118742r) - i14;
    }

    /* renamed from: M0 */
    public static void m108618M0(C3020p0 c3020p0) {
        if (C31890dc.m153233v(c3020p0.f12023C.f12098G) && c3020p0.f12062u + 172800000 > System.currentTimeMillis()) {
            C31845ac.m152996J().m153058p(c3020p0.f12023C.f12098G);
        }
    }

    /* renamed from: N */
    public static int m108619N() {
        return (AbstractC23136l9.m118722k0() - AbstractC23136l9.m118659K(AbstractC16802y.feed_padding_left_profile_item)) - AbstractC23136l9.m118659K(AbstractC16802y.feed_padding_right_profile_item);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001c, B:6:0x0059, B:18:0x0097, B:20:0x00a0, B:21:0x00a3, B:24:0x0137, B:25:0x0144, B:27:0x014a, B:29:0x0152, B:31:0x0156, B:33:0x015d, B:41:0x013e, B:42:0x00a8, B:44:0x00ae, B:55:0x00fe, B:56:0x011c, B:58:0x0122, B:59:0x0126, B:61:0x012c, B:62:0x0070, B:65:0x007a, B:68:0x0084, B:71:0x0045, B:73:0x0049, B:75:0x0051, B:46:0x00b9, B:48:0x00c3, B:50:0x00cd, B:51:0x00df, B:52:0x00e3), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014a A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001c, B:6:0x0059, B:18:0x0097, B:20:0x00a0, B:21:0x00a3, B:24:0x0137, B:25:0x0144, B:27:0x014a, B:29:0x0152, B:31:0x0156, B:33:0x015d, B:41:0x013e, B:42:0x00a8, B:44:0x00ae, B:55:0x00fe, B:56:0x011c, B:58:0x0122, B:59:0x0126, B:61:0x012c, B:62:0x0070, B:65:0x007a, B:68:0x0084, B:71:0x0045, B:73:0x0049, B:75:0x0051, B:46:0x00b9, B:48:0x00c3, B:50:0x00cd, B:51:0x00df, B:52:0x00e3), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001c, B:6:0x0059, B:18:0x0097, B:20:0x00a0, B:21:0x00a3, B:24:0x0137, B:25:0x0144, B:27:0x014a, B:29:0x0152, B:31:0x0156, B:33:0x015d, B:41:0x013e, B:42:0x00a8, B:44:0x00ae, B:55:0x00fe, B:56:0x011c, B:58:0x0122, B:59:0x0126, B:61:0x012c, B:62:0x0070, B:65:0x007a, B:68:0x0084, B:71:0x0045, B:73:0x0049, B:75:0x0051, B:46:0x00b9, B:48:0x00c3, B:50:0x00cd, B:51:0x00df, B:52:0x00e3), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001c, B:6:0x0059, B:18:0x0097, B:20:0x00a0, B:21:0x00a3, B:24:0x0137, B:25:0x0144, B:27:0x014a, B:29:0x0152, B:31:0x0156, B:33:0x015d, B:41:0x013e, B:42:0x00a8, B:44:0x00ae, B:55:0x00fe, B:56:0x011c, B:58:0x0122, B:59:0x0126, B:61:0x012c, B:62:0x0070, B:65:0x007a, B:68:0x0084, B:71:0x0045, B:73:0x0049, B:75:0x0051, B:46:0x00b9, B:48:0x00c3, B:50:0x00cd, B:51:0x00df, B:52:0x00e3), top: B:2:0x0002, inners: #0 }] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m108620O(C29105a c29105a) {
        char c11;
        C3014o c3014o;
        try {
            C3020p0 c3020p0 = c29105a.f134929b;
            String str = c29105a.f134930c;
            String str2 = c29105a.f134931d;
            Context context = c29105a.f134928a;
            InterfaceC2259a interfaceC2259a = c29105a.f134933f;
            TrackingSource trackingSource = c29105a.f134934g;
            C3025q0.d dVar = c29105a.f134932e;
            int i11 = c29105a.f134935h;
            int m40667f = TrackingSource.m40667f(c3020p0);
            String str3 = "";
            if (m40667f == 10) {
                str3 = new TrackingSource.C7894b().m40694f(10).m40691c(c3020p0.f12057p).m40693e(c3020p0.f12058q).m40692d(c3020p0.m14465A()).m40695g(i11).m40689a();
            } else {
                C32145v4 c32145v4 = c3020p0.f12039S;
                if (c32145v4 != null && !TextUtils.isEmpty(c32145v4.f148248a)) {
                    str3 = TrackingSource.m40672k(m40667f, c3020p0.f12039S.f148248a);
                }
            }
            int hashCode = str.hashCode();
            if (hashCode != -1392351947) {
                if (hashCode != -966632145) {
                    if (hashCode == 1986893040 && str.equals("action.open.inapp")) {
                        c11 = 1;
                        if (c11 == 0) {
                            if (c11 != 1) {
                                if (c11 != 2) {
                                    if (interfaceC2259a != null) {
                                        C31877d c31877d = new C31877d(trackingSource);
                                        C32002l4 c32002l4 = c29105a.f134936i;
                                        if (c32002l4 != null) {
                                            c31877d.m153184c(c32002l4);
                                        }
                                        interfaceC2259a.mo11938V2(str, str2, c31877d);
                                    }
                                } else if (!TextUtils.isEmpty(str2)) {
                                    String m96089h = AbstractC18069a.m96089h(new JSONObject(str2), "android");
                                    try {
                                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(m96089h);
                                        if (launchIntentForPackage != null) {
                                            if (!TextUtils.isEmpty(c3020p0.f12022B.f12287i)) {
                                                launchIntentForPackage.putExtra("referrer", URLEncoder.encode(c3020p0.f12022B.f12287i, "UTF-8"));
                                            }
                                            context.startActivity(launchIntentForPackage);
                                        } else {
                                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(context.getString(AbstractC8020f0.str_ratezalo_url), m96089h))));
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(context.getString(AbstractC8020f0.str_ratezalo_url), m96089h))));
                                    }
                                }
                            } else if (!TextUtils.isEmpty(str2)) {
                                AbstractC23118k2.m118602o(context, str2, m40667f, str3);
                            }
                        } else if (!TextUtils.isEmpty(str2)) {
                            AbstractC23118k2.m118600m(context, Long.parseLong(str2), m40667f, str3);
                        }
                        if (dVar == null) {
                            FeedActionZUtils.m47521I(c3020p0, dVar, 20);
                            FeedActionZUtils.m47559q(c3020p0, dVar);
                        } else {
                            FeedActionZUtils.m47520H(c3020p0, 20);
                            FeedActionZUtils.m47558p(c3020p0);
                        }
                        if (c3020p0.f12058q != 100 && (c3014o = c3020p0.f12023C.f12135z.f12168s) != null && c3014o.f11995a) {
                            AbstractC20826v0.m108806e0(c3020p0.f12057p);
                            if (interfaceC2259a != null) {
                                interfaceC2259a.mo11927O();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    c11 = 65535;
                    if (c11 == 0) {
                    }
                    if (dVar == null) {
                    }
                    if (c3020p0.f12058q != 100) {
                        return;
                    } else {
                        return;
                    }
                }
                if (str.equals("action.open.gamedetail")) {
                    c11 = 0;
                    if (c11 == 0) {
                    }
                    if (dVar == null) {
                    }
                    if (c3020p0.f12058q != 100) {
                    }
                }
                c11 = 65535;
                if (c11 == 0) {
                }
                if (dVar == null) {
                }
                if (c3020p0.f12058q != 100) {
                }
            } else {
                if (str.equals("action.open.app")) {
                    c11 = 2;
                    if (c11 == 0) {
                    }
                    if (dVar == null) {
                    }
                    if (c3020p0.f12058q != 100) {
                    }
                }
                c11 = 65535;
                if (c11 == 0) {
                }
                if (dVar == null) {
                }
                if (c3020p0.f12058q != 100) {
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
        AbstractC20110a.m104539h(e12);
    }

    /* renamed from: P */
    public static /* synthetic */ boolean m108621P(ArrayList arrayList, Context context, String str, View view) {
        try {
            m108593A();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    if (c10866e != null && c10866e.m56411z()) {
                        return false;
                    }
                }
            }
            KeyEventCallbackC17462c m118462o = AbstractC23093i.m118462o(context, str);
            f102271a = m118462o;
            if (m118462o != null) {
                m118462o.mo13822K();
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m108622Q(ArrayList arrayList, Context context, String str, C16719g c16719g) {
        try {
            m108593A();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    if (c10866e != null && c10866e.m56411z()) {
                        return;
                    }
                }
            }
            if (!AbstractC23093i.m118471x()) {
                KeyEventCallbackC17462c m118462o = AbstractC23093i.m118462o(context, str);
                f102271a = m118462o;
                if (m118462o != null) {
                    m118462o.mo13822K();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m108623R(ArrayList arrayList, C3020p0 c3020p0, TextView textView, TextView textView2, TextView textView3, boolean z11, Context context, InterfaceC2266h interfaceC2266h, String str, String str2, View view) {
        int i11;
        try {
            m108593A();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    if (c10866e != null && c10866e.m56411z()) {
                        return false;
                    }
                }
            }
            if (TextUtils.isEmpty(c3020p0.f12023C.f12115f) && C23055e5.m118271f()) {
                WeakReference weakReference = new WeakReference(textView);
                WeakReference weakReference2 = new WeakReference(textView2);
                int height = textView2.getHeight();
                if (textView3 != null && textView3.isShown()) {
                    i11 = textView3.getHeight() + AbstractC23136l9.m118742r(16.0f);
                } else {
                    i11 = 0;
                }
                int i12 = height + i11;
                String charSequence = textView2.getText().toString();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new c(weakReference, weakReference2, c3020p0, z11, charSequence, view, context, interfaceC2266h, i12));
                f102271a = AbstractC23093i.m118461n(context, str, new InterfaceC2267i() { // from class: is.f0

                    /* renamed from: b */
                    public final /* synthetic */ String f102171b;

                    public /* synthetic */ C20794f0(String str22) {
                        r2 = str22;
                    }

                    @Override // ao.InterfaceC2267i
                    /* renamed from: a */
                    public final void mo11994a() {
                        AbstractC20814p0.m108626U(InterfaceC0765j.this, r2);
                    }
                });
            } else {
                f102271a = AbstractC23093i.m118462o(context, str);
            }
            KeyEventCallbackC17462c keyEventCallbackC17462c = f102271a;
            if (keyEventCallbackC17462c != null) {
                keyEventCallbackC17462c.mo13822K();
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: S */
    public static /* synthetic */ void m108624S(InterfaceC0765j interfaceC0765j, String str) {
        String str2;
        if (TextUtils.isEmpty(AbstractC18458a.f93019a)) {
            str2 = "vi";
        } else {
            str2 = AbstractC18458a.f93019a;
        }
        interfaceC0765j.mo1660i7(str, str2, "AIzaSyCl62jwgaf_aF9pICIzsxN2U7rzKpQNMvU");
    }

    /* renamed from: T */
    public static /* synthetic */ void m108625T(ArrayList arrayList, C3020p0 c3020p0, C21697g c21697g, C21697g c21697g2, C21697g c21697g3, boolean z11, Context context, InterfaceC2266h interfaceC2266h, String str, String str2, C16719g c16719g) {
        int i11;
        try {
            m108593A();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    if (c10866e != null) {
                        c10866e.m56411z();
                    }
                }
            }
            if (TextUtils.isEmpty(c3020p0.f12023C.f12115f) && C23055e5.m118271f()) {
                WeakReference weakReference = new WeakReference(c21697g);
                WeakReference weakReference2 = new WeakReference(c21697g2);
                int m89112O = c21697g2.m89112O();
                if (c21697g3 != null && c21697g3.isShown()) {
                    i11 = c21697g3.m89112O() + AbstractC23136l9.m118742r(16.0f);
                } else {
                    i11 = 0;
                }
                int i12 = m89112O + i11;
                String charSequence = c21697g2.m111973m1().toString();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new d(weakReference, weakReference2, c3020p0, z11, charSequence, context, interfaceC2266h, i12));
                f102271a = AbstractC23093i.m118461n(context, str, new InterfaceC2267i() { // from class: is.e0

                    /* renamed from: b */
                    public final /* synthetic */ String f102165b;

                    public /* synthetic */ C20792e0(String str22) {
                        r2 = str22;
                    }

                    @Override // ao.InterfaceC2267i
                    /* renamed from: a */
                    public final void mo11994a() {
                        AbstractC20814p0.m108624S(InterfaceC0765j.this, r2);
                    }
                });
            } else {
                f102271a = AbstractC23093i.m118462o(context, str);
            }
            KeyEventCallbackC17462c keyEventCallbackC17462c = f102271a;
            if (keyEventCallbackC17462c != null) {
                keyEventCallbackC17462c.mo13822K();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m108626U(InterfaceC0765j interfaceC0765j, String str) {
        String str2;
        if (TextUtils.isEmpty(AbstractC18458a.f93019a)) {
            str2 = "vi";
        } else {
            str2 = AbstractC18458a.f93019a;
        }
        interfaceC0765j.mo1660i7(str, str2, "AIzaSyCl62jwgaf_aF9pICIzsxN2U7rzKpQNMvU");
    }

    /* renamed from: V */
    public static /* synthetic */ void m108627V(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, View view) {
        if (!c3020p0.m14493X()) {
            AbstractC23647d.m123906p("490201");
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11948c1(c3020p0);
            }
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m108628W(C3020p0 c3020p0, boolean z11, InterfaceC2259a interfaceC2259a, C16719g c16719g) {
        String str;
        if (!c3020p0.m14493X()) {
            if (z11) {
                str = "6516";
            } else {
                str = "490201";
            }
            AbstractC23647d.m123906p(str);
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11948c1(c3020p0);
            }
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m108629X(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, View view) {
        C3025q0 c3025q0;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && interfaceC2259a != null) {
            interfaceC2259a.mo11971un(c3025q0.f12111b);
        }
    }

    /* renamed from: Y */
    public static /* synthetic */ void m108630Y(WeakReference weakReference, WeakReference weakReference2, CharSequence charSequence, int i11, int i12, C3013n3 c3013n3, boolean z11, int i13, String str, C31890dc c31890dc) {
        boolean z12;
        FeedBackgroundView feedBackgroundView;
        int i14;
        try {
            TextView textView = (TextView) weakReference.get();
            int i15 = 0;
            if (c31890dc != null && !c31890dc.m153248s()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i13 == 0 && !str.equals(String.valueOf(0)) && z12 && (feedBackgroundView = (FeedBackgroundView) weakReference2.get()) != null && str.equals(feedBackgroundView.getTag(1090453510))) {
                if (c31890dc.m153249t()) {
                    i14 = C31890dc.f146485E;
                } else {
                    i14 = c31890dc.f146497c;
                }
                CharSequence m143352C = C28652r.m143349v().m143352C(new SpannableStringBuilder(charSequence), AbstractC23136l9.m118742r(i14));
                CharSequence m153072x = C31845ac.m152996J().m153072x(m143352C, c31890dc, i11, i12, 7);
                feedBackgroundView.setContent(m153072x);
                if (!TextUtils.isEmpty(m153072x)) {
                    if (c31890dc.m153248s()) {
                        feedBackgroundView.setTypeRender(0);
                        feedBackgroundView.m43642n(c31890dc, false);
                    } else if (c3013n3.m14430a()) {
                        int i16 = AbstractC6918a0.tag_visibility;
                        if (TextUtils.isEmpty(m143352C)) {
                            i15 = 8;
                        }
                        feedBackgroundView.m43644q(i16, Integer.valueOf(i15));
                        feedBackgroundView.m43641m(c31890dc, false, z11, m153072x, c3013n3.f11989a, 7);
                    }
                }
            }
            if (textView != null) {
                m108676w(textView.getText(), textView);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:46:0x0009, B:5:0x0017, B:8:0x0023, B:10:0x002c, B:12:0x0039, B:14:0x003f, B:15:0x0046, B:17:0x0070, B:19:0x0076, B:20:0x007f, B:22:0x0085, B:25:0x0090, B:27:0x0042, B:28:0x00a5, B:30:0x00ab, B:31:0x00ba, B:33:0x00c0, B:35:0x00c6), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:46:0x0009, B:5:0x0017, B:8:0x0023, B:10:0x002c, B:12:0x0039, B:14:0x003f, B:15:0x0046, B:17:0x0070, B:19:0x0076, B:20:0x007f, B:22:0x0085, B:25:0x0090, B:27:0x0042, B:28:0x00a5, B:30:0x00ab, B:31:0x00ba, B:33:0x00c0, B:35:0x00c6), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:46:0x0009, B:5:0x0017, B:8:0x0023, B:10:0x002c, B:12:0x0039, B:14:0x003f, B:15:0x0046, B:17:0x0070, B:19:0x0076, B:20:0x007f, B:22:0x0085, B:25:0x0090, B:27:0x0042, B:28:0x00a5, B:30:0x00ab, B:31:0x00ba, B:33:0x00c0, B:35:0x00c6), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:46:0x0009, B:5:0x0017, B:8:0x0023, B:10:0x002c, B:12:0x0039, B:14:0x003f, B:15:0x0046, B:17:0x0070, B:19:0x0076, B:20:0x007f, B:22:0x0085, B:25:0x0090, B:27:0x0042, B:28:0x00a5, B:30:0x00ab, B:31:0x00ba, B:33:0x00c0, B:35:0x00c6), top: B:45:0x0009 }] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m108631Z(WeakReference weakReference, CharSequence charSequence, int i11, int i12, int i13, C3013n3 c3013n3, boolean z11, C8362q0 c8362q0, C3020p0 c3020p0, int i14, String str, C31890dc c31890dc) {
        boolean z12;
        C8362q0 c8362q02;
        int m153244m;
        CharSequence m153072x;
        int i15 = 0;
        if (c31890dc != null) {
            try {
                if (!c31890dc.m153248s()) {
                    z12 = true;
                    if (i14 == 0 && !str.equals(String.valueOf(0)) && z12 && (c8362q02 = (C8362q0) weakReference.get()) != null && str.equals(c8362q02.getTag(1090453510))) {
                        if (!c31890dc.m153249t()) {
                            m153244m = C31890dc.f146485E;
                        } else {
                            m153244m = c31890dc.m153244m(charSequence, i11);
                        }
                        CharSequence m143352C = C28652r.m143349v().m143352C(new SpannableStringBuilder(charSequence), AbstractC23136l9.m118742r(m153244m));
                        m153072x = C31845ac.m152996J().m153072x(m143352C, c31890dc, i12, i13, 7);
                        c8362q02.m44799D1(m153072x);
                        if (!TextUtils.isEmpty(m153072x)) {
                            if (c31890dc.m153248s()) {
                                c8362q02.m44804I1(0);
                                c8362q02.m44798C1(c31890dc, false, "", i11);
                            } else if (c3013n3.m14430a()) {
                                int i16 = AbstractC6918a0.tag_visibility;
                                if (TextUtils.isEmpty(m143352C)) {
                                    i15 = 8;
                                }
                                c8362q02.m44803H1(i16, Integer.valueOf(i15));
                                c8362q02.m44796A1(c31890dc, false, z11, m153072x, c3013n3.f11989a, i11);
                            }
                        }
                    }
                    if (c8362q0.m44809s1() != null) {
                        m108678x(c8362q0.m44809s1().m111973m1(), c8362q0.m44809s1());
                    }
                    if (c8362q0.m44809s1() == null && c3020p0.m14486Q()) {
                        c8362q0.m44809s1().m89106L().m89029M(12);
                        return;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        z12 = false;
        if (i14 == 0) {
            if (!c31890dc.m153249t()) {
            }
            CharSequence m143352C2 = C28652r.m143349v().m143352C(new SpannableStringBuilder(charSequence), AbstractC23136l9.m118742r(m153244m));
            m153072x = C31845ac.m152996J().m153072x(m143352C2, c31890dc, i12, i13, 7);
            c8362q02.m44799D1(m153072x);
            if (!TextUtils.isEmpty(m153072x)) {
            }
        }
        if (c8362q0.m44809s1() != null) {
        }
        if (c8362q0.m44809s1() == null) {
        }
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m108633a0(WeakReference weakReference, CharSequence charSequence, C3013n3 c3013n3, boolean z11, int i11, int i12, String str, C31890dc c31890dc) {
        int i13;
        int i14;
        try {
            FeedBackgroundView feedBackgroundView = (FeedBackgroundView) weakReference.get();
            if (i12 == 0) {
                int i15 = 0;
                if (!str.equals(String.valueOf(0)) && c31890dc != null && feedBackgroundView != null && str.equals(feedBackgroundView.getTag(1090453510))) {
                    if (c31890dc.m153249t()) {
                        i13 = C31890dc.f146485E;
                    } else {
                        i13 = c31890dc.f146497c;
                    }
                    CharSequence m143352C = C28652r.m143349v().m143352C(new SpannableStringBuilder(charSequence), AbstractC23136l9.m118742r(i13));
                    feedBackgroundView.setContent(m143352C);
                    if (!TextUtils.isEmpty(m143352C)) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    feedBackgroundView.setVisibility(i14);
                    if (c31890dc.m153248s()) {
                        feedBackgroundView.setTypeRender(0);
                        feedBackgroundView.m43642n(c31890dc, false);
                    } else if (c3013n3.m14430a()) {
                        int i16 = AbstractC6918a0.tag_visibility;
                        if (TextUtils.isEmpty(m143352C)) {
                            i15 = 8;
                        }
                        feedBackgroundView.m43644q(i16, Integer.valueOf(i15));
                        feedBackgroundView.setTypeRender(1);
                        feedBackgroundView.m43641m(c31890dc, false, z11, m143352C, c3013n3.f11989a, i11);
                    }
                }
            }
            if (feedBackgroundView.getViewRender() != null) {
                m108676w(feedBackgroundView.getViewRender().getText(), feedBackgroundView.getViewRender());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m108635b0(WeakReference weakReference, CharSequence charSequence, int i11, C3013n3 c3013n3, boolean z11, WeakReference weakReference2, CharSequence charSequence2, C8362q0 c8362q0, int i12, String str, C31890dc c31890dc) {
        int m153244m;
        int i13;
        if (i12 == 0) {
            try {
                if (!str.equals(String.valueOf(0)) && c31890dc != null) {
                    C8362q0 c8362q02 = (C8362q0) weakReference.get();
                    if (c8362q02 != null && str.equals(c8362q02.getTag(1090453510))) {
                        if (c31890dc.m153249t()) {
                            m153244m = C31890dc.f146485E;
                        } else {
                            m153244m = c31890dc.m153244m(charSequence, i11);
                        }
                        CharSequence m143352C = C28652r.m143349v().m143352C(new SpannableStringBuilder(charSequence), AbstractC23136l9.m118742r(m153244m));
                        c8362q02.m44799D1(m143352C);
                        int i14 = 8;
                        if (!TextUtils.isEmpty(m143352C)) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        c8362q02.mo44614b1(i13);
                        if (c31890dc.m153248s()) {
                            c8362q02.m44804I1(0);
                            c8362q02.m44798C1(c31890dc, false, "", i11);
                        } else if (c3013n3.m14430a()) {
                            int i15 = AbstractC6918a0.tag_visibility;
                            if (!TextUtils.isEmpty(m143352C)) {
                                i14 = 0;
                            }
                            c8362q02.m44803H1(i15, Integer.valueOf(i14));
                            c8362q02.m44804I1(1);
                            c8362q02.m44796A1(c31890dc, false, z11, m143352C, c3013n3.f11989a, i11);
                        }
                    }
                    C21697g c21697g = (C21697g) weakReference2.get();
                    if (c21697g != null && !TextUtils.isEmpty(charSequence2)) {
                        c21697g.m111955C1(C10880s.m56519f());
                        c21697g.mo44614b1(0);
                        c21697g.m111959G1(charSequence2);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        if (c8362q0.m44809s1() != null) {
            m108678x(c8362q0.m44809s1().m111973m1(), c8362q0.m44809s1());
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m108637c0(AspectRatioImageView aspectRatioImageView, String str, C3979l c3979l, boolean z11) {
        try {
            aspectRatioImageView.setShowLoading(false);
            if (c3979l != null && aspectRatioImageView.getTag().equals(str)) {
                if (z11) {
                    aspectRatioImageView.setImageInfo(c3979l);
                } else {
                    aspectRatioImageView.setImageInfoAnim(c3979l);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: d0 */
    private static void m108639d0(ImageView imageView, String str, C24003n c24003n, C23528a c23528a) {
        try {
            if (imageView instanceof RecyclingImageView) {
                ((C23528a) c23528a.m123612r((RecyclingImageView) imageView)).m123619y(str, c24003n, 10);
            } else {
                C3977j c3977j = new C3977j(MainApplication.getAppContext());
                ((C23528a) c23528a.m123612r(c3977j)).m123579C(str, c24003n, new a(c3977j, imageView));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e0 */
    public static boolean m108641e0(int i11) {
        return i11 == 6 || i11 == 2 || i11 == 3 || i11 == 11;
    }

    /* renamed from: f0 */
    private static String m108643f0(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: g0 */
    private static String m108645g0(String str) {
        if (str == null) {
            return "";
        }
        String[] split = str.split("\\s+");
        if (split.length <= 0) {
            return "";
        }
        return TextUtils.join(" ", Arrays.copyOfRange(split, 0, split.length - 1));
    }

    /* renamed from: h0 */
    public static void m108647h0(C3000l0 c3000l0, int i11, C8289h1 c8289h1, boolean z11, InterfaceC2259a interfaceC2259a) {
        int i12;
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14324b0(i11) != null) {
                    C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                    if (c8289h1 != null) {
                        if (m14324b0.m14479H()) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        c8289h1.mo44614b1(i12);
                        c8289h1.m44689v1(c3000l0, i11, z11, interfaceC2259a, 0);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: i0 */
    public static void m108649i0(C3000l0 c3000l0, C21697g c21697g, InterfaceC10867f interfaceC10867f) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3003l3.c cVar = c3000l0.f11851A;
            if (cVar != null && cVar.f11959d != null) {
                c21697g.m111959G1(cVar.f11958c);
                Iterator it = c3000l0.f11851A.f11959d.iterator();
                while (it.hasNext()) {
                    C10866e.m56359e((C10866e) it.next(), c3000l0.f11895q, c3000l0.m14322a0().f12022B.f12280b, c3000l0.f11851A.f11956a, -1, interfaceC10867f);
                }
            }
            c21697g.m111955C1(C10880s.m56519f());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j0 */
    public static void m108651j0(C3000l0 c3000l0, int i11, View view, RobotoTextView robotoTextView, ImageView imageView, RobotoTextView robotoTextView2, boolean z11, C23528a c23528a, InterfaceC10867f interfaceC10867f, int i12) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            m108657m0(m14324b0, view, robotoTextView, imageView, robotoTextView2, z11, c23528a, interfaceC10867f, i12, c3000l0.f11896q0, m14324b0.m14494Y());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k0 */
    public static void m108653k0(C3000l0 c3000l0, int i11, ImageButton imageButton, RobotoTextView robotoTextView, View view, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, boolean z11, C23528a c23528a, InterfaceC10867f interfaceC10867f, int i12) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            m108659n0(m14324b0, imageButton, robotoTextView, view, robotoTextView2, robotoTextView3, z11, c23528a, interfaceC10867f, i12, c3000l0.f11896q0, m14324b0.m14494Y());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l0 */
    public static void m108655l0(C3000l0 c3000l0, int i11, C21693c c21693c, C22126c0 c22126c0, C22122a0 c22122a0, C22126c0 c22126c02, boolean z11, C23528a c23528a, InterfaceC10867f interfaceC10867f, int i12) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            m108661o0(m14324b0, c21693c, c22126c0, c22122a0, c22126c02, z11, c23528a, interfaceC10867f, i12, c3000l0.f11896q0, m14324b0.m14494Y());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: m0 */
    public static void m108657m0(C3020p0 c3020p0, View view, RobotoTextView robotoTextView, ImageView imageView, RobotoTextView robotoTextView2, boolean z11, C23528a c23528a, InterfaceC10867f interfaceC10867f, int i11, int i12, boolean z12) {
        try {
            C3047v0 c3047v0 = c3020p0.f12022B;
            String m114542i = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
            m108663p0(c3020p0, robotoTextView, interfaceC10867f, i11, i12, z12);
            if (imageView != null) {
                imageView.setImageDrawable(C23212s8.m119609q(imageView.getContext(), AbstractC16781w.default_avatar));
                String str = c3020p0.f12022B.f12283e;
                if (!TextUtils.isEmpty(str)) {
                    boolean z13 = AbstractC23304d.m120536g().f147980a;
                    if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(c3020p0.f12022B.f12280b)) {
                        int m12307a = C2343e.m12307a(c3020p0.f12022B.f12280b, false);
                        imageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), m12307a));
                    } else if (!z11 || !z13 || C23999j.m125696L2(str, C23278z2.m120143n())) {
                        m108639d0(imageView, str, C23278z2.m120143n(), c23528a);
                    }
                }
            }
            String m119284r = AbstractC23160o0.m119284r(c3020p0.f12062u, true);
            if (robotoTextView2 != null) {
                robotoTextView2.setText(m119284r);
            }
            if (view != null) {
                if (c3020p0.m14493X()) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            FeedActionZUtils.m47543c(c3020p0.f12057p, "new_feed");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n0 */
    public static void m108659n0(C3020p0 c3020p0, ImageButton imageButton, RobotoTextView robotoTextView, View view, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, boolean z11, C23528a c23528a, InterfaceC10867f interfaceC10867f, int i11, int i12, boolean z12) {
        int i13;
        ContactProfile contactProfile;
        boolean z13;
        String str;
        try {
            C3047v0 c3047v0 = c3020p0.f12022B;
            String m114542i = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
            m108663p0(c3020p0, robotoTextView, interfaceC10867f, i11, i12, z12);
            if (view != null) {
                boolean z14 = AbstractC23304d.m120536g().f147980a;
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageDrawable(C23212s8.m119609q(view.getContext(), AbstractC16781w.default_avatar));
                    String str2 = c3020p0.f12022B.f12283e;
                    if (!TextUtils.isEmpty(str2)) {
                        if (C23302b.f113247a.m120523d(str2) && !CoreUtility.f89233i.equals(c3020p0.f12022B.f12280b)) {
                            int m12307a = C2343e.m12307a(c3020p0.f12022B.f12280b, false);
                            ((ImageView) view).setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), m12307a));
                        } else if (!z11 || !z14 || C23999j.m125696L2(str2, C23278z2.m120143n())) {
                            m108639d0((ImageView) view, str2, C23278z2.m120143n(), c23528a);
                        }
                    }
                } else if (view instanceof GroupAvatarView) {
                    ContactProfile m118084d = AbstractC23028c0.m118084d(c3020p0.f12022B.f12280b);
                    if (m118084d != null) {
                        contactProfile = ContactProfile.m40356w(m118084d);
                        if (!TextUtils.isEmpty(m118084d.f42446v) && CoreUtility.f89233i.equals(m118084d.f42434r)) {
                            str = m118084d.f42446v;
                        } else {
                            str = c3020p0.f12022B.f12283e;
                        }
                        contactProfile.f42446v = str;
                    } else {
                        contactProfile = new ContactProfile(c3020p0.f12022B.f12280b);
                        contactProfile.f42427o1 = AbstractC23028c0.m118087g(m114542i);
                        C3047v0 c3047v02 = c3020p0.f12022B;
                        contactProfile.f42446v = c3047v02.f12283e;
                        contactProfile.f42437s = c3047v02.f12282d;
                    }
                    GroupAvatarView groupAvatarView = (GroupAvatarView) view;
                    if (z11 && z14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    groupAvatarView.setScrollingMode(z13);
                    ((GroupAvatarView) view).setStrokeDisableColor(AbstractC22055v0.m115162v(view.getContext()));
                    ((GroupAvatarView) view).m75736i(AbstractC22055v0.m115116F(c3020p0.f12022B.f12280b, false), AbstractC22055v0.m115115E(c3020p0.f12022B.f12280b, false));
                    ((GroupAvatarView) view).setStateLoadingStory(AbstractC22055v0.m115112B(c3020p0.f12022B.f12280b));
                    ((GroupAvatarView) view).m75731c(contactProfile);
                }
            }
            String m119284r = AbstractC23160o0.m119284r(c3020p0.f12062u, true);
            if (robotoTextView2 != null) {
                robotoTextView2.setText(m119284r);
            }
            if (robotoTextView3 != null) {
                if (!c3020p0.m14494Y() && c3020p0.m14488S()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                robotoTextView3.setVisibility(i13);
            }
            if (imageButton != null) {
                if (c3020p0.m14493X()) {
                    imageButton.setVisibility(8);
                } else {
                    imageButton.setVisibility(0);
                }
            }
            FeedActionZUtils.m47543c(c3020p0.f12057p, "new_feed");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: o */
    public static void m108660o(Context context, View view, String str, ArrayList arrayList) {
        if (view != null && !TextUtils.isEmpty(str) && context != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: is.l0

                /* renamed from: p */
                public final /* synthetic */ ArrayList f102242p;

                /* renamed from: q */
                public final /* synthetic */ Context f102243q;

                /* renamed from: r */
                public final /* synthetic */ String f102244r;

                public /* synthetic */ ViewOnLongClickListenerC20806l0(ArrayList arrayList2, Context context2, String str2) {
                    r1 = arrayList2;
                    r2 = context2;
                    r3 = str2;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m108621P;
                    m108621P = AbstractC20814p0.m108621P(r1, r2, r3, view2);
                    return m108621P;
                }
            });
        }
    }

    /* renamed from: o0 */
    public static void m108661o0(C3020p0 c3020p0, C21693c c21693c, C22126c0 c22126c0, C22122a0 c22122a0, C22126c0 c22126c02, boolean z11, C23528a c23528a, InterfaceC10867f interfaceC10867f, int i11, int i12, boolean z12) {
        try {
            C3047v0 c3047v0 = c3020p0.f12022B;
            String m114542i = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
            m108665q0(c3020p0, c22126c0, interfaceC10867f, i11, i12, z12);
            if (c22122a0 != null) {
                c22122a0.mo111926w1(AbstractC16803z.default_avatar);
                String str = c3020p0.f12022B.f12283e;
                if (!TextUtils.isEmpty(str)) {
                    boolean z13 = AbstractC23304d.m120536g().f147980a;
                    if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(c3020p0.f12022B.f12280b)) {
                        int m12307a = C2343e.m12307a(c3020p0.f12022B.f12280b, false);
                        c22122a0.mo111925v1(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), m12307a));
                    } else if (!z11 || !z13 || C23999j.m125696L2(str, C23278z2.m120143n())) {
                        c22122a0.mo65956I1(c23528a, str, C23278z2.m120143n(), 10, C3979l.b.UNKNOWN, new b(c3020p0));
                    }
                }
            }
            String m119284r = AbstractC23160o0.m119284r(c3020p0.f12062u, true);
            if (c22126c02 != null) {
                c22126c02.m111959G1(m119284r);
            }
            if (c21693c != null) {
                if (c3020p0.m14493X()) {
                    c21693c.mo44614b1(8);
                } else {
                    c21693c.mo44614b1(0);
                }
            }
            FeedActionZUtils.m47543c(c3020p0.f12057p, "new_feed");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: p */
    public static void m108662p(Context context, C16719g c16719g, String str, ArrayList arrayList) {
        if (c16719g != null && !TextUtils.isEmpty(str) && context != null) {
            c16719g.m89111N0(new C16719g.d() { // from class: is.d0

                /* renamed from: p */
                public final /* synthetic */ ArrayList f102156p;

                /* renamed from: q */
                public final /* synthetic */ Context f102157q;

                /* renamed from: r */
                public final /* synthetic */ String f102158r;

                public /* synthetic */ C20790d0(ArrayList arrayList2, Context context2, String str2) {
                    r1 = arrayList2;
                    r2 = context2;
                    r3 = str2;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g2) {
                    AbstractC20814p0.m108622Q(r1, r2, r3, c16719g2);
                }
            });
        }
    }

    /* renamed from: p0 */
    public static void m108663p0(C3020p0 c3020p0, RobotoTextView robotoTextView, InterfaceC10867f interfaceC10867f, int i11, int i12, boolean z11) {
        m108667r0(c3020p0, robotoTextView, interfaceC10867f, i11, i12, z11);
    }

    /* renamed from: q */
    public static void m108664q(CharSequence charSequence, C21697g c21697g, int i11) {
        if (c21697g != null && charSequence != null) {
            AbstractC23136l9.m118703e(charSequence, c21697g, i11);
        }
    }

    /* renamed from: q0 */
    public static void m108665q0(C3020p0 c3020p0, C22126c0 c22126c0, InterfaceC10867f interfaceC10867f, int i11, int i12, boolean z11) {
        m108667r0(c3020p0, c22126c0, interfaceC10867f, i11, i12, z11);
    }

    /* renamed from: r */
    static void m108666r(Context context, TextView textView, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && textView != null && context != null) {
            if (f102272b == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), AbstractC16803z.ic_google_translate_short);
                f102272b = decodeResource;
                f102272b = AbstractC23170p.m119367y(decodeResource, AbstractC23136l9.m118762x1(96.0f));
            }
            int m118722k0 = AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(16.0f) * 2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("\u0000 \n\n");
            spannableStringBuilder.setSpan(new C10884w(f102272b, m118722k0), 1, 2, 17);
            spannableStringBuilder.append(charSequence);
            textView.setMovementMethod(CustomMovementMethod.m56305e());
            textView.setVisibility(0);
            textView.setText(spannableStringBuilder);
            if (textView.getContext() != null) {
                context = textView.getContext();
            }
            m108660o(context, textView, charSequence.toString(), null);
        }
    }

    /* renamed from: r0 */
    private static void m108667r0(C3020p0 c3020p0, Object obj, InterfaceC10867f interfaceC10867f, int i11, int i12, boolean z11) {
        String str;
        SpannableString spannableString;
        if (obj != null && c3020p0 != null) {
            try {
                if (!(obj instanceof RobotoTextView) && !(obj instanceof C21697g)) {
                    return;
                }
                C3047v0 c3047v0 = c3020p0.f12022B;
                String m114542i = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
                String str2 = c3020p0.f12022B.f12291m;
                String m14465A = c3020p0.m14465A();
                int i13 = 1;
                boolean z12 = !TextUtils.isEmpty(str2);
                if (z12) {
                    Spanned fromHtml = Html.fromHtml(String.format("<a href=\"zm://FeedActivity/%s\">%s</a> ", m14465A, m108595B(m114542i, str2, 2, i11, i12, z11)) + str2);
                    spannableString = new SpannableString(fromHtml.toString());
                    for (Object obj2 : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
                        int spanStart = fromHtml.getSpanStart(obj2);
                        int spanEnd = fromHtml.getSpanEnd(obj2);
                        int spanFlags = fromHtml.getSpanFlags(obj2);
                        if (obj2 instanceof URLSpan) {
                            C10866e c10866e = new C10866e(((URLSpan) obj2).getURL(), spanStart, spanEnd);
                            c10866e.m56369M(interfaceC10867f);
                            spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                        }
                    }
                    i13 = 2;
                } else {
                    spannableString = new SpannableString(m114542i);
                }
                if (obj instanceof RobotoTextView) {
                    m108680y((RobotoTextView) obj, z12, i11);
                    ((RobotoTextView) obj).setText(spannableString);
                    ((RobotoTextView) obj).setMaxLines(i13);
                    ((RobotoTextView) obj).setMovementMethod(CustomMovementMethod.m56305e());
                    AbstractC23136l9.m118702d1(MainApplication.getAppContext(), c3020p0, (RobotoTextView) obj);
                    return;
                }
                if (obj instanceof C22126c0) {
                    m108682z((C22126c0) obj, z12, i11);
                    ((C22126c0) obj).m111959G1(spannableString);
                    ((C22126c0) obj).m111953A1(i13);
                    ((C22126c0) obj).m111955C1(C10880s.m56519f());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                C3047v0 c3047v02 = c3020p0.f12022B;
                if (c3047v02 != null) {
                    str = AbstractC21935u.m114542i(c3047v02.f12280b, c3047v02.f12282d);
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    if (obj instanceof RobotoTextView) {
                        ((RobotoTextView) obj).setText(str);
                    } else if (obj instanceof C22126c0) {
                        ((C22126c0) obj).m111959G1(str);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static void m108668s(Context context, C21697g c21697g, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && c21697g != null && context != null) {
            if (f102272b == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), AbstractC16803z.ic_google_translate_short);
                f102272b = decodeResource;
                f102272b = AbstractC23170p.m119367y(decodeResource, AbstractC23136l9.m118762x1(96.0f));
            }
            int m118722k0 = AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(16.0f) * 2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("\u0000 \n\n");
            spannableStringBuilder.setSpan(new C10884w(f102272b, m118722k0), 1, 2, 17);
            spannableStringBuilder.append(charSequence);
            c21697g.m111955C1(C10880s.m56519f());
            c21697g.mo44614b1(0);
            c21697g.m111959G1(spannableStringBuilder);
            if (c21697g.getContext() != null) {
                context = c21697g.getContext();
            }
            m108662p(context, c21697g, charSequence.toString(), null);
        }
    }

    /* renamed from: s0 */
    public static void m108669s0(Context context, C3020p0 c3020p0, TextView textView, InterfaceC2259a interfaceC2259a, int i11) {
        String m45149t;
        if (textView != null) {
            int i12 = 8;
            if (c3020p0 != null) {
                try {
                    if (c3020p0.m14495Z()) {
                        textView.setCompoundDrawablePadding(AbstractC23136l9.m118712h(context, 2.0f));
                        textView.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118665N(textView.getContext(), c3020p0.f12042V.m45142j()), (Drawable) null, (Drawable) null, (Drawable) null);
                        if (i11 == 1) {
                            m45149t = "";
                        } else {
                            m45149t = c3020p0.f12042V.m45149t();
                        }
                        textView.setText(m45149t);
                        if (i11 != 6 && i11 != 11) {
                            i12 = 0;
                        }
                        textView.setVisibility(i12);
                        textView.setOnClickListener(new View.OnClickListener() { // from class: is.m0

                            /* renamed from: q */
                            public final /* synthetic */ InterfaceC2259a f102252q;

                            public /* synthetic */ ViewOnClickListenerC20808m0(InterfaceC2259a interfaceC2259a2) {
                                r2 = interfaceC2259a2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                AbstractC20814p0.m108627V(C3020p0.this, r2, view);
                            }
                        });
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            textView.setVisibility(8);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: is.n0.<init>(java.util.ArrayList, bo.p0, android.widget.TextView, android.widget.TextView, android.widget.TextView, boolean, android.content.Context, ao.h, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: t */
    static void m108670t(android.content.Context r13, android.widget.TextView r14, android.widget.TextView r15, android.widget.TextView r16, bo.C3020p0 r17, boolean r18, ao.InterfaceC2266h r19) {
        /*
            r11 = r14
            r2 = r17
            if (r11 == 0) goto L3f
            if (r13 == 0) goto L3f
            if (r2 != 0) goto La
            goto L3f
        La:
            bo.q0 r0 = r2.f12023C
            java.lang.CharSequence r0 = r0.f12110a
            java.lang.String r9 = r0.toString()
            if (r18 == 0) goto L1a
            java.lang.String r0 = r17.m14529v()
        L18:
            r10 = r0
            goto L1f
        L1a:
            bo.q0 r0 = r2.f12023C
            java.lang.String r0 = r0.f12113d
            goto L18
        L1f:
            java.util.ArrayList r1 = r2.f12029I
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L28
            return
        L28:
            m108593A()
            is.n0 r12 = new is.n0
            r0 = r12
            r2 = r17
            r3 = r16
            r4 = r14
            r5 = r15
            r6 = r18
            r7 = r13
            r8 = r19
            r0.<init>()
            r14.setOnLongClickListener(r12)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: is.AbstractC20814p0.m108670t(android.content.Context, android.widget.TextView, android.widget.TextView, android.widget.TextView, bo.p0, boolean, ao.h):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:8:0x0006, B:18:0x001f, B:20:0x0028, B:23:0x003c, B:24:0x0055, B:27:0x0064, B:33:0x0070, B:35:0x005e, B:36:0x004a, B:37:0x0031, B:4:0x007c), top: B:7:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:8:0x0006, B:18:0x001f, B:20:0x0028, B:23:0x003c, B:24:0x0055, B:27:0x0064, B:33:0x0070, B:35:0x005e, B:36:0x004a, B:37:0x0031, B:4:0x007c), top: B:7:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:8:0x0006, B:18:0x001f, B:20:0x0028, B:23:0x003c, B:24:0x0055, B:27:0x0064, B:33:0x0070, B:35:0x005e, B:36:0x004a, B:37:0x0031, B:4:0x007c), top: B:7:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:8:0x0006, B:18:0x001f, B:20:0x0028, B:23:0x003c, B:24:0x0055, B:27:0x0064, B:33:0x0070, B:35:0x005e, B:36:0x004a, B:37:0x0031, B:4:0x007c), top: B:7:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:8:0x0006, B:18:0x001f, B:20:0x0028, B:23:0x003c, B:24:0x0055, B:27:0x0064, B:33:0x0070, B:35:0x005e, B:36:0x004a, B:37:0x0031, B:4:0x007c), top: B:7:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x001d  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m108671t0(Context context, C3020p0 c3020p0, C22124b0 c22124b0, InterfaceC2259a interfaceC2259a, int i11) {
        boolean z11;
        float f11;
        int m45142j;
        String m45149t;
        if (c22124b0 != null) {
            int i12 = 8;
            if (c3020p0 != null) {
                try {
                    if (c3020p0.m14495Z()) {
                        if (i11 != 2 && i11 != 3) {
                            z11 = false;
                            if (!z11) {
                                f11 = 4.0f;
                            } else {
                                f11 = 2.0f;
                            }
                            c22124b0.m115399p1(AbstractC23136l9.m118712h(context, f11));
                            if (!z11) {
                                m45142j = c3020p0.f12042V.m45143k();
                            } else {
                                m45142j = c3020p0.f12042V.m45142j();
                            }
                            if (i11 != 13) {
                                c22124b0.m115402s1(C27280g.m139659b(c22124b0.getContext(), m45142j, AbstractC16801x.white_70), null, null, null);
                            } else {
                                c22124b0.m115402s1(AbstractC23136l9.m118665N(c22124b0.getContext(), m45142j), null, null, null);
                            }
                            C22126c0 m115398o1 = c22124b0.m115398o1();
                            if (i11 != 1) {
                                m45149t = "";
                            } else {
                                m45149t = c3020p0.f12042V.m45149t();
                            }
                            m115398o1.m111959G1(m45149t);
                            if (i11 != 6 && i11 != 11) {
                                i12 = 0;
                            }
                            c22124b0.mo44614b1(i12);
                            c22124b0.mo89109M0(new C16719g.c() { // from class: is.h0

                                /* renamed from: q */
                                public final /* synthetic */ boolean f102198q;

                                /* renamed from: r */
                                public final /* synthetic */ InterfaceC2259a f102199r;

                                public /* synthetic */ C20798h0(boolean z112, InterfaceC2259a interfaceC2259a2) {
                                    r2 = z112;
                                    r3 = interfaceC2259a2;
                                }

                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    AbstractC20814p0.m108628W(C3020p0.this, r2, r3, c16719g);
                                }
                            });
                            return;
                        }
                        z112 = true;
                        if (!z112) {
                        }
                        c22124b0.m115399p1(AbstractC23136l9.m118712h(context, f11));
                        if (!z112) {
                        }
                        if (i11 != 13) {
                        }
                        C22126c0 m115398o12 = c22124b0.m115398o1();
                        if (i11 != 1) {
                        }
                        m115398o12.m111959G1(m45149t);
                        if (i11 != 6) {
                            i12 = 0;
                        }
                        c22124b0.mo44614b1(i12);
                        c22124b0.mo89109M0(new C16719g.c() { // from class: is.h0

                            /* renamed from: q */
                            public final /* synthetic */ boolean f102198q;

                            /* renamed from: r */
                            public final /* synthetic */ InterfaceC2259a f102199r;

                            public /* synthetic */ C20798h0(boolean z112, InterfaceC2259a interfaceC2259a2) {
                                r2 = z112;
                                r3 = interfaceC2259a2;
                            }

                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g) {
                                AbstractC20814p0.m108628W(C3020p0.this, r2, r3, c16719g);
                            }
                        });
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            c22124b0.mo44614b1(8);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: is.c0.<init>(java.util.ArrayList, bo.p0, kd0.g, kd0.g, kd0.g, boolean, android.content.Context, ao.h, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: u */
    public static void m108672u(android.content.Context r13, kd0.C21697g r14, kd0.C21697g r15, kd0.C21697g r16, bo.C3020p0 r17, boolean r18, ao.InterfaceC2266h r19) {
        /*
            r11 = r14
            r2 = r17
            if (r11 == 0) goto L3f
            if (r13 == 0) goto L3f
            if (r2 != 0) goto La
            goto L3f
        La:
            bo.q0 r0 = r2.f12023C
            java.lang.CharSequence r0 = r0.f12110a
            java.lang.String r9 = r0.toString()
            if (r18 == 0) goto L1a
            java.lang.String r0 = r17.m14529v()
        L18:
            r10 = r0
            goto L1f
        L1a:
            bo.q0 r0 = r2.f12023C
            java.lang.String r0 = r0.f12113d
            goto L18
        L1f:
            java.util.ArrayList r1 = r2.f12029I
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L28
            return
        L28:
            m108593A()
            is.c0 r12 = new is.c0
            r0 = r12
            r2 = r17
            r3 = r16
            r4 = r14
            r5 = r15
            r6 = r18
            r7 = r13
            r8 = r19
            r0.<init>()
            r14.m89111N0(r12)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: is.AbstractC20814p0.m108672u(android.content.Context, kd0.g, kd0.g, kd0.g, bo.p0, boolean, ao.h):void");
    }

    /* renamed from: u0 */
    public static void m108673u0(InterfaceC2259a interfaceC2259a, C3020p0 c3020p0, AspectRatioImageView aspectRatioImageView, C23528a c23528a, boolean z11) {
        if (aspectRatioImageView == null) {
            return;
        }
        try {
            if (c3020p0.m14496a0()) {
                aspectRatioImageView.setVisibility(0);
                m108602E0(aspectRatioImageView.getContext(), c3020p0.f12023C.f12111b, aspectRatioImageView, AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(16.0f) * 2), f102273c, z11, c23528a);
                aspectRatioImageView.setOnClickListener(new View.OnClickListener() { // from class: is.o0

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC2259a f102267q;

                    public /* synthetic */ ViewOnClickListenerC20812o0(InterfaceC2259a interfaceC2259a2) {
                        r2 = interfaceC2259a2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC20814p0.m108629X(C3020p0.this, r2, view);
                    }
                });
            } else {
                aspectRatioImageView.setVisibility(8);
                aspectRatioImageView.setOnClickListener(null);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: v */
    public static void m108674v(Context context) {
        try {
            float m118715i = AbstractC23136l9.m118715i(AbstractC23136l9.m118698c0(), 1.0f);
            int dimension = (int) AbstractC23136l9.m118698c0().getDimension(AbstractC16802y.feed_padding_left_profile_item);
            AbstractC23304d.f113329T = (int) (((((AbstractC23136l9.m118766z(context) - dimension) - ((int) AbstractC23136l9.m118698c0().getDimension(AbstractC16802y.feed_padding_right_profile_item))) - (m118715i * 2.0f)) * 1.0f) / 3.0f);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: v0 */
    public static void m108675v0(C3020p0 c3020p0, TextView textView, boolean z11, boolean z12, Context context, InterfaceC10867f interfaceC10867f) {
        ArrayList arrayList;
        if (textView == null) {
            return;
        }
        try {
            textView.setText("");
            textView.setVisibility(8);
            if (c3020p0 == null) {
                return;
            }
            CharSequence m108607H = m108607H(c3020p0, z11, interfaceC10867f, false);
            if (!TextUtils.isEmpty(m108607H)) {
                Iterator it = c3020p0.f12029I.iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    c10866e.m56371O(z12);
                    c10866e.m56369M(interfaceC10867f);
                }
                Iterator it2 = c3020p0.f12030J.iterator();
                while (it2.hasNext()) {
                    C10866e c10866e2 = (C10866e) it2.next();
                    c10866e2.m56371O(z12);
                    c10866e2.m56369M(interfaceC10867f);
                    if (c3020p0.m14498b0()) {
                        c10866e2.m56372P(1);
                        c10866e2.m56374R(c3020p0.f12058q);
                    } else {
                        c10866e2.m56372P(0);
                        c10866e2.m56374R(c3020p0.f12058q);
                    }
                }
                CharSequence m152970f = C31839a6.m152970f(m108607H, c3020p0.m14531w(z11, false), false, interfaceC10867f);
                C3003l3 c3003l3 = c3020p0.f12059r;
                if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C10866e.m56359e((C10866e) it3.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                    }
                }
                if (z12 && !c3020p0.m14493X()) {
                    textView.setMovementMethod(C10886y.m56528k());
                    C28100j3 c28100j3 = new C28100j3(1);
                    c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                    textView.setTag(Integer.valueOf(AbstractC6918a0.tag_callback_span_listener));
                    textView.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                } else {
                    textView.setMovementMethod(CustomMovementMethod.m56305e());
                }
                textView.setVisibility(0);
                textView.setText(m152970f);
                if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                    m108660o(context, textView, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                } else {
                    textView.setOnLongClickListener(null);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: w */
    public static void m108676w(CharSequence charSequence, View view) {
        if (AbstractC26683d.f126393l) {
            AbstractC28245z3.m142219b(charSequence, view);
        }
    }

    /* renamed from: w0 */
    public static void m108677w0(C3020p0 c3020p0, C21697g c21697g, boolean z11, boolean z12, C21697g c21697g2, C21697g c21697g3, boolean z13, InterfaceC2266h interfaceC2266h, boolean z14, boolean z15, InterfaceC10867f interfaceC10867f) {
        boolean z16;
        int i11;
        boolean z17;
        ArrayList arrayList;
        C3025q0 c3025q0;
        if (c3020p0 != null && c21697g != null) {
            try {
                Context context = c21697g.getContext();
                c21697g.m111959G1("");
                c21697g.mo44614b1(8);
                CharSequence m108607H = m108607H(c3020p0, z11, interfaceC10867f, z12);
                if (z13 && AbstractC23309i.m121528Ve()) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!TextUtils.isEmpty(m108607H)) {
                    ArrayList arrayList2 = c3020p0.f12029I;
                    if (arrayList2 != null) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C10866e c10866e = (C10866e) it.next();
                            c10866e.m56371O(z14);
                            c10866e.m56369M(interfaceC10867f);
                        }
                    }
                    ArrayList arrayList3 = c3020p0.f12030J;
                    if (arrayList3 != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            C10866e c10866e2 = (C10866e) it2.next();
                            c10866e2.m56371O(z14);
                            c10866e2.m56369M(interfaceC10867f);
                            if (c3020p0.m14498b0()) {
                                c10866e2.m56372P(1);
                                c10866e2.m56374R(c3020p0.f12058q);
                            } else {
                                c10866e2.m56372P(0);
                                c10866e2.m56374R(c3020p0.f12058q);
                            }
                        }
                    }
                    ArrayList arrayList4 = c3020p0.f12031K;
                    if (arrayList4 != null) {
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            C10866e c10866e3 = (C10866e) it3.next();
                            c10866e3.m56371O(z14);
                            c10866e3.m56369M(interfaceC10867f);
                            if (c3020p0.m14498b0()) {
                                c10866e3.m56372P(1);
                                c10866e3.m56374R(c3020p0.f12058q);
                            } else {
                                c10866e3.m56372P(0);
                                c10866e3.m56374R(c3020p0.f12058q);
                            }
                        }
                    }
                    if (z15 && (c3025q0 = c3020p0.f12023C) != null && c3025q0.f12096E != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    CharSequence m152970f = C31839a6.m152970f(m108607H, c3020p0.m14531w(z11, z12), z17, interfaceC10867f);
                    C3003l3 c3003l3 = c3020p0.f12059r;
                    if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C10866e.m56359e((C10866e) it4.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                        }
                    }
                    if (z14) {
                        c21697g.m111955C1(C10887z.m56529k());
                        C28100j3 c28100j3 = new C28100j3(1);
                        c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                        c21697g.setTag(AbstractC6918a0.tag_callback_span_listener, interfaceC10867f);
                        c21697g.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                    } else {
                        c21697g.m111955C1(C10880s.m56519f());
                    }
                    c21697g.mo44614b1(0);
                    c21697g.m111959G1(m152970f);
                    if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                        if (z16 && c21697g3 != null) {
                            m108672u(context, c21697g, c21697g2, c21697g3, c3020p0, z11, interfaceC2266h);
                        } else {
                            m108662p(context, c21697g, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                        }
                    } else {
                        c21697g.m89111N0(null);
                    }
                }
                if (c21697g3 != null) {
                    if (z16 && !TextUtils.isEmpty(c3020p0.f12023C.f12115f)) {
                        m108668s(context, c21697g3, c3020p0.f12023C.f12115f);
                    }
                    if (z16) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    c21697g3.mo44614b1(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: x */
    public static void m108678x(CharSequence charSequence, C16719g c16719g) {
        if (AbstractC26683d.f126393l) {
            AbstractC28245z3.m142219b(charSequence, c16719g);
        }
    }

    /* renamed from: x0 */
    public static void m108679x0(C3020p0 c3020p0, C22126c0 c22126c0, boolean z11, boolean z12, Context context, InterfaceC10867f interfaceC10867f) {
        ArrayList arrayList;
        if (c22126c0 == null) {
            return;
        }
        try {
            c22126c0.m111959G1("");
            c22126c0.mo44614b1(8);
            if (c3020p0 == null) {
                return;
            }
            CharSequence m108607H = m108607H(c3020p0, z11, interfaceC10867f, false);
            if (!TextUtils.isEmpty(m108607H)) {
                Iterator it = c3020p0.f12029I.iterator();
                while (it.hasNext()) {
                    C10866e c10866e = (C10866e) it.next();
                    c10866e.m56371O(z12);
                    c10866e.m56369M(interfaceC10867f);
                }
                Iterator it2 = c3020p0.f12030J.iterator();
                while (it2.hasNext()) {
                    C10866e c10866e2 = (C10866e) it2.next();
                    c10866e2.m56371O(z12);
                    c10866e2.m56369M(interfaceC10867f);
                    if (c3020p0.m14498b0()) {
                        c10866e2.m56372P(1);
                        c10866e2.m56374R(c3020p0.f12058q);
                    } else {
                        c10866e2.m56372P(0);
                        c10866e2.m56374R(c3020p0.f12058q);
                    }
                }
                CharSequence m152970f = C31839a6.m152970f(m108607H, c3020p0.m14531w(z11, false), false, interfaceC10867f);
                C3003l3 c3003l3 = c3020p0.f12059r;
                if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C10866e.m56359e((C10866e) it3.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                    }
                }
                if (z12) {
                    c22126c0.m111955C1(C10887z.m56529k());
                    C28100j3 c28100j3 = new C28100j3(1);
                    c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                    c22126c0.m89129Y0(Integer.valueOf(AbstractC6918a0.tag_callback_span_listener));
                    c22126c0.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                } else {
                    c22126c0.m111955C1(C10880s.m56519f());
                }
                c22126c0.mo44614b1(0);
                c22126c0.m111959G1(m152970f);
                if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                    m108662p(context, c22126c0, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                } else {
                    c22126c0.m89111N0(null);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: y */
    private static void m108680y(RobotoTextView robotoTextView, boolean z11, int i11) {
        if (robotoTextView != null) {
            if (z11) {
                robotoTextView.setTextSize(0, AbstractC23136l9.m118736p(AbstractC16802y.f85297f4));
                robotoTextView.setFontStyle(5);
                robotoTextView.setSingleLine(false);
                robotoTextView.setEllipsize(null);
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.FeedActivityTextColor));
                return;
            }
            robotoTextView.setTextSize(0, AbstractC23136l9.m118736p(AbstractC16802y.f85296f3));
            robotoTextView.setFontStyle(7);
            robotoTextView.setSingleLine(true);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            if (i11 == 13) {
                robotoTextView.setTextColor(AbstractC23136l9.m118641B(robotoTextView.getContext(), AbstractC16801x.white));
            } else {
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: is.k0.<init>(java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.CharSequence, int, int, bo.n3, boolean):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0012, B:10:0x002c, B:14:0x00c0, B:16:0x00c6, B:17:0x00cc, B:19:0x00d2, B:21:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f8, B:28:0x00fc, B:30:0x0102, B:32:0x0108, B:34:0x010c, B:37:0x0113, B:39:0x012c, B:40:0x0153, B:41:0x014c, B:44:0x0159, B:46:0x0163, B:49:0x0175, B:51:0x0182, B:53:0x0186, B:55:0x018a, B:56:0x018e, B:58:0x0194, B:60:0x01ac, B:63:0x01b9, B:66:0x003a, B:68:0x0042, B:69:0x0050, B:71:0x0056, B:73:0x006c, B:74:0x0074, B:76:0x007a, B:77:0x0086, B:79:0x00aa), top: B:7:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0012, B:10:0x002c, B:14:0x00c0, B:16:0x00c6, B:17:0x00cc, B:19:0x00d2, B:21:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f8, B:28:0x00fc, B:30:0x0102, B:32:0x0108, B:34:0x010c, B:37:0x0113, B:39:0x012c, B:40:0x0153, B:41:0x014c, B:44:0x0159, B:46:0x0163, B:49:0x0175, B:51:0x0182, B:53:0x0186, B:55:0x018a, B:56:0x018e, B:58:0x0194, B:60:0x01ac, B:63:0x01b9, B:66:0x003a, B:68:0x0042, B:69:0x0050, B:71:0x0056, B:73:0x006c, B:74:0x0074, B:76:0x007a, B:77:0x0086, B:79:0x00aa), top: B:7:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0012, B:10:0x002c, B:14:0x00c0, B:16:0x00c6, B:17:0x00cc, B:19:0x00d2, B:21:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f8, B:28:0x00fc, B:30:0x0102, B:32:0x0108, B:34:0x010c, B:37:0x0113, B:39:0x012c, B:40:0x0153, B:41:0x014c, B:44:0x0159, B:46:0x0163, B:49:0x0175, B:51:0x0182, B:53:0x0186, B:55:0x018a, B:56:0x018e, B:58:0x0194, B:60:0x01ac, B:63:0x01b9, B:66:0x003a, B:68:0x0042, B:69:0x0050, B:71:0x0056, B:73:0x006c, B:74:0x0074, B:76:0x007a, B:77:0x0086, B:79:0x00aa), top: B:7:0x0012 }] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m108681y0(bo.C3000l0 r19, bo.C3020p0 r20, android.widget.TextView r21, android.widget.TextView r22, com.zing.zalo.feed.components.FeedBackgroundView r23, int r24, android.content.Context r25, com.zing.zalo.social.controls.InterfaceC10867f r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: is.AbstractC20814p0.m108681y0(bo.l0, bo.p0, android.widget.TextView, android.widget.TextView, com.zing.zalo.feed.components.FeedBackgroundView, int, android.content.Context, com.zing.zalo.social.controls.f, boolean):void");
    }

    /* renamed from: z */
    private static void m108682z(C22126c0 c22126c0, boolean z11, int i11) {
        if (z11) {
            AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Activity, c22126c0);
        } else if (i11 == 13) {
            AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Name_Video, c22126c0);
        } else {
            AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Name, c22126c0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: is.i0.<init>(java.lang.ref.WeakReference, java.lang.CharSequence, int, int, int, bo.n3, boolean, com.zing.zalo.feed.components.q0, bo.p0):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: z0 */
    public static void m108683z0(bo.C3000l0 r14, bo.C3020p0 r15, com.zing.zalo.feed.components.C8362q0 r16, int r17, kd0.C21697g r18, int r19, android.content.Context r20, com.zing.zalo.social.controls.InterfaceC10867f r21, boolean r22, int r23) {
        /*
            r0 = r15
            r9 = r16
            if (r14 == 0) goto L75
            if (r0 == 0) goto L75
            if (r9 != 0) goto La
            goto L75
        La:
            l80.c0 r2 = r16.m44809s1()     // Catch: java.lang.Exception -> L71
            r1 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            m108594A0(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L71
            java.lang.CharSequence r3 = r15.m14527t()     // Catch: java.lang.Exception -> L71
            java.lang.CharSequence r1 = r15.m14528u()     // Catch: java.lang.Exception -> L71
            int r5 = r0.f12037Q     // Catch: java.lang.Exception -> L71
            int r6 = is.C20801j.m108536d(r14)     // Catch: java.lang.Exception -> L71
            bo.q0 r2 = r0.f12023C     // Catch: java.lang.Exception -> L71
            bo.n3 r7 = r2.f12097F     // Catch: java.lang.Exception -> L71
            zh.ac r2 = p716zh.C31845ac.m152996J()     // Catch: java.lang.Exception -> L71
            zh.dc r2 = r2.m153044X()     // Catch: java.lang.Exception -> L71
            r4 = 0
            r9.m44804I1(r4)     // Catch: java.lang.Exception -> L71
            r9.m44797B1(r2, r4)     // Catch: java.lang.Exception -> L71
            r4 = r23
            r9.m44815y1(r7, r1, r4)     // Catch: java.lang.Exception -> L71
            bo.q0 r1 = r0.f12023C     // Catch: java.lang.Exception -> L71
            int r1 = r1.f12096E     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L71
            r2 = 1090453510(0x40ff0006, float:7.968753)
            r9.setTag(r2, r1)     // Catch: java.lang.Exception -> L71
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L71
            r2.<init>(r9)     // Catch: java.lang.Exception -> L71
            zh.ac r11 = p716zh.C31845ac.m152996J()     // Catch: java.lang.Exception -> L71
            bo.q0 r1 = r0.f12023C     // Catch: java.lang.Exception -> L71
            int r12 = r1.f12096E     // Catch: java.lang.Exception -> L71
            is.i0 r13 = new is.i0     // Catch: java.lang.Exception -> L71
            r1 = r13
            r4 = r23
            r8 = r22
            r9 = r16
            r10 = r15
            r1.<init>()     // Catch: java.lang.Exception -> L71
            r11.m153057o0(r12, r13)     // Catch: java.lang.Exception -> L71
            m108618M0(r15)     // Catch: java.lang.Exception -> L71
            goto L75
        L71:
            r0 = move-exception
            ho0.AbstractC20110a.m104539h(r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: is.AbstractC20814p0.m108683z0(bo.l0, bo.p0, com.zing.zalo.feed.components.q0, int, kd0.g, int, android.content.Context, com.zing.zalo.social.controls.f, boolean, int):void");
    }
}
