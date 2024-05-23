package b90;

import android.text.Spanned;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import k30.C21459a;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23212s8;
import on0.AbstractC24319c;
import on0.AbstractC24342w;
import p304ks.AbstractC21935u;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: b90.d */
/* loaded from: classes6.dex */
public abstract class EnumC2667d extends Enum {

    /* renamed from: A */
    private static final /* synthetic */ InterfaceC30165a f10676A;

    /* renamed from: s */
    public static final EnumC2667d f10677s = new EnumC2667d("NORMAL", 0) { // from class: b90.d.g
        g(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m114547n = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(m114547n, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_usage);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{C21459a.m111038f(m13107e(), 0, 2, null), C21459a.m111038f(m13109h(), 0, 2, null)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
    };

    /* renamed from: t */
    public static final EnumC2667d f10678t = new EnumC2667d("HALF_WAY", 1) { // from class: b90.d.f
        f(String str, int i11) {
            super(str, i11, null);
        }

        /* renamed from: u */
        private final int m13118u() {
            return (int) ((((float) m13107e()) / ((float) m13109h())) * 100);
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_half_way_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m13118u()), " " + AbstractC21935u.m114547n()}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            CharSequence mo13106d = mo13106d();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_half_way_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(mo13106d, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_half_way_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m13118u()), ""}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
    };

    /* renamed from: u */
    public static final EnumC2667d f10679u = new EnumC2667d("ALMOST_FULL", 2) { // from class: b90.d.b
        b(String str, int i11) {
            super(str, i11, null);
        }

        /* renamed from: u */
        private final String m13117u() {
            return C21459a.m111038f(m13109h() - m13107e(), 0, 2, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_almost_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m13117u(), " " + AbstractC21935u.m114547n()}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            CharSequence mo13106d = mo13106d();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_almost_full_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(mo13106d, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_almost_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m13117u(), ""}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    };

    /* renamed from: v */
    public static final EnumC2667d f10680v = new EnumC2667d("FULL", 3) { // from class: b90.d.e
        e(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            CharSequence m127168X0;
            String valueOf;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{" " + AbstractC21935u.m114547n()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            m127168X0 = AbstractC24342w.m127168X0(format);
            String obj = m127168X0.toString();
            if (obj.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = obj.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    valueOf = AbstractC24319c.m126980e(charAt);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb2.append((Object) valueOf);
                String substring = obj.substring(1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                sb2.append(substring);
                return sb2.toString();
            }
            return obj;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            CharSequence mo13106d = mo13106d();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_full_subtitle_full);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(mo13106d, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            CharSequence m127168X0;
            String valueOf;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{""}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            m127168X0 = AbstractC24342w.m127168X0(format);
            String obj = m127168X0.toString();
            if (obj.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = obj.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    valueOf = AbstractC24319c.m126980e(charAt);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb2.append((Object) valueOf);
                String substring = obj.substring(1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                sb2.append(substring);
                return sb2.toString();
            }
            return obj;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    };

    /* renamed from: w */
    public static final EnumC2667d f10681w = new EnumC2667d("ABUSE", 4) { // from class: b90.d.a

        /* renamed from: B */
        private final SimpleDateFormat f10688B = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

        a(String str, int i11) {
            super(str, i11, null);
            this.f10688B = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_banner);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n(), this.f10688B.format(new Date(m13105c()))}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            Spanned m119746j = AbstractC23244v8.m119746j(format);
            AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
            return m119746j;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_subtitle);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            String format2 = String.format(m118743r02, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n(), C21459a.m111038f(m13109h(), 0, 2, null), this.f10688B.format(new Date(m13105c()))}, 3));
            AbstractC19074t.m100207e(format2, "format(...)");
            interfaceC18509p.mo240pC(format, format2);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_tab_me);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    };

