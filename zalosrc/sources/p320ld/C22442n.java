package p320ld;

import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23136l9;
import p297kd.C21690e;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p443qc.AbstractC25219c;
import p484ri.C25804a;

/* renamed from: ld.n */
/* loaded from: classes3.dex */
public final class C22442n {

    /* renamed from: a */
    public static final C22442n f109794a = new C22442n();

    private C22442n() {
    }

    /* renamed from: a */
    public static final String m115985a(C21690e c21690e) {
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        C25804a m120688m = AbstractC23306f.m120688m();
        AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
        int m115991A = C22447s.m115991A(c21690e, c21690e.f105269f);
        if (m115991A == 10) {
            String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.sync_pass_status_sync_set_pass_success);
            AbstractC19074t.m100207e(string, "getString(...)");
            return string;
        }
        if (m115991A == 11) {
            String string2 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.sync_pass_status_sync_change_pass_success);
            AbstractC19074t.m100207e(string2, "getString(...)");
            return string2;
        }
        if (m115991A == 12) {
            String string3 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.sync_pass_status_sync_remove_pass_success);
            AbstractC19074t.m100207e(string3, "getString(...)");
            return string3;
        }
        if (C22447s.f109797a.m116072X(m115991A)) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_success);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        int m115993B = C22447s.m115993B(m115991A);
        if (m115993B == 1) {
            if (c21690e.m111898x()) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_and_media_success);
                AbstractC19074t.m100205c(m118743r02);
                return m118743r02;
            }
            if (!AbstractC3489d.m17513u() && m120676j.m128393J() && (m120688m.m133001t() instanceof AbstractC25219c.b)) {
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_success_without_media);
                AbstractC19074t.m100205c(m118743r03);
                return m118743r03;
            }
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_success);
            AbstractC19074t.m100205c(m118743r04);
            return m118743r04;
        }
        if (m115993B == 2) {
            if (f109794a.m115990f()) {
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_finish_restored_data_msg_user_zcloud);
                AbstractC19074t.m100205c(m118743r05);
                return m118743r05;
            }
            if (c21690e.m111898x()) {
                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_and_media_success);
                AbstractC19074t.m100205c(m118743r06);
                return m118743r06;
            }
            String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_success);
            AbstractC19074t.m100205c(m118743r07);
            return m118743r07;
        }
        return "";
    }

    /* renamed from: b */
    private final String m115986b(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_msg_error_notif);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                return m118743r0;
            }
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_msg_error_tab_msg);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_msg_error);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        return m118743r03;
    }

    /* renamed from: c */
    private final String m115987c(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_msg_error_notif);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                return m118743r0;
            }
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_msg_error_tab_msg);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_msg_error);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        return m118743r03;
    }

    /* renamed from: d */
    public static final String m115988d(int i11, int i12, int i13, int i14, boolean z11) {
        String m118743r0;
        String m118743r02;
        if (i11 != 1) {
            if (i11 != 2) {
                return f109794a.m115986b(i13);
            }
            switch (i12) {
                case 1:
                    if (!f109794a.m115990f()) {
                        if (i13 == 0) {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_msg_error);
                            break;
                        } else if (i13 != 1) {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_msg_error_notif);
                            break;
                        } else {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_msg_error_tab_msg);
                            break;
                        }
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_error_restored_data_msg_user_zcloud);
                        break;
                    }
                case 2:
                    if (!z11) {
                        if (i13 == 0) {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_network);
                            break;
                        } else if (i13 != 1) {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_network_notif);
                            break;
                        } else {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_network_tab_msg);
                            break;
                        }
                    } else if (i13 == 0) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_error_network);
                        break;
                    } else if (i13 != 1) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_error_network_notif);
                        break;
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_error_network_tab_msg);
                        break;
                    }
                case 3:
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_media_error_wifi_only);
                    break;
                case 4:
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.sync_error_dont_support_new_db_format);
                    break;
                case 5:
                    if (!z11) {
                        m118743r02 = f109794a.m115987c(i13);
                        break;
                    } else if (i13 == 0) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_error_fullstorage);
                        break;
                    } else if (i13 != 1) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_error_fullstorage_notif);
                        break;
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_msg_error_fullstorage_tab_msg);
                        break;
                    }
                case 6:
                    if (i13 == 0) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_media_error);
                        break;
                    } else if (i13 != 1) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_media_error_notif);
                        break;
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_restore_media_error_tab_msg);
                        break;
                    }
                case 7:
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_warning_add_account_gdrive);
                    break;
                case 8:
                default:
                    m118743r02 = f109794a.m115987c(i13);
                    break;
                case 9:
                    if (i13 == 0) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_authen_account_gdrive);
                        break;
                    } else if (i13 != 1) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_authen_account_gdrive_notif);
                        break;
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_authen_account_gdrive_tab_msg);
                        break;
                    }
                case 10:
                    if (i13 == 0) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_account_gdrive_limit);
                        break;
                    } else if (i13 != 1) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_account_gdrive_limit_notif);
                        break;
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_restore_media_error_account_gdrive_limit_tab_msg);
                        break;
                    }
            }
            AbstractC19074t.m100205c(m118743r02);
            return m118743r02;
        }
        switch (i12) {
            case 1:
                if (i13 == 0) {
                    switch (i14) {
                        case 10:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_setting);
                            break;
                        case 11:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_setting);
                            break;
                        case 12:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_setting);
                            break;
                        default:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_msg_error);
                            break;
                    }
                } else if (i13 != 1) {
                    switch (i14) {
                        case 10:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_setting_notif);
                            break;
                        case 11:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_setting_notif);
                            break;
                        case 12:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_setting_notif);
                            break;
                        default:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_msg_error_notif);
                            break;
                    }
                } else {
                    switch (i14) {
                        case 10:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_setting_tab_msg);
                            break;
                        case 11:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_setting_tab_msg);
                            break;
                        case 12:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_setting_tab_msg);
                            break;
                        default:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_msg_error_tab_msg);
                            break;
                    }
                }
            case 2:
                if (!z11) {
                    if (i13 == 0) {
                        switch (i14) {
                            case 10:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_network);
                                break;
                            case 11:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_network);
                                break;
                            case 12:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_network);
                                break;
                            default:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_network);
                                break;
                        }
                    } else if (i13 != 1) {
                        switch (i14) {
                            case 10:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_network_notif);
                                break;
                            case 11:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_network_notif);
                                break;
                            case 12:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_network_notif);
                                break;
                            default:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_network_notif);
                                break;
                        }
                    } else {
                        switch (i14) {
                            case 10:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_network_tab_msg);
                                break;
                            case 11:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_network_tab_msg);
                                break;
                            case 12:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_network_tab_msg);
                                break;
                            default:
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_network_tab_msg);
                                break;
                        }
                    }
                } else if (i13 == 0) {
                    switch (i14) {
                        case 10:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_network);
                            break;
                        case 11:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_network);
                            break;
                        case 12:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_network);
                            break;
                        default:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_error_network);
                            break;
                    }
                } else if (i13 != 1) {
                    switch (i14) {
                        case 10:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_network_notif);
                            break;
                        case 11:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_network_notif);
                            break;
                        case 12:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_network_notif);
                            break;
                        default:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_error_network_notif);
                            break;
                    }
                } else {
                    switch (i14) {
                        case 10:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pass_error_network_tab_msg);
                            break;
                        case 11:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pass_error_network_tab_msg);
                            break;
                        case 12:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pass_error_network_tab_msg);
                            break;
                        default:
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_error_network_tab_msg);
                            break;
                    }
                }
            case 3:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_media_error_wifi_only);
                break;
            case 4:
            default:
                m118743r0 = f109794a.m115986b(i13);
                break;
            case 5:
                if (!z11) {
                    m118743r0 = f109794a.m115986b(i13);
                    break;
                } else if (i13 == 0) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_error_fullstorage);
                    break;
                } else if (i13 != 1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_error_fullstorage_notif);
                    break;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_error_fullstorage_tab_msg);
                    break;
                }
            case 6:
                if (i13 == 0) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_media_error);
                    break;
                } else if (i13 != 1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_media_error_notif);
                    break;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_audit_backup_media_error_tab_msg);
                    break;
                }
            case 7:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_warning_add_account_gdrive);
                break;
            case 8:
                if (i13 == 0) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_lack_storage_gdrive);
                    break;
                } else if (i13 != 1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_lack_storage_gdrive_notif);
                    break;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_lack_storage_gdrive_tab_msg);
                    break;
                }
            case 9:
                if (i13 == 0) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_authen_account_gdrive);
                    break;
                } else if (i13 != 1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_authen_account_gdrive_notif);
                    break;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_authen_account_gdrive_tab_msg);
                    break;
                }
            case 10:
                if (i13 == 0) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_account_gdrive_limit);
                    break;
                } else if (i13 != 1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_account_gdrive_limit_notif);
                    break;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_media_error_account_gdrive_limit_tab_msg);
                    break;
                }
        }
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }

    /* renamed from: e */
    public static final String m115989e(int i11, int i12, boolean z11) {
        String m118743r0;
        String m118743r02;
        String m118743r03;
        if (C22447s.f109797a.m116072X(i12)) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_progressing);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            String format = String.format(m118743r04, Arrays.copyOf(new Object[]{""}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        if (C22447s.m116037h0(z11, i11)) {
            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_restore_preparing_data);
            AbstractC19074t.m100207e(m118743r05, "getString(...)");
            return m118743r05;
        }
        if (C22447s.m116033f0(i11)) {
            switch (i12) {
                case 10:
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_set_pwd_notif);
                    break;
                case 11:
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_change_pwd_notif);
                    break;
                case 12:
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_off_pwd_notif);
                    break;
                default:
                    if (!C22438j.m115948p(i12)) {
                        m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sycn_saving_mes);
                        break;
                    } else if (f109794a.m115990f()) {
                        m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_restoring_data_msg_user_zcloud);
                        break;
                    } else {
                        m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_restore_progressing);
                        break;
                    }
            }
            AbstractC19074t.m100205c(m118743r03);
            return m118743r03;
        }
        if (C22447s.m116031e0(i11)) {
            if (!C22438j.m115948p(i12)) {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_progress_backup_media);
            } else {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_progress_restore_media);
            }
            AbstractC19074t.m100205c(m118743r02);
            return m118743r02;
        }
        switch (i11) {
            case 18:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_backup_media);
                break;
            case 19:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleted_backup_message);
                break;
            case 20:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleted_backup_message);
                break;
            case 21:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_backup_message_fail);
                break;
            case 22:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleted_backup_message);
                break;
            default:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing);
                break;
        }
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }

    /* renamed from: f */
    private final boolean m115990f() {
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2461l()) {
            return true;
        }
        return false;
    }
}
