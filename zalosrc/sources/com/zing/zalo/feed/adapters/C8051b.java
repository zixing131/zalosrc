package com.zing.zalo.feed.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.text.AbstractC1463b;
import bo.C2966e1;
import bo.C2996k1;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.showingphotolib.view.AspectRatioImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7852a;
import com.zing.zalo.feed.adapters.C8051b;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.DynamicRatioFrameLayout;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23278z2;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p588vw.C28652r;
import p649xl.C29730ba;
import pm0.C24848g0;

/* renamed from: com.zing.zalo.feed.adapters.b */
/* loaded from: classes4.dex */
public final class C8051b extends FeedBaseAdapter.AbstractC8023b {

    /* renamed from: I */
    private final Context f44063I;

    /* renamed from: J */
    private FeedBaseAdapter.InterfaceC8021a f44064J;

    /* renamed from: K */
    private C29730ba f44065K;

    /* renamed from: L */
    private C23528a f44066L;

    /* renamed from: M */
    private PorterDuff.Mode f44067M;

    /* renamed from: N */
    private String f44068N;

    /* renamed from: O */
    private int f44069O;

    /* renamed from: P */
    private List f44070P;

    /* renamed from: com.zing.zalo.feed.adapters.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ Image f44072m1;

        /* renamed from: n1 */
        final /* synthetic */ float f44073n1;

        /* renamed from: o1 */
        final /* synthetic */ AspectRatioImageView f44074o1;

        a(Image image, float f11, AspectRatioImageView aspectRatioImageView) {
            this.f44072m1 = image;
            this.f44073n1 = f11;
            this.f44074o1 = aspectRatioImageView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c().getWidth() != 0 && c3979l.m18839c().getHeight() != 0) {
                        C7852a.d m43384z0 = C8051b.this.m43384z0(c3979l, this.f44072m1, this.f44073n1);
                        AspectRatioImageView aspectRatioImageView = this.f44074o1;
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m43384z0.f42176a, m43384z0.f42177b);
                        C8051b.this.m43383y0(this.f44072m1, layoutParams);
                        aspectRatioImageView.setLayoutParams(layoutParams);
                        this.f44074o1.setRatio((m43384z0.f42177b * 1.0f) / m43384z0.f42176a);
                        this.f44074o1.requestLayout();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8051b(ViewGroup viewGroup, Context context, FeedBaseAdapter.InterfaceC8021a interfaceC8021a) {
        super(viewGroup);
        AbstractC19074t.m100208f(viewGroup, "convertView");
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(interfaceC8021a, "feedProfileCallback");
        this.f44063I = context;
        this.f44064J = interfaceC8021a;
        this.f44067M = PorterDuff.Mode.ADD;
        this.f44068N = "";
        this.f44069O = -1;
        this.f44070P = new ArrayList();
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        C29730ba m147774c = C29730ba.m147774c((LayoutInflater) systemService, viewGroup, true);
        AbstractC19074t.m100207e(m147774c, "inflate(...)");
        this.f44065K = m147774c;
        m147774c.f137330A.setScaleOption(5);
        this.f44065K.f137346z.setScaleOption(5);
        this.f44066L = new C23528a(context);
    }

