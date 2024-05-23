package com.zing.zalo;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1671e;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.List;
import p649xl.C29710a8;
import p649xl.C29717af;
import p649xl.C29736bg;
import p649xl.C29741c3;
import p649xl.C29753cf;
import p649xl.C29781e7;
import p649xl.C29789ef;
import p649xl.C29801f9;
import p649xl.C29817g7;
import p649xl.C29825gf;
import p649xl.C29853i7;
import p649xl.C29861if;
import p649xl.C29862ig;
import p649xl.C29889k7;
import p649xl.C29897kf;
import p649xl.C29898kg;
import p649xl.C29933mf;
import p649xl.C29934mg;
import p649xl.C29950ne;
import p649xl.C29953o;
import p649xl.C29969of;
import p649xl.C29970og;
import p649xl.C29979p7;
import p649xl.C29998q8;
import p649xl.C30004qe;
import p649xl.C30006qg;
import p649xl.C30007r;
import p649xl.C30029s4;
import p649xl.C30039se;
import p649xl.C30040sf;
import p649xl.C30058u;
import p649xl.C30073ue;
import p649xl.C30092w;
import p649xl.C30107we;
import p649xl.C30113x3;
import p649xl.C30126y;
import p649xl.C30141ye;
import p649xl.C30147z3;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends AbstractC1671e {

    /* renamed from: a */
    private static final SparseIntArray f37846a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(38);
        f37846a = sparseIntArray;
        sparseIntArray.put(AbstractC7409c0.backup_key_setup_view, 1);
        sparseIntArray.put(AbstractC7409c0.backup_passphrase_setup_view, 2);
        sparseIntArray.put(AbstractC7409c0.backup_password_verification_view, 3);
        sparseIntArray.put(AbstractC7409c0.backup_pin_code_setup_container_view, 4);
        sparseIntArray.put(AbstractC7409c0.backup_pin_code_setup_view, 5);
        sparseIntArray.put(AbstractC7409c0.e2ee_setting_view, 6);
        sparseIntArray.put(AbstractC7409c0.feed_visible_time_limit_options_bottom_sheet, 7);
        sparseIntArray.put(AbstractC7409c0.feed_visible_time_limit_options_item_view, 8);
        sparseIntArray.put(AbstractC7409c0.item_zcloud_connect_feature, 9);
        sparseIntArray.put(AbstractC7409c0.layout_storage_usage_detail, 10);
        sparseIntArray.put(AbstractC7409c0.layout_storage_usage_detail_filter_bottom_view, 11);
        sparseIntArray.put(AbstractC7409c0.layout_storage_usage_header_view, 12);
        sparseIntArray.put(AbstractC7409c0.layout_story_archive_onboarding, 13);
        sparseIntArray.put(AbstractC7409c0.layout_tool_storage_voice_viewer, 14);
        sparseIntArray.put(AbstractC7409c0.media_picker_view, 15);
        sparseIntArray.put(AbstractC7409c0.music_detail_bottom_sheet_layout, 16);
        sparseIntArray.put(AbstractC7409c0.onboarding_move_tab_bottom_sheet_layout, 17);
        sparseIntArray.put(AbstractC7409c0.z_cloud_check_list_setup_view, 18);
        sparseIntArray.put(AbstractC7409c0.z_cloud_connect_feature_view, 19);
        sparseIntArray.put(AbstractC7409c0.z_cloud_gp_container_view, 20);
        sparseIntArray.put(AbstractC7409c0.z_cloud_gp_download_complete_view, 21);
        sparseIntArray.put(AbstractC7409c0.z_cloud_gp_downloading_data_view, 22);
        sparseIntArray.put(AbstractC7409c0.z_cloud_gp_more_info_bottom_sheet, 23);
        sparseIntArray.put(AbstractC7409c0.z_cloud_gp_processing_data_view, 24);
        sparseIntArray.put(AbstractC7409c0.z_cloud_keep_backup_data, 25);
        sparseIntArray.put(AbstractC7409c0.z_cloud_media_empty_view, 26);
        sparseIntArray.put(AbstractC7409c0.z_cloud_set_up_pin_remind_view, 27);
        sparseIntArray.put(AbstractC7409c0.z_cloud_setup_select_pwd_view, 28);
        sparseIntArray.put(AbstractC7409c0.zalo_cloud_encryption_setup_intro_view, 29);
        sparseIntArray.put(AbstractC7409c0.zalo_cloud_restore_container_view, 30);
        sparseIntArray.put(AbstractC7409c0.zalo_cloud_restore_view, 31);
        sparseIntArray.put(AbstractC7409c0.zcloud_finish_reset_cloud_view, 32);
        sparseIntArray.put(AbstractC7409c0.zcloud_locked_verification_view, 33);
        sparseIntArray.put(AbstractC7409c0.zcloud_restore_container_view, 34);
        sparseIntArray.put(AbstractC7409c0.zcloud_settings_view, 35);
        sparseIntArray.put(AbstractC7409c0.zcloud_setup_container_view, 36);
        sparseIntArray.put(AbstractC7409c0.zcloud_start_reset_cloud_view, 37);
        sparseIntArray.put(AbstractC7409c0.zdb_migrate_view, 38);
    }

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: a */
    public List mo8549a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: b */
    public ViewDataBinding mo8462b(InterfaceC1672f interfaceC1672f, View view, int i11) {
        int i12 = f37846a.get(i11);
        if (i12 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i12) {
                case 1:
                    if ("layout/backup_key_setup_view_0".equals(tag)) {
                        return new C29953o(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for backup_key_setup_view is invalid. Received: " + tag);
                case 2:
                    if ("layout/backup_passphrase_setup_view_0".equals(tag)) {
                        return new C30007r(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for backup_passphrase_setup_view is invalid. Received: " + tag);
                case 3:
                    if ("layout/backup_password_verification_view_0".equals(tag)) {
                        return new C30058u(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for backup_password_verification_view is invalid. Received: " + tag);
                case 4:
                    if ("layout/backup_pin_code_setup_container_view_0".equals(tag)) {
                        return new C30092w(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for backup_pin_code_setup_container_view is invalid. Received: " + tag);
                case 5:
                    if ("layout/backup_pin_code_setup_view_0".equals(tag)) {
                        return new C30126y(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for backup_pin_code_setup_view is invalid. Received: " + tag);
                case 6:
                    if ("layout/e2ee_setting_view_0".equals(tag)) {
                        return new C29741c3(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for e2ee_setting_view is invalid. Received: " + tag);
                case 7:
                    if ("layout/feed_visible_time_limit_options_bottom_sheet_0".equals(tag)) {
                        return new C30113x3(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for feed_visible_time_limit_options_bottom_sheet is invalid. Received: " + tag);
                case 8:
                    if ("layout/feed_visible_time_limit_options_item_view_0".equals(tag)) {
                        return new C30147z3(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for feed_visible_time_limit_options_item_view is invalid. Received: " + tag);
                case 9:
                    if ("layout/item_zcloud_connect_feature_0".equals(tag)) {
                        return new C30029s4(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for item_zcloud_connect_feature is invalid. Received: " + tag);
                case 10:
                    if ("layout/layout_storage_usage_detail_0".equals(tag)) {
                        return new C29781e7(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_storage_usage_detail is invalid. Received: " + tag);
                case 11:
                    if ("layout/layout_storage_usage_detail_filter_bottom_view_0".equals(tag)) {
                        return new C29817g7(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_storage_usage_detail_filter_bottom_view is invalid. Received: " + tag);
                case 12:
                    if ("layout/layout_storage_usage_header_view_0".equals(tag)) {
                        return new C29853i7(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_storage_usage_header_view is invalid. Received: " + tag);
                case 13:
                    if ("layout/layout_story_archive_onboarding_0".equals(tag)) {
                        return new C29889k7(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_story_archive_onboarding is invalid. Received: " + tag);
                case 14:
                    if ("layout/layout_tool_storage_voice_viewer_0".equals(tag)) {
                        return new C29979p7(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_tool_storage_voice_viewer is invalid. Received: " + tag);
                case 15:
                    if ("layout/media_picker_view_0".equals(tag)) {
                        return new C29710a8(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for media_picker_view is invalid. Received: " + tag);
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if ("layout/music_detail_bottom_sheet_layout_0".equals(tag)) {
                        return new C29998q8(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for music_detail_bottom_sheet_layout is invalid. Received: " + tag);
                case 17:
                    if ("layout/onboarding_move_tab_bottom_sheet_layout_0".equals(tag)) {
                        return new C29801f9(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for onboarding_move_tab_bottom_sheet_layout is invalid. Received: " + tag);
                case 18:
                    if ("layout/z_cloud_check_list_setup_view_0".equals(tag)) {
                        return new C29950ne(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_check_list_setup_view is invalid. Received: " + tag);
                case 19:
                    if ("layout/z_cloud_connect_feature_view_0".equals(tag)) {
                        return new C30004qe(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_connect_feature_view is invalid. Received: " + tag);
                case 20:
                    if ("layout/z_cloud_gp_container_view_0".equals(tag)) {
                        return new C30039se(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_gp_container_view is invalid. Received: " + tag);
                case 21:
                    if ("layout/z_cloud_gp_download_complete_view_0".equals(tag)) {
                        return new C30073ue(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_gp_download_complete_view is invalid. Received: " + tag);
                case 22:
                    if ("layout/z_cloud_gp_downloading_data_view_0".equals(tag)) {
                        return new C30107we(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_gp_downloading_data_view is invalid. Received: " + tag);
                case 23:
                    if ("layout/z_cloud_gp_more_info_bottom_sheet_0".equals(tag)) {
                        return new C30141ye(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_gp_more_info_bottom_sheet is invalid. Received: " + tag);
                case 24:
                    if ("layout/z_cloud_gp_processing_data_view_0".equals(tag)) {
                        return new C29717af(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_gp_processing_data_view is invalid. Received: " + tag);
                case 25:
                    if ("layout/z_cloud_keep_backup_data_0".equals(tag)) {
                        return new C29753cf(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_keep_backup_data is invalid. Received: " + tag);
                case 26:
                    if ("layout/z_cloud_media_empty_view_0".equals(tag)) {
                        return new C29789ef(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_media_empty_view is invalid. Received: " + tag);
                case 27:
                    if ("layout/z_cloud_set_up_pin_remind_view_0".equals(tag)) {
                        return new C29825gf(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_set_up_pin_remind_view is invalid. Received: " + tag);
                case 28:
                    if ("layout/z_cloud_setup_select_pwd_view_0".equals(tag)) {
                        return new C29861if(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for z_cloud_setup_select_pwd_view is invalid. Received: " + tag);
                case 29:
                    if ("layout/zalo_cloud_encryption_setup_intro_view_0".equals(tag)) {
                        return new C29897kf(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zalo_cloud_encryption_setup_intro_view is invalid. Received: " + tag);
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    if ("layout/zalo_cloud_restore_container_view_0".equals(tag)) {
                        return new C29933mf(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zalo_cloud_restore_container_view is invalid. Received: " + tag);
                case 31:
                    if ("layout/zalo_cloud_restore_view_0".equals(tag)) {
                        return new C29969of(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zalo_cloud_restore_view is invalid. Received: " + tag);
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    if ("layout/zcloud_finish_reset_cloud_view_0".equals(tag)) {
                        return new C30040sf(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zcloud_finish_reset_cloud_view is invalid. Received: " + tag);
                case 33:
                    if ("layout/zcloud_locked_verification_view_0".equals(tag)) {
                        return new C29736bg(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zcloud_locked_verification_view is invalid. Received: " + tag);
                case 34:
                    if ("layout/zcloud_restore_container_view_0".equals(tag)) {
                        return new C29862ig(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zcloud_restore_container_view is invalid. Received: " + tag);
                case 35:
                    if ("layout/zcloud_settings_view_0".equals(tag)) {
                        return new C29898kg(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zcloud_settings_view is invalid. Received: " + tag);
                case 36:
                    if ("layout/zcloud_setup_container_view_0".equals(tag)) {
                        return new C29934mg(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zcloud_setup_container_view is invalid. Received: " + tag);
                case 37:
                    if ("layout/zcloud_start_reset_cloud_view_0".equals(tag)) {
                        return new C29970og(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zcloud_start_reset_cloud_view is invalid. Received: " + tag);
                case 38:
                    if ("layout/zdb_migrate_view_0".equals(tag)) {
                        return new C30006qg(interfaceC1672f, view);
                    }
                    throw new IllegalArgumentException("The tag for zdb_migrate_view is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: c */
    public ViewDataBinding mo8463c(InterfaceC1672f interfaceC1672f, View[] viewArr, int i11) {
        if (viewArr == null || viewArr.length == 0 || f37846a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
