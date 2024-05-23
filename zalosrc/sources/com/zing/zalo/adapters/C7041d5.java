package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23278z2;
import org.json.JSONObject;
import p354n3.C23528a;
import p471r3.C25630b;
import p588vw.C28644j;
import p588vw.C28652r;
import vg.C28020b3;

/* renamed from: com.zing.zalo.adapters.d5 */
/* loaded from: classes3.dex */
public final class C7041d5 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f38476r;

    /* renamed from: s */
    private LayoutInflater f38477s;

    /* renamed from: t */
    private C23528a f38478t;

    /* renamed from: u */
    private final ArrayList f38479u;

    /* renamed from: com.zing.zalo.adapters.d5$a */
    /* loaded from: classes3.dex */
    public static class a {
        public static final C32698a Companion = new C32698a(null);

        /* renamed from: a */
        private int f38480a;

        /* renamed from: com.zing.zalo.adapters.d5$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32698a {
            private C32698a() {
            }

            public /* synthetic */ C32698a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public a(int i11) {
            this.f38480a = i11;
        }

        /* renamed from: a */
        public final int m35960a() {
            return this.f38480a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.d5$b */
    /* loaded from: classes3.dex */
    public static final class b extends a {

        /* renamed from: b */
        private C7904b f38481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7904b c7904b) {
            super(0);
            AbstractC19074t.m100208f(c7904b, "topicInfo");
            this.f38481b = c7904b;
        }

        /* renamed from: b */
        public final C7904b m35961b() {
            return this.f38481b;
        }
    }

    /* renamed from: com.zing.zalo.adapters.d5$c */
    /* loaded from: classes3.dex */
    private static final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private ImageView f38482I;

        /* renamed from: J */
        private RobotoTextView f38483J;

        /* renamed from: K */
        private RobotoTextView f38484K;

        /* renamed from: L */
        private View f38485L;

        /* renamed from: M */
        private RecyclingImageView f38486M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.icn_topic_type);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f38482I = (ImageView) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.tv_title);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f38483J = (RobotoTextView) findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.tv_subtitle);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            this.f38484K = (RobotoTextView) findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.btm_separator_line);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            this.f38485L = findViewById4;
            View findViewById5 = view.findViewById(AbstractC6918a0.thumb_image);
            AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
            this.f38486M = (RecyclingImageView) findViewById5;
        }

        /* renamed from: i0 */
        public final View m35962i0() {
            return this.f38485L;
        }

        /* renamed from: j0 */
        public final ImageView m35963j0() {
            return this.f38482I;
        }

        /* renamed from: k0 */
        public final RecyclingImageView m35964k0() {
            return this.f38486M;
        }

        /* renamed from: l0 */
        public final RobotoTextView m35965l0() {
            return this.f38484K;
        }

        /* renamed from: m0 */
        public final RobotoTextView m35966m0() {
            return this.f38483J;
        }
    }

    public C7041d5(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f38476r = context;
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f38477s = (LayoutInflater) systemService;
        this.f38478t = new C23528a(context);
        this.f38479u = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x003f, TRY_ENTER, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015b A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0182 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0236 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0240 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:33:0x0110, B:34:0x0153, B:36:0x015b, B:37:0x017e, B:39:0x0182, B:47:0x0199, B:48:0x019c, B:49:0x022f, B:51:0x0236, B:54:0x0240, B:56:0x01a1, B:58:0x01b1, B:60:0x01d0, B:62:0x01d8, B:63:0x01dc, B:64:0x01ed, B:66:0x01f7, B:67:0x0201, B:69:0x0213, B:70:0x021d, B:71:0x0221, B:72:0x0225, B:73:0x0174, B:74:0x0132, B:75:0x00ab, B:76:0x00b5, B:77:0x00cc, B:79:0x00d4, B:80:0x00e1, B:81:0x00ee, B:82:0x0042, B:83:0x004b, B:84:0x0054, B:85:0x005d, B:86:0x0066, B:88:0x006e, B:89:0x0077), top: B:2:0x000b }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        Drawable m118665N;
        int i12;
        StringBuilder sb2;
        String m118743r0;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        try {
            if (mo10005m(i11) == 0 && (abstractC1876c0 instanceof c)) {
                a m35958L = m35958L(i11);
                if (m35958L instanceof b) {
                    C7904b m35961b = ((b) m35958L).m35961b();
                    int i13 = m35961b.f42729a;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 != 4) {
                                        if (i13 != 5) {
                                            m118665N = AbstractC23136l9.m118665N(this.f38476r, AbstractC16803z.ic_default_pin);
                                        } else {
                                            m118665N = AbstractC23136l9.m118665N(this.f38476r, AbstractC16803z.ic_pinned_album);
                                        }
                                    }
                                } else {
                                    m118665N = AbstractC23136l9.m118665N(this.f38476r, AbstractC16803z.ic_poll_color);
                                }
                            } else {
                                m118665N = AbstractC23136l9.m118665N(this.f38476r, AbstractC16803z.ic_message);
                            }
                        } else {
                            m118665N = AbstractC23136l9.m118665N(this.f38476r, AbstractC16803z.ic_note);
                        }
                        ((c) abstractC1876c0).m35963j0().setImageDrawable(m118665N);
                        i12 = m35961b.f42729a;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3 && i12 != 4 && i12 != 5) {
                                        RobotoTextView m35966m0 = ((c) abstractC1876c0).m35966m0();
                                        String str = m35961b.f42736h;
                                        if (str != null && !TextUtils.isEmpty(str)) {
                                            m118743r0 = m35961b.f42736h;
                                        } else {
                                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unsupported_pin_title);
                                        }
                                        m35966m0.setText(m118743r0);
                                    }
                                } else {
                                    ((c) abstractC1876c0).m35966m0().setText(C28652r.m143349v().m143357H(m35961b.m40773k()));
                                }
                            } else if (TextUtils.isEmpty(m35961b.f42716D)) {
                                ((c) abstractC1876c0).m35966m0().setText(m35961b.f42736h);
                            } else {
                                ((c) abstractC1876c0).m35966m0().setText(m35961b.f42716D);
                            }
                            sb2 = new StringBuilder();
                            if (m35961b.f42729a == 2) {
                                C19067n0 c19067n0 = C19067n0.f94947a;
                                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_message_from);
                                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                                String format = String.format(m118743r02, Arrays.copyOf(new Object[]{m35961b.m40767e()}, 1));
                                AbstractC19074t.m100207e(format, "format(...)");
                                sb2.append(format);
                            } else {
                                C19067n0 c19067n02 = C19067n0.f94947a;
                                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_created_by);
                                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                                String format2 = String.format(m118743r03, Arrays.copyOf(new Object[]{m35961b.m40765c()}, 1));
                                AbstractC19074t.m100207e(format2, "format(...)");
                                sb2.append(format2);
                            }
                            if (sb2.length() > 0) {
                                ((c) abstractC1876c0).m35965l0().setVisibility(0);
                                ((c) abstractC1876c0).m35965l0().setText(sb2.toString());
                            } else {
                                ((c) abstractC1876c0).m35965l0().setVisibility(8);
                            }
                            if (m35961b.f42729a == 2) {
                                RecyclingImageView m35964k0 = ((c) abstractC1876c0).m35964k0();
                                int i14 = m35961b.f42746r;
                                if (i14 != 1) {
                                    if (i14 != 32 && i14 != 44 && i14 != 49) {
                                        switch (i14) {
                                            case 36:
                                                m35964k0.setVisibility(0);
                                                m35964k0.setImageResource(AbstractC16803z.no_image2);
                                                if (!TextUtils.isEmpty(m35961b.f42749u)) {
                                                    C25630b m143282P0 = C28644j.m143233Y().m143282P0(new C25630b(new JSONObject(m35961b.f42749u)));
                                                    AbstractC19074t.m100207e(m143282P0, "prepareStickerInfo(...)");
                                                    if (m143282P0.m132448z()) {
                                                        Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                                                        if (m141206w != null) {
                                                            m35964k0.setImageBitmap(m141206w);
                                                            break;
                                                        }
                                                    } else {
                                                        C28020b3.m141166H(C28020b3.f130648a, m35964k0, this.f38478t, m143282P0, null, false, null, 28, null);
                                                        break;
                                                    }
                                                } else {
                                                    String m40766d = m35961b.m40766d();
                                                    if (!TextUtils.isEmpty(m40766d)) {
                                                        AbstractC23268y2.m120031e(this.f38478t, m35964k0, m40766d, C23278z2.m120122e());
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 37:
                                            case 38:
                                                break;
                                            default:
                                                m35964k0.setVisibility(8);
                                                break;
                                        }
                                    }
                                    m35964k0.setVisibility(0);
                                    m35964k0.setImageResource(AbstractC16803z.no_image2);
                                    String m40766d2 = m35961b.m40766d();
                                    if (!TextUtils.isEmpty(m40766d2)) {
                                        AbstractC23268y2.m120031e(this.f38478t, m35964k0, m40766d2, C23278z2.m120122e());
                                    } else {
                                        m35964k0.setVisibility(8);
                                    }
                                } else {
                                    m35964k0.setVisibility(8);
                                }
                            } else {
                                ((c) abstractC1876c0).m35964k0().setVisibility(8);
                            }
                            if (i11 == mo10003k() - 1) {
                                ((c) abstractC1876c0).m35962i0().setVisibility(8);
                                return;
                            } else {
                                ((c) abstractC1876c0).m35962i0().setVisibility(0);
                                return;
                            }
                        }
                        ((c) abstractC1876c0).m35966m0().setText(C28652r.m143349v().m143357H(m35961b.f42754z));
                        sb2 = new StringBuilder();
                        if (m35961b.f42729a == 2) {
                        }
                        if (sb2.length() > 0) {
                        }
                        if (m35961b.f42729a == 2) {
                        }
                        if (i11 == mo10003k() - 1) {
                        }
                    }
                    if (m35961b.f42732d > 0) {
                        m118665N = AbstractC23136l9.m118665N(this.f38476r, AbstractC16803z.ic_reminder);
                    } else {
                        m118665N = AbstractC23136l9.m118665N(this.f38476r, AbstractC16803z.ic_note);
                    }
                    ((c) abstractC1876c0).m35963j0().setImageDrawable(m118665N);
                    i12 = m35961b.f42729a;
                    if (i12 != 0) {
                    }
                    ((c) abstractC1876c0).m35966m0().setText(C28652r.m143349v().m143357H(m35961b.f42754z));
                    sb2 = new StringBuilder();
                    if (m35961b.f42729a == 2) {
                    }
                    if (sb2.length() > 0) {
                    }
                    if (m35961b.f42729a == 2) {
                    }
                    if (i11 == mo10003k() - 1) {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 0) {
            View inflate = this.f38477s.inflate(AbstractC7409c0.pin_board_item_layout, viewGroup, false);
            AbstractC19074t.m100205c(inflate);
            return new c(inflate);
        }
        throw new ClassCastException("Unknown viewType " + i11);
    }

    /* renamed from: L */
    public final a m35958L(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < mo10003k()) {
                    return (a) this.f38479u.get(i11);
                }
                return null;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final void m35959M(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "items");
        ArrayList arrayList2 = this.f38479u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38479u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            a m35958L = m35958L(i11);
            if (m35958L != null) {
                return m35958L.m35960a();
            }
            return 0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return 0;
        }
    }
}
