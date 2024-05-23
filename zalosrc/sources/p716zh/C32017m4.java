package p716zh;

import ag0.C0815e1;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p304ks.AbstractC21935u;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p361nb.C23658o;
import p653xp.C30190a;

/* renamed from: zh.m4 */
/* loaded from: classes3.dex */
public class C32017m4 {

    /* renamed from: N */
    private static volatile C32017m4 f147343N;

    /* renamed from: L */
    List f147355L;

    /* renamed from: M */
    long f147356M;

    /* renamed from: a */
    List f147357a = Arrays.asList(a.m154386f(100, 10001), a.m154386f(101, 10002), a.m154386f(107, 10031), a.m154386f(102, 10003), a.m154387g(106, new C31987k4(10002, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(106, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(106, new C31987k4(10001, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(106, new C31987k4(10003, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154386f(104, 10002, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(103, 10001, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(105, 10003, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(200, 10011), a.m154386f(199, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START));

    /* renamed from: b */
    List f147358b = Arrays.asList(a.m154386f(200, 10001), a.m154386f(201, 10002), a.m154386f(207, 10031), a.m154386f(202, 10003), a.m154387g(206, new C31987k4(10002, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(206, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(206, new C31987k4(10001, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(206, new C31987k4(10003, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154386f(204, 10002, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(203, 10001, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(205, 10003, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(300, 10011), a.m154386f(299, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START));

    /* renamed from: c */
    List f147359c = Arrays.asList(a.m154386f(100, 10001, 4), a.m154386f(101, 10002, 4), a.m154386f(107, 10031, 4), a.m154386f(102, 10003, 4), a.m154386f(103, 10001, 4, 10007), a.m154386f(103, 10002, 4, 10007), a.m154386f(105, 10003, 4, 10007), a.m154386f(200, 10011), a.m154385e(199));

    /* renamed from: d */
    List f147360d = Arrays.asList(a.m154386f(200, 10001, 4), a.m154386f(201, 10002, 4), a.m154386f(207, 10031, 4), a.m154386f(202, 10003, 4), a.m154386f(203, 10001, 4, 10007), a.m154386f(203, 10002, 4, 10007), a.m154386f(205, 10003, 4, 10007), a.m154386f(300, 10011), a.m154385e(299));

    /* renamed from: e */
    List f147361e = Arrays.asList(a.m154386f(1, 10002, 10011), a.m154386f(2, 4, 10011), a.m154385e(0));

    /* renamed from: f */
    List f147362f = Arrays.asList(a.m154386f(1, 10002, 10033), a.m154386f(1, 10031, 10033), a.m154386f(2, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 10033), a.m154386f(3, 10007, 10033), a.m154386f(4, 4, 10033), a.m154386f(5, 10001, 10033), a.m154386f(6, 10003, 10033), a.m154386f(7, 10011, 10033));

    /* renamed from: g */
    List f147363g = Arrays.asList(a.m154387g(103, new C31987k4(10002, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(103, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(103, new C31987k4(10001, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(103, new C31987k4(10003, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154386f(100, 10001, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(101, 10002, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(102, 10003, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154386f(199, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), a.m154387g(200, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 45)), a.m154387g(202, new C31987k4(10002, 45), new C31987k4(10011)), a.m154387g(204, new C31987k4(10031, 45), new C31987k4(10011)), a.m154387g(201, new C31987k4(10002), new C31987k4(10011, 45)), a.m154387g(203, new C31987k4(10031), new C31987k4(10011, 45)), a.m154387g(202, new C31987k4(10002), new C31987k4(4), new C31987k4(10011, 45)), a.m154387g(203, new C31987k4(10031), new C31987k4(4), new C31987k4(10011, 45)), a.m154387g(205, new C31987k4(10002), new C31987k4(10011)), a.m154387g(206, new C31987k4(10031), new C31987k4(10011)), a.m154387g(204, new C31987k4(10002), new C31987k4(4), new C31987k4(10011)), a.m154387g(205, new C31987k4(10031), new C31987k4(4), new C31987k4(10011)), a.m154387g(201, new C31987k4(4), new C31987k4(10011, 45)), a.m154387g(IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR, new C31987k4(10011)), a.m154386f(100, 10001, 4, 10007), a.m154386f(101, 10002, 4, 10007), a.m154386f(102, 10003, 4, 10007), a.m154387g(200, new C31987k4(10007, 45)), a.m154386f(199, 10007));

    /* renamed from: h */
    List f147364h = Arrays.asList(a.m154387g(201, new C31987k4(1, 2), new C31987k4(10001)), a.m154387g(202, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 1), new C31987k4(10001)), a.m154387g(203, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 3), new C31987k4(10001)), a.m154387g(204, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 4), new C31987k4(10001)), a.m154387g(304, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 17), new C31987k4(10001)), a.m154387g(205, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER), new C31987k4(4, 1), new C31987k4(10001)), a.m154387g(206, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 2), new C31987k4(10001)), a.m154387g(207, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 5), new C31987k4(10001)), a.m154387g(208, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 6), new C31987k4(10001)), a.m154387g(209, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 7), new C31987k4(10001)), a.m154387g(210, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_VIDEO_DECODER), new C31987k4(4, 1), new C31987k4(10001)), a.m154387g(211, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 8), new C31987k4(10001)), a.m154387g(212, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13), new C31987k4(10001)), a.m154387g(213, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 14), new C31987k4(10001)), a.m154386f(214, 2, 10001), a.m154387g(215, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START, 1), new C31987k4(10001)), a.m154387g(216, new C31987k4(10002, 2), new C31987k4(10001)), a.m154387g(217, new C31987k4(10002, 3), new C31987k4(10001)), a.m154387g(217, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 3), new C31987k4(10001)), a.m154387g(217, new C31987k4(10007, 3), new C31987k4(10001)), a.m154387g(217, new C31987k4(10011), new C31987k4(10001)), a.m154386f(218, IMediaPlayer.MEDIA_INFO_AUDIO_SEEK_RENDERING_START, 10001), a.m154387g(219, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 15), new C31987k4(10001)), a.m154387g(219, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 15), new C31987k4(10001)), a.m154387g(220, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 2), new C31987k4(10001)), a.m154387g(221, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 9), new C31987k4(10001)), a.m154387g(222, new C31987k4(10003, 2), new C31987k4(10001)), a.m154386f(224, 30001, 10001), a.m154386f(224, 60001, 10001), a.m154387g(223, new C31987k4(10002, 4), new C31987k4(10001)), a.m154387g(225, new C31987k4(10010, 5), new C31987k4(10001)), a.m154387g(200, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 10), new C31987k4(10001)), a.m154386f(226, 3, 10001), a.m154387g(227, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 11), new C31987k4(10001)), a.m154387g(227, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 11), new C31987k4(10001)), a.m154387g(228, new C31987k4(40001, 1), new C31987k4(10001)), a.m154386f(999, 6, 10001), a.m154387g(301, new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154214n(true), new C31987k4(10001)), a.m154387g(302, new C31987k4(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO).m154214n(true), new C31987k4(10001)), a.m154387g(229, new C31987k4(0, 7).m154214n(true), new C31987k4(10001)), a.m154387g(230, new C31987k4(10000, 88), new C31987k4(10001)), a.m154387g(230, new C31987k4(10032), new C31987k4(10001)), a.m154387g(231, new C31987k4(8), new C31987k4(10001)), a.m154387g(232, new C31987k4(9), new C31987k4(10001)), a.m154387g(233, new C31987k4(10), new C31987k4(10001)), a.m154387g(234, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START), new C31987k4(10001)), a.m154387g(303, new C31987k4(11), new C31987k4(10001)), a.m154387g(307, new C31987k4(19), new C31987k4(10001)), a.m154387g(304, new C31987k4(14), new C31987k4(10001)), a.m154387g(305, new C31987k4(16), new C31987k4(10001)), a.m154387g(306, new C31987k4(17), new C31987k4(10001)), a.m154387g(308, new C31987k4(20), new C31987k4(10001)), a.m154387g(309, new C31987k4(21), new C31987k4(10001)), a.m154387g(310, new C31987k4(22), new C31987k4(10001)), a.m154387g(311, new C31987k4(25), new C31987k4(10001)), a.m154387g(312, new C31987k4(26), new C31987k4(10001)), a.m154387g(313, new C31987k4(27), new C31987k4(10001)), a.m154387g(314, new C31987k4(28), new C31987k4(10001)), a.m154387g(315, new C31987k4(29), new C31987k4(10001)), a.m154387g(316, new C31987k4(30), new C31987k4(10001)), a.m154387g(317, new C31987k4(31), new C31987k4(10001)), a.m154387g(318, new C31987k4(33), new C31987k4(10001)), a.m154387g(319, new C31987k4(35), new C31987k4(10001)), a.m154387g(320, new C31987k4(36), new C31987k4(10001)), a.m154387g(321, new C31987k4(37), new C31987k4(10001)), a.m154387g(322, new C31987k4(38), new C31987k4(10001)), a.m154387g(323, new C31987k4(39), new C31987k4(10001)), a.m154387g(324, new C31987k4(40), new C31987k4(10001)), a.m154387g(325, new C31987k4(0, 8), new C31987k4(10001)), a.m154387g(326, new C31987k4(0, 9).m154214n(true), new C31987k4(10001)), a.m154387g(327, new C31987k4(1, 10), new C31987k4(10001)), a.m154387g(328, new C31987k4(20000), new C31987k4(10001)), a.m154387g(329, new C31987k4(41), new C31987k4(10001)), a.m154387g(330, new C31987k4(42), new C31987k4(10001)), a.m154387g(331, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 19)), a.m154386f(299, 10001));

    /* renamed from: i */
    List f147365i = Arrays.asList(a.m154387g(4, new C31987k4(10016), new C31987k4(7)), a.m154387g(1, new C31987k4(10002, 13), new C31987k4(7)), a.m154387g(5, new C31987k4(10016), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 8), new C31987k4(7)), a.m154387g(5, new C31987k4(10016), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 9), new C31987k4(7)), a.m154387g(2, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 8), new C31987k4(7)), a.m154387g(3, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 9), new C31987k4(7)), a.m154386f(0, 7));

    /* renamed from: j */
    List f147366j = Arrays.asList(a.m154387g(15, new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154214n(true), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(50, new C31987k4(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO).m154214n(true), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(30, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154386f(22, 10), a.m154387g(31, new C31987k4(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 16), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154386f(22, 10), a.m154387g(100, new C31987k4(10002, 13), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(101, new C31987k4(10002, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(102, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(103, new C31987k4(10001, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(104, new C31987k4(10003, 12), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(105, new C31987k4(10016), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(106, new C31987k4(10011)), a.m154387g(12, new C31987k4(10002).m154214n(true), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(13, new C31987k4(10001).m154214n(true), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(14, new C31987k4(10003).m154214n(true), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154386f(0, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START));

    /* renamed from: k */
    List f147367k = Arrays.asList(a.m154387g(15, new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154214n(true), new C31987k4(10007)), a.m154387g(50, new C31987k4(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO).m154214n(true), new C31987k4(10007)), a.m154386f(11, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 4, 10007), a.m154386f(12, 10002, 4, 10007), a.m154387g(14, new C31987k4(10001, 11), new C31987k4(4)), a.m154387g(13, new C31987k4(10001).m154214n(true), new C31987k4(4)), a.m154387g(16, new C31987k4(1, 4), new C31987k4(4)), a.m154387g(17, new C31987k4(10001), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START).m154214n(true), new C31987k4(4)), a.m154387g(11, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START).m154214n(true), new C31987k4(4)), a.m154387g(140, new C31987k4(10012), new C31987k4(4)), a.m154387g(141, new C31987k4(10001), new C31987k4(10013), new C31987k4(4)), a.m154387g(142, new C31987k4(10012, 14), new C31987k4(10013), new C31987k4(4)), a.m154386f(143, 10011), a.m154387g(69, new C31987k4(10002).m154214n(true), new C31987k4(4)), a.m154387g(70, new C31987k4(10003), new C31987k4(4)), a.m154386f(69, 4), a.m154386f(0, 10007));

    /* renamed from: l */
    List f147368l = Arrays.asList(a.m154387g(1, new C31987k4(10002), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM)), a.m154387g(2, new C31987k4(10001), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM)), a.m154387g(3, new C31987k4(10002), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM)), a.m154387g(4, new C31987k4(10001), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM)), a.m154387g(5, new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_SUBTITLE_STREAM), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM)), a.m154387g(6, new C31987k4(10003), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM)), a.m154387g(7, new C31987k4(10003), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM)));

    /* renamed from: m */
    List f147369m = Arrays.asList(a.m154387g(101, new C31987k4(1, 3), new C31987k4(10001), new C31987k4(10012)), a.m154387g(102, new C31987k4(10001), new C31987k4(10012)), a.m154386f(100, 10012));

    /* renamed from: n */
    List f147370n = Arrays.asList(a.m154387g(105, new C31987k4(10001, 37).m154214n(true), new C31987k4(10013)), a.m154387g(101, new C31987k4(10001).m154214n(true), new C31987k4(10013)), a.m154387g(102, new C31987k4(10012, 14).m154214n(true), new C31987k4(10013)), a.m154387g(103, new C31987k4(10018).m154214n(true), new C31987k4(10013)), a.m154387g(104, new C31987k4(10002).m154214n(true), new C31987k4(10013)), a.m154387g(106, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START).m154214n(true), new C31987k4(10013)), a.m154386f(100, 10013));

    /* renamed from: o */
    List f147371o = Arrays.asList(a.m154387g(100, new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 35), new C31987k4(10017)), a.m154387g(101, new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 36), new C31987k4(10017)), a.m154387g(102, new C31987k4(10012), new C31987k4(10017)), a.m154387g(103, new C31987k4(10018), new C31987k4(10017)), a.m154387g(104, new C31987k4(10002, 29), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_VIDEO_STREAM)), a.m154387g(105, new C31987k4(10002, 32), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_VIDEO_STREAM)), a.m154387g(106, new C31987k4(10002, 31), new C31987k4(10017)), a.m154385e(199));

    /* renamed from: p */
    List f147372p = Arrays.asList(a.m154387g(100, new C31987k4(10017, 39)), a.m154387g(101, new C31987k4(10017, 38)), a.m154387g(102, new C31987k4(10013, 41)), a.m154387g(103, new C31987k4(10013, 42)), a.m154385e(199));

    /* renamed from: q */
    List f147373q = Arrays.asList(a.m154387g(103, new C31987k4(10013, 43)), a.m154387g(102, new C31987k4(10013, 44)), a.m154385e(199));

    /* renamed from: r */
    List f147374r = Arrays.asList(a.m154387g(1, new C31987k4(10002, 31), new C31987k4(10016)), a.m154387g(2, new C31987k4(10001, 28), new C31987k4(10016)), a.m154387g(3, new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT), new C31987k4(10016)), a.m154387g(4, new C31987k4(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO), new C31987k4(10016)), a.m154387g(5, new C31987k4(10002, 29), new C31987k4(10016)), a.m154387g(7, new C31987k4(10002, 32), new C31987k4(10016)), a.m154387g(6, new C31987k4(50001, 1), new C31987k4(10016)), a.m154387g(6, new C31987k4(10001, 30), new C31987k4(10016)), a.m154386f(0, 10016));

