package gp0;

/* renamed from: gp0.t0 */
/* loaded from: classes7.dex */
public abstract class AbstractC19571t0 {
    /* renamed from: a */
    public static String m102333a(int i11) {
        if (i11 == 411) {
            return "VOICE_HOLD_REQUEST";
        }
        if (i11 == 413) {
            return "VOICE_UNHOLD_REQUEST";
        }
        if (i11 == 462) {
            return "GROUP_BROADCAST_STATE_REC";
        }
        if (i11 == 465) {
            return "GROUP_INIT_CALL_RECEIVE";
        }
        if (i11 == 459) {
            return "GROUP_SENT_LOG_CALL";
        }
        if (i11 == 460) {
            return "GROUP_PING";
        }
        switch (i11) {
            case 401:
                return "VOICE_REQUEST_CALL";
            case 402:
                return "VOICE_REQUEST_ANSWER";
            case 403:
                return "VOICE_ANSWER";
            case 404:
                return "VOICE_CREATE_SIP_ACCOUNT";
            case 405:
                return "VOICE_CALL_CANCEL";
            case 406:
                return "VOICE_CALL_FINISH";
            case 407:
                return "VOICE_CALL_RINGING";
            case 408:
                return "VOICE_REQUEST_ANSWER_ACK";
            case 409:
                return "VOICE_END_CALL";
            default:
                switch (i11) {
                    case 416:
                        return "VOICE_REQUEST_CALL_ZRTP";
                    case 417:
                        return "VOICE_REQUEST_CHANGE_ZRTP";
                    case 418:
                        return "VOICE_CHANGE_ZRTP";
                    case 419:
                        return "VOICE_CHANGE_ZRTP_ACK";
                    default:
                        switch (i11) {
                            case 450:
                                return "GROUP_REQUEST_CALL";
                            case 451:
                                return "GROUP_INIT_CALL";
                            case 452:
                                return "GROUP_RING_RING";
                            case 453:
                                return "GROUP_CANCEL_CALL";
                            case 454:
                                return "GROUP_ANSWER_CALL";
                            case 455:
                                return "GROUP_END_CALL";
                            case 456:
                                return "GROUP_ADD_USER";
                            default:
                                return "NOT_DEFINED";
                        }
                }
        }
    }
}
