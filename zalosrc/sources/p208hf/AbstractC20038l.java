package p208hf;

import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.showcase.WalkThroughOnboardView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import qm0.AbstractC25366r;
import sa0.C26209i;

/* renamed from: hf.l */
/* loaded from: classes3.dex */
public abstract class AbstractC20038l {

    /* renamed from: a */
    private final ViewGroup f98479a;

    /* renamed from: b */
    private WalkThroughOnboardView f98480b;

    /* renamed from: hf.l$a */
    /* loaded from: classes3.dex */
    public static final class a implements WalkThroughOnboardView.InterfaceC13300b {
        a() {
        }

        @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
        /* renamed from: a */
        public void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
            AbstractC19074t.m100208f(walkThroughOnboardView, "walkThroughOnboardView");
            AbstractC20038l.this.mo38377b();
        }
    }

    public AbstractC20038l(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parentView");
        this.f98479a = viewGroup;
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        WalkThroughOnboardView walkThroughOnboardView = new WalkThroughOnboardView(context);
        walkThroughOnboardView.setDimColor(Color.parseColor("#B3000000"));
        this.f98480b = walkThroughOnboardView;
        walkThroughOnboardView.setListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m103967c(AbstractC20038l abstractC20038l) {
        AbstractC19074t.m100208f(abstractC20038l, "this$0");
        abstractC20038l.f98479a.removeView(abstractC20038l.f98480b);
        abstractC20038l.f98480b.setVisibility(8);
    }

    /* renamed from: b */
    public void mo38377b() {
        this.f98480b.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: hf.k
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20038l.m103967c(AbstractC20038l.this);
            }
        }).start();
    }

    /* renamed from: d */
    public void m103968d(View view) {
        List<WalkThroughOnboardView.C13302d> m131496e;
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        C26209i c26209i = new C26209i(view);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_onboard_desc);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_onboard_gotit);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        WalkThroughOnboardView.C13302d c13302d = new WalkThroughOnboardView.C13302d("", m118743r0, c26209i, m118743r02);
        c13302d.m74674n(4);
        c13302d.m74670j(AbstractC23222t7.f112566j);
        WalkThroughOnboardView walkThroughOnboardView = this.f98480b;
        m131496e = AbstractC25366r.m131496e(c13302d);
        walkThroughOnboardView.setData(m131496e);
        AbstractC0924m0.m3880ho(true);
        if (this.f98480b.getParent() == null) {
            this.f98480b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f98479a.addView(this.f98480b);
        }
        this.f98480b.setVisibility(0);
        this.f98480b.setAlpha(0.0f);
        this.f98480b.animate().alpha(1.0f).setDuration(200L).start();
    }
}