    /* renamed from: s */
    List f147375s = Arrays.asList(a.m154383c("6550", new C31987k4(10001), new C31987k4(4)), a.m154383c("66111", new C31987k4(10012), new C31987k4(4)), a.m154383c("66121", new C31987k4(10001), new C31987k4(10013), new C31987k4(4)), a.m154383c("66131", new C31987k4(10012, 14), new C31987k4(10013), new C31987k4(4)), a.m154383c("6553", new C31987k4(10001), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), new C31987k4(4)));

    /* renamed from: t */
    List f147376t = Arrays.asList(a.m154383c("7550", new C31987k4(10001), new C31987k4(4)), a.m154383c("76111", new C31987k4(10012), new C31987k4(4)), a.m154383c("76121", new C31987k4(10001), new C31987k4(10013), new C31987k4(4)), a.m154383c("76131", new C31987k4(10012, 14), new C31987k4(10013), new C31987k4(4)), a.m154383c("7553", new C31987k4(10001), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), new C31987k4(4)));

    /* renamed from: u */
    List f147377u = Arrays.asList(a.m154383c("6551", new C31987k4(10001), new C31987k4(4)), a.m154383c("66112", new C31987k4(10012), new C31987k4(4)), a.m154383c("66122", new C31987k4(10001), new C31987k4(10013), new C31987k4(4)), a.m154383c("66132", new C31987k4(10012, 14), new C31987k4(10013), new C31987k4(4)), a.m154383c("6554", new C31987k4(10001), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), new C31987k4(4)));

    /* renamed from: v */
    List f147378v = Arrays.asList(a.m154384d(m154364j("form_post_feed", "privacy_non_album"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 46)), a.m154384d(m154364j("form_post_feed", "privacy_selected_album"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 47)), a.m154384d(m154364j("form_create_album", "privacy_row"), new C31987k4(10017, 48)), a.m154384d(m154364j("preview_theme_preview_album", "apply_other_theme"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_VIDEO_STREAM), new C31987k4(10017), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM, 49)), a.m154384d(m154364j("preview_theme_create_album", "select_theme"), new C31987k4(10017), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM, 50)), a.m154384d(m154364j("album_detail", "select_theme"), new C31987k4(10013, 50)), a.m154384d(m154364j("album_detail", "quick_scroll"), new C31987k4(10013, 54)), a.m154384d(m154364j("preview_theme", "icon_privacy"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM, 51)), a.m154384d(m154364j("preview_album", "icon_privacy"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_VIDEO_STREAM, 52)), a.m154384d(m154364j("all_photo_profile", "list_item_album_longpress"), new C31987k4(10012, 14)), a.m154384d(m154364j("full_list_album", "list_item_album_longpress"), new C31987k4(10018, 53)));

    /* renamed from: w */
    List f147379w = Arrays.asList(a.m154383c("7551", new C31987k4(10001), new C31987k4(4)), a.m154383c("76112", new C31987k4(10012), new C31987k4(4)), a.m154383c("76122", new C31987k4(10001), new C31987k4(10013), new C31987k4(4)), a.m154383c("76132", new C31987k4(10012, 14), new C31987k4(10013), new C31987k4(4)), a.m154383c("7554", new C31987k4(10001), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START), new C31987k4(4)));

    /* renamed from: x */
    List f147380x = Arrays.asList(a.m154387g(100, new C31987k4(10012, 14), new C31987k4(10013), new C31987k4(4, 5)), a.m154387g(101, new C31987k4(10012, 14), new C31987k4(10013), new C31987k4(4, 6)), a.m154387g(102, new C31987k4(10001), new C31987k4(10013), new C31987k4(4, 5)), a.m154387g(102, new C31987k4(10001), new C31987k4(10013), new C31987k4(4, 6)), a.m154387g(103, new C31987k4(10001), new C31987k4(4), new C31987k4(10013), new C31987k4(4, 5)), a.m154387g(103, new C31987k4(10001), new C31987k4(4), new C31987k4(10013), new C31987k4(4, 6)), a.m154387g(104, new C31987k4(10001, 34), new C31987k4(10013), new C31987k4(4, 5)), a.m154387g(104, new C31987k4(10001, 34), new C31987k4(10013), new C31987k4(4, 6)), a.m154387g(105, new C31987k4(10014), new C31987k4(10013), new C31987k4(4, 5)), a.m154387g(105, new C31987k4(10014), new C31987k4(10013), new C31987k4(4, 6)), a.m154387g(106, new C31987k4(10015)), a.m154387g(106, new C31987k4(10015)), a.m154385e(199));

    /* renamed from: y */
    List f147381y = Arrays.asList(a.m154387g(100, new C31987k4(10001, 15)), a.m154387g(101, new C31987k4(10001, 18)), a.m154387g(102, new C31987k4(10013, 22), new C31987k4(10001)), a.m154387g(103, new C31987k4(10014, 20)), a.m154387g(104, new C31987k4(10013, 23), new C31987k4(10001)), a.m154387g(105, new C31987k4(10001, 17)), a.m154387g(106, new C31987k4(10001), new C31987k4(4)), a.m154387g(107, new C31987k4(10015)), a.m154387g(108, new C31987k4(0, 11), new C31987k4(48)), a.m154387g(109, new C31987k4(0, 7), new C31987k4(48)), a.m154385e(199));

    /* renamed from: z */
    List f147382z = Arrays.asList(a.m154387g(100, new C31987k4(10001, 16)), a.m154387g(101, new C31987k4(10001, 19)), a.m154387g(102, new C31987k4(10013, 24), new C31987k4(10001)), a.m154387g(103, new C31987k4(10014, 21)), a.m154387g(104, new C31987k4(10013, 25), new C31987k4(10001)), a.m154387g(106, new C31987k4(10001), new C31987k4(4)), a.m154385e(199));

    /* renamed from: A */
    List f147344A = Collections.singletonList(a.m154383c("6611", new C31987k4(10001, 26)));

    /* renamed from: B */
    List f147345B = Collections.singletonList(a.m154383c("7611", new C31987k4(10001, 26)));

    /* renamed from: C */
    List f147346C = Arrays.asList(a.m154383c("6612", new C31987k4(10001, 27)), a.m154383c("6613", new C31987k4(10001), new C31987k4(10012, 14)));

    /* renamed from: D */
    List f147347D = Arrays.asList(a.m154383c("7612", new C31987k4(10001, 27)), a.m154383c("7613", new C31987k4(10001), new C31987k4(10012, 14)));

    /* renamed from: E */
    List f147348E = Arrays.asList(a.m154383c("timeline", new C31987k4(10002)), a.m154383c("quick_comment", new C31987k4(10002), new C31987k4(10011)), a.m154383c("viewfull_photodetail", new C31987k4(4), new C31987k4(10011)), a.m154383c("viewfull_photodetail", new C31987k4(10007)), a.m154383c("feed_detail", new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)));

    /* renamed from: F */
    List f147349F = Arrays.asList(a.m154383c("timeline", new C31987k4(10002)), a.m154383c("quick_comment", new C31987k4(10002), new C31987k4(10011)), a.m154383c("viewfull_photodetail", new C31987k4(4), new C31987k4(10011)), a.m154383c("viewfull_photodetail", new C31987k4(10007)), a.m154383c("feed_detail", new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)));

    /* renamed from: G */
    List f147350G = Arrays.asList(a.m154387g(101, new C31987k4(10002)), a.m154387g(102, new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START)), a.m154387g(105, new C31987k4(10007)), a.m154387g(103, new C31987k4(10002), new C31987k4(10011)), a.m154387g(104, new C31987k4(4), new C31987k4(10011)));

    /* renamed from: H */
    List f147351H = Arrays.asList(a.m154387g(1, new C31987k4(10002)), a.m154387g(3, new C31987k4(10003)), a.m154387g(2, new C31987k4(10001)), a.m154387g(4, new C31987k4(10031)));

    /* renamed from: I */
    List f147352I = Arrays.asList(a.m154387g(1, new C31987k4(10001, 55), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_ATTACHMENT_STREAM)), a.m154387g(2, new C31987k4(10001, 56), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_ATTACHMENT_STREAM)), a.m154387g(3, new C31987k4(6), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_ATTACHMENT_STREAM)), a.m154387g(0, new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_ATTACHMENT_STREAM)));

    /* renamed from: J */
    List f147353J = Arrays.asList(a.m154384d(m154366l("form_post_feed", "social_music_post_click_add_music"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 57)), a.m154384d(m154366l("form_post_feed", "social_music_post_click_music"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 58)), a.m154384d(m154366l("form_post_feed", "social_music_post_click_action_music"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 59)), a.m154384d(m154366l("form_post_feed", "social_music_post_click_change_music"), new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 60)), a.m154384d(m154366l("social_music_pick", "social_music_story_list_click_play_music"), new C31987k4(7), new C31987k4(10026, 61)), a.m154384d(m154366l("social_music_pick", "social_music_story_list_click_change_cate"), new C31987k4(7), new C31987k4(10026, 82)), a.m154384d(m154366l("social_music_pick", "social_music_story_list_scroll_cate"), new C31987k4(7), new C31987k4(10026, 63)), a.m154384d(m154366l("social_music_pick", "social_music_story_list_scroll"), new C31987k4(7), new C31987k4(10026, 64)), a.m154384d(m154366l("social_music_pick", "social_music_story_list_click_search"), new C31987k4(7), new C31987k4(10026, 65)), a.m154384d(m154366l("social_music_pick", "social_music_story_list_click_pick"), new C31987k4(7), new C31987k4(10026, 83)), a.m154384d(m154366l("social_music_pick", "social_music_story_list_search_result"), new C31987k4(7), new C31987k4(10026, 67)), a.m154384d(m154366l("social_music_pick", "social_music_post_list_click_play_music"), new C31987k4(10026, 61)), a.m154384d(m154366l("social_music_pick", "social_music_post_list_click_change_cate"), new C31987k4(10026, 62)), a.m154384d(m154366l("social_music_pick", "social_music_post_list_scroll_cate"), new C31987k4(10026, 63)), a.m154384d(m154366l("social_music_pick", "social_music_post_list_scroll"), new C31987k4(10026, 64)), a.m154384d(m154366l("social_music_pick", "social_music_post_list_click_search"), new C31987k4(10026, 65)), a.m154384d(m154366l("social_music_pick", "social_music_post_list_click_pick"), new C31987k4(10026, 66)), a.m154384d(m154366l("social_music_pick", "social_music_post_list_search_result"), new C31987k4(10026, 67)), a.m154384d(m154366l("timeline", "social_music_post_mute"), new C31987k4(10002, 68)), a.m154384d(m154366l("feed_detail", "social_music_post_mute"), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 68)), a.m154384d(m154366l("feed_detail", "social_music_post_mute"), new C31987k4(10007, 68)), a.m154384d(m154366l("viewfull", "social_music_post_mute"), new C31987k4(4, 68)), a.m154384d(m154366l("social_music_detail", "social_music_post_open_ZingMP3"), new C31987k4(10027, 69)));

    /* renamed from: K */
    List f147354K = Arrays.asList(a.m154384d(m154367m("social_music_story_view_mute", 0), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START, 78)), a.m154384d(m154367m("social_music_story_view_detail", 0), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START, 79)), a.m154384d(m154367m("social_music_story_open_ZingMP3", 0), new C31987k4(10029, 80)), a.m154384d(m154367m("social_music_story_add_music", 0), new C31987k4(7, 81)), a.m154384d(m154367m("social_music_story_edit_music_change", 0), new C31987k4(7, 84)), a.m154384d(m154367m("social_music_story_edit_music_remove", 0), new C31987k4(7, 85)), a.m154384d(m154367m("social_music_story_edit_music_visual", 1), new C31987k4(7, 86)), a.m154384d(m154367m("social_music_story_edit_music_save", 0), new C31987k4(7, 87)));

    /* renamed from: zh.m4$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final C32002l4 f147383a;

        /* renamed from: b */
        private int f147384b;

        /* renamed from: c */
        private String f147385c;

        /* renamed from: d */
        private C23648e f147386d;

        public a(int i11, C32002l4 c32002l4) {
            this.f147383a = c32002l4;
            this.f147384b = i11;
        }

        /* renamed from: c */
        public static a m154383c(String str, C31987k4... c31987k4Arr) {
            C32002l4 m154268k = C32002l4.m154268k();
            for (C31987k4 c31987k4 : c31987k4Arr) {
                m154268k.m154272b(c31987k4);
            }
            return new a(str, m154268k);
        }

        /* renamed from: d */
        public static a m154384d(C23648e c23648e, C31987k4... c31987k4Arr) {
            C32002l4 m154268k = C32002l4.m154268k();
            for (C31987k4 c31987k4 : c31987k4Arr) {
                m154268k.m154272b(c31987k4);
            }
            return new a(c23648e, m154268k);
        }

        /* renamed from: e */
        public static a m154385e(int i11) {
            return new a(i11, C32002l4.m154268k());
        }

        /* renamed from: f */
        public static a m154386f(int i11, int... iArr) {
            C32002l4 m154268k = C32002l4.m154268k();
            for (int i12 : iArr) {
                m154268k.m154271a(i12);
            }
            return new a(i11, m154268k);
        }

        /* renamed from: g */
        public static a m154387g(int i11, C31987k4... c31987k4Arr) {
            C32002l4 m154268k = C32002l4.m154268k();
            for (C31987k4 c31987k4 : c31987k4Arr) {
                m154268k.m154272b(c31987k4);
            }
            return new a(i11, m154268k);
        }

        /* renamed from: h */
        public String m154388h() {
            return this.f147385c;
        }

        /* renamed from: i */
        public int m154389i() {
            return this.f147384b;
        }

        /* renamed from: j */
        public boolean m154390j(C32002l4 c32002l4) {
            return c32002l4.m154276f(this.f147383a);
        }

        public a(String str, C32002l4 c32002l4) {
            this.f147383a = c32002l4;
            this.f147385c = str;
        }

        public a(C23648e c23648e, C32002l4 c32002l4) {
            this.f147383a = c32002l4;
            this.f147386d = c23648e;
        }
    }

    public C32017m4() {
        C30190a c30190a = C30190a.f140233a;
        this.f147355L = Arrays.asList(a.m154384d(c30190a.m148856a("notif_setting_remove", ""), new C31987k4(10028, 70)), a.m154384d(c30190a.m148856a("notif_setting_new_post_off", "notif_in_app"), new C31987k4(10028, 71)), a.m154384d(c30190a.m148856a("notif_setting_new_post_off", "social_profile_right_menu"), new C31987k4(10001, 71)), a.m154384d(c30190a.m148856a("notif_setting_new_post_on", "notif_in_app"), new C31987k4(10028, 72)), a.m154384d(c30190a.m148856a("notif_setting_new_post_on", "social_profile_right_menu"), new C31987k4(10001, 72)), a.m154384d(c30190a.m148856a("notif_setting_specific_off", "notif_in_app"), new C31987k4(10028, 73)), a.m154384d(c30190a.m148856a("notif_setting_specific_off", "feed_detail"), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 73)), a.m154384d(c30190a.m148856a("notif_setting_specific_off", "viewfull_photodetail"), new C31987k4(10007, 73)), a.m154384d(c30190a.m148856a("notif_setting_specific_on", "notif_in_app"), new C31987k4(10028, 74)), a.m154384d(c30190a.m148856a("notif_setting_specific_on", "feed_detail"), new C31987k4(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 74)), a.m154384d(c30190a.m148856a("notif_setting_specific_on", "viewfull_photodetail"), new C31987k4(10007, 74)), a.m154384d(c30190a.m148856a("notif_setting_centre_option_on", ""), new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, 75)), a.m154384d(c30190a.m148856a("notif_setting_centre_option_except", ""), new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, 76)), a.m154384d(c30190a.m148856a("notif_setting_centre_option_off", ""), new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, 77)));
        this.f147356M = 0L;
    }

    /* renamed from: N */
    private C23658o m154324N(int i11, int i12, String str) {
        return C23658o.m123979g(m154328a(str), i11, i12, str);
    }

    /* renamed from: O */
    private C23658o m154325O(long j11, int i11, String str) {
        return C23658o.m123980h(m154328a(str), j11, i11, str);
    }

    /* renamed from: S */
    public static C32017m4 m154326S() {
        if (f147343N == null) {
            synchronized (C32017m4.class) {
                try {
                    if (f147343N == null) {
                        f147343N = new C32017m4();
                    }
                } finally {
                }
            }
        }
        return f147343N;
    }

    /* renamed from: Z */
    private void m154327Z(C32002l4 c32002l4, C32002l4 c32002l42, TrackingSource trackingSource) {
        if (c32002l4 != null && c32002l42 != null && trackingSource != null) {
            for (int i11 = 1; i11 <= c32002l42.m154286w(); i11++) {
                C31987k4 m154278n = c32002l42.m154278n(c32002l42.m154286w() - i11);
                C31987k4 m154278n2 = c32002l4.m154278n(c32002l4.m154286w() - i11);
                if (m154278n2 != null && m154278n.m154210j()) {
                    trackingSource.m40685y(m154278n2.m154204c());
                }
            }
        }
    }

    /* renamed from: a */
    private int m154328a(String str) {
        if (str.equals(CoreUtility.f89233i)) {
            return 0;
        }
        if (AbstractC21935u.m114558y(str)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: A */
    public TrackingSource m154329A(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147350G);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("Get suggest comment source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: B */
    public TrackingSource m154330B(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147357a);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("LikeFeed source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: C */
    public TrackingSource m154331C(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147359c);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("LikePhoto source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: D */
    public TrackingSource m154332D(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147373q);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("UpdatePrivacyAlbum source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: E */
    public TrackingSource m154333E(C32002l4 c32002l4, boolean z11) {
        if (z11) {
            return m154330B(c32002l4);
        }
        return m154337I(c32002l4);
    }

    /* renamed from: F */
    public TrackingSource m154334F(C32002l4 c32002l4, boolean z11) {
        if (z11) {
            return m154331C(c32002l4);
        }
        return m154338J(c32002l4);
    }

    /* renamed from: G */
    public TrackingSource m154335G(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147380x);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("ReuseAvatar source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: H */
    public TrackingSource m154336H(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147365i);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("ShareMemory source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: I */
    public TrackingSource m154337I(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147358b);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("UnLike source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: J */
    public TrackingSource m154338J(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147360d);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("UnLikePhoto source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: K */
    public TrackingSource m154339K(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147381y);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("UpdateAvatar source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: L */
    public TrackingSource m154340L(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147382z);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("UpdateCover source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: M */
    public TrackingSource m154341M(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147362f);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            return new TrackingSource(-1);
        }
        return trackingSource;
    }

    /* renamed from: P */
    String m154342P(C32002l4 c32002l4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.m154390j(c32002l4)) {
                return aVar.m154388h();
            }
        }
        return "";
    }

    /* renamed from: Q */
    public C23648e m154343Q(C32002l4 c32002l4) {
        if (c32002l4 == null) {
            return null;
        }
        a m154344R = m154344R(c32002l4, this.f147378v);
        if (m154344R != null) {
            m154351a0("getAlbumActionLogV2EntryPoint: " + m154344R.f147386d.mo123915d());
        }
        if (m154344R != null) {
            return m154344R.f147386d;
        }
        return null;
    }

    /* renamed from: R */
    a m154344R(C32002l4 c32002l4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.m154390j(c32002l4)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: T */
    public C23648e m154345T(C32002l4 c32002l4) {
        a m154344R = m154344R(c32002l4, this.f147353J);
        if (m154344R != null) {
            m154351a0("getMusicPostActionLogV2: " + m154344R.f147386d.mo123915d());
        }
        if (m154344R != null) {
            return m154344R.f147386d;
        }
        return null;
    }

    /* renamed from: U */
    public C23648e m154346U(C32002l4 c32002l4) {
        a m154344R = m154344R(c32002l4, this.f147354K);
        if (m154344R != null) {
            m154351a0("getMusicStoryActionLogV2: " + m154344R.f147386d.mo123915d());
        }
        if (m154344R != null) {
            return m154344R.f147386d;
        }
        return null;
    }

    /* renamed from: V */
    public C23648e m154347V(C32002l4 c32002l4) {
        a m154344R = m154344R(c32002l4, this.f147355L);
        if (m154344R != null) {
            m154351a0("getSettingNotificationActionLogV2: " + m154344R.f147386d.mo123915d());
        }
        if (m154344R != null) {
            return m154344R.f147386d;
        }
        return null;
    }

    /* renamed from: W */
    public int m154348W(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147351H);
        } else {
            trackingSource = null;
        }
        if (trackingSource != null) {
            return trackingSource.m40683t();
        }
        return 0;
    }

    /* renamed from: X */
    public TrackingSource m154349X(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147352I);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            return new TrackingSource(-1);
        }
        return trackingSource;
    }

    /* renamed from: Y */
    TrackingSource m154350Y(C32002l4 c32002l4, List list) {
        TrackingSource trackingSource = new TrackingSource(-1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.m154390j(c32002l4)) {
                TrackingSource trackingSource2 = new TrackingSource(aVar.m154389i());
                m154327Z(c32002l4, aVar.f147383a, trackingSource2);
                return trackingSource2;
            }
        }
        return trackingSource;
    }

    /* renamed from: a0 */
    public void m154351a0(String str) {
    }

    /* renamed from: b */
    public String m154352b(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147347D);
        } else {
            str = "";
        }
        m154351a0("Open album from other profile action log: " + str);
        return str;
    }

    /* renamed from: b0 */
    public void m154353b0() {
        this.f147356M = System.currentTimeMillis();
    }

    /* renamed from: c */
    public String m154354c(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147346C);
        } else {
            str = "";
        }
        m154351a0("Open album from own profile action log: " + str);
        return str;
    }

    /* renamed from: c0 */
    public void m154355c0(int i11, String str) {
        C0815e1.m2075D().m2107e(m154326S().m154325O(System.currentTimeMillis() - this.f147356M, i11, str));
    }

    /* renamed from: d */
    public String m154356d(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147345B);
        } else {
            str = "";
        }
        m154351a0("Open all photos from own profile action log: " + str);
        return str;
    }

    /* renamed from: d0 */
    public void m154357d0(int i11, int i12, String str) {
        C0815e1.m2075D().m2107e(m154326S().m154324N(i11, i12, str));
    }

    /* renamed from: e */
    public String m154358e(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147344A);
        } else {
            str = "";
        }
        m154351a0("Open all photos from own profile action log: " + str);
        return str;
    }

    /* renamed from: e0 */
    public void m154359e0(String str) {
        C0815e1.m2075D().m2100V(new C23648e(25, "social_convert_old_log", 0, "social_convert_old_log", new String[0]).m123926s(str), false);
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: f */
    public String m154360f(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147379w);
        } else {
            str = "";
        }
        m154351a0("Swipe view full photo own profile action log: " + str);
        return str;
    }

    /* renamed from: g */
    public String m154361g(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147377u);
        } else {
            str = "";
        }
        m154351a0("Swipe view full photo own profile action log: " + str);
        return str;
    }

    /* renamed from: h */
    public String m154362h(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147376t);
        } else {
            str = "";
        }
        m154351a0("View full photo own profile action log: " + str);
        return str;
    }

    /* renamed from: i */
    public String m154363i(C32002l4 c32002l4) {
        String str;
        if (c32002l4 != null) {
            str = m154342P(c32002l4, this.f147375s);
        } else {
            str = "";
        }
        m154351a0("View full photo own profile action log: " + str);
        return str;
    }

    /* renamed from: j */
    C23648e m154364j(String str, String str2) {
        return new C23648e(17, str, 0, str2, new String[0]);
    }

    /* renamed from: k */
    public String m154365k(C32002l4 c32002l4) {
        if (c32002l4 != null) {
            return m154342P(c32002l4, this.f147349F);
        }
        return "";
    }

    /* renamed from: l */
    C23648e m154366l(String str, String str2) {
        return new C23648e(30, str, 0, str2, new String[0]);
    }

    /* renamed from: m */
    C23648e m154367m(String str, int i11) {
        return m154368n("", str, i11);
    }

    /* renamed from: n */
    C23648e m154368n(String str, String str2, int i11) {
        return new C23648e(41, str, i11, str2, new String[0]);
    }

    /* renamed from: o */
    public String m154369o(C32002l4 c32002l4) {
        if (c32002l4 != null) {
            return m154342P(c32002l4, this.f147348E);
        }
        return "";
    }

    /* renamed from: p */
    public TrackingSource m154370p(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147370n);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("AllPhoto source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: q */
    public TrackingSource m154371q(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147369m);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("AllPhoto source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: r */
    public TrackingSource m154372r(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147363g);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("CommentFeed source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: s */
    public TrackingSource m154373s(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147371o);
            trackingSource.m40677a("srcTheme", Integer.valueOf(m154350Y(c32002l4, this.f147372p).m40683t()));
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("CreateAlbum source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: t */
    public TrackingSource m154374t(C32002l4 c32002l4) {
        TrackingSource trackingSource = new TrackingSource(-1);
        trackingSource.m40677a("srcTheme", Integer.valueOf(m154350Y(c32002l4, this.f147372p).m40683t()));
        m154351a0("EditAlbum source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: u */
    public TrackingSource m154375u(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147368l);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("Edit feed source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: v */
    public TrackingSource m154376v(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147366j);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("Feed Details source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: w */
    public TrackingSource m154377w(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147361e);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("GetListComment source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: x */
    public TrackingSource m154378x(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147374r);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("Get list memory source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: y */
    public TrackingSource m154379y(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147367k);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("Photo Details source: " + trackingSource.toString());
        return trackingSource;
    }

    /* renamed from: z */
    public TrackingSource m154380z(C32002l4 c32002l4) {
        TrackingSource trackingSource;
        if (c32002l4 != null) {
            trackingSource = m154350Y(c32002l4, this.f147364h);
        } else {
            trackingSource = null;
        }
        if (trackingSource == null) {
            trackingSource = new TrackingSource(-1);
        }
        m154351a0("GetProfileFeed source: " + trackingSource.toString());
        return trackingSource;
    }
}