    /* renamed from: D0 */
    public static /* synthetic */ CharSequence m43369D0(C8051b c8051b, RobotoTextView robotoTextView, String str, ThemeItem themeItem, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 2;
        }
        return c8051b.m43387C0(robotoTextView, str, themeItem, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m43377s0(C8051b c8051b, View view) {
        FeedBaseAdapter.AlbumProfileCallback albumProfileCallback;
        AbstractC19074t.m100208f(c8051b, "this$0");
        FeedBaseAdapter.InterfaceC8021a interfaceC8021a = c8051b.f44064J;
        if (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback) {
            albumProfileCallback = (FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a;
        } else {
            albumProfileCallback = null;
        }
        if (albumProfileCallback != null) {
            albumProfileCallback.mo43229b4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m43378t0(C8051b c8051b, View view) {
        FeedBaseAdapter.AlbumProfileCallback albumProfileCallback;
        AbstractC19074t.m100208f(c8051b, "this$0");
        FeedBaseAdapter.InterfaceC8021a interfaceC8021a = c8051b.f44064J;
        if (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback) {
            albumProfileCallback = (FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a;
        } else {
            albumProfileCallback = null;
        }
        if (albumProfileCallback != null) {
            albumProfileCallback.mo43229b4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m43379u0(C8051b c8051b, View view) {
        FeedBaseAdapter.AlbumProfileCallback albumProfileCallback;
        AbstractC19074t.m100208f(c8051b, "this$0");
        FeedBaseAdapter.InterfaceC8021a interfaceC8021a = c8051b.f44064J;
        if (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback) {
            albumProfileCallback = (FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a;
        } else {
            albumProfileCallback = null;
        }
        if (albumProfileCallback != null) {
            albumProfileCallback.mo43226W0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m43380v0(C8051b c8051b, View view) {
        FeedBaseAdapter.AlbumProfileCallback albumProfileCallback;
        AbstractC19074t.m100208f(c8051b, "this$0");
        FeedBaseAdapter.InterfaceC8021a interfaceC8021a = c8051b.f44064J;
        if (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback) {
            albumProfileCallback = (FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a;
        } else {
            albumProfileCallback = null;
        }
        if (albumProfileCallback != null) {
            albumProfileCallback.mo43226W0();
        }
    }

    /* renamed from: w0 */
    private final CharSequence m43381w0(ThemeItem themeItem) {
        CharSequence m143350A;
        boolean m127149O;
        boolean m127120J;
        boolean m127120J2;
        String replaceAll;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("...<a href=\"zm://SeeMore/\">%s</a>", Arrays.copyOf(new Object[]{AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        ArrayList arrayList = new ArrayList();
        String m119747k = AbstractC23244v8.m119747k(new C24329j("(\r\n|\n)").m127019g(format, "<br/>"));
        AbstractC19074t.m100207e(m119747k, "getStandardizedString(...)");
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
            if (matcher.find()) {
                m127149O = AbstractC24342w.m127149O(m119747k, "<a href=\"http", false, 2, null);
                if (!m127149O) {
                    String group = matcher.group();
                    AbstractC19074t.m100207e(group, "group(...)");
                    m127120J = AbstractC24341v.m127120J(group, "https://", false, 2, null);
                    if (m127120J) {
                        replaceAll = matcher.replaceAll("<a href=\"$1\">$1</a>");
                        AbstractC19074t.m100207e(replaceAll, "replaceAll(...)");
                    } else {
                        String group2 = matcher.group();
                        AbstractC19074t.m100207e(group2, "group(...)");
                        m127120J2 = AbstractC24341v.m127120J(group2, "http://", false, 2, null);
                        if (m127120J2) {
                            replaceAll = matcher.replaceAll("<a href=\"$1\">$1</a>");
                            AbstractC19074t.m100207e(replaceAll, "replaceAll(...)");
                        } else {
                            replaceAll = matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                            AbstractC19074t.m100207e(replaceAll, "replaceAll(...)");
                        }
                    }
                    m119747k = replaceAll;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        Spanned m7440a = AbstractC1463b.m7440a(Pattern.compile("<(?![ab/])").matcher(m119747k).replaceAll("&lt;"), 0);
        AbstractC19074t.m100207e(m7440a, "fromHtml(...)");
        SpannableString spannableString = new SpannableString(m7440a.toString());
        Object[] spans = m7440a.getSpans(0, m7440a.length(), Object.class);
        if (spans != null && spans.length != 0) {
            AbstractC19074t.m100205c(spans);
            for (Object obj : spans) {
                int spanStart = m7440a.getSpanStart(obj);
                int spanEnd = m7440a.getSpanEnd(obj);
                int spanFlags = m7440a.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    c10866e.f54832J = 10;
                    c10866e.m56366J(true);
                    c10866e.m56382Z(themeItem.getContent().getDescColor());
                    arrayList.add(c10866e);
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
            m143350A = C28652r.m143349v().m143350A(spannableString);
            AbstractC19074t.m100207e(m143350A, "getTextDynamicEmoticonParsed(...)");
        } else {
            m143350A = C28652r.m143349v().m143350A(new SpannableString(new C24329j("<br/>").m127019g(m119747k, "\n")));
            AbstractC19074t.m100207e(m143350A, "getTextDynamicEmoticonParsed(...)");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10866e) it.next()).m56378V(new C10866e.a() { // from class: rn.h2
                @Override // com.zing.zalo.social.controls.C10866e.a
                /* renamed from: a */
                public final void mo44545a(int i11) {
                    C8051b.m43382x0(C8051b.this, i11);
                }
            });
        }
        return m143350A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m43382x0(C8051b c8051b, int i11) {
        FeedBaseAdapter.AlbumProfileCallback albumProfileCallback;
        AbstractC19074t.m100208f(c8051b, "this$0");
        FeedBaseAdapter.InterfaceC8021a interfaceC8021a = c8051b.f44064J;
        if (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback) {
            albumProfileCallback = (FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a;
        } else {
            albumProfileCallback = null;
        }
        if (albumProfileCallback != null) {
            albumProfileCallback.mo43231d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m43383y0(Image image, RelativeLayout.LayoutParams layoutParams) {
        layoutParams.removeRule(9);
        layoutParams.removeRule(10);
        layoutParams.removeRule(11);
        layoutParams.removeRule(12);
        layoutParams.leftMargin = AbstractC23136l9.m118742r(image.getTranslateX() * AbstractC23136l9.m118722k0());
        layoutParams.topMargin = AbstractC23136l9.m118742r(image.getTranslateY() * AbstractC23136l9.m118722k0());
        switch (image.getAnchorType()) {
            case 1:
                layoutParams.addRule(9);
                layoutParams.addRule(10);
                return;
            case 2:
                layoutParams.addRule(9);
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                return;
            case 3:
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                return;
            case 4:
                layoutParams.addRule(9);
                layoutParams.addRule(10);
                layoutParams.addRule(12);
                return;
            case 5:
                layoutParams.addRule(9);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                return;
            case 6:
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                layoutParams.addRule(12);
                return;
            case 7:
                layoutParams.addRule(9);
                layoutParams.addRule(12);
                return;
            case 8:
                layoutParams.addRule(9);
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                return;
            case 9:
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v26, types: [int] */
    /* JADX WARN: Type inference failed for: r8v33, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* renamed from: z0 */
    public final C7852a.d m43384z0(C3979l c3979l, Image image, float f11) {
        ?? r92;
        ?? r82;
        Bitmap m18839c;
        float m118722k0;
        int i11;
        float scale;
        float height;
        String scaleType;
        int height2;
        float f12;
        float f13;
        String str;
        String str2;
        int i12 = 0;
        if (c3979l != null && c3979l.m18839c() != null && c3979l.m18839c().getWidth() != 0 && c3979l.m18839c().getHeight() != 0) {
            try {
                m18839c = c3979l.m18839c();
                m118722k0 = AbstractC23136l9.m118722k0();
                i11 = (int) (f11 * m118722k0);
                scale = image.getScale();
                height = (c3979l.m18839c().getHeight() * 1.0f) / c3979l.m18839c().getWidth();
                scaleType = image.getScaleType();
            } catch (Exception e11) {
                e = e11;
                r92 = false;
            }
            try {
                switch (scaleType.hashCode()) {
                    case 2402104:
                        if (scaleType.equals(Image.SCALE_TYPE_NONE)) {
                            ?? width = (int) (m18839c.getWidth() * scale);
                            height2 = m18839c.getHeight();
                            scaleType = width;
                            f13 = height2;
                            str2 = scaleType;
                            f12 = f13 * scale;
                            str = str2;
                            i12 = (int) f12;
                            r82 = str;
                            break;
                        }
                        ?? width2 = (int) (m18839c.getWidth() * scale);
                        height2 = m18839c.getHeight();
                        scaleType = width2;
                        f13 = height2;
                        str2 = scaleType;
                        f12 = f13 * scale;
                        str = str2;
                        i12 = (int) f12;
                        r82 = str;
                    case 182565115:
                        if (scaleType.equals(Image.SCALE_TYPE_FIXED_WIDTH)) {
                            ?? r83 = (int) (m118722k0 * scale);
                            f12 = ((float) r83) * height;
                            str = r83;
                            i12 = (int) f12;
                            r82 = str;
                        } else {
                            ?? width22 = (int) (m18839c.getWidth() * scale);
                            height2 = m18839c.getHeight();
                            scaleType = width22;
                            f13 = height2;
                            str2 = scaleType;
                            f12 = f13 * scale;
                            str = str2;
                            i12 = (int) f12;
                            r82 = str;
                            break;
                        }
                    case 931556466:
                        if (scaleType.equals(Image.SCALE_TYPE_FIXED_HEIGHT)) {
                            i12 = (int) (i11 / scale);
                            r82 = (int) (i12 / height);
                            break;
                        } else {
                            ?? width222 = (int) (m18839c.getWidth() * scale);
                            height2 = m18839c.getHeight();
                            scaleType = width222;
                            f13 = height2;
                            str2 = scaleType;
                            f12 = f13 * scale;
                            str = str2;
                            i12 = (int) f12;
                            r82 = str;
                            break;
                        }
                    case 1244896183:
                        if (scaleType.equals(Image.SCALE_TYPE_SCREEN)) {
                            f13 = i11;
                            str2 = (int) (m118722k0 * scale);
                            f12 = f13 * scale;
                            str = str2;
                            i12 = (int) f12;
                            r82 = str;
                        } else {
                            ?? width2222 = (int) (m18839c.getWidth() * scale);
                            height2 = m18839c.getHeight();
                            scaleType = width2222;
                            f13 = height2;
                            str2 = scaleType;
                            f12 = f13 * scale;
                            str = str2;
                            i12 = (int) f12;
                            r82 = str;
                            break;
                        }
                    default:
                        ?? width22222 = (int) (m18839c.getWidth() * scale);
                        height2 = m18839c.getHeight();
                        scaleType = width22222;
                        f13 = height2;
                        str2 = scaleType;
                        f12 = f13 * scale;
                        str = str2;
                        i12 = (int) f12;
                        r82 = str;
                        break;
                }
            } catch (Exception e12) {
                r92 = scaleType;
                e = e12;
                e.printStackTrace();
                r82 = r92;
                return new C7852a.d(r82, i12);
            }
            return new C7852a.d(r82, i12);
        }
        return new C7852a.d(0, 0);
    }

    /* renamed from: A0 */
    public final void m43385A0() {
        Iterator it = this.f44070P.iterator();
        while (it.hasNext()) {
            ((AspectRatioImageView) it.next()).setVisibility(8);
        }
    }

    /* renamed from: B0 */
    public final void m43386B0(Image image, AspectRatioImageView aspectRatioImageView, float f11) {
        AbstractC19074t.m100208f(image, "element");
        AbstractC19074t.m100208f(aspectRatioImageView, "view");
        try {
            if (!TextUtils.isEmpty(image.getUrl())) {
                ((C23528a) this.f44066L.m123612r(aspectRatioImageView)).m123579C(image.getUrl(), C23278z2.m120162x(), new a(image, f11, aspectRatioImageView).m125762H1(AbstractC23006a0.f111912c).m125764I1(150));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* renamed from: C0 */
    public final CharSequence m43387C0(RobotoTextView robotoTextView, String str, ThemeItem themeItem, int i11) {
        int m127178g0;
        String str2 = str;
        AbstractC19074t.m100208f(robotoTextView, "<this>");
        AbstractC19074t.m100208f(str2, "input");
        AbstractC19074t.m100208f(themeItem, "themeItem");
        if (AbstractC19074t.m100204b(str2, this.f44068N) && this.f44069O == themeItem.getId()) {
            return "";
        }
        ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((AbstractC23136l9.m118722k0() - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824);
        this.f44068N = str2;
        this.f44069O = themeItem.getId();
        robotoTextView.setText(str);
        robotoTextView.measure(makeMeasureSpec, 0);
        if (robotoTextView.getLineCount() > i11) {
            HashSet hashSet = new HashSet();
            hashSet.add('\n');
            hashSet.add('\t');
            hashSet.add(' ');
            int lineStart = robotoTextView.getLayout().getLineStart(0);
            CharSequence subSequence = str2.subSequence(lineStart, robotoTextView.getLayout().getLineEnd(i11 - 1));
            boolean contains = hashSet.contains(Character.valueOf(subSequence.charAt(subSequence.length() - 1)));
            str2 = subSequence;
            if (contains) {
                str2 = subSequence.subSequence(lineStart, subSequence.length() - 1);
            }
            CharSequence m43381w0 = m43381w0(themeItem);
            do {
                robotoTextView.setText(TextUtils.concat(str2, m43381w0));
                robotoTextView.measure(makeMeasureSpec, 0);
                if (robotoTextView.getLineCount() > i11) {
                    m127178g0 = AbstractC24342w.m127178g0(str2.toString(), " ", 0, false, 6, null);
                    if (m127178g0 > 0) {
                        str2 = str2.subSequence(0, m127178g0);
                    } else {
                        ?? m108614K0 = AbstractC20814p0.m108614K0(str2, str2.length() - 5);
                        AbstractC19074t.m100205c(m108614K0);
                        str2 = m108614K0;
                    }
                } else {
                    ?? concat = TextUtils.concat(str2, m43381w0);
                    AbstractC19074t.m100205c(concat);
                    str2 = concat;
                }
            } while (robotoTextView.getLineCount() > i11);
        }
        return str2;
    }

    /* renamed from: E0 */
    public final void m43388E0(ViewGroup viewGroup, List list) {
        AbstractC19074t.m100208f(viewGroup, "decorContainer");
        AbstractC19074t.m100208f(list, "images");
        m43389F0(viewGroup, list);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m43386B0((Image) list.get(i11), (AspectRatioImageView) this.f44070P.get(i11), 1.0f);
        }
    }

    /* renamed from: F0 */
    public final void m43389F0(ViewGroup viewGroup, List list) {
        AbstractC19074t.m100208f(viewGroup, "decorContainer");
        AbstractC19074t.m100208f(list, "images");
        int size = list.size();
        int size2 = this.f44070P.size();
        if (size > size2) {
            int i11 = size - size2;
            for (int i12 = 0; i12 < i11; i12++) {
                m43390r0(viewGroup);
            }
        }
        m43385A0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
    /* renamed from: i0 */
    public void mo43244i0(C2966e1 c2966e1, int i11) {
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        FeedBaseAdapter.AlbumProfileCallback albumProfileCallback;
        AbstractC19074t.m100208f(c2966e1, "feedRow");
        C2996k1 c2996k1 = c2966e1.f11723u;
        if (c2996k1 == null) {
            return;
        }
        C29730ba c29730ba = this.f44065K;
        ThemeItem m14206f = c2996k1.m14206f();
        c29730ba.f137343w.setBackgroundColor(m14206f.getDecorAlbum().getBgColor());
        c29730ba.f137337q.setRatioHeight(c2996k1.m14204d());
        DynamicRatioFrameLayout dynamicRatioFrameLayout = c29730ba.f137337q;
        AbstractC19074t.m100207e(dynamicRatioFrameLayout, "decorContainer");
        m43388E0(dynamicRatioFrameLayout, m14206f.getDecorAlbum().getImages());
        c29730ba.f137333D.setText(c2996k1.m14207g());
        c29730ba.f137333D.setTextColor(c2996k1.m14206f().getContent().getTitleColor());
        c29730ba.f137333D.setOnClickListener(new View.OnClickListener() { // from class: rn.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8051b.m43377s0(C8051b.this, view);
            }
        });
        int i17 = 0;
        if (c2996k1.m14201a().length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        RobotoTextView robotoTextView = c29730ba.f137338r;
        int i18 = 8;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        robotoTextView.setVisibility(i12);
        if (z11) {
            if (!c2996k1.m14212l()) {
                c29730ba.f137338r.setText(C28652r.m143349v().m143353D(c2996k1.m14201a()));
            } else {
                RobotoTextView robotoTextView2 = this.f44065K.f137338r;
                AbstractC19074t.m100207e(robotoTextView2, "desc");
                CharSequence m43369D0 = m43369D0(this, robotoTextView2, c2996k1.m14201a(), c2996k1.m14206f(), 0, 4, null);
                if (m43369D0.length() > 0) {
                    c29730ba.f137338r.setText(m43369D0);
                    c29730ba.f137338r.setMovementMethod(CustomMovementMethod.m56305e());
                }
            }
        }
        c29730ba.f137338r.setTextColor(c2996k1.m14206f().getContent().getTextColor02());
        c29730ba.f137338r.setOnClickListener(new View.OnClickListener() { // from class: rn.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8051b.m43378t0(C8051b.this, view);
            }
        });
        c29730ba.f137344x.setText(c2996k1.m14202b());
        LinearLayout linearLayout = c29730ba.f137341u;
        if (c2996k1.m14213m()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        linearLayout.setVisibility(i13);
        boolean m14209i = c2996k1.m14209i();
        com.zing.zalo.p077ui.widget.AspectRatioImageView aspectRatioImageView = c29730ba.f137339s;
        if (m14209i) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        aspectRatioImageView.setVisibility(i14);
        LinearLayout linearLayout2 = c29730ba.f137345y;
        if (m14209i) {
            i15 = 0;
        } else {
            i15 = 8;
        }
        linearLayout2.setVisibility(i15);
        if (m14209i) {
            c29730ba.f137334E.setText(c2996k1.m14203c().m45149t());
            com.zing.zalo.p077ui.widget.AspectRatioImageView aspectRatioImageView2 = c29730ba.f137346z;
            aspectRatioImageView2.setImageDrawable(AbstractC23136l9.m118665N(aspectRatioImageView2.getContext(), c2996k1.m14203c().m45143k()));
        }
        c29730ba.f137345y.setOnClickListener(new View.OnClickListener() { // from class: rn.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8051b.m43379u0(C8051b.this, view);
            }
        });
        int textColor01 = c2996k1.m14206f().getContent().getTextColor01();
        c29730ba.f137344x.setTextColor(textColor01);
        c29730ba.f137339s.setColorFilter(textColor01);
        c29730ba.f137334E.setTextColor(textColor01);
        c29730ba.f137346z.setColorFilter(textColor01);
        LinearLayout linearLayout3 = c29730ba.f137331B;
        if (c2996k1.m14211k()) {
            i16 = 0;
        } else {
            i16 = 8;
        }
        linearLayout3.setVisibility(i16);
        if (c2996k1.m14211k()) {
            c29730ba.f137332C.setText(c2996k1.m14205e());
            com.zing.zalo.p077ui.widget.AspectRatioImageView aspectRatioImageView3 = c29730ba.f137330A;
            aspectRatioImageView3.setImageDrawable(AbstractC23136l9.m118665N(aspectRatioImageView3.getContext(), c2996k1.m14203c().m45143k()));
            c29730ba.f137335F.setText(c2996k1.m14203c().m45149t());
            com.zing.zalo.p077ui.widget.AspectRatioImageView aspectRatioImageView4 = c29730ba.f137340t;
            if (c2996k1.m14210j()) {
                i18 = 0;
            }
            aspectRatioImageView4.setVisibility(i18);
            c29730ba.f137331B.setOnClickListener(new View.OnClickListener() { // from class: rn.g2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8051b.m43380v0(C8051b.this, view);
                }
            });
        }
        Divider divider = c29730ba.f137342v;
        if (!c2996k1.m14208h()) {
            i17 = 4;
        }
        divider.setVisibility(i17);
        c29730ba.f137342v.setBackgroundColor(c2996k1.m14206f().getLineDividerColor());
        FeedBaseAdapter.InterfaceC8021a interfaceC8021a = this.f44064J;
        if (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback) {
            albumProfileCallback = (FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a;
        } else {
            albumProfileCallback = null;
        }
        if (albumProfileCallback != null) {
            albumProfileCallback.mo43235f4(this.f7784p, c29730ba.f137333D);
        }
    }

    /* renamed from: r0 */
    public final void m43390r0(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "<this>");
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(this.f44063I);
        this.f44070P.add(aspectRatioImageView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        C24848g0 c24848g0 = C24848g0.f119245a;
        viewGroup.addView(aspectRatioImageView, layoutParams);
    }
}
