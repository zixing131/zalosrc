package com.zing.zalo.p077ui.zalocloud.graceperiod;

import am.AbstractC0900b0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import k30.C21459a;
import ln0.AbstractC22543l;
import me0.C23212s8;
import on0.AbstractC24342w;
import p649xl.AbstractC30124xe;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZCloudGPMoreInfoBottomSheet extends ZdsModalBottomSheet {
    public static final C13855a Companion = new C13855a(null);

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPMoreInfoBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C13855a {
        private C13855a() {
        }

        public /* synthetic */ C13855a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPMoreInfoBottomSheet$b */
    /* loaded from: classes6.dex */
    public final class C13856b extends BottomSheet {

        /* renamed from: b1 */
        public AbstractC30124xe f71574b1;

        /* renamed from: c1 */
        private long f71575c1;

        /* renamed from: d1 */
        private long f71576d1;

        public C13856b() {
        }

        /* renamed from: IL */
        private final SpannableStringBuilder m77175IL(String str, String str2) {
            int m127173b0;
            int m116580c;
            int m116584g;
            int m116584g2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            try {
                m127173b0 = AbstractC24342w.m127173b0(str, str2, 0, false, 6, null);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.text_secondary));
                m116580c = AbstractC22543l.m116580c(m127173b0, 0);
                spannableStringBuilder.setSpan(foregroundColorSpan, 0, m116580c, 17);
                m116584g = AbstractC22543l.m116584g(str2.length() + m127173b0, str.length());
                spannableStringBuilder.setSpan(new StyleSpan(1), m127173b0, m116584g, 17);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.text_secondary));
                m116584g2 = AbstractC22543l.m116584g(m116584g + 1, str.length());
                spannableStringBuilder.setSpan(foregroundColorSpan2, m116584g2, str.length(), 17);
            } catch (Exception e11) {
                AbstractC0900b0.m2786b("CommonZaloview", ((Object) spannableStringBuilder) + " - " + e11);
            }
            return spannableStringBuilder;
        }

        /* renamed from: JL */
        private final void m77176JL() {
            long j11;
            Bundle m92642L3 = m92642L3();
            long j12 = 0;
            if (m92642L3 != null) {
                j11 = m92642L3.getLong("ARG_CLOUD_MEDIA_SIZE");
            } else {
                j11 = 0;
            }
            this.f71575c1 = j11;
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                j12 = m92642L32.getLong("ARG_MY_CLOUD_SIZE");
            }
            this.f71576d1 = j12;
        }

        /* renamed from: LL */
        private final void m77177LL() {
            ListItem listItem = m77178KL().f139974P;
            AppCompatImageView appCompatImageView = new AppCompatImageView(listItem.getContext());
            Context context = appCompatImageView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_gallery_line_24, AbstractC2807a.icon_primary));
            listItem.m90587c(appCompatImageView);
            listItem.m90592m(false);
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = m92652XI(AbstractC8020f0.str_cloud_media_size);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{C21459a.m111038f(this.f71575c1, 0, 2, null)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            listItem.setSubtitle(m77175IL(format, C21459a.m111038f(this.f71575c1, 0, 2, null)));
            listItem.setSubtitleColor(C23212s8.m119606n(AbstractC2807a.text_secondary));
            ListItem listItem2 = m77178KL().f139975Q;
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(listItem2.getContext());
            Context context2 = appCompatImageView2.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            appCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_my_cloud_line_24, AbstractC2807a.icon_primary));
            listItem2.m90587c(appCompatImageView2);
            listItem2.m90592m(false);
            String m92652XI2 = m92652XI(AbstractC8020f0.str_my_cloud_size);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            String format2 = String.format(m92652XI2, Arrays.copyOf(new Object[]{C21459a.m111038f(this.f71576d1, 0, 2, null)}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            listItem2.setSubtitle(m77175IL(format2, C21459a.m111038f(this.f71576d1, 0, 2, null)));
            listItem2.setSubtitleColor(C23212s8.m119606n(AbstractC2807a.text_secondary));
        }

        /* renamed from: KL */
        public final AbstractC30124xe m77178KL() {
            AbstractC30124xe abstractC30124xe = this.f71574b1;
            if (abstractC30124xe != null) {
                return abstractC30124xe;
            }
            AbstractC19074t.m100223u("mBinding");
            return null;
        }

        /* renamed from: ML */
        public final void m77179ML(AbstractC30124xe abstractC30124xe) {
            AbstractC19074t.m100208f(abstractC30124xe, "<set-?>");
            this.f71574b1 = abstractC30124xe;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet
        /* renamed from: lL */
        protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
            AbstractC19074t.m100208f(layoutInflater, "inflater");
            AbstractC30124xe m148709Q = AbstractC30124xe.m148709Q(layoutInflater, linearLayout, true);
            AbstractC19074t.m100207e(m148709Q, "inflate(...)");
            m77179ML(m148709Q);
            m77176JL();
            m90533zL(EnumC17017m.HUG_CONTENT);
            m90525tL(true);
            m77177LL();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new C13856b();
    }
}
