package u80;

import ag0.C0815e1;
import android.view.ViewGroup;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.C11621p0;
import com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView;
import com.zing.zalo.p077ui.mycloud.EmbeddedMyCloudPagesLayout;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import n60.AbstractC23596i;
import p246iw.C20843c0;
import p279jw.C21373a;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import sa0.C26209i;

/* renamed from: u80.p2 */
/* loaded from: classes6.dex */
public abstract class AbstractC27162p2 extends AbstractC23596i {

    /* renamed from: u80.p2$a */
    /* loaded from: classes6.dex */
    public static final class a implements AbstractC23596i.a {
        a() {
        }

        @Override // n60.AbstractC23596i.a
        /* renamed from: a */
        public void mo123720a() {
            C20843c0 m120602N0 = AbstractC23306f.m120602N0();
            m120602N0.m109071S1(false);
            m120602N0.m109089v1(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC27162p2(ViewGroup viewGroup, C11621p0 c11621p0) {
        super(viewGroup, c11621p0);
        AbstractC19074t.m100208f(viewGroup, "parentView");
        AbstractC19074t.m100208f(c11621p0, "chatViewHolder");
    }

    @Override // n60.AbstractC23596i
    /* renamed from: b */
    public void mo123711b() {
        String str;
        super.mo123711b();
        if (m123713e() == 1) {
            str = "mycloud_listing_onboarding_2";
        } else if (m123713e() == 2) {
            str = "mycloud_listing_onboarding_3";
        } else {
            str = "mycloud_listing_onboarding_1";
        }
        C0815e1.m2075D().m2100V(new C23648e(1, "", 1, str, ""), false);
    }

    @Override // n60.AbstractC23596i
    /* renamed from: i */
    public void mo123717i() {
        EmbeddedMyCloudPagesLayout m64829x0;
        CarouselMyCloudCollectionView carouselMyCloudCollectionView;
        m123718j(new a());
        AbstractC23306f.m120602N0().m109089v1(false);
        RecyclingImageView recyclingImageView = (RecyclingImageView) m123715g().findViewById(AbstractC6918a0.change_mode_chat_view);
        if (recyclingImageView != null && (m64829x0 = m123712d().m64829x0()) != null && (carouselMyCloudCollectionView = m64829x0.getCarouselMyCloudCollectionView()) != null) {
            C26209i c26209i = new C26209i(carouselMyCloudCollectionView);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_onboarding_step2_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_onboarding_step2_desc);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_onboarding_step2_btn_text);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            AbstractC23596i.b bVar = new AbstractC23596i.b(m118743r0, "tip.mycloud.listing.collection", m118743r02, c26209i, m118743r03, false, AbstractC23222t7.f112576o, 32, null);
            C26209i c26209i2 = new C26209i(recyclingImageView);
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_onboarding_step3_title);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_onboarding_step3_desc);
            AbstractC19074t.m100207e(m118743r05, "getString(...)");
            String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_onboarding_step3_btn_text);
            AbstractC19074t.m100207e(m118743r06, "getString(...)");
            AbstractC23596i.b bVar2 = new AbstractC23596i.b(m118743r04, "tip.mycloud.listing.change.mode", m118743r05, c26209i2, m118743r06, false, AbstractC23222t7.f112576o, 32, null);
            m123716h().clear();
            m123716h().add(bVar);
            m123716h().add(bVar2);
        }
    }

    @Override // n60.AbstractC23596i
    /* renamed from: k */
    public void mo123719k() {
        try {
            super.mo123719k();
            C21373a.f104231a.m110794Q();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
