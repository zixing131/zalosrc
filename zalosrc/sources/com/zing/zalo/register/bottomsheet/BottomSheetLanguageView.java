package com.zing.zalo.register.bottomsheet;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.register.bottomsheet.BottomSheetLanguageView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p133ek.AbstractC18458a;
import p649xl.C30025s0;

/* loaded from: classes4.dex */
public final class BottomSheetLanguageView extends BottomSheet {

    /* renamed from: b1 */
    public C30025s0 f49372b1;

    /* renamed from: c1 */
    private final String[] f49373c1;

    /* renamed from: d1 */
    private final String[] f49374d1;

    public BottomSheetLanguageView() {
        String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language);
        AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
        this.f49373c1 = m118755v0;
        String[] m118755v02 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
        AbstractC19074t.m100207e(m118755v02, "getStringArray(...)");
        this.f49374d1 = m118755v02;
    }

    /* renamed from: LL */
    private final String m50041LL(boolean z11) {
        String str = AbstractC18458a.f93019a;
        int i11 = 0;
        if (!(!TextUtils.isEmpty(str))) {
            String str2 = this.f49373c1[0];
            AbstractC19074t.m100207e(str2, "get(...)");
            return str2;
        }
        String str3 = this.f49373c1[0];
        String[] strArr = this.f49374d1;
        String str4 = strArr[0];
        int length = strArr.length;
        while (true) {
            if (i11 < length) {
                if (AbstractC19074t.m100204b(str, this.f49374d1[i11])) {
                    str3 = this.f49373c1[i11];
                    break;
                }
                i11++;
            } else {
                str = str4;
                break;
            }
        }
        if (z11) {
            AbstractC19074t.m100205c(str3);
            return str3;
        }
        AbstractC19074t.m100205c(str);
        return str;
    }

    /* renamed from: ML */
    private final void m50042ML() {
        m50045KL().f139278t.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_title_choose_language_code));
        ListItemSetting listItemSetting = m50045KL().f139276r;
        String str = this.f49373c1[0];
        AbstractC19074t.m100207e(str, "get(...)");
        listItemSetting.setTitle(str);
        listItemSetting.setSubtitle("");
        listItemSetting.setTick(AbstractC19074t.m100204b(m50041LL(false), this.f49374d1[0]));
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: dz.j
            public /* synthetic */ ViewOnClickListenerC18141j() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetLanguageView.m50043NL(BottomSheetLanguageView.this, view);
            }
        });
        ListItemSetting listItemSetting2 = m50045KL().f139275q;
        String str2 = this.f49373c1[1];
        AbstractC19074t.m100207e(str2, "get(...)");
        listItemSetting2.setTitle(str2);
        listItemSetting2.setSubtitle("");
        listItemSetting2.setTick(AbstractC19074t.m100204b(m50041LL(false), this.f49374d1[1]));
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: dz.k
            public /* synthetic */ ViewOnClickListenerC18142k() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetLanguageView.m50044OL(BottomSheetLanguageView.this, view);
            }
        });
    }

    /* renamed from: NL */
    public static final void m50043NL(BottomSheetLanguageView bottomSheetLanguageView, View view) {
        AbstractC19074t.m100208f(bottomSheetLanguageView, "this$0");
        AbstractC18458a.f93019a = bottomSheetLanguageView.f49374d1[0];
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SELECTED_LANGUAGE", bottomSheetLanguageView.f49374d1[0]);
        bottomSheetLanguageView.mo50035CK(-1, intent);
        bottomSheetLanguageView.close();
    }

    /* renamed from: OL */
    public static final void m50044OL(BottomSheetLanguageView bottomSheetLanguageView, View view) {
        AbstractC19074t.m100208f(bottomSheetLanguageView, "this$0");
        AbstractC18458a.f93019a = bottomSheetLanguageView.f49374d1[1];
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SELECTED_LANGUAGE", bottomSheetLanguageView.f49374d1[1]);
        bottomSheetLanguageView.mo50035CK(-1, intent);
        bottomSheetLanguageView.close();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CK */
    public void mo50035CK(int i11, Intent intent) {
        ZaloView m92650VI;
        super.mo50035CK(i11, intent);
        if ((m92650VI() instanceof RegisterLayoutBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(i11, intent);
        }
    }

    /* renamed from: KL */
    public final C30025s0 m50045KL() {
        C30025s0 c30025s0 = this.f49372b1;
        if (c30025s0 != null) {
            return c30025s0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: PL */
    public final void m50046PL(C30025s0 c30025s0) {
        AbstractC19074t.m100208f(c30025s0, "<set-?>");
        this.f49372b1 = c30025s0;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30025s0 m148468c = C30025s0.m148468c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148468c, "inflate(...)");
        m50046PL(m148468c);
        m90525tL(true);
        m90528wL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m50042ML();
    }
}
