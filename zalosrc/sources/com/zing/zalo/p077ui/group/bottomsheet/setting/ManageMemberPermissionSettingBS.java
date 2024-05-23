package com.zing.zalo.p077ui.group.bottomsheet.setting;

import ag0.C0815e1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.group.bottomsheet.setting.ManageMemberPermissionSettingBS;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import i70.C20380b;
import me0.AbstractC23136l9;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p649xl.C30093w0;
import pm0.C24848g0;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class ManageMemberPermissionSettingBS extends BottomSheet {

    /* renamed from: b1 */
    private C30093w0 f61988b1;

    /* renamed from: KL */
    private final CharSequence m66143KL(String str, boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC8020f0.str_community_lock_view_members_setting_desc;
        } else {
            i11 = AbstractC8020f0.str_lock_view_members_setting_desc;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        return C20380b.m106165d(m92689tK, this, m118743r0, str, null, 16, null);
    }

    /* renamed from: LL */
    private final void m66144LL(int i11, boolean z11, boolean z12, String str) {
        if (z11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 11) {
                        if (i11 != 12) {
                            if (i11 == 30 && !z12) {
                                C0815e1.m2075D().m2100V(new C23648e(61, str, 0, "hide_mem_list_off", new String[0]), true);
                                return;
                            }
                            return;
                        }
                        AbstractC23647d.m123897g("1591051");
                        return;
                    }
                    AbstractC23647d.m123897g("1591054");
                    return;
                }
                AbstractC23647d.m123897g("1591057");
                return;
            }
            AbstractC23647d.m123897g("1591048");
            return;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 11) {
                    if (i11 != 12) {
                        if (i11 == 30 && z12) {
                            C0815e1.m2075D().m2100V(new C23648e(61, str, 0, "hide_mem_list_on", new String[0]), true);
                            return;
                        }
                        return;
                    }
                    AbstractC23647d.m123897g("1591052");
                    return;
                }
                AbstractC23647d.m123897g("1591055");
                return;
            }
            AbstractC23647d.m123897g("1591058");
            return;
        }
        AbstractC23647d.m123897g("1591049");
    }

    /* renamed from: ML */
    private final void m66145ML(int i11, String str) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 11) {
                    if (i11 != 12) {
                        if (i11 == 30) {
                            C0815e1.m2075D().m2100V(new C23648e(61, str, 1, "hide_mem_list_bottom_sheet", new String[0]), true);
                            return;
                        }
                        return;
                    }
                    AbstractC23647d.m123897g("1591050");
                    return;
                }
                AbstractC23647d.m123897g("1591053");
                return;
            }
            AbstractC23647d.m123897g("1591056");
            return;
        }
        AbstractC23647d.m123897g("1591047");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m66146NL(ManageMemberPermissionSettingBS manageMemberPermissionSettingBS, int i11, boolean z11, String str, View view) {
        AbstractC19074t.m100208f(manageMemberPermissionSettingBS, "this$0");
        manageMemberPermissionSettingBS.m66148PL(false);
        AbstractC19074t.m100205c(str);
        manageMemberPermissionSettingBS.m66144LL(i11, false, z11, str);
        manageMemberPermissionSettingBS.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public static final void m66147OL(ManageMemberPermissionSettingBS manageMemberPermissionSettingBS, int i11, boolean z11, String str, View view) {
        AbstractC19074t.m100208f(manageMemberPermissionSettingBS, "this$0");
        manageMemberPermissionSettingBS.m66148PL(true);
        AbstractC19074t.m100205c(str);
        manageMemberPermissionSettingBS.m66144LL(i11, true, z11, str);
        manageMemberPermissionSettingBS.close();
    }

    /* renamed from: PL */
    private final void m66148PL(boolean z11) {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ManageMemberPermissionSettingBottomSheet) {
            Intent intent = new Intent();
            intent.putExtra("RESULT_DATA_NEW_CHECKED_VALUE", z11);
            C24848g0 c24848g0 = C24848g0.f119245a;
            ((ManageMemberPermissionSettingBottomSheet) m92650VI).mo50035CK(-1, intent);
        }
    }

    /* renamed from: QL */
    private final void m66149QL(RobotoTextView robotoTextView, int i11, String str, boolean z11) {
        int i12;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 11 && i11 != 12 && i11 != 20 && i11 != 27) {
                if (i11 == 30) {
                    robotoTextView.setText(m66143KL(str, z11));
                    robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
                    robotoTextView.setVisibility(0);
                    return;
                }
                return;
            }
            robotoTextView.setText("");
            robotoTextView.setVisibility(8);
            return;
        }
        if (z11) {
            i12 = AbstractC8020f0.str_community_settings_hint_subtitle_edit_info;
        } else {
            i12 = AbstractC8020f0.str_setting_change_group_information_subtitle_v2;
        }
        robotoTextView.setText(AbstractC23136l9.m118743r0(i12));
        robotoTextView.setVisibility(0);
    }

    /* renamed from: RL */
    private final void m66150RL(RobotoTextView robotoTextView, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 11) {
                    if (i11 != 12) {
                        if (i11 != 20) {
                            if (i11 != 27) {
                                if (i11 == 30) {
                                    robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lock_view_members_setting_title));
                                    return;
                                }
                                return;
                            }
                            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send_message_permission));
                            return;
                        }
                        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_set_nickname_permission));
                        return;
                    }
                    robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_create_post_v2));
                    return;
                }
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_create_poll_v2));
                return;
            }
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_pin_message_v2));
            return;
        }
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_change_group_information_v2));
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        int i11;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m90533zL(EnumC17017m.HUG_CONTENT);
        C30093w0 m148634c = C30093w0.m148634c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148634c, "inflate(...)");
        this.f61988b1 = m148634c;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            final int i12 = m92642L3.getInt("EXTRA_BUNDLE_SETTING_VIEW_ID", -1);
            final boolean z11 = m92642L3.getBoolean("EXTRA_BUNDLE_IS_CHECK", true);
            final String string = m92642L3.getString("EXTRA_ENTRY_POINT", "");
            boolean z12 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY", false);
            C30093w0 c30093w0 = this.f61988b1;
            if (c30093w0 == null) {
                AbstractC19074t.m100223u("binding");
                c30093w0 = null;
            }
            RobotoTextView robotoTextView = c30093w0.f139748t;
            AbstractC19074t.m100207e(robotoTextView, "tvTitle");
            m66150RL(robotoTextView, i12);
            RobotoTextView robotoTextView2 = c30093w0.f139747s;
            AbstractC19074t.m100207e(robotoTextView2, "tvDesc");
            AbstractC19074t.m100205c(string);
            m66149QL(robotoTextView2, i12, string, z12);
            ListItem listItem = c30093w0.f139746r;
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
            Context context = zAppCompatImageView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139659b(context, AbstractC16803z.ic_check_line_24, AbstractC2808b.f150821b60));
            listItem.m90589e(zAppCompatImageView);
            int i13 = 8;
            if (!z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            listItem.setTrailingItemVisibility(i11);
            EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
            listItem.setTrailingGravity(enumC16952b0);
            listItem.setIdTracking("BOTTOM_SHEET_MEMBER_PERMISSION_SETTING_EVERYONE");
            listItem.m90592m(true);
            listItem.m90591l(AbstractC23136l9.m118736p(AbstractC16802y.permission_setting_bottom_sheet_content_horizontal_padding), 0, 0, 0);
            listItem.setOnClickListener(new View.OnClickListener() { // from class: b70.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageMemberPermissionSettingBS.m66146NL(ManageMemberPermissionSettingBS.this, i12, z11, string, view);
                }
            });
            ListItem listItem2 = c30093w0.f139745q;
            ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(listItem2.getContext());
            Context context2 = zAppCompatImageView2.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            zAppCompatImageView2.setImageDrawable(C27280g.m139659b(context2, AbstractC16803z.ic_check_line_24, AbstractC2808b.f150821b60));
            listItem2.m90589e(zAppCompatImageView2);
            if (z11) {
                i13 = 0;
            }
            listItem2.setTrailingItemVisibility(i13);
            listItem2.setTrailingGravity(enumC16952b0);
            listItem2.setIdTracking("BOTTOM_SHEET_MEMBER_PERMISSION_SETTING_ADMIN");
            if (z12) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_settings_admin_permission_v2);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                listItem2.setTitle(m118743r0);
            }
            listItem2.m90592m(false);
            listItem2.setOnClickListener(new View.OnClickListener() { // from class: b70.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageMemberPermissionSettingBS.m66147OL(ManageMemberPermissionSettingBS.this, i12, z11, string, view);
                }
            });
            m66145ML(i12, string);
        }
    }
}
