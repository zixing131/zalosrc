package com.zing.zalo.p077ui.mycloud;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.mycloud.CollectionInfoHeaderView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p246iw.C20843c0;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p716zh.C31950hc;
import pk.C24799c;

/* loaded from: classes6.dex */
public final class CollectionInfoHeaderView extends LinearLayout implements C23744a.c {

    /* renamed from: p */
    private long f65286p;

    /* renamed from: q */
    private RobotoTextView f65287q;

    /* renamed from: r */
    private RobotoTextView f65288r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionInfoHeaderView(Context context, long j11) {
        this(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65286p = j11;
        m70015d();
    }

    /* renamed from: b */
    private final void m70013b(final C24799c c24799c) {
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.i
            @Override // java.lang.Runnable
            public final void run() {
                CollectionInfoHeaderView.m70014c(CollectionInfoHeaderView.this, c24799c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m70014c(CollectionInfoHeaderView collectionInfoHeaderView, C24799c c24799c) {
        int m109067P0;
        String m118746s0;
        AbstractC19074t.m100208f(collectionInfoHeaderView, "this$0");
        AbstractC19074t.m100208f(c24799c, "$collectionInfo");
        collectionInfoHeaderView.f65287q.setText(c24799c.m128821a());
        C31950hc c31950hc = C31950hc.f146830a;
        if (c31950hc.m153634E()) {
            m109067P0 = AbstractC23306f.m120602N0().m109067P0(collectionInfoHeaderView.f65286p) - c31950hc.m153643v();
        } else {
            m109067P0 = AbstractC23306f.m120602N0().m109067P0(collectionInfoHeaderView.f65286p);
        }
        boolean m109081m1 = C20843c0.Companion.m109092a().m109081m1(collectionInfoHeaderView.f65286p);
        RobotoTextView robotoTextView = collectionInfoHeaderView.f65288r;
        if (m109081m1) {
            if (m109067P0 <= 1) {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_my_cloud_collection_indo_size_singular, Integer.valueOf(m109067P0), AbstractC23160o0.m119227X(c24799c.m128822b()));
            } else {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_my_cloud_collection_indo_size_plural, Integer.valueOf(m109067P0), AbstractC23160o0.m119227X(c24799c.m128822b()));
            }
        } else if (m109067P0 <= 1) {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_my_cloud_collection_indo_size_and_time_singular, Integer.valueOf(m109067P0), AbstractC23160o0.m119227X(c24799c.m128822b()));
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_my_cloud_collection_indo_size_and_time_plural, Integer.valueOf(m109067P0), AbstractC23160o0.m119227X(c24799c.m128822b()));
        }
        robotoTextView.setText(m118746s0);
    }

    /* renamed from: d */
    private final void m70015d() {
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i11 = AbstractC23222t7.f112586t;
        setPadding(i11, i11, i11, i11);
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        C24799c m109091x0 = C20843c0.Companion.m109092a().m109091x0(this.f65286p);
        if (m109091x0 != null) {
            RobotoTextView robotoTextView = this.f65287q;
            robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTextStyleBold(true);
            robotoTextView.setTextSize(0, AbstractC23222t7.f112598z);
            robotoTextView.setMaxLines(2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            robotoTextView.setEllipsize(truncateAt);
            RobotoTextView robotoTextView2 = this.f65288r;
            robotoTextView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC21196a.TextColor2));
            robotoTextView2.setTextStyleBold(false);
            robotoTextView2.setTextSize(0, AbstractC23222t7.f112582r);
            robotoTextView2.setPadding(0, AbstractC23222t7.f112566j, 0, 0);
            robotoTextView2.setMaxLines(1);
            robotoTextView2.setEllipsize(truncateAt);
            m70013b(m109091x0);
        }
        addView(this.f65287q);
        addView(this.f65288r);
        AbstractC20110a.f98889a.mo104548a("SMLMyCloudCollection CollectionInfoHeaderView->initView", new Object[0]);
    }

    public final long getCollectionId() {
        return this.f65286p;
    }

    public final RobotoTextView getMDesc() {
        return this.f65288r;
    }

    public final RobotoTextView getMTitle() {
        return this.f65287q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5203);
        bVar.m124119a().m124115b(this, 174);
        bVar.m124119a().m124115b(this, 175);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5203);
        bVar.m124119a().m124117e(this, 174);
        bVar.m124119a().m124117e(this, 175);
    }

    public final void setCollectionId(long j11) {
        this.f65286p = j11;
    }

    public final void setMDesc(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f65288r = robotoTextView;
    }

    public final void setMTitle(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f65287q = robotoTextView;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        C24799c m109091x0;
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (i11 != 174 && i11 != 175) {
                if (i11 == 5203) {
                    if (objArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        Object obj = objArr[0];
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Long");
                        long longValue = ((Long) obj).longValue();
                        if (longValue == this.f65286p && (m109091x0 = C20843c0.Companion.m109092a().m109091x0(longValue)) != null) {
                            m70013b(m109091x0);
                        }
                    }
                }
            } else {
                C24799c m109091x02 = C20843c0.Companion.m109092a().m109091x0(this.f65286p);
                if (m109091x02 != null) {
                    m70013b(m109091x02);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionInfoHeaderView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f65287q = new RobotoTextView(context2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f65288r = new RobotoTextView(context3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionInfoHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f65287q = new RobotoTextView(context2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f65288r = new RobotoTextView(context3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionInfoHeaderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f65287q = new RobotoTextView(context2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f65288r = new RobotoTextView(context3);
    }
}
