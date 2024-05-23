package p401or;

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
import qm0.AbstractC25366r;
import sa0.C26209i;

/* renamed from: or.f */
/* loaded from: classes4.dex */
public abstract class AbstractC24416f {

    /* renamed from: a */
    private final ViewGroup f117904a;

    /* renamed from: b */
    private WalkThroughOnboardView f117905b;

    /* renamed from: or.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements WalkThroughOnboardView.InterfaceC13300b {
        a() {
        }

        @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
        /* renamed from: a */
        public void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
            AbstractC19074t.m100208f(walkThroughOnboardView, "walkThroughOnboardView");
            AbstractC24416f.this.mo38376b();
        }
    }

    public AbstractC24416f(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parentView");
        this.f117904a = viewGroup;
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        WalkThroughOnboardView walkThroughOnboardView = new WalkThroughOnboardView(context);
        walkThroughOnboardView.setDimColor(Color.parseColor("#80000000"));
        this.f117905b = walkThroughOnboardView;
        walkThroughOnboardView.setListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m127695c(AbstractC24416f abstractC24416f) {
        AbstractC19074t.m100208f(abstractC24416f, "this$0");
        abstractC24416f.f117904a.removeView(abstractC24416f.f117905b);
        abstractC24416f.f117905b.setVisibility(8);
    }

    /* renamed from: b */
    public void mo38376b() {
        this.f117905b.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: or.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC24416f.m127695c(AbstractC24416f.this);
            }
        }).start();
    }

    /* renamed from: d */
    public void m127696d(View view) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        m127697e(view);
        AbstractC0924m0.m3910io(true);
        if (this.f117905b.getParent() == null) {
            this.f117905b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f117904a.addView(this.f117905b);
        }
        this.f117905b.setVisibility(0);
        this.f117905b.setAlpha(0.0f);
        this.f117905b.animate().alpha(1.0f).setDuration(200L).start();
    }

    /* renamed from: e */
    public final void m127697e(View view) {
        List<WalkThroughOnboardView.C13302d> m131496e;
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        C26209i c26209i = new C26209i(view);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_onboard_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_onboard_desc);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_onboard_gotit);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        WalkThroughOnboardView.C13302d c13302d = new WalkThroughOnboardView.C13302d(m118743r0, m118743r02, c26209i, m118743r03);
        c13302d.m74674n(3);
        WalkThroughOnboardView walkThroughOnboardView = this.f117905b;
        m131496e = AbstractC25366r.m131496e(c13302d);
        walkThroughOnboardView.setData(m131496e);
    }
}