    /* renamed from: x */
    public static final EnumC2667d f10682x = new EnumC2667d("ERROR", 5) { // from class: b90.d.d
        d(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m114547n = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(m114547n, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_error_state);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    };

    /* renamed from: y */
    public static final EnumC2667d f10683y = new EnumC2667d("CALCULATING", 6) { // from class: b90.d.c
        c(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m114547n = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(m114547n, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_calculting_state);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
    };

    /* renamed from: z */
    private static final /* synthetic */ EnumC2667d[] f10684z;

    /* renamed from: p */
    private long f10685p;

    /* renamed from: q */
    private long f10686q;

    /* renamed from: r */
    private long f10687r;

    /* renamed from: b90.d$a */
    /* loaded from: classes6.dex */
    static final class a extends EnumC2667d {

        /* renamed from: B */
        private final SimpleDateFormat f10688B = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

        a(String str, int i11) {
            super(str, i11, null);
            this.f10688B = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_banner);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n(), this.f10688B.format(new Date(m13105c()))}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            Spanned m119746j = AbstractC23244v8.m119746j(format);
            AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
            return m119746j;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_subtitle);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            String format2 = String.format(m118743r02, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n(), C21459a.m111038f(m13109h(), 0, 2, null), this.f10688B.format(new Date(m13105c()))}, 3));
            AbstractC19074t.m100207e(format2, "format(...)");
            interfaceC18509p.mo240pC(format, format2);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_abuse_tab_me);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    }

    /* renamed from: b90.d$b */
    /* loaded from: classes6.dex */
    static final class b extends EnumC2667d {
        b(String str, int i11) {
            super(str, i11, null);
        }

        /* renamed from: u */
        private final String m13117u() {
            return C21459a.m111038f(m13109h() - m13107e(), 0, 2, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_almost_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m13117u(), " " + AbstractC21935u.m114547n()}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            CharSequence mo13106d = mo13106d();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_almost_full_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(mo13106d, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_almost_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m13117u(), ""}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    }

    /* renamed from: b90.d$c */
    /* loaded from: classes6.dex */
    static final class c extends EnumC2667d {
        c(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m114547n = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(m114547n, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_calculting_state);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
    }

    /* renamed from: b90.d$d */
    /* loaded from: classes6.dex */
    static final class d extends EnumC2667d {
        d(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m114547n = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(m114547n, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_error_state);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    }

    /* renamed from: b90.d$e */
    /* loaded from: classes6.dex */
    static final class e extends EnumC2667d {
        e(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            CharSequence m127168X0;
            String valueOf;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{" " + AbstractC21935u.m114547n()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            m127168X0 = AbstractC24342w.m127168X0(format);
            String obj = m127168X0.toString();
            if (obj.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = obj.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    valueOf = AbstractC24319c.m126980e(charAt);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb2.append((Object) valueOf);
                String substring = obj.substring(1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                sb2.append(substring);
                return sb2.toString();
            }
            return obj;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            CharSequence mo13106d = mo13106d();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_full_subtitle_full);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(mo13106d, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            CharSequence m127168X0;
            String valueOf;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_full_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{""}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            m127168X0 = AbstractC24342w.m127168X0(format);
            String obj = m127168X0.toString();
            if (obj.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = obj.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    valueOf = AbstractC24319c.m126980e(charAt);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb2.append((Object) valueOf);
                String substring = obj.substring(1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                sb2.append(substring);
                return sb2.toString();
            }
            return obj;
        }

        @Override // b90.EnumC2667d
        /* renamed from: j */
        public int mo13111j() {
            return C23212s8.m119606n(AbstractC2807a.error_text);
        }
    }

    /* renamed from: b90.d$f */
    /* loaded from: classes6.dex */
    static final class f extends EnumC2667d {
        f(String str, int i11) {
            super(str, i11, null);
        }

        /* renamed from: u */
        private final int m13118u() {
            return (int) ((((float) m13107e()) / ((float) m13109h())) * 100);
        }

        @Override // b90.EnumC2667d
        /* renamed from: d */
        public CharSequence mo13106d() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_half_way_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m13118u()), " " + AbstractC21935u.m114547n()}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            CharSequence mo13106d = mo13106d();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_half_way_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(mo13106d, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_half_way_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m13118u()), ""}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
    }

    /* renamed from: b90.d$g */
    /* loaded from: classes6.dex */
    static final class g extends EnumC2667d {
        g(String str, int i11) {
            super(str, i11, null);
        }

        @Override // b90.EnumC2667d
        /* renamed from: g */
        public void mo13108g(InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "block");
            String m114547n = AbstractC21935u.m114547n();
            AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC18509p.mo240pC(m114547n, m118743r0);
        }

        @Override // b90.EnumC2667d
        /* renamed from: i */
        public CharSequence mo13110i() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_usage);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{C21459a.m111038f(m13107e(), 0, 2, null), C21459a.m111038f(m13109h(), 0, 2, null)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
    }

    static {
        EnumC2667d[] m13104b = m13104b();
        f10684z = m13104b;
        f10676A = AbstractC30166b.m148796a(m13104b);
    }

    public /* synthetic */ EnumC2667d(String str, int i11, AbstractC19060k abstractC19060k) {
        this(str, i11);
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2667d[] m13104b() {
        return new EnumC2667d[]{f10677s, f10678t, f10679u, f10680v, f10681w, f10682x, f10683y};
    }

    public static EnumC2667d valueOf(String str) {
        return (EnumC2667d) Enum.valueOf(EnumC2667d.class, str);
    }

    public static EnumC2667d[] values() {
        return (EnumC2667d[]) f10684z.clone();
    }

    /* renamed from: c */
    public final long m13105c() {
        return this.f10687r;
    }

    /* renamed from: d */
    public CharSequence mo13106d() {
        return "";
    }

    /* renamed from: e */
    public final long m13107e() {
        return this.f10685p;
    }

    /* renamed from: g */
    public abstract void mo13108g(InterfaceC18509p interfaceC18509p);

    /* renamed from: h */
    public final long m13109h() {
        return this.f10686q;
    }

    /* renamed from: i */
    public abstract CharSequence mo13110i();

    /* renamed from: j */
    public int mo13111j() {
        return C23212s8.m119606n(AbstractC2807a.TextColor2);
    }

    /* renamed from: m */
    public boolean m13112m() {
        if (ordinal() != f10677s.ordinal() && ordinal() != f10679u.ordinal() && ordinal() != f10680v.ordinal() && ordinal() != f10678t.ordinal()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public boolean m13113q() {
        int ordinal = ordinal();
        if (ordinal == f10681w.ordinal() || ordinal == f10680v.ordinal() || ordinal == f10679u.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final void m13114r(long j11) {
        this.f10687r = j11;
    }

    /* renamed from: s */
    public final void m13115s(long j11) {
        this.f10685p = j11;
    }

    /* renamed from: t */
    public final void m13116t(long j11) {
        this.f10686q = j11;
    }

    private EnumC2667d(String str, int i11) {
        super(str, i11);
    }
}
