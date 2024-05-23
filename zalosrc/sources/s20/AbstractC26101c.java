package s20;

import android.os.Bundle;
import b10.AbstractC2486e;
import b10.EnumC2485d;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj0.AbstractC23322a;
import v00.AbstractC27413h;

/* renamed from: s20.c */
/* loaded from: classes5.dex */
public abstract class AbstractC26101c {
    /* renamed from: A */
    public static final BottomSheetItem m134298A(BaseBottomSheetView baseBottomSheetView) {
        String str;
        Bundle m92642L3;
        if (baseBottomSheetView == null || (m92642L3 = baseBottomSheetView.m92642L3()) == null || (str = m92642L3.getString("CAN_PIN_COMMENT")) == null) {
            str = "null";
        }
        if (!AbstractC19074t.m100204b(str, "null") && !Boolean.parseBoolean(str)) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10156P.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: B */
    public static final BottomSheetItem m134299B(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_UNPIN")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10143C.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: a */
    public static final BottomSheetItem m134300a(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_ANALYTIC")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10162s.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: b */
    public static final BottomSheetItem m134301b(BaseBottomSheetView baseBottomSheetView, boolean z11) {
        return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10141A.m12552c()), (String) null, (String) null, String.valueOf(z11), 6, (AbstractC19060k) null);
    }

    /* renamed from: c */
    public static final BottomSheetItem m134302c(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_BLOCK")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10164u.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: d */
    public static final BottomSheetItem m134303d(BaseBottomSheetView baseBottomSheetView) {
        boolean z11;
        EnumC2485d enumC2485d;
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null) {
            z11 = m92642L3.getBoolean("BOOKMARK");
        } else {
            z11 = false;
        }
        if (z11) {
            enumC2485d = EnumC2485d.f10169z;
        } else {
            enumC2485d = EnumC2485d.f10168y;
        }
        return new BottomSheetItem(Integer.valueOf(enumC2485d.m12552c()), (String) null, (String) null, String.valueOf(z11), 6, (AbstractC19060k) null);
    }

    /* renamed from: e */
    public static final BottomSheetItem m134304e(BaseBottomSheetView baseBottomSheetView) {
        AbstractC19074t.m100208f(baseBottomSheetView, "<this>");
        Bundle m92642L3 = baseBottomSheetView.m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("CAN_COPY")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10152L.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b3, code lost:            if (r2.getBoolean("CAN_REPORT") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:            if (r2.getBoolean("CAN_COPY") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:            if (r2.getBoolean("CAN_SHARE") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:            if (r2.getBoolean("CAN_PIN") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:            if (r2.getBoolean("CAN_UNPIN") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010d, code lost:            if (r2.getBoolean("CAN_BLOCK") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:            if (r2.getBoolean("CAN_UNBLOCK") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0139, code lost:            if (r2.getBoolean("CAN_DELETE") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:            if (r2.getBoolean("CAN_DELETE") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0163, code lost:            if (r2.getBoolean("CAN_EDIT") == true) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:            if (r2.getBoolean("CAN_SHARE") == true) goto L302;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m134305f(BaseBottomSheetView baseBottomSheetView, List list) {
        String str;
        BottomSheetItem bottomSheetItem;
        String str2;
        BottomSheetItem bottomSheetItem2;
        AbstractC19074t.m100208f(baseBottomSheetView, "<this>");
        AbstractC19074t.m100208f(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BottomSheetItem bottomSheetItem3 = (BottomSheetItem) it.next();
            if (AbstractC2486e.m12568p(bottomSheetItem3)) {
                Bundle m92642L3 = baseBottomSheetView.m92642L3();
                if (m92642L3 != null) {
                }
                bottomSheetItem3 = null;
            } else if (AbstractC2486e.m12555c(bottomSheetItem3)) {
                Bundle m92642L32 = baseBottomSheetView.m92642L3();
                if (m92642L32 != null) {
                }
                bottomSheetItem3 = null;
            } else if (AbstractC2486e.m12567o(bottomSheetItem3)) {
                Bundle m92642L33 = baseBottomSheetView.m92642L3();
                if (m92642L33 == null || !m92642L33.getBoolean("BOOKMARK")) {
                    Integer m51413c = bottomSheetItem3.m51413c();
                    String m51412b = bottomSheetItem3.m51412b();
                    String m51411a = bottomSheetItem3.m51411a();
                    String m51414d = bottomSheetItem3.m51414d();
                    if (m51414d == null) {
                        m51414d = "false";
                    }
                    bottomSheetItem2 = new BottomSheetItem(m51413c, m51412b, m51411a, m51414d);
                    bottomSheetItem3 = bottomSheetItem2;
                }
                bottomSheetItem3 = null;
            } else if (AbstractC2486e.m12569q(bottomSheetItem3)) {
                Bundle m92642L34 = baseBottomSheetView.m92642L3();
                if (m92642L34 != null && m92642L34.getBoolean("BOOKMARK")) {
                    Integer m51413c2 = bottomSheetItem3.m51413c();
                    String m51412b2 = bottomSheetItem3.m51412b();
                    String m51411a2 = bottomSheetItem3.m51411a();
                    String m51414d2 = bottomSheetItem3.m51414d();
                    if (m51414d2 == null) {
                        m51414d2 = "true";
                    }
                    bottomSheetItem2 = new BottomSheetItem(m51413c2, m51412b2, m51411a2, m51414d2);
                    bottomSheetItem3 = bottomSheetItem2;
                }
                bottomSheetItem3 = null;
            } else if (AbstractC2486e.m12562j(bottomSheetItem3)) {
                Bundle m92642L35 = baseBottomSheetView.m92642L3();
                if (m92642L35 != null) {
                }
                bottomSheetItem3 = null;
            } else if (AbstractC2486e.m12566n(bottomSheetItem3)) {
                Bundle m92642L36 = baseBottomSheetView.m92642L3();
                if (m92642L36 != null) {
                }
                bottomSheetItem3 = null;
            } else {
                if (AbstractC2486e.m12553a(bottomSheetItem3)) {
                    bottomSheetItem2 = new BottomSheetItem(bottomSheetItem3.m51413c(), bottomSheetItem3.m51412b(), bottomSheetItem3.m51411a(), String.valueOf(VideoLayout.Companion.m52630a()));
                } else if (AbstractC2486e.m12554b(bottomSheetItem3)) {
                    Bundle m92642L37 = baseBottomSheetView.m92642L3();
                    if (m92642L37 != null) {
                    }
                    bottomSheetItem3 = null;
                } else if (AbstractC2486e.m12565m(bottomSheetItem3)) {
                    Bundle m92642L38 = baseBottomSheetView.m92642L3();
                    if (m92642L38 != null) {
                    }
                    bottomSheetItem3 = null;
                } else if (AbstractC2486e.m12557e(bottomSheetItem3)) {
                    Bundle m92642L39 = baseBottomSheetView.m92642L3();
                    if (m92642L39 != null) {
                    }
                    bottomSheetItem3 = null;
                } else if (AbstractC2486e.m12558f(bottomSheetItem3)) {
                    Bundle m92642L310 = baseBottomSheetView.m92642L3();
                    if (m92642L310 != null) {
                    }
                    bottomSheetItem3 = null;
                } else if (AbstractC2486e.m12559g(bottomSheetItem3)) {
                    Bundle m92642L311 = baseBottomSheetView.m92642L3();
                    if (m92642L311 != null) {
                    }
                    bottomSheetItem3 = null;
                } else {
                    if (AbstractC2486e.m12560h(bottomSheetItem3)) {
                        Bundle m92642L312 = baseBottomSheetView.m92642L3();
                        if (m92642L312 != null && m92642L312.containsKey("LOCK_COMMENT")) {
                            Bundle m92642L313 = baseBottomSheetView.m92642L3();
                            boolean z11 = false;
                            if (m92642L313 != null && m92642L313.getBoolean("LOCK_COMMENT")) {
                                z11 = true;
                            }
                            bottomSheetItem2 = new BottomSheetItem(bottomSheetItem3.m51413c(), bottomSheetItem3.m51412b(), bottomSheetItem3.m51411a(), String.valueOf(!z11));
                        }
                    } else if (AbstractC2486e.m12563k(bottomSheetItem3)) {
                        Bundle m92642L314 = baseBottomSheetView.m92642L3();
                        if (m92642L314 != null) {
                        }
                    } else if (AbstractC2486e.m12556d(bottomSheetItem3)) {
                        Bundle m92642L315 = baseBottomSheetView.m92642L3();
                        if (m92642L315 != null) {
                        }
                    } else if (AbstractC2486e.m12561i(bottomSheetItem3)) {
                        Bundle m92642L316 = baseBottomSheetView.m92642L3();
                        if (m92642L316 == null || (str2 = m92642L316.getString("CAN_PIN_COMMENT")) == null) {
                            str2 = "null";
                        }
                        AbstractC19074t.m100205c(str2);
                        if (!AbstractC19074t.m100204b(str2, "null") && Boolean.parseBoolean(str2)) {
                            bottomSheetItem = new BottomSheetItem(bottomSheetItem3.m51413c(), bottomSheetItem3.m51412b(), bottomSheetItem3.m51411a(), String.valueOf(Boolean.parseBoolean(str2)));
                            bottomSheetItem3 = bottomSheetItem;
                        }
                    } else if (AbstractC2486e.m12564l(bottomSheetItem3)) {
                        Bundle m92642L317 = baseBottomSheetView.m92642L3();
                        if (m92642L317 == null || (str = m92642L317.getString("CAN_PIN_COMMENT")) == null) {
                            str = "null";
                        }
                        AbstractC19074t.m100205c(str);
                        if (!AbstractC19074t.m100204b(str, "null") && !Boolean.parseBoolean(str)) {
                            bottomSheetItem = new BottomSheetItem(bottomSheetItem3.m51413c(), bottomSheetItem3.m51412b(), bottomSheetItem3.m51411a(), String.valueOf(Boolean.parseBoolean(str)));
                            bottomSheetItem3 = bottomSheetItem;
                        }
                    }
                    bottomSheetItem3 = null;
                }
                bottomSheetItem3 = bottomSheetItem2;
            }
            if (bottomSheetItem3 != null) {
                arrayList.add(bottomSheetItem3);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final Integer m134306g(BottomSheetItem bottomSheetItem) {
        if (bottomSheetItem == null) {
            return null;
        }
        Integer m51413c = bottomSheetItem.m51413c();
        int m12552c = EnumC2485d.f10161r.m12552c();
        if (m51413c == null || m51413c.intValue() != m12552c) {
            int m12552c2 = EnumC2485d.f10167x.m12552c();
            if (m51413c == null || m51413c.intValue() != m12552c2) {
                int m12552c3 = EnumC2485d.f10162s.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c3) {
                    return Integer.valueOf(AbstractC23322a.zch_ic_analytic_line_24);
                }
                int m12552c4 = EnumC2485d.f10163t.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c4) {
                    return Integer.valueOf(AbstractC23322a.zds_ic_edit_text_line_24);
                }
                int m12552c5 = EnumC2485d.f10164u.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c5) {
                    return Integer.valueOf(AbstractC23322a.zds_ic_ban_line_24);
                }
                int m12552c6 = EnumC2485d.f10165v.m12552c();
                if (m51413c == null || m51413c.intValue() != m12552c6) {
                    int m12552c7 = EnumC2485d.f10145E.m12552c();
                    if (m51413c == null || m51413c.intValue() != m12552c7) {
                        int m12552c8 = EnumC2485d.f10157Q.m12552c();
                        if (m51413c == null || m51413c.intValue() != m12552c8) {
                            int m12552c9 = EnumC2485d.f10166w.m12552c();
                            if (m51413c != null && m51413c.intValue() == m12552c9) {
                                return Integer.valueOf(AbstractC23322a.zds_ic_minus_circle_line_24);
                            }
                            int m12552c10 = EnumC2485d.f10168y.m12552c();
                            if (m51413c != null && m51413c.intValue() == m12552c10) {
                                return Integer.valueOf(AbstractC23322a.zds_ic_bookmark_line_24);
                            }
                            int m12552c11 = EnumC2485d.f10169z.m12552c();
                            if (m51413c != null && m51413c.intValue() == m12552c11) {
                                return Integer.valueOf(AbstractC23322a.zds_ic_bookmark_delete_line_24);
                            }
                            int m12552c12 = EnumC2485d.f10141A.m12552c();
                            if (m51413c != null && m51413c.intValue() == m12552c12) {
                                return Integer.valueOf(AbstractC23322a.zch_ic_auto_scroll_line_24);
                            }
                            int m12552c13 = EnumC2485d.f10142B.m12552c();
                            if (m51413c == null || m51413c.intValue() != m12552c13) {
                                int m12552c14 = EnumC2485d.f10155O.m12552c();
                                if (m51413c == null || m51413c.intValue() != m12552c14) {
                                    int m12552c15 = EnumC2485d.f10143C.m12552c();
                                    if (m51413c == null || m51413c.intValue() != m12552c15) {
                                        int m12552c16 = EnumC2485d.f10156P.m12552c();
                                        if (m51413c == null || m51413c.intValue() != m12552c16) {
                                            int m12552c17 = EnumC2485d.f10144D.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c17) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_delete_line_24);
                                            }
                                            int m12552c18 = EnumC2485d.f10146F.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c18) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_dislike_line_24);
                                            }
                                            int m12552c19 = EnumC2485d.f10147G.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c19) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_heart_broken_line_24);
                                            }
                                            int m12552c20 = EnumC2485d.f10148H.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c20) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_comment_line_24);
                                            }
                                            int m12552c21 = EnumC2485d.f10149I.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c21) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_category_line_24);
                                            }
                                            int m12552c22 = EnumC2485d.f10150J.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c22) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_feedback_line_24);
                                            }
                                            int m12552c23 = EnumC2485d.f10151K.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c23) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_tnc_line_24);
                                            }
                                            int m12552c24 = EnumC2485d.f10152L.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c24) {
                                                return Integer.valueOf(AbstractC23322a.zds_ic_copy_line_24);
                                            }
                                            int m12552c25 = EnumC2485d.f10153M.m12552c();
                                            if (m51413c != null && m51413c.intValue() == m12552c25) {
                                                return Integer.valueOf(AbstractC23322a.zch_ic_comment_delete_line_24);
                                            }
                                            int m12552c26 = EnumC2485d.f10154N.m12552c();
                                            if (m51413c == null || m51413c.intValue() != m12552c26) {
                                                return null;
                                            }
                                            return Integer.valueOf(AbstractC23322a.zch_ic_report_line_24);
                                        }
                                    }
                                    return Integer.valueOf(AbstractC23322a.zch_ic_unpin_line_24);
                                }
                            }
                            return Integer.valueOf(AbstractC23322a.zch_ic_pin_line_24);
                        }
                    }
                }
                return Integer.valueOf(AbstractC23322a.zch_ic_warning_line_24);
            }
        }
        return Integer.valueOf(AbstractC23322a.zch_ic_share_external_line_24);
    }

    /* renamed from: h */
    public static final Integer m134307h(BottomSheetItem bottomSheetItem, boolean z11) {
        int i11;
        if (bottomSheetItem == null) {
            return null;
        }
        Integer m51413c = bottomSheetItem.m51413c();
        int m12552c = EnumC2485d.f10161r.m12552c();
        if (m51413c == null || m51413c.intValue() != m12552c) {
            int m12552c2 = EnumC2485d.f10167x.m12552c();
            if (m51413c == null || m51413c.intValue() != m12552c2) {
                int m12552c3 = EnumC2485d.f10162s.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c3) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_channel_action_analytics);
                }
                int m12552c4 = EnumC2485d.f10163t.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c4) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_channel_action_edit);
                }
                int m12552c5 = EnumC2485d.f10164u.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c5) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_channel_action_block);
                }
                int m12552c6 = EnumC2485d.f10165v.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c6) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_channel_action_report);
                }
                int m12552c7 = EnumC2485d.f10166w.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c7) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_channel_action_unblock);
                }
                int m12552c8 = EnumC2485d.f10145E.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c8) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_video_action_report);
                }
                int m12552c9 = EnumC2485d.f10168y.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c9) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_video_action_bookmark);
                }
                int m12552c10 = EnumC2485d.f10169z.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c10) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_video_action_unbookmark);
                }
                int m12552c11 = EnumC2485d.f10141A.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c11) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_video_action_auto_next);
                }
                int m12552c12 = EnumC2485d.f10142B.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c12) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_video_action_pin);
                }
                int m12552c13 = EnumC2485d.f10143C.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c13) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_video_action_unpin);
                }
                int m12552c14 = EnumC2485d.f10144D.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c14) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_upload_action_delete);
                }
                int m12552c15 = EnumC2485d.f10146F.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c15) {
                    if (z11) {
                        i11 = AbstractC27413h.zch_bts_video_action_uninterested_ads;
                    } else {
                        i11 = AbstractC27413h.zch_bts_video_action_uninterested;
                    }
                    return Integer.valueOf(i11);
                }
                int m12552c16 = EnumC2485d.f10147G.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c16) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_video_action_uninterested_channel);
                }
                int m12552c17 = EnumC2485d.f10148H.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c17) {
                    return Integer.valueOf(AbstractC27413h.zch_page_upload_allow_comment);
                }
                int m12552c18 = EnumC2485d.f10149I.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c18) {
                    return Integer.valueOf(AbstractC27413h.zch_page_setting_onboarding);
                }
                int m12552c19 = EnumC2485d.f10150J.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c19) {
                    return Integer.valueOf(AbstractC27413h.zch_page_setting_feedback);
                }
                int m12552c20 = EnumC2485d.f10151K.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c20) {
                    return Integer.valueOf(AbstractC27413h.zch_page_setting_tnc);
                }
                int m12552c21 = EnumC2485d.f10152L.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c21) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_comment_action_copy);
                }
                int m12552c22 = EnumC2485d.f10153M.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c22) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_comment_action_delete);
                }
                int m12552c23 = EnumC2485d.f10154N.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c23) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_comment_action_report);
                }
                int m12552c24 = EnumC2485d.f10155O.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c24) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_comment_pin_comment);
                }
                int m12552c25 = EnumC2485d.f10156P.m12552c();
                if (m51413c != null && m51413c.intValue() == m12552c25) {
                    return Integer.valueOf(AbstractC27413h.zch_bts_comment_unpin_comment);
                }
                int m12552c26 = EnumC2485d.f10157Q.m12552c();
                if (m51413c == null || m51413c.intValue() != m12552c26) {
                    return null;
                }
                return Integer.valueOf(AbstractC27413h.zch_bts_video_action_report);
            }
        }
        return Integer.valueOf(AbstractC27413h.zch_bts_video_action_share);
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m134308i(BottomSheetItem bottomSheetItem, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m134307h(bottomSheetItem, z11);
    }

    /* renamed from: j */
    public static final BottomSheetItem m134309j(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_DELETE")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10153M.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: k */
    public static final BottomSheetItem m134310k(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_DELETE")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10144D.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: l */
    public static final BottomSheetItem m134311l(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_EDIT")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10163t.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: m */
    public static final BottomSheetItem m134312m(BaseBottomSheetView baseBottomSheetView) {
        return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10150J.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
    }

    /* renamed from: n */
    public static final BottomSheetItem m134313n(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        Bundle m92642L32;
        if (baseBottomSheetView == null || (m92642L3 = baseBottomSheetView.m92642L3()) == null || !m92642L3.containsKey("LOCK_COMMENT") || baseBottomSheetView == null || (m92642L32 = baseBottomSheetView.m92642L3()) == null) {
            return null;
        }
        return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10148H.m12552c()), (String) null, (String) null, String.valueOf(!m92642L32.getBoolean("LOCK_COMMENT")), 6, (AbstractC19060k) null);
    }

    /* renamed from: o */
    public static final BottomSheetItem m134314o(BaseBottomSheetView baseBottomSheetView) {
        String str;
        Bundle m92642L3;
        if (baseBottomSheetView == null || (m92642L3 = baseBottomSheetView.m92642L3()) == null || (str = m92642L3.getString("CAN_PIN_COMMENT")) == null) {
            str = "null";
        }
        if (!AbstractC19074t.m100204b(str, "null") && Boolean.parseBoolean(str)) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10155O.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: p */
    public static final BottomSheetItem m134315p(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_PIN")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10142B.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: q */
    public static final BottomSheetItem m134316q(BaseBottomSheetView baseBottomSheetView, String str) {
        return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10151K.m12552c()), (String) null, (String) null, str, 6, (AbstractC19060k) null);
    }

    /* renamed from: r */
    public static final BottomSheetItem m134317r(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_REPORT")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10165v.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: s */
    public static final BottomSheetItem m134318s(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_REPORT")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10154N.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: t */
    public static final BottomSheetItem m134319t(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_REPORT")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10145E.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: u */
    public static final BottomSheetItem m134320u(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_SHARE")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10161r.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: v */
    public static final BottomSheetItem m134321v(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        boolean z11 = false;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_SHARE")) {
            z11 = true;
        }
        if (z11) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10167x.m12552c()), (String) null, (String) null, String.valueOf(z11), 4, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: w */
    public static final BottomSheetItem m134322w(BaseBottomSheetView baseBottomSheetView) {
        return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10149I.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
    }

    /* renamed from: x */
    public static final BottomSheetItem m134323x(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_UNBLOCK")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10166w.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: y */
    public static final BottomSheetItem m134324y(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_UNINTERESTED")) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10147G.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null);
        }
        return null;
    }

    /* renamed from: z */
    public static final BottomSheetItem m134325z(BaseBottomSheetView baseBottomSheetView) {
        Bundle m92642L3;
        boolean z11 = false;
        if (baseBottomSheetView != null && (m92642L3 = baseBottomSheetView.m92642L3()) != null && m92642L3.getBoolean("CAN_UNINTERESTED")) {
            z11 = true;
        }
        if (z11) {
            return new BottomSheetItem(Integer.valueOf(EnumC2485d.f10146F.m12552c()), (String) null, (String) null, String.valueOf(z11), 6, (AbstractC19060k) null);
        }
        return null;
    }
}
