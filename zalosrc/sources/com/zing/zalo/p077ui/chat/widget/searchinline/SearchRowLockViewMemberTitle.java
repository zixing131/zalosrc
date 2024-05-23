package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.FrameLayout;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.widget.searchinline.C11815a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import i70.C20380b;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p716zh.C31902e9;
import pm0.C24848g0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class SearchRowLockViewMemberTitle extends SearchRow {

    /* renamed from: D */
    private final C11815a.g f61430D;

    /* renamed from: E */
    private C31902e9 f61431E;

    /* renamed from: F */
    private final RobotoTextView f61432F;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowLockViewMemberTitle$a */
    /* loaded from: classes5.dex */
    public static final class C11808a extends AbstractC19075u implements InterfaceC18494a {
        C11808a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m65639a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m65639a() {
            SearchRowLockViewMemberTitle.this.f61430D.mo56867b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRowLockViewMemberTitle(Context context, C11815a.g gVar) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(gVar, "listener");
        this.f61430D = gVar;
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int m118742r = AbstractC23136l9.m118742r(8.0f);
        robotoTextView.setPadding(m118742r, m118742r, m118742r, m118742r);
        robotoTextView.setFontStyle(5);
        robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_02));
        robotoTextView.setTextAlignment(2);
        robotoTextView.setTextSize(0, AbstractC23222t7.f112576o);
        robotoTextView.setMovementMethod(new LinkMovementMethod());
        this.f61432F = robotoTextView;
        addView(robotoTextView);
    }

    /* renamed from: m */
    public final void m65638m(C31902e9 c31902e9, boolean z11) {
        int i11;
        CharSequence m118743r0;
        int i12;
        String m118743r02;
        int i13;
        AbstractC19074t.m100208f(c31902e9, "result");
        this.f61431E = c31902e9;
        RobotoTextView robotoTextView = this.f61432F;
        if (c31902e9 == null) {
            AbstractC19074t.m100223u("searchResult");
            c31902e9 = null;
        }
        if (!c31902e9.m153324p()) {
            C31902e9 c31902e92 = this.f61431E;
            if (c31902e92 == null) {
                AbstractC19074t.m100223u("searchResult");
                c31902e92 = null;
            }
            if (c31902e92.m153312d()) {
                if (z11) {
                    i13 = AbstractC8020f0.str_community_mentions_hide_members_title_for_other_without_all;
                } else {
                    i13 = AbstractC8020f0.str_mentions_hide_members_title_for_other_with_all_v2;
                }
                m118743r02 = AbstractC23136l9.m118743r0(i13);
            } else {
                if (z11) {
                    i12 = AbstractC8020f0.str_community_mentions_hide_members_title_for_other_without_all;
                } else {
                    i12 = AbstractC8020f0.str_mentions_hide_members_title_for_other_without_all;
                }
                m118743r02 = AbstractC23136l9.m118743r0(i12);
            }
            AbstractC19074t.m100205c(m118743r02);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m118743r0 = C20380b.m106164c(context, null, m118743r02, "gr_mention_list", new C11808a());
        } else {
            if (z11) {
                i11 = AbstractC8020f0.str_community_mentions_hide_members_title_for_owner_admins;
            } else {
                i11 = AbstractC8020f0.str_mentions_hide_members_title_for_admins_v2;
            }
            m118743r0 = AbstractC23136l9.m118743r0(i11);
        }
        robotoTextView.setText(m118743r0);
    }
}
