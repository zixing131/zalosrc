package u80;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zalocloud.configs.C16805b;
import dj.C17945a0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import og0.EnumC24253d;
import p304ks.AbstractC21935u;
import ui0.C27280g;
import vg.C28212v6;

/* renamed from: u80.l1 */
/* loaded from: classes6.dex */
public final class C27145l1 {

    /* renamed from: a */
    public static final C27145l1 f127862a = new C27145l1();

    /* renamed from: u80.l1$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f127863a;

        static {
            int[] iArr = new int[EnumC24253d.values().length];
            try {
                iArr[EnumC24253d.f117154q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24253d.f117155r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24253d.f117156s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127863a = iArr;
        }
    }

    private C27145l1() {
    }

    /* renamed from: a */
    private final SpannableStringBuilder m139247a(Context context) {
        Drawable m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_cloud_slash_solid_24, AbstractC2807a.icon_04);
        if (m139660c != null) {
            m139660c.setBounds(0, 0, AbstractC23136l9.m118759w1(16), AbstractC23136l9.m118759w1(16));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_outcloud_status_tip_body));
            int length = spannableStringBuilder.length();
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (TextUtils.equals("*", String.valueOf(spannableStringBuilder.charAt(i11)))) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            spannableStringBuilder.setSpan(new C27104b0(m139660c, AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f)), i11, i11 + 1, 33);
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder("");
    }

    /* renamed from: b */
    public final C28212v6 m139248b() {
        C28212v6 c28212v6 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_outcloud_status_size_100_tip_title));
        c28212v6.f131577c = "tip.zcloud.file.status";
        c28212v6.f131590p = 4;
        return c28212v6;
    }

    /* renamed from: c */
    public final void m139249c(Context context, C28212v6 c28212v6, C17945a0 c17945a0) {
        int i11;
        String m114547n;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c28212v6, "promoteNotiInfo");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        EnumC24253d m95216o5 = c17945a0.m95216o5();
        if (m95216o5 == null) {
            i11 = -1;
        } else {
            i11 = a.f127863a[m95216o5.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                c28212v6.f131581g = AbstractC23136l9.m118746s0(AbstractC8020f0.str_outcloud_status_default_tip_title, AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_this_item));
                c28212v6.f131582h = AbstractC23136l9.m118746s0(AbstractC8020f0.str_outcloud_status_default_tip_body, C16805b.Companion.m89811a().m89800f());
                return;
            }
            int i12 = AbstractC8020f0.str_outcloud_status_size_full_tip_title;
            Object[] objArr = new Object[1];
            if (AbstractC3489d.m17503k()) {
                m114547n = C16805b.Companion.m89811a().m89800f();
            } else {
                m114547n = AbstractC21935u.m114547n();
            }
            objArr[0] = m114547n;
            c28212v6.f131581g = AbstractC23136l9.m118746s0(i12, objArr);
            c28212v6.f131582h = m139247a(context);
            return;
        }
        c28212v6.f131581g = AbstractC23136l9.m118743r0(AbstractC8020f0.str_outcloud_status_size_100_tip_title);
        c28212v6.f131582h = m139247a(context);
    }
}
