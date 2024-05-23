package lh0;

/* renamed from: lh0.b */
/* loaded from: classes7.dex */
public enum EnumC22487b {
    OPEN_APP(1),
    DEEP_LINKING(2),
    SHARE(3),
    OPEN_APP_BY_NOTIFICATION(4),
    RECEIVE_NOTIFICATION(5),
    POST_FEED(6),
    SEND_APP_REQUEST(7),
    SEND_MSG(8),
    SEND_OA_MSG(9),
    GET_FRIEND(10),
    GET_INVITABLE_FRIEND(11),
    GET_PROFILE(12),
    AUTHEN(13),
    RECOVERY(14),
    PROTECT_ACC(15),
    START_SCREEN(16),
    CRASH_LOG(17);


    /* renamed from: p */
    int f110014p;

    EnumC22487b(int i11) {
        this.f110014p = i11;
    }

    /* renamed from: c */
    public String m116273c() {
        int i11 = this.f110014p;
        return i11 == 1 ? "open_app" : i11 == 2 ? "deep_linking" : i11 == 3 ? "share" : i11 == 4 ? "open_app_by_notification" : i11 == 5 ? "receive_notification" : i11 == 6 ? "post_feed" : i11 == 7 ? "send_app_request" : i11 == 8 ? "send_msg" : i11 == 9 ? "send_oa_msg" : i11 == 10 ? "get_friend" : i11 == 11 ? "get_invitable_friend" : i11 == 12 ? "get_profile" : i11 == 13 ? "authen" : i11 == 14 ? "recovery" : i11 == 15 ? "protect_acc" : i11 == 16 ? "start_screen" : "crash_log";
    }
}
