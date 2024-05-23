package com.zing.zalo.business_account.business_tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2807a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.business_account.business_tools.AbstractC7404a;
import com.zing.zalo.business_account.business_tools.AbstractC7406c;
import com.zing.zalo.business_account.business_tools.BusinessToolsSettingItemView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import de.InterfaceC17894c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes3.dex */
public final class BusinessToolsSettingItemView extends ListItem {
    public static final C7400a Companion = new C7400a(null);

    /* renamed from: I */
    private static final int f40227I = AbstractC23222t7.f112539R;

    /* renamed from: J */
    private static final int f40228J = AbstractC23222t7.f112514B;

    /* renamed from: G */
    private final RecyclingImageView f40229G;

    /* renamed from: H */
    private AbstractC7406c.d f40230H;

    /* renamed from: com.zing.zalo.business_account.business_tools.BusinessToolsSettingItemView$a */
    /* loaded from: classes3.dex */
    public static final class C7400a {
        private C7400a() {
        }

        public /* synthetic */ C7400a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BusinessToolsSettingItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m37573q(InterfaceC17894c interfaceC17894c, AbstractC7406c.d dVar, View view) {
        AbstractC19074t.m100208f(interfaceC17894c, "$actionHandler");
        AbstractC19074t.m100208f(dVar, "$item");
        interfaceC17894c.mo37585oj(new AbstractC7404a.a(dVar));
    }

    public final RecyclingImageView getImageView() {
        return this.f40229G;
    }

    public final AbstractC7406c.d getSettingItem() {
        return this.f40230H;
    }

    /* renamed from: p */
    public final void m37574p(final InterfaceC17894c interfaceC17894c, final AbstractC7406c.d dVar) {
        int i11;
        AbstractC19074t.m100208f(interfaceC17894c, "actionHandler");
        AbstractC19074t.m100208f(dVar, "item");
        this.f40230H = dVar;
        setIdTracking(dVar.m37619e());
        this.f40229G.setImageDrawable(dVar.m37616b());
        setTitle(dVar.m37618d());
        CharSequence m37617c = dVar.m37617c();
        if (m37617c == null) {
            m37617c = "";
        }
        setSubtitle(m37617c);
        m90592m(true);
        if (dVar.m37620f()) {
            i11 = AbstractC23222t7.f112545X;
        } else {
            i11 = 0;
        }
        m90591l(i11, 0, 0, 0);
        setOnClickListener(new View.OnClickListener() { // from class: de.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessToolsSettingItemView.m37573q(InterfaceC17894c.this, dVar, view);
            }
        });
    }

    public final void setSettingItem(AbstractC7406c.d dVar) {
        this.f40230H = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BusinessToolsSettingItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ResourceType"})
    public BusinessToolsSettingItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setBackgroundResource(C23212s8.m119611s(context, AbstractC2807a.ui_background));
        setTitleMaxLine(1);
        setTitleColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        setSubtitleColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        setLeadingGravity(EnumC16952b0.CENTER);
        RoundCornerImageView roundCornerImageView = new RoundCornerImageView(context, null);
        this.f40229G = roundCornerImageView;
        roundCornerImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        m90587c(roundCornerImageView);
    }
}
