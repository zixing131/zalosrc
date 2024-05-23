package com.zing.zalo.p077ui.group.leavegroup;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.group.leavegroup.SelectGroupOwnerRow;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.RadioButton;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23028c0;
import me0.C23212s8;
import qm0.AbstractC25366r;
import ui0.C27276c;

/* loaded from: classes5.dex */
public final class SelectGroupOwnerRow extends ListItem {

    /* renamed from: G */
    private final Avatar f62061G;

    /* renamed from: H */
    private final RadioButton f62062H;

    /* renamed from: I */
    private InterfaceC18319c f62063I;

    /* renamed from: J */
    private boolean f62064J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectGroupOwnerRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m66277r(SelectGroupOwnerRow selectGroupOwnerRow, ContactProfile contactProfile, View view) {
        AbstractC19074t.m100208f(selectGroupOwnerRow, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$profile");
        selectGroupOwnerRow.f62062H.m90615f(true, true);
        InterfaceC18319c interfaceC18319c = selectGroupOwnerRow.f62063I;
        if (interfaceC18319c != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m66278s(SelectGroupOwnerRow selectGroupOwnerRow, ContactProfile contactProfile, CompoundButton compoundButton, boolean z11) {
        InterfaceC18319c interfaceC18319c;
        AbstractC19074t.m100208f(selectGroupOwnerRow, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$profile");
        if (z11 && (interfaceC18319c = selectGroupOwnerRow.f62063I) != null) {
        }
    }

    /* renamed from: u */
    private final void m66279u() {
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.container));
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        int m139649b = C27276c.m139649b(context, 16);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        int m139649b2 = C27276c.m139649b(context2, 16);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        int m139649b3 = C27276c.m139649b(context3, 16);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        setPadding(m139649b, m139649b2, m139649b3, C27276c.m139649b(context4, 16));
        m90591l(0, 0, 0, 0);
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        m90591l(C27276c.m139649b(context5, 80), 0, 0, 0);
        setTitleMaxLine(1);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        m90587c(this.f62061G);
        m90589e(this.f62062H);
        setTrailingGravity(enumC16952b0);
    }

    public final InterfaceC18319c getActionResponder() {
        return this.f62063I;
    }

    /* renamed from: q */
    public final void m66280q(GroupFullMemberAdapter.C6938b c6938b, boolean z11) {
        CharSequence charSequence;
        int i11;
        List m131496e;
        AbstractC19074t.m100208f(c6938b, "data");
        final ContactProfile contactProfile = c6938b.f38022b;
        if (contactProfile != null) {
            Avatar avatar = this.f62061G;
            m131496e = AbstractC25366r.m131496e(contactProfile.f42434r);
            avatar.m90480p(m131496e);
            if (contactProfile.f42399a1.isEmpty()) {
                CharSequence m118085e = AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_you);
                AbstractC19074t.m100207e(m118085e, "getDisplayName(...)");
                setTitle(m118085e);
            } else {
                SpannableString spannableString = new SpannableString(AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_you));
                for (int i12 = 0; i12 < contactProfile.f42399a1.size() - 1; i12 += 2) {
                    Object obj = contactProfile.f42399a1.get(i12);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    if (((Number) obj).intValue() >= 0) {
                        int i13 = i12 + 1;
                        Object obj2 = contactProfile.f42399a1.get(i13);
                        AbstractC19074t.m100207e(obj2, "get(...)");
                        int intValue = ((Number) obj2).intValue();
                        Object obj3 = contactProfile.f42399a1.get(i12);
                        AbstractC19074t.m100207e(obj3, "get(...)");
                        if (intValue > ((Number) obj3).intValue()) {
                            Object obj4 = contactProfile.f42399a1.get(i13);
                            AbstractC19074t.m100207e(obj4, "get(...)");
                            if (((Number) obj4).intValue() <= spannableString.length()) {
                                StyleSpan styleSpan = new StyleSpan(1);
                                Object obj5 = contactProfile.f42399a1.get(i12);
                                AbstractC19074t.m100207e(obj5, "get(...)");
                                int intValue2 = ((Number) obj5).intValue();
                                Object obj6 = contactProfile.f42399a1.get(i13);
                                AbstractC19074t.m100207e(obj6, "get(...)");
                                spannableString.setSpan(styleSpan, intValue2, ((Number) obj6).intValue(), 33);
                            }
                        }
                    }
                }
                setTitle(spannableString);
            }
            setOnClickListener(new View.OnClickListener() { // from class: f70.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectGroupOwnerRow.m66277r(SelectGroupOwnerRow.this, contactProfile, view);
                }
            });
            this.f62062H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f70.o
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    SelectGroupOwnerRow.m66278s(SelectGroupOwnerRow.this, contactProfile, compoundButton, z12);
                }
            });
        }
        if (c6938b.f38027g) {
            Context context = getContext();
            if (this.f62064J) {
                i11 = AbstractC8020f0.str_leave_community_select_owner_admin;
            } else {
                i11 = AbstractC8020f0.str_leave_group_select_owner_admin;
            }
            charSequence = context.getString(i11);
            AbstractC19074t.m100207e(charSequence, "getString(...)");
        } else {
            charSequence = "";
        }
        setSubtitle(charSequence);
        RadioButton radioButton = this.f62062H;
        boolean z12 = c6938b.f38036p;
        radioButton.m90615f(z12, z12);
        m90592m(z11);
    }

    public final void setActionResponder(InterfaceC18319c interfaceC18319c) {
        this.f62063I = interfaceC18319c;
    }

    public final void setCommunity(boolean z11) {
        this.f62064J = z11;
    }

    public /* synthetic */ SelectGroupOwnerRow(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGroupOwnerRow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f62061G = new Avatar(context);
        this.f62062H = new RadioButton(context);
        m66279u();
    }
}
