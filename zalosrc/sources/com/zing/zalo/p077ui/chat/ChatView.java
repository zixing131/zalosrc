package com.zing.zalo.p077ui.chat;

import a40.AbstractC0131a;
import ac.C0697c0;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0815e1;
import ag0.C0856z;
import ak0.C0888c;
import ak0.InterfaceC0887b;
import am.AbstractC0924m0;
import am.C0943w;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.AbstractC1388a;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.C2040d;
import au.AbstractC2335a;
import au.AbstractC2379w;
import au.C2370r0;
import au.EnumC2344e0;
import au.EnumC2363o;
import au.RunnableC2375u;
import b40.C2520a;
import b40.C2526d;
import b40.C2546u;
import b90.EnumC2667d;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bn.C2852a1;
import bn.C2876h0;
import bp0.AbstractC3102n;
import bp0.C3114z;
import c30.C3246i0;
import c30.C3255n;
import c60.InterfaceC3299a;
import c70.C3334c;
import ch0.AbstractC3489d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.SendMessageDialog;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.LiveLocationBar;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.p077ui.RetryMsgPopupActivity;
import com.zing.zalo.p077ui.SetNicknamePopupView;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetBlockView;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetReportAttachMsgTypeDetail;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetVideoHdOnboard;
import com.zing.zalo.p077ui.chat.AbstractC11316a;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowFile;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowLiveLocation;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiPhotos;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoLiveStream;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoMask;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0;
import com.zing.zalo.p077ui.chat.contextmenu.MessageContextMenuView;
import com.zing.zalo.p077ui.chat.detail.ChatDetailsView;
import com.zing.zalo.p077ui.chat.dialog.ChatDialogView;
import com.zing.zalo.p077ui.chat.picker.doodle.DrawDoodleView;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectView;
import com.zing.zalo.p077ui.chat.rightmenu.C11705b;
import com.zing.zalo.p077ui.chat.rightmenu.C11709f;
import com.zing.zalo.p077ui.chat.rightmenu.C11710g;
import com.zing.zalo.p077ui.chat.rightmenu.C11711h;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c;
import com.zing.zalo.p077ui.chat.transfer.ChatOpenParam;
import com.zing.zalo.p077ui.chat.transfer.ChatWindowReference;
import com.zing.zalo.p077ui.chat.transfer.DrawDoodleResult;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.p077ui.chat.widget.banners.ChatSettingBanner;
import com.zing.zalo.p077ui.chat.widget.banners.NotifyCallSettingBanner;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.p077ui.chat.widget.inputbar.PageMenuView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.JumpDownFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.MentionJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.ReactJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.UnreadJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.WhereLeftJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView;
import com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter;
import com.zing.zalo.p077ui.chat.widget.search.ChatSearchBarView;
import com.zing.zalo.p077ui.chat.widget.search.ChatSearchToolbarView;
import com.zing.zalo.p077ui.chat.widget.searchinline.C11815a;
import com.zing.zalo.p077ui.chat.widget.theme.C11826a;
import com.zing.zalo.p077ui.chat.widget.theme.ChatThemePhotoRow;
import com.zing.zalo.p077ui.chattag.BottomSheetUnSupportEditChatTag;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamPlaybackView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.p077ui.group.manage.ManageGroupView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.mediastore.MediaStoreAvatarPickerView;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$SettingHorizontalModuleView;
import com.zing.zalo.p077ui.moduleview.csc.FloatingPromoteTrendingStickerModulesView;
import com.zing.zalo.p077ui.mycloud.EmbeddedMyCloudPagesLayout;
import com.zing.zalo.p077ui.mycloud.MyCloudQuotaBanner;
import com.zing.zalo.p077ui.mycloud.MyCloudQuotaManagementView;
import com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.picker.landingpage.LandingPageView;
import com.zing.zalo.p077ui.picker.location.LocationPickerView;
import com.zing.zalo.p077ui.picker.location.ShareLocationWithMapView;
import com.zing.zalo.p077ui.picker.mycloud.IntroMyCloudQuickPickerView;
import com.zing.zalo.p077ui.settings.SettingCallV2View;
import com.zing.zalo.p077ui.settings.SettingMessageV2View;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.showcase.WalkThroughOnboardView;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView;
import com.zing.zalo.p077ui.toolstoragev1.detail.StorageUsageDetailView;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.ChatComposePanelNew;
import com.zing.zalo.p077ui.widget.E2eeWarningBanner;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.FileDownloadBannerView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StickyMusicPlayer;
import com.zing.zalo.p077ui.widget.StickyNotiLiveStreamingBar;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import com.zing.zalo.p077ui.widget.layoutmanager.LinearLayoutManagerFixed;
import com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton;
import com.zing.zalo.p077ui.widget.reaction.AnimReactionCounterView;
import com.zing.zalo.p077ui.widget.reaction.ReactionDetailView;
import com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView;
import com.zing.zalo.p077ui.widget.reaction.bottomsheet.BottomSheetExpandReactionPickerView;
import com.zing.zalo.p077ui.widget.recyclerview.SwipeItemListView;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;
import com.zing.zalo.p077ui.widget.textview.AnimTypingTextView;
import com.zing.zalo.p077ui.zalocloud.connect.ZCloudConnectSuccessView;
import com.zing.zalo.p077ui.zviews.AppListingView;
import com.zing.zalo.p077ui.zviews.AvatarPickerView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.p077ui.zviews.BroadcastMsgToFriendsView;
import com.zing.zalo.p077ui.zviews.Cocos2dxLoadingView;
import com.zing.zalo.p077ui.zviews.CodeLockMessageView;
import com.zing.zalo.p077ui.zviews.E2EESettingView;
import com.zing.zalo.p077ui.zviews.EditPinBoardView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.GifViewerZView;
import com.zing.zalo.p077ui.zviews.GroupBoardView;
import com.zing.zalo.p077ui.zviews.GroupCalendarView;
import com.zing.zalo.p077ui.zviews.GroupEventDetailView;
import com.zing.zalo.p077ui.zviews.GroupInCommonView;
import com.zing.zalo.p077ui.zviews.GroupInformationView;
import com.zing.zalo.p077ui.zviews.GroupMemApprovalView;
import com.zing.zalo.p077ui.zviews.GroupNotificationSettingView;
import com.zing.zalo.p077ui.zviews.GroupPollCreatingView;
import com.zing.zalo.p077ui.zviews.GroupPollVotingView;
import com.zing.zalo.p077ui.zviews.GroupPostComposeViewV2;
import com.zing.zalo.p077ui.zviews.GroupPostDetailViewV2;
import com.zing.zalo.p077ui.zviews.GroupReminderComposeView;
import com.zing.zalo.p077ui.zviews.InviteToCreateGroupView;
import com.zing.zalo.p077ui.zviews.InviteToMultiGroupView;
import com.zing.zalo.p077ui.zviews.JumpLinkSettingBottomView;
import com.zing.zalo.p077ui.zviews.ManageGroupLinkView;
import com.zing.zalo.p077ui.zviews.ManageMembersView;
import com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView;
import com.zing.zalo.p077ui.zviews.MutualFeedView;
import com.zing.zalo.p077ui.zviews.NearbyZView;
import com.zing.zalo.p077ui.zviews.NicknameInGroupView;
import com.zing.zalo.p077ui.zviews.OAVideoPlaylistView;
import com.zing.zalo.p077ui.zviews.OnboardingCommunityUpgradedView;
import com.zing.zalo.p077ui.zviews.PasscodeView;
import com.zing.zalo.p077ui.zviews.PinBoardView;
import com.zing.zalo.p077ui.zviews.QRWalletBottomSheetZinstantView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.QuickMessageBottomSheetView;
import com.zing.zalo.p077ui.zviews.QuickMessageCreatingView;
import com.zing.zalo.p077ui.zviews.RatingCallView;
import com.zing.zalo.p077ui.zviews.RemindChatMessageView;
import com.zing.zalo.p077ui.zviews.ReplyStickerPopupView;
import com.zing.zalo.p077ui.zviews.RequestLocationView;
import com.zing.zalo.p077ui.zviews.RolledMediaBottomSheet;
import com.zing.zalo.p077ui.zviews.SelfDeleteConversationConfigView;
import com.zing.zalo.p077ui.zviews.SettingCallFromStrangerView;
import com.zing.zalo.p077ui.zviews.ShareLocationChatPickerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.UnpinTopicPinBoardView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoZView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.ZinstantZaloView;
import com.zing.zalo.p077ui.zviews.ZinstantZaloViewPopup;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.pinboard.PinTopicBanner;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import com.zing.zalo.report_v2.reportattachment.ReportAttachmentView;
import com.zing.zalo.social.controls.C10862a0;
import com.zing.zalo.social.controls.MentionSpan;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicomponents.reddot.RedDotImageView;
import com.zing.zalo.uicontrol.AbstractPushToTalkControl;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.uicontrol.PushToTalkControl;
import com.zing.zalo.uicontrol.PushToTalkSpeechToText;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.utils.systemui.SystemUIUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zinstant.component.p081ui.input.ZinstantInputText;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import df0.C17914d;
import dg0.AbstractC17927b;
import dj.C17945a0;
import dj.C17988o1;
import dj.C17996r0;
import dj.C17999s0;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import f70.C18815q;
import fd0.AbstractC18884d;
import fd0.C18888h;
import fi.C18946d;
import fi.C18953k;
import g30.AbstractC19215a;
import gd0.C19406k;
import gd0.InterfaceC19397b;
import ge.C19411c;
import gg0.AbstractC19444a;
import gi.EnumC19449b;
import gi.EnumC19450c;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import gw.C19610a;
import gw.C19669z;
import hf0.C20040b;
import hf0.C20043e;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import i40.C20275e;
import i60.C20335a;
import i60.C20336b;
import i60.C20337c;
import i60.C20340f;
import i60.C20341g;
import i60.C20343i;
import i60.C20345k;
import i60.C20346l;
import i60.C20347m;
import i60.C20348n;
import i60.C20349o;
import i60.C20351q;
import i60.C20352r;
import i60.C20353s;
import i60.C20354t;
import i60.C20355u;
import i60.C20356v;
import i60.EnumC20344j;
import i70.C20379a;
import if0.C20529b;
import if0.C20534g;
import if0.C20543p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k60.InterfaceC21485c;
import kw.C21956b;
import l30.AbstractC22055v0;
import lb0.C22423y;
import ly.C22688w;
import m90.EnumC22962a;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23078g6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23201r8;
import me0.AbstractC23204s0;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.AbstractC23238v2;
import me0.AbstractC23244v8;
import me0.AbstractC23265y;
import me0.C23081g9;
import me0.C23212s8;
import me0.C23278z2;
import me0.C23283z7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mw.C23459d;
import mx.C23475l;
import mz.C23493c;
import n60.C23594g;
import n60.C23595h;
import nh0.C23793c;
import og0.C24252c;
import og0.EnumC24251b;
import og0.EnumC24253d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a0.C0012a;
import p019aj.C0874h;
import p056cj.C3535c;
import p056cj.C3538f;
import p056cj.C3545m;
import p056cj.C3554v;
import p100df.EnumC17910b;
import p105dn.EnumC18030a;
import p131ei.C18434b;
import p133ek.C18460c;
import p140ev.C18613b;
import p140ev.C18620i;
import p142ey.C18644n;
import p161fg.C18922m;
import p172fy.C19171b;
import p189gv.C19609h;
import p205hc.InterfaceC19968g;
import p207he.C20014h;
import p207he.C20024r;
import p239ih.C20556f;
import p241ij.C20568e;
import p268ji.C21270p;
import p268ji.C21272r;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p304ks.C21914b;
import p304ks.C21927m;
import p322lf.AbstractC22470k;
import p325lj.C22499f;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p364nj.C23801b;
import p365nk.C23805a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p392oh.C24261h;
import p394oj.C24277c;
import p405ov.C24559a;
import p409oz.C24585b;
import p445qe.C25244a;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p471r3.EnumC25629a;
import p494rv.C25979a;
import p495rx.C25994h;
import p510sq.C26365a;
import p511sw.C26393b;
import p542ub.InterfaceC27218a;
import p549uj.AbstractC27282a;
import p558uu.InterfaceC27367c;
import p559uv.C27373c;
import p585vs.C28610b;
import p588vw.C28652r;
import p641xd.C29583g;
import p645xh.C29630g;
import p716zh.AbstractC31990k7;
import p716zh.C31845ac;
import p716zh.C31849b1;
import p716zh.C31862c;
import p716zh.C31868c5;
import p716zh.C31877d;
import p716zh.C31883d5;
import p716zh.C31887d9;
import p716zh.C31890dc;
import p716zh.C31894e1;
import p716zh.C31902e9;
import p716zh.C31904eb;
import p716zh.C31922g;
import p716zh.C31933ga;
import p716zh.C31944h6;
import p716zh.C31948ha;
import p716zh.C31950hc;
import p716zh.C31967j;
import p716zh.C31973j5;
import p716zh.C31980jc;
import p716zh.C31983k0;
import p716zh.C31986k3;
import p716zh.C32002l4;
import p716zh.C32006l8;
import p716zh.C32018m5;
import p716zh.C32027n;
import p716zh.C32037n9;
import p716zh.C32050o7;
import p716zh.C32058p1;
import p716zh.C32076q5;
import p716zh.C32084r;
import p716zh.C32090r5;
import p716zh.C32100s1;
import p716zh.C32106s7;
import p716zh.C32108s9;
import p716zh.C32119t6;
import p716zh.C32190y7;
import p716zh.C32205z8;
import p732zy.C32596l;
import p732zy.C32600p;
import p90.C24696p;
import p90.C24699s;
import p90.InterfaceC24700t;
import ph.C24751d;
import ph.C24753f;
import pm0.C24848g0;
import pm0.C24860q;
import qi0.C25297f;
import qi0.EnumC25293b;
import qi0.EnumC25294c;
import rc0.InterfaceC25728a;
import sa0.C26203c;
import sj0.C26277b;
import sy.AbstractC26412d;
import tg.C26664o;
import th.AbstractC26681b;
import u60.C27043b;
import u80.C27145l1;
import ue0.AbstractC27241b;
import ue0.C27240a;
import ui0.C27280g;
import v30.C27517h;
import v50.AbstractC27702jb;
import v50.AbstractC27716kb;
import v50.C27675hd;
import v50.C27856ub;
import v50.RunnableC27742m9;
import v50.RunnableC27895x8;
import v50.ViewOnClickListenerC27838t7;
import vg.AbstractC28025b8;
import vg.AbstractC28045d8;
import vg.AbstractC28207v1;
import vg.C28020b3;
import vg.C28023b6;
import vg.C28181s2;
import vg.C28201u4;
import vg.C28203u6;
import vg.C28212v6;
import w30.C28719g;
import w50.C28771c;
import w90.C28829a;
import ws.C29210k;
import x50.C29384b;
import y90.EnumC30859c;
import zl0.AbstractC32226c;
import zm.voip.p721ui.views.CreateGroupCallZView;
import zm.voip.service.C32299k;

/* loaded from: classes5.dex */
public class ChatView extends SlidableZaloView implements InterfaceC11568d, ZaloView.InterfaceC17417b, C23744a.c, View.OnClickListener, TextWatcher, PageMenuView.InterfaceC11746a, RequestLocationView.InterfaceC14962b, InterfaceC13567b1.a, AnimReactionCounterView.InterfaceC13727d, ChatDetailsView.InterfaceC11577h {

    /* renamed from: J4 */
    private static final int f56726J4 = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: K4 */
    public static int f56727K4;

    /* renamed from: L4 */
    public static int f56728L4;

    /* renamed from: M4 */
    public static final Map f56729M4;

    /* renamed from: A3 */
    boolean f56732A3;

    /* renamed from: B1 */
    public List f56734B1;

    /* renamed from: C1 */
    public C23528a f56738C1;

    /* renamed from: D3 */
    private UnreadJumpFloatingView f56744D3;

    /* renamed from: E3 */
    private TextView f56748E3;

    /* renamed from: F2 */
    private String f56751F2;

    /* renamed from: F3 */
    private TextView f56752F3;

    /* renamed from: G3 */
    private MentionJumpFloatingView f56756G3;

    /* renamed from: G4 */
    private int f56757G4;

    /* renamed from: H3 */
    private ReactJumpFloatingView f56760H3;

    /* renamed from: I1 */
    private AnimChat f56762I1;

    /* renamed from: I3 */
    private WhereLeftJumpFloatingView f56764I3;

    /* renamed from: J1 */
    private boolean f56766J1;

    /* renamed from: K1 */
    private boolean f56769K1;

    /* renamed from: L1 */
    private PinTopicBanner f56772L1;

    /* renamed from: L2 */
    Snackbar f56773L2;

    /* renamed from: M1 */
    public ChatEmptyView f56775M1;

    /* renamed from: O2 */
    public C13306b f56782O2;

    /* renamed from: P0 */
    private InterfaceC11320c f56784P0;

    /* renamed from: P1 */
    private int f56785P1;

    /* renamed from: P2 */
    public ShowcaseView f56786P2;

    /* renamed from: Q0 */
    private View f56788Q0;

    /* renamed from: Q1 */
    public C31983k0 f56789Q1;

    /* renamed from: R0 */
    private C11603g0 f56792R0;

    /* renamed from: R1 */
    public C11621p0 f56793R1;

    /* renamed from: R2 */
    TooltipView f56794R2;

    /* renamed from: S0 */
    private SwipeItemListView f56796S0;

    /* renamed from: S2 */
    View f56798S2;

    /* renamed from: T0 */
    private LinearLayoutManager f56800T0;

    /* renamed from: T2 */
    View f56802T2;

    /* renamed from: T3 */
    AbstractC28207v1.j0 f56803T3;

    /* renamed from: U0 */
    private ChatSettingBanner f56804U0;

    /* renamed from: U2 */
    View f56806U2;

    /* renamed from: V0 */
    private NotifyCallSettingBanner f56808V0;

    /* renamed from: V2 */
    RedDotImageButton f56810V2;

    /* renamed from: W0 */
    private ChatInfoView f56812W0;

    /* renamed from: W2 */
    View f56814W2;

    /* renamed from: X0 */
    private ChatDetailsView f56816X0;

    /* renamed from: X3 */
    public ChatComposePanelNew f56819X3;

    /* renamed from: Y0 */
    private MessageContextMenuView f56820Y0;

    /* renamed from: Y2 */
    private RunnableC2375u f56822Y2;

    /* renamed from: Y3 */
    C3977j f56823Y3;

    /* renamed from: Z0 */
    private ChatInputBar f56824Z0;

    /* renamed from: Z3 */
    RemindChatMessageView f56827Z3;

    /* renamed from: a1 */
    private MyCloudQuotaBanner f56828a1;

    /* renamed from: b1 */
    public ActionEditText f56832b1;

    /* renamed from: c1 */
    private RedDotImageButton f56836c1;

    /* renamed from: c3 */
    AnimReactionCounterView f56838c3;

    /* renamed from: c4 */
    private LiveEmojiButton f56839c4;

    /* renamed from: d1 */
    private PageMenuView f56840d1;

    /* renamed from: d3 */
    InterfaceC11475g0 f56842d3;

    /* renamed from: e1 */
    private View f56844e1;

    /* renamed from: f1 */
    private TextView f56848f1;

    /* renamed from: f4 */
    private ManageGroupView f56851f4;

    /* renamed from: g1 */
    private View f56852g1;

    /* renamed from: g3 */
    private ZaloView f56854g3;

    /* renamed from: h1 */
    private ChatAttachmentContainer f56856h1;

    /* renamed from: h2 */
    private ChatSearchBarView f56857h2;

    /* renamed from: h4 */
    KeyEventCallbackC17462c f56859h4;

    /* renamed from: i1 */
    public AbstractPushToTalkControl f56860i1;

    /* renamed from: i2 */
    private View f56861i2;

    /* renamed from: i4 */
    TextView f56863i4;

    /* renamed from: j1 */
    private AnimTypingTextView f56864j1;

    /* renamed from: j2 */
    private EditText f56865j2;

    /* renamed from: j4 */
    View f56867j4;

    /* renamed from: k1 */
    private View f56868k1;

    /* renamed from: k2 */
    private ChatSearchToolbarView f56869k2;

    /* renamed from: k4 */
    View f56871k4;

    /* renamed from: l1 */
    private LandingPageView f56872l1;

    /* renamed from: l2 */
    private RecyclerView f56873l2;

    /* renamed from: l3 */
    private ActionBarMenuItem f56874l3;

    /* renamed from: l4 */
    View f56875l4;

    /* renamed from: m1 */
    private E2eeWarningBanner f56876m1;

    /* renamed from: m2 */
    private ChatFilterSearchAdapter f56877m2;

    /* renamed from: m3 */
    private ActionBarMenuItem f56878m3;

    /* renamed from: m4 */
    View f56879m4;

    /* renamed from: n2 */
    MessageId f56881n2;

    /* renamed from: n3 */
    private ActionBarMenuItem f56882n3;

    /* renamed from: n4 */
    View f56883n4;

    /* renamed from: o1 */
    private C27856ub f56884o1;

    /* renamed from: o2 */
    private MessageId f56885o2;

    /* renamed from: o3 */
    private ActionBarMenuItem f56886o3;

    /* renamed from: o4 */
    View f56887o4;

    /* renamed from: p3 */
    private ActionBarMenuItem f56890p3;

    /* renamed from: p4 */
    View f56891p4;

    /* renamed from: q2 */
    private C24003n f56893q2;

    /* renamed from: q3 */
    private ActionBarMenuItem f56894q3;

    /* renamed from: q4 */
    View f56895q4;

    /* renamed from: r3 */
    private ActionBarMenuItem f56898r3;

    /* renamed from: r4 */
    View f56899r4;

    /* renamed from: s1 */
    public KeyEventCallbackC17462c f56900s1;

    /* renamed from: s3 */
    private ActionBarMenuItem f56902s3;

    /* renamed from: s4 */
    AppCompatImageView f56903s4;

    /* renamed from: t1 */
    public KeyEventCallbackC17462c f56904t1;

    /* renamed from: t2 */
    public boolean f56905t2;

    /* renamed from: t4 */
    private View f56907t4;

    /* renamed from: u1 */
    public C3246i0.a f56908u1;

    /* renamed from: u4 */
    private Button f56911u4;

    /* renamed from: v2 */
    private C3538f f56913v2;

    /* renamed from: v4 */
    private View f56915v4;

    /* renamed from: w4 */
    boolean f56919w4;

    /* renamed from: y3 */
    C2040d f56926y3;

    /* renamed from: z3 */
    Runnable f56930z3;

    /* renamed from: n1 */
    private boolean f56880n1 = false;

    /* renamed from: p1 */
    private boolean f56888p1 = false;

    /* renamed from: q1 */
    long f56892q1 = 0;

    /* renamed from: r1 */
    int f56896r1 = C29384b.m146529g();

    /* renamed from: v1 */
    private C8009j f56912v1 = null;

    /* renamed from: w1 */
    public boolean f56916w1 = false;

    /* renamed from: x1 */
    public boolean f56920x1 = true;

    /* renamed from: y1 */
    private boolean f56924y1 = false;

    /* renamed from: z1 */
    private boolean f56928z1 = false;

    /* renamed from: A1 */
    private C17945a0 f56730A1 = null;

    /* renamed from: D1 */
    private boolean f56742D1 = false;

    /* renamed from: E1 */
    private boolean f56746E1 = false;

    /* renamed from: F1 */
    private long f56750F1 = 0;

    /* renamed from: G1 */
    boolean f56754G1 = true;

    /* renamed from: H1 */
    private boolean f56758H1 = false;

    /* renamed from: N1 */
    public boolean f56778N1 = false;

    /* renamed from: O1 */
    public boolean f56781O1 = false;

    /* renamed from: S1 */
    private boolean f56797S1 = true;

    /* renamed from: T1 */
    private boolean f56801T1 = false;

    /* renamed from: U1 */
    private boolean f56805U1 = false;

    /* renamed from: V1 */
    private boolean f56809V1 = false;

    /* renamed from: W1 */
    private boolean f56813W1 = false;

    /* renamed from: X1 */
    private boolean f56817X1 = false;

    /* renamed from: Y1 */
    private boolean f56821Y1 = false;

    /* renamed from: Z1 */
    private boolean f56825Z1 = false;

    /* renamed from: a2 */
    private boolean f56829a2 = false;

    /* renamed from: b2 */
    private boolean f56833b2 = true;

    /* renamed from: c2 */
    private boolean f56837c2 = false;

    /* renamed from: d2 */
    private boolean f56841d2 = false;

    /* renamed from: e2 */
    private long f56845e2 = 0;

    /* renamed from: f2 */
    private long f56849f2 = 0;

    /* renamed from: g2 */
    private boolean f56853g2 = false;

    /* renamed from: p2 */
    private boolean f56889p2 = true;

    /* renamed from: r2 */
    private int f56897r2 = 1;

    /* renamed from: s2 */
    private boolean f56901s2 = false;

    /* renamed from: u2 */
    private boolean f56909u2 = false;

    /* renamed from: w2 */
    public final AtomicBoolean f56917w2 = new AtomicBoolean(false);

    /* renamed from: x2 */
    private EnumC20344j f56921x2 = EnumC20344j.f100335q;

    /* renamed from: y2 */
    private boolean f56925y2 = false;

    /* renamed from: z2 */
    private String f56929z2 = "";

    /* renamed from: A2 */
    private String f56731A2 = "";

    /* renamed from: B2 */
    private String f56735B2 = "";

    /* renamed from: C2 */
    private int f56739C2 = 0;

    /* renamed from: D2 */
    private int f56743D2 = 0;

    /* renamed from: E2 */
    public ContactProfile f56747E2 = null;

    /* renamed from: G2 */
    boolean f56755G2 = false;

    /* renamed from: H2 */
    C21956b.b f56759H2 = C21956b.b.f108084u;

    /* renamed from: I2 */
    private int f56763I2 = 0;

    /* renamed from: J2 */
    boolean f56767J2 = false;

    /* renamed from: K2 */
    private final Runnable f56770K2 = new Runnable() { // from class: v50.f9
        public /* synthetic */ RunnableC27641f9() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ChatView.this.m59253ER();
        }
    };

    /* renamed from: M2 */
    private boolean f56776M2 = false;

    /* renamed from: N2 */
    public final Handler f56779N2 = new HandlerC11289k(Looper.getMainLooper());

    /* renamed from: Q2 */
    boolean f56790Q2 = false;

    /* renamed from: X2 */
    boolean f56818X2 = false;

    /* renamed from: Z2 */
    private int f56826Z2 = 0;

    /* renamed from: a3 */
    private C32205z8 f56830a3 = null;

    /* renamed from: b3 */
    private final Runnable f56834b3 = new Runnable() { // from class: v50.q9
        public /* synthetic */ RunnableC27798q9() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ChatView.this.mo59762Oa();
        }
    };

    /* renamed from: e3 */
    public int f56846e3 = 0;

    /* renamed from: f3 */
    private String f56850f3 = "";

    /* renamed from: h3 */
    private int f56858h3 = 1;

    /* renamed from: i3 */
    private final Runnable f56862i3 = new Runnable() { // from class: v50.ba
        public /* synthetic */ RunnableC27582ba() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ChatView.this.m59623ET();
        }
    };

    /* renamed from: j3 */
    private Runnable f56866j3 = new RunnableC11300p0();

    /* renamed from: k3 */
    private boolean f56870k3 = false;

    /* renamed from: t3 */
    private final ArrayList f56906t3 = new ArrayList();

    /* renamed from: u3 */
    private final ArrayList f56910u3 = new ArrayList();

    /* renamed from: v3 */
    private final C32100s1.a f56914v3 = new C11269a();

    /* renamed from: w3 */
    private Bitmap f56918w3 = null;

    /* renamed from: x3 */
    private Bitmap f56922x3 = null;

    /* renamed from: B3 */
    boolean f56736B3 = false;

    /* renamed from: C3 */
    private View f56740C3 = null;

    /* renamed from: J3 */
    private JumpDownFloatingView f56768J3 = null;

    /* renamed from: K3 */
    private Animator f56771K3 = null;

    /* renamed from: L3 */
    private Animator f56774L3 = null;

    /* renamed from: M3 */
    private final Runnable f56777M3 = new Runnable() { // from class: v50.ma
        public /* synthetic */ RunnableC27743ma() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ChatView.this.m59259FR();
        }
    };

    /* renamed from: N3 */
    final Runnable f56780N3 = new RunnableC11281g();

    /* renamed from: O3 */
    private final Runnable f56783O3 = new RunnableC11283h();

    /* renamed from: P3 */
    private final Runnable f56787P3 = new RunnableC11291l();

    /* renamed from: Q3 */
    public AvatarPickerView f56791Q3 = null;

    /* renamed from: R3 */
    private final Runnable f56795R3 = new Runnable() { // from class: v50.xa
        public /* synthetic */ RunnableC27897xa() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ChatView.this.m59267GR();
        }
    };

    /* renamed from: S3 */
    boolean f56799S3 = false;

    /* renamed from: U3 */
    private Runnable f56807U3 = null;

    /* renamed from: V3 */
    public final Runnable f56811V3 = new RunnableC11303r();

    /* renamed from: W3 */
    private final Runnable f56815W3 = new Runnable() { // from class: v50.ib
        public /* synthetic */ RunnableC27688ib() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ChatView.this.m59274HR();
        }
    };

    /* renamed from: a4 */
    private boolean f56831a4 = false;

    /* renamed from: b4 */
    private boolean f56835b4 = false;

    /* renamed from: d4 */
    private String f56843d4 = "";

    /* renamed from: e4 */
    private final SendMessageDialog.InterfaceC7996a f56847e4 = new C11272b0();

    /* renamed from: g4 */
    private final ManageGroupView.InterfaceC11977b f56855g4 = new C11274c0();

    /* renamed from: x4 */
    private final HashMap f56923x4 = new HashMap();

    /* renamed from: y4 */
    private final AtomicBoolean f56927y4 = new AtomicBoolean(false);

    /* renamed from: z4 */
    private final AtomicBoolean f56931z4 = new AtomicBoolean(false);

    /* renamed from: A4 */
    private int f56733A4 = -1;

    /* renamed from: B4 */
    private final InterfaceC19397b f56737B4 = new C11276d0();

    /* renamed from: C4 */
    private final AtomicBoolean f56741C4 = new AtomicBoolean(true);

    /* renamed from: D4 */
    private C3545m f56745D4 = null;

    /* renamed from: E4 */
    private boolean f56749E4 = false;

    /* renamed from: F4 */
    private final Object f56753F4 = new Object();

    /* renamed from: H4 */
    private int f56761H4 = 0;

    /* renamed from: I4 */
    private EnumC19450c f56765I4 = EnumC19450c.f96553p;

    /* renamed from: com.zing.zalo.ui.chat.ChatView$a */
    /* loaded from: classes5.dex */
    public class C11269a implements C32100s1.a {

        /* renamed from: com.zing.zalo.ui.chat.ChatView$a$a */
        /* loaded from: classes5.dex */
        public class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ ActionBarMenuItem f56933l1;

            /* renamed from: m1 */
            final /* synthetic */ int f56934m1;

            a(ActionBarMenuItem actionBarMenuItem, int i11) {
                this.f56933l1 = actionBarMenuItem;
                this.f56934m1 = i11;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                try {
                    if (this.f56933l1.getIconView() != null && c3979l != null && c3979l.m18839c() != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(c3979l.m18839c());
                        this.f56933l1.getIconView().setPadding(AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f));
                        this.f56933l1.getIconView().setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f56933l1.getIconView().setImageBitmap(createBitmap);
                        int i11 = this.f56934m1;
                        if (i11 == 2) {
                            ChatView.this.f56922x3 = createBitmap;
                        } else if (i11 == 1) {
                            ChatView.this.f56918w3 = createBitmap;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ChatView", e11);
                }
            }
        }

        C11269a() {
        }

        /* renamed from: g */
        public /* synthetic */ void m60321g(int i11, int i12, C23801b c23801b) {
            String str;
            ChatView chatView = ChatView.this;
            ActionBarMenuItem actionBarMenuItem = i11 == 1 ? chatView.f56878m3 : chatView.f56882n3;
            if (actionBarMenuItem == null) {
                return;
            }
            C32100s1.m154953d().m154966p(true);
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 4) {
                            if (i12 != 8) {
                                if (i12 != 16 || c23801b == null) {
                                    return;
                                }
                                if (c23801b.f115037d != 3 || i11 != 1) {
                                    ChatView.this.f56784P0.mo60659Wd(c23801b.f115044k);
                                    InterfaceC11320c interfaceC11320c = ChatView.this.f56784P0;
                                    if (i11 == 1) {
                                        str = "tip.csc.call";
                                    } else {
                                        str = "tip.csc.videocall";
                                    }
                                    interfaceC11320c.mo60816v5(str);
                                    return;
                                }
                                return;
                            }
                            C32100s1.m154953d().m154967q(true);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionBarMenuItem.getIconView(), "rotation", 0.0f, 30.0f, -30.0f, 30.0f, -30.0f, 20.0f, -20.0f, 10.0f, -10.0f, 0.0f);
                            ofFloat.setRepeatMode(1);
                            ofFloat.setRepeatCount(4);
                            ofFloat.setDuration(2000L);
                            ofFloat.start();
                            ChatView.this.f56910u3.add(ofFloat);
                            return;
                        }
                        C32100s1.m154953d().m154967q(true);
                        C26277b c26277b = new C26277b(AbstractC23136l9.m118742r(48.0f) / 2.0f, AbstractC23136l9.m118641B(actionBarMenuItem.getContext(), AbstractC16801x.btn_type2_d), ZAbstractBase.ZVU_PROCESS_FLUSH, 5, 1, 3, 400, new Rect(0, 0, 0, 0), 100.0f);
                        actionBarMenuItem.setGlowingBackgroundDrawable(c26277b);
                        c26277b.m135211x();
                        ChatView.this.f56906t3.add(c26277b);
                        return;
                    }
                    actionBarMenuItem.setEnableGreenDot(true);
                    C26277b c26277b2 = new C26277b(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118641B(actionBarMenuItem.getContext(), AbstractC17452c.GreenDotAlpha), ZAbstractBase.ZVU_PROCESS_FLUSH, 0, 1, 3, 300, new Rect(0, 0, 0, 0), 100.0f);
                    actionBarMenuItem.setGlowingDrawable(c26277b2);
                    c26277b2.m135211x();
                    ChatView.this.f56906t3.add(c26277b2);
                    return;
                }
                actionBarMenuItem.setEnableGreenDot(true);
                return;
            }
            actionBarMenuItem.setEnableGreenDot(false);
            ChatView.this.m59243CU();
        }

        /* renamed from: h */
        public /* synthetic */ void m60322h(int i11, String str) {
            try {
                C24003n m120129h = C23278z2.m120129h();
                ActionBarMenuItem actionBarMenuItem = i11 == 1 ? ChatView.this.f56878m3 : ChatView.this.f56882n3;
                if (actionBarMenuItem == null) {
                    return;
                }
                ((C23528a) ChatView.this.f56738C1.m123612r(new C3977j(actionBarMenuItem.getIconView().getContext()))).m123579C(str, m120129h, new a(actionBarMenuItem, i11));
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // p716zh.C32100s1.a
        /* renamed from: a */
        public void mo60323a() {
            ChatView chatView = ChatView.this;
            chatView.f56779N2.post(new Runnable() { // from class: com.zing.zalo.ui.chat.q
                public /* synthetic */ RunnableC11681q() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59243CU();
                }
            });
        }

        @Override // p716zh.C32100s1.a
        /* renamed from: b */
        public void mo60324b(String str, int i11) {
            ChatView.this.f56779N2.post(new Runnable() { // from class: com.zing.zalo.ui.chat.r

                /* renamed from: q */
                public final /* synthetic */ int f60772q;

                /* renamed from: r */
                public final /* synthetic */ String f60773r;

                public /* synthetic */ RunnableC11683r(int i112, String str2) {
                    r2 = i112;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11269a.this.m60322h(r2, r3);
                }
            });
        }

        @Override // p716zh.C32100s1.a
        /* renamed from: c */
        public void mo60325c(int i11, int i12, C23801b c23801b) {
            ChatView.this.f56779N2.post(new Runnable() { // from class: com.zing.zalo.ui.chat.s

                /* renamed from: q */
                public final /* synthetic */ int f60910q;

                /* renamed from: r */
                public final /* synthetic */ int f60911r;

                /* renamed from: s */
                public final /* synthetic */ C23801b f60912s;

                public /* synthetic */ RunnableC11712s(int i122, int i112, C23801b c23801b2) {
                    r2 = i122;
                    r3 = i112;
                    r4 = c23801b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11269a.this.m60321g(r2, r3, r4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.ChatView$a0 */
    /* loaded from: classes5.dex */
    public class C11270a0 implements ZDSReactionDetailItemView.InterfaceC13749a {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f56936a;

        C11270a0(C17945a0 c17945a0) {
            this.f56936a = c17945a0;
        }

        /* renamed from: d */
        public static /* synthetic */ String m60327d(boolean z11, C24753f c24753f) {
            return "Reaction onUndoButtonClick -> isUndoAll=" + z11 + " type=" + c24753f.m128596i();
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView.InterfaceC13749a
        /* renamed from: a */
        public void mo60328a(C24753f c24753f, boolean z11) {
            C22423y.m115857j(new InterfaceC18494a() { // from class: com.zing.zalo.ui.chat.u

                /* renamed from: p */
                public final /* synthetic */ boolean f60933p;

                /* renamed from: q */
                public final /* synthetic */ C24753f f60934q;

                public /* synthetic */ C11720u(boolean z112, C24753f c24753f2) {
                    r1 = z112;
                    r2 = c24753f2;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m60327d;
                    m60327d = ChatView.C11270a0.m60327d(r1, r2);
                    return m60327d;
                }
            });
            if (z112) {
                AbstractC19646n0.m103004m2(this.f56936a, true);
            } else {
                AbstractC19646n0.m103012o2(c24753f2.m128595h(), this.f56936a, true);
            }
            ChatView.this.mo59628Et();
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView.InterfaceC13749a
        /* renamed from: b */
        public void mo60329b(ContactProfile contactProfile) {
            ChatView.this.f56784P0.mo60697cb(contactProfile);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$b */
    /* loaded from: classes5.dex */
    public class C11271b extends TooltipView.AbstractC16939c {

        /* renamed from: a */
        private boolean f56938a = false;

        /* renamed from: b */
        final /* synthetic */ C28212v6 f56939b;

        /* renamed from: c */
        final /* synthetic */ C17945a0 f56940c;

        C11271b(C28212v6 c28212v6, C17945a0 c17945a0) {
            this.f56939b = c28212v6;
            this.f56940c = c17945a0;
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.AbstractC16939c
        /* renamed from: a */
        public void mo60330a() {
            if ("tip.zcloud.file.status".equals(this.f56939b.f131577c)) {
                ChatView.this.f56796S0.f71285l1 = true;
                if (ChatView.this.m59312MQ()) {
                    ChatView.this.f56793R1.m64829x0().setPreventTouch(false);
                }
            }
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.AbstractC16939c
        /* renamed from: b */
        public void mo60331b() {
            C17945a0 c17945a0;
            C21956b.c cVar;
            if ("tip.zcloud.file.status".equals(this.f56939b.f131577c) && (c17945a0 = this.f56940c) != null && !this.f56938a) {
                if (c17945a0.m95216o5() == EnumC24253d.f117155r) {
                    cVar = C21956b.c.f108089r;
                } else {
                    cVar = C21956b.c.f108088q;
                }
                C21956b.m114662l(cVar, this.f56940c.m95041W4());
                this.f56938a = true;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$b0 */
    /* loaded from: classes5.dex */
    public class C11272b0 implements SendMessageDialog.InterfaceC7996a {

        /* renamed from: a */
        C3114z f56942a;

        C11272b0() {
        }

        /* renamed from: e */
        public /* synthetic */ void m60334e(boolean z11) {
            ChatView chatView = ChatView.this;
            ActionEditText actionEditText = chatView.f56832b1;
            if (actionEditText != null) {
                if (z11) {
                    chatView.f56784P0.mo60539Bc();
                    if (this.f56942a == null) {
                        this.f56942a = new C3114z(MainApplication.getAppContext());
                    }
                    this.f56942a.m15732o(40, 0, 0);
                    return;
                }
                actionEditText.setTextSize(1, 16.0f);
                ChatView.this.mo60133na();
                C28652r.m143349v().m143362X(ChatView.this.mo59808Rl(), ChatView.this.f56832b1.getTextSize());
                ChatView.this.f56832b1.invalidate();
                ChatView.this.f56785P1 = 0;
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m60335f(int i11) {
            try {
                ChatView chatView = ChatView.this;
                if (chatView.f56832b1 != null) {
                    if (i11 > 50) {
                        chatView.f56785P1 = (int) ((((i11 - 50) / 50.0f) * 200.0f) + 100.0f);
                    } else {
                        chatView.f56785P1 = (int) (((i11 / 50.0f) * 50.0f) + 50.0f);
                    }
                    ChatView.this.f56832b1.setTextSize(1, (int) ((ChatView.this.f56785P1 * 16.0f) / 100.0f));
                    C28652r.m143349v().m143362X(ChatView.this.mo59808Rl(), ChatView.this.f56832b1.getTextSize());
                    ChatView.this.f56832b1.invalidate();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.dialog.SendMessageDialog.InterfaceC7996a
        /* renamed from: a */
        public void mo43055a(int i11) {
            if (ChatView.this.m92676n2() != null) {
                ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.w

                    /* renamed from: q */
                    public final /* synthetic */ int f60943q;

                    public /* synthetic */ RunnableC11724w(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.C11272b0.this.m60335f(r2);
                    }
                });
            }
        }

        @Override // com.zing.zalo.dialog.SendMessageDialog.InterfaceC7996a
        /* renamed from: b */
        public void mo43056b(boolean z11) {
            if (ChatView.this.m92676n2() != null) {
                ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.v

                    /* renamed from: q */
                    public final /* synthetic */ boolean f60938q;

                    public /* synthetic */ RunnableC11722v(boolean z112) {
                        r2 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.C11272b0.this.m60334e(r2);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$c */
    /* loaded from: classes5.dex */
    public class C11273c implements PinTopicBanner.InterfaceC9046c {
        C11273c() {
        }

        @Override // com.zing.zalo.pinboard.PinTopicBanner.InterfaceC9046c
        /* renamed from: a */
        public void mo48430a(C7904b c7904b) {
            ChatView.this.f56784P0.mo60721fm(c7904b);
        }

        @Override // com.zing.zalo.pinboard.PinTopicBanner.InterfaceC9046c
        /* renamed from: b */
        public void mo48431b() {
            ChatView.this.f56784P0.mo60642Ti();
        }

        @Override // com.zing.zalo.pinboard.PinTopicBanner.InterfaceC9046c
        /* renamed from: c */
        public void mo48432c(int i11, boolean z11) {
            ChatView.this.f56784P0.mo60603Mc(i11, z11);
        }

        @Override // com.zing.zalo.pinboard.PinTopicBanner.InterfaceC9046c
        /* renamed from: d */
        public void mo48433d(String str, long j11) {
            if (!TextUtils.isEmpty(str)) {
                ChatView.this.mo59771PG(str, j11, "csc_pinboard_mini");
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$c0 */
    /* loaded from: classes5.dex */
    class C11274c0 implements ManageGroupView.InterfaceC11977b {
        C11274c0() {
        }

        @Override // com.zing.zalo.p077ui.group.manage.ManageGroupView.InterfaceC11977b
        /* renamed from: a */
        public void mo60336a() {
            ChatView.this.f56784P0.mo60814uk();
        }

        @Override // com.zing.zalo.p077ui.group.manage.ManageGroupView.InterfaceC11977b
        /* renamed from: b */
        public void mo60337b() {
            ChatView.this.f56784P0.mo60577I8();
        }

        @Override // com.zing.zalo.p077ui.group.manage.ManageGroupView.InterfaceC11977b
        /* renamed from: c */
        public void mo60338c() {
            ChatView.this.f56784P0.mo60769mp();
        }

        @Override // com.zing.zalo.p077ui.group.manage.ManageGroupView.InterfaceC11977b
        /* renamed from: d */
        public void mo60339d(boolean z11) {
        }

        @Override // com.zing.zalo.p077ui.group.manage.ManageGroupView.InterfaceC11977b
        /* renamed from: e */
        public void mo60340e() {
            ChatView.this.f56784P0.mo60686ah();
        }

        @Override // com.zing.zalo.p077ui.group.manage.ManageGroupView.InterfaceC11977b
        /* renamed from: g4 */
        public void mo60341g4() {
            ChatView.this.f56784P0.mo60723g4();
        }

        @Override // com.zing.zalo.p077ui.group.manage.ManageGroupView.InterfaceC11977b
        /* renamed from: i4 */
        public void mo60342i4() {
            ChatView.this.f56784P0.mo60743i4();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$d */
    /* loaded from: classes5.dex */
    public class C11275d extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ int f56946l1;

        /* renamed from: m1 */
        final /* synthetic */ ActionBarMenuItem f56947m1;

        /* renamed from: n1 */
        final /* synthetic */ int f56948n1;

        /* renamed from: o1 */
        final /* synthetic */ String f56949o1;

        C11275d(int i11, ActionBarMenuItem actionBarMenuItem, int i12, String str) {
            this.f56946l1 = i11;
            this.f56947m1 = actionBarMenuItem;
            this.f56948n1 = i12;
            this.f56949o1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c23995f.m125657h() == 200) {
                Resources m92651WI = ChatView.this.m92651WI();
                Bitmap m18839c = c3979l.m18839c();
                int i11 = this.f56946l1;
                this.f56947m1.m92774j(AbstractC23136l9.m118733o(ChatView.this.m92689tK(), this.f56948n1, this.f56949o1, new BitmapDrawable(m92651WI, Bitmap.createScaledBitmap(m18839c, i11, i11, true))));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$d0 */
    /* loaded from: classes5.dex */
    public class C11276d0 extends C19406k {
        C11276d0() {
        }

        /* renamed from: q */
        public /* synthetic */ void m60348q(C0888c c0888c) {
            ChatView.this.m60020gQ().mo60632R6(c0888c);
        }

        /* renamed from: r */
        public /* synthetic */ void m60349r(String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5, ZinstantLayout zinstantLayout) {
            String zOMInsight2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            sb2.append(str3);
            sb2.append(str4);
            if (zOMInsight == null) {
                zOMInsight2 = "";
            } else {
                zOMInsight2 = zOMInsight.toString();
            }
            sb2.append(zOMInsight2);
            sb2.append(str5);
            String m122788d = AbstractC23352g.m122788d(sb2.toString());
            C10862a0 c10862a0 = (C10862a0) ChatView.this.f56923x4.get(m122788d);
            if (c10862a0 == null) {
                C10862a0 c10862a02 = new C10862a0(MainApplication.getAppContext(), zinstantLayout.getFeatureType(), str, str2, str3, str4, zOMInsight, str5);
                ChatView.this.f56923x4.put(m122788d, c10862a02);
                c10862a0 = c10862a02;
            }
            ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.b0

                /* renamed from: q */
                public final /* synthetic */ C0888c f57100q;

                public /* synthetic */ RunnableC11319b0(C0888c c0888c) {
                    r2 = c0888c;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11276d0.this.m60348q(r2);
                }
            });
        }

        /* renamed from: s */
        public /* synthetic */ void m60350s() {
            if (ChatView.this.mo60194rc() == 0) {
                synchronized (ChatView.this.f56753F4) {
                    try {
                        if (ChatView.this.mo60194rc() == 0) {
                            if (ChatView.this.f56927y4.getAndSet(false)) {
                                if (ChatView.this.f56745D4 != null && !ChatView.this.f56793R1.m64771f1() && ChatView.this.f56745D4.m18018d() != null && ChatView.this.f56745D4.m18018d().mo2740d().mo2736b()) {
                                    ChatView.this.mo60094l7(9, false);
                                }
                            } else if (ChatView.this.f56931z4.getAndSet(false)) {
                                ChatView.this.f56741C4.set(true);
                                ChatView.this.m59551yU();
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        /* renamed from: t */
        public /* synthetic */ void m60351t() {
            ChatView.this.mo59846U5(false);
            ChatView chatView = ChatView.this;
            if (chatView.f56846e3 == 9) {
                chatView.mo59706Ka(0);
            }
        }

        /* renamed from: u */
        public /* synthetic */ void m60352u() {
            ChatView.this.mo59846U5(true);
            ChatView.this.mo59595Ci();
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: c */
        public void mo60353c() {
            super.mo60353c();
            ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.a0
                public /* synthetic */ RunnableC11317a0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11276d0.this.m60350s();
                }
            });
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: e */
        public void mo60354e(int i11) {
            super.mo60354e(i11);
            ChatView.this.f56733A4 = i11;
            ChatView chatView = ChatView.this;
            chatView.mo60094l7(chatView.f56846e3, false);
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: f */
        public void mo60355f(boolean z11) {
            super.mo60355f(z11);
            ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.y
                public /* synthetic */ RunnableC11829y() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11276d0.this.m60352u();
                }
            });
        }

        @Override // gd0.C19406k, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.z

                /* renamed from: q */
                public final /* synthetic */ String f61570q;

                /* renamed from: r */
                public final /* synthetic */ String f61571r;

                /* renamed from: s */
                public final /* synthetic */ String f61572s;

                /* renamed from: t */
                public final /* synthetic */ String f61573t;

                /* renamed from: u */
                public final /* synthetic */ ZOMInsight f61574u;

                /* renamed from: v */
                public final /* synthetic */ String f61575v;

                /* renamed from: w */
                public final /* synthetic */ ZinstantLayout f61576w;

                public /* synthetic */ RunnableC11831z(String str6, String str22, String str32, String str42, ZOMInsight zOMInsight2, String str52, ZinstantLayout zinstantLayout2) {
                    r2 = str6;
                    r3 = str22;
                    r4 = str32;
                    r5 = str42;
                    r6 = zOMInsight2;
                    r7 = str52;
                    r8 = zinstantLayout2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11276d0.this.m60349r(r2, r3, r4, r5, r6, r7, r8);
                }
            });
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: j */
        public void mo60356j() {
            super.mo60356j();
            ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.x
                public /* synthetic */ RunnableC11827x() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11276d0.this.m60351t();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$e */
    /* loaded from: classes5.dex */
    class C11277e extends AnimatorListenerAdapter {
        C11277e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ChatView.this.f56768J3.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$e0 */
    /* loaded from: classes5.dex */
    public class C11278e0 extends C19406k {
        C11278e0(InterfaceC19397b interfaceC19397b) {
            super(interfaceC19397b);
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: c */
        public void mo60353c() {
            if (!ChatView.this.f56927y4.get()) {
                ChatView.this.f56931z4.set(true);
            }
            super.mo60353c();
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: h */
        public void mo60357h(Exception exc) {
            ChatView.this.f56741C4.set(false);
            ChatView.this.m60290yQ(true);
            super.mo60357h(exc);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$f */
    /* loaded from: classes5.dex */
    class C11279f extends AnimatorListenerAdapter {
        C11279f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ChatView.this.f56768J3.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$f0 */
    /* loaded from: classes5.dex */
    public class C11280f0 extends C22688w.b {
        C11280f0(BaseZaloView baseZaloView, InterfaceC27218a interfaceC27218a, boolean z11) {
            super(baseZaloView, interfaceC27218a, z11);
        }

        /* renamed from: q0 */
        public /* synthetic */ void m60359q0(Class cls, Bundle bundle, int i11) {
            try {
                ChatView.this.f72421L0.m92676n2().mo35581q(cls, bundle, i11, 1, true);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: a */
        public void mo49370a(int i11) {
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: f */
        public void mo49373f(C19609h c19609h, C18620i c18620i) {
            if (ChatView.this.m92676n2() != null) {
                C18620i c18620i2 = C18620i.f93698u;
                if (ChatView.this.f56784P0.mo60624Q7()) {
                    c18620i2 = C18620i.f93702y;
                }
                WebBaseView.m86649WQ(ChatView.this.m92676n2(), c19609h, null, c18620i2);
            }
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: u */
        public void mo49386u(Class cls, Bundle bundle, int i11) {
            ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.c0

                /* renamed from: q */
                public final /* synthetic */ Class f57102q;

                /* renamed from: r */
                public final /* synthetic */ Bundle f57103r;

                /* renamed from: s */
                public final /* synthetic */ int f57104s;

                public /* synthetic */ RunnableC11321c0(Class cls2, Bundle bundle2, int i112) {
                    r2 = cls2;
                    r3 = bundle2;
                    r4 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11280f0.this.m60359q0(r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$g */
    /* loaded from: classes5.dex */
    class RunnableC11281g implements Runnable {
        RunnableC11281g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ChatView.this.mo59889Wr() > 0) {
                    ChatView.this.m60307zU();
                    ChatView chatView = ChatView.this;
                    chatView.f56779N2.postDelayed(chatView.f56780N3, 50L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$g0 */
    /* loaded from: classes5.dex */
    public class ViewOnTouchListenerC11282g0 implements View.OnTouchListener {

        /* renamed from: p */
        final int f56957p = ViewConfiguration.get(MainApplication.getAppContext()).getScaledTouchSlop();

        /* renamed from: q */
        float f56958q;

        /* renamed from: r */
        float f56959r;

        ViewOnTouchListenerC11282g0() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f56958q = motionEvent.getX();
                this.f56959r = motionEvent.getY();
            } else if (motionEvent.getAction() == 1 && Math.sqrt(Math.pow(this.f56958q - motionEvent.getX(), 2.0d) + Math.pow(this.f56959r - motionEvent.getY(), 2.0d)) <= this.f56957p) {
                if (ChatView.this.mo59948ba(EnumC19450c.f96555r)) {
                    ChatView.this.f56784P0.mo60602M5();
                }
                ChatView chatView = ChatView.this;
                if (chatView.f56846e3 != 0) {
                    chatView.mo60094l7(0, false);
                }
                ChatView.this.mo59619Dz();
                if (ChatView.this.f56853g2) {
                    ChatView.this.m60020gQ().mo60579Id(0);
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$h */
    /* loaded from: classes5.dex */
    class RunnableC11283h implements Runnable {
        RunnableC11283h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ChatView.this.f56864j1 != null) {
                    ChatView.this.m59385XT(false);
                    ChatView chatView = ChatView.this;
                    chatView.f56793R1.f60408d.removeView(chatView.f56864j1);
                    ChatView chatView2 = ChatView.this;
                    chatView2.f56793R1.f60408d.f56681P = null;
                    chatView2.f56864j1 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$h0 */
    /* loaded from: classes5.dex */
    class C11284h0 implements E2eeWarningBanner.InterfaceC13496a {
        C11284h0() {
        }

        @Override // com.zing.zalo.p077ui.widget.E2eeWarningBanner.InterfaceC13496a
        /* renamed from: a */
        public void mo60360a() {
            ChatView.this.f56784P0.mo60651V8();
        }

        @Override // com.zing.zalo.p077ui.widget.E2eeWarningBanner.InterfaceC13496a
        /* renamed from: b */
        public void mo60361b() {
            ChatView.this.f56784P0.mo60727gf();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$i */
    /* loaded from: classes5.dex */
    public class C11285i implements ZaloDrawerLayout.InterfaceC16579e {
        C11285i() {
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16579e
        /* renamed from: F1 */
        public void mo60362F1(int i11) {
            ChatView.this.f56784P0.mo60558F1(i11);
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16579e
        /* renamed from: a */
        public void mo60363a(View view) {
            try {
                if (((ZaloView) ChatView.this).f88763d0 != null) {
                    ((ZaloView) ChatView.this).f88763d0.m92753w();
                }
                ChatView.this.f56784P0.mo60820vf();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16579e
        /* renamed from: b */
        public void mo60364b(View view) {
            ChatView.this.f56784P0.mo60620Pc();
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16579e
        /* renamed from: c */
        public void mo60365c(View view, float f11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$i0 */
    /* loaded from: classes5.dex */
    public class C11286i0 implements InterfaceC24700t {
        C11286i0() {
        }

        /* renamed from: e */
        public /* synthetic */ void m60367e() {
            ChatView.this.f56784P0.mo60841yo(true);
        }

        @Override // p90.InterfaceC24700t
        /* renamed from: C2 */
        public C23528a mo60368C2() {
            ChatView chatView = ChatView.this;
            if (chatView.f56738C1 == null) {
                chatView.f56738C1 = new C23528a(chatView.getContext());
            }
            return ChatView.this.f56738C1;
        }

        @Override // p90.InterfaceC24700t
        /* renamed from: a */
        public boolean mo60369a() {
            if (!ChatView.this.f72421L0.m92677nJ() && ChatView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }

        @Override // p90.InterfaceC24700t
        /* renamed from: b */
        public void mo60370b(boolean z11) {
            if (z11) {
                ChatView.this.mo46829Y();
            } else {
                ChatView.this.mo49315c4();
            }
        }

        @Override // p90.InterfaceC24700t
        /* renamed from: c */
        public void mo60371c() {
            ChatView.this.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.chat.e0
                public /* synthetic */ RunnableC11599e0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.C11286i0.this.m60367e();
                }
            }, 150L);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$j */
    /* loaded from: classes5.dex */
    public class C11287j implements MyCloudQuotaManagementView.InterfaceC12499b {
        C11287j() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudQuotaManagementView.InterfaceC12499b
        /* renamed from: a */
        public void mo60372a() {
            if (ChatView.this.m92662fJ() == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("access_flow", ToolStorageDetailPage.EnumC13333a.f68484r.m74885c());
            ChatView.this.m92662fJ().m93066i2(ToolStorageDetailView.class, bundle, 0, 1, true);
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudQuotaManagementView.InterfaceC12499b
        /* renamed from: b */
        public void mo60373b() {
            AbstractC23152n3.m119050j0(ChatView.this.m92689tK(), AbstractC23306f.m120583H().m110204g().f110055I);
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudQuotaManagementView.InterfaceC12499b
        /* renamed from: c */
        public void mo60374c() {
            if (ChatView.this.m92662fJ() == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FLOW", ZCloudConnectSuccessView.EnumC13827b.f71511p);
            ChatView.this.m92662fJ().m93069k2(ZCloudConnectSuccessView.class, bundle, 1, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$j0 */
    /* loaded from: classes5.dex */
    class C11288j0 implements MyCloudQuotaBanner.InterfaceC12495a {
        C11288j0() {
        }

        /* renamed from: d */
        private void m60375d(EnumC2667d enumC2667d) {
            int i11 = C11290k0.f56970c[enumC2667d.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            ChatView.this.f56759H2 = C21956b.b.f108083t;
                            return;
                        }
                        return;
                    }
                    ChatView.this.f56759H2 = C21956b.b.f108082s;
                    return;
                }
                ChatView.this.f56759H2 = C21956b.b.f108081r;
                return;
            }
            ChatView.this.f56759H2 = C21956b.b.f108080q;
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudQuotaBanner.InterfaceC12495a
        /* renamed from: a */
        public void mo60376a(int i11) {
            if (i11 == 0) {
                AbstractC23136l9.m118714h1(ChatView.this.f56796S0, ChatView.this.f56796S0.getPaddingBottom() + ChatView.this.f56828a1.getHeight());
            } else {
                AbstractC23136l9.m118714h1(ChatView.this.f56796S0, ChatView.this.f56796S0.getPaddingBottom() - ChatView.this.f56828a1.getHeight());
            }
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudQuotaBanner.InterfaceC12495a
        /* renamed from: b */
        public void mo60377b(MyCloudQuotaBanner.EnumC12496b enumC12496b, EnumC2667d enumC2667d) {
            if (enumC12496b == MyCloudQuotaBanner.EnumC12496b.f65391p) {
                AbstractC0924m0.m3907il(System.currentTimeMillis());
                ChatView.this.mo59573BB(false);
            }
            m60375d(enumC2667d);
            ChatView.this.m60162pT();
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudQuotaBanner.InterfaceC12495a
        /* renamed from: c */
        public void mo60378c(MyCloudQuotaBanner.EnumC12496b enumC12496b, EnumC2667d enumC2667d) {
            if (enumC12496b == MyCloudQuotaBanner.EnumC12496b.f65391p) {
                AbstractC0924m0.m3907il(System.currentTimeMillis());
                ChatView.this.mo59573BB(false);
            } else {
                m60375d(enumC2667d);
                ChatView.this.m60162pT();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$k */
    /* loaded from: classes5.dex */
    class HandlerC11289k extends Handler {
        HandlerC11289k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11;
            boolean z11;
            MessageId messageId;
            try {
                i11 = message.what;
                z11 = true;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
            if (i11 != 12342 && i11 != 12343) {
                if (i11 != 12344 && i11 != 12345) {
                    if (i11 == 123456) {
                        ChatView.this.mo59620E4();
                        if (ChatView.this.mo59727Ly()) {
                            ChatView.this.f56816X0.m62814aN();
                        }
                        if (ChatView.this.f56820Y0 != null) {
                            ChatView.this.f56820Y0.m62731vM();
                        }
                    } else if (i11 == 123457) {
                        if (ChatView.this.f56792R0 != null && !ChatView.this.mo60294yp() && (messageId = (MessageId) message.obj) != null) {
                            if (ChatView.this.mo59727Ly()) {
                                ChatView.this.f56816X0.m62814aN();
                            } else {
                                ChatView.this.f56792R0.m64553U1(messageId);
                            }
                            AbstractC19444a.m101696d(ChatView.this.f56770K2);
                            AbstractC19444a.m101694b(ChatView.this.f56770K2, 1000L);
                        }
                    } else if (i11 == 123458) {
                        String str = (String) message.obj;
                        ShowcaseView showcaseView = ChatView.this.f56786P2;
                        if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(str, ChatView.this.f56786P2.getShowcaseId()) && !AbstractC28025b8.m141453i(str).f131579e) {
                            ChatView.this.f56786P2.m74626d();
                            ChatView.this.f56786P2 = null;
                        }
                        ChatView.this.f56784P0.mo60658Wb(str);
                    } else if (i11 == 123459) {
                        ChatView.this.f56784P0.mo60816v5("tip.csc.reaction.add");
                        ChatView.this.f56784P0.mo60816v5("tip.csc.reaction.button");
                    } else if (i11 == 123460) {
                        ChatView.this.mo59648GC(false);
                        Object obj = message.obj;
                        if (obj == null || !((Boolean) obj).booleanValue()) {
                            z11 = false;
                        }
                        if (ChatView.this.f56894q3 != null) {
                            ChatView.this.f56894q3.setEnableGreenDot(z11);
                        }
                    } else if (i11 == 123461) {
                        ChatView.this.f56784P0.mo60701cp();
                        ChatView.this.m60020gQ().mo60688an();
                    } else if (i11 == 123462) {
                        Object obj2 = message.obj;
                        if (obj2 == null || !((Boolean) obj2).booleanValue()) {
                            z11 = false;
                        }
                        ChatView.this.m60132nT(z11);
                    } else if (i11 == 123463) {
                        ChatView.this.f56784P0.mo60816v5((String) message.obj);
                    }
                    super.handleMessage(message);
                }
                InterfaceC11320c interfaceC11320c = ChatView.this.f56784P0;
                if (message.what != 12345) {
                    z11 = false;
                }
                interfaceC11320c.mo60728gi(z11);
                if (ChatView.this.mo59727Ly()) {
                    ChatView.this.f56816X0.m62814aN();
                }
                if (ChatView.this.f56820Y0 != null) {
                    ChatView.this.f56820Y0.m62731vM();
                }
                super.handleMessage(message);
            }
            InterfaceC11320c interfaceC11320c2 = ChatView.this.f56784P0;
            if (message.what != 12343) {
                z11 = false;
            }
            interfaceC11320c2.mo60733h7(z11);
            if (ChatView.this.mo59727Ly()) {
                ChatView.this.f56816X0.m62814aN();
            }
            if (ChatView.this.f56820Y0 != null) {
                ChatView.this.f56820Y0.m62731vM();
            }
            if (ChatView.this.m59312MQ()) {
                ChatView.this.f56793R1.m64829x0().m70181g1();
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$k0 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11290k0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56968a;

        /* renamed from: b */
        static final /* synthetic */ int[] f56969b;

        /* renamed from: c */
        static final /* synthetic */ int[] f56970c;

        /* renamed from: d */
        static final /* synthetic */ int[] f56971d;

        static {
            int[] iArr = new int[EnumC24253d.values().length];
            f56971d = iArr;
            try {
                iArr[EnumC24253d.f117154q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56971d[EnumC24253d.f117155r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56971d[EnumC24253d.f117156s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC2667d.values().length];
            f56970c = iArr2;
            try {
                iArr2[EnumC2667d.f10678t.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56970c[EnumC2667d.f10679u.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56970c[EnumC2667d.f10680v.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56970c[EnumC2667d.f10681w.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56970c[EnumC2667d.f10677s.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56970c[EnumC2667d.f10682x.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56970c[EnumC2667d.f10683y.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[EnumC18030a.values().length];
            f56969b = iArr3;
            try {
                iArr3[EnumC18030a.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56969b[EnumC18030a.SINGLE_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f56969b[EnumC18030a.SINGLE_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[EnumC20344j.values().length];
            f56968a = iArr4;
            try {
                iArr4[EnumC20344j.f100336r.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f56968a[EnumC20344j.f100337s.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$l */
    /* loaded from: classes5.dex */
    class RunnableC11291l implements Runnable {
        RunnableC11291l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ChatView.this.m92676n2() != null && !ChatView.this.mo60294yp() && ChatView.this.f56812W0 != null) {
                    ChatView.this.f56812W0.m65161GM();
                    ChatView.this.f56812W0.mo65183d0();
                    ChatView.this.m59867VT(true);
                    ChatView chatView = ChatView.this;
                    chatView.mo60117mi(chatView.mo60273x4());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$l0 */
    /* loaded from: classes5.dex */
    public class C11292l0 extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        boolean f56973a = true;

        C11292l0() {
        }

        /* renamed from: g */
        public /* synthetic */ void m60380g() {
            if (ChatView.this.mo60098lG() && !ChatView.this.f56793R1.m64756a1()) {
                ChatView.this.f56793R1.m64721G0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            boolean z12;
            try {
                if (ChatView.this.f56796S0.m76950t2()) {
                    return;
                }
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                    this.f56973a = true;
                }
                ChatView.this.f56784P0.mo60828wj(z11, z12, ChatView.this.f56921x2);
                if (z11 && C29210k.m145804c0().m145888v(ChatView.this.f56784P0.mo60624Q7(), ChatView.this.f56784P0.mo60540Bd())) {
                    int i12 = C11290k0.f56968a[ChatView.this.f56921x2.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            C24860q mo59932Zt = ChatView.this.mo59932Zt();
                            ChatView.this.m60020gQ().mo60796sk(new C28610b(ChatView.this.m60020gQ().mo60615Oc(), 3, ((Long) mo59932Zt.m129215c()).longValue(), ((Long) mo59932Zt.m129216d()).longValue()));
                            ChatView.this.f56921x2 = EnumC20344j.f100335q;
                        }
                    } else {
                        C24860q mo59932Zt2 = ChatView.this.mo59932Zt();
                        ChatView.this.m60020gQ().mo60796sk(new C28610b(ChatView.this.m60020gQ().mo60615Oc(), 4, ((Long) mo59932Zt2.m129215c()).longValue(), ((Long) mo59932Zt2.m129216d()).longValue()));
                        ChatView.this.f56921x2 = EnumC20344j.f100335q;
                    }
                }
                try {
                    if (ChatView.this.f56792R0 != null) {
                        if (z11) {
                            ChatView.this.mo59937ag(false);
                            ChatView.this.mo59806Rh();
                        } else {
                            ChatView.this.mo59937ag(true);
                            if (i11 == 1) {
                                ChatView chatView = ChatView.this;
                                if (chatView.f56881n2 != null) {
                                    chatView.mo59918Yt();
                                    ChatView.this.mo59806Rh();
                                }
                            }
                            if (ChatView.this.f56793R1.m64792l1()) {
                                ChatView.this.f56784P0.mo60602M5();
                            }
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ChatView", e11);
                }
                int m59934aQ = ChatView.this.m59934aQ();
                int mo59610Dc = ChatView.this.mo59610Dc();
                int m59959cQ = ChatView.this.m59959cQ();
                if (z11) {
                    if (m59934aQ <= m59959cQ) {
                        ChatView.this.m60099lP(true);
                    } else if (mo59610Dc - m59959cQ >= ChatView.this.mo59736Mm() - 1) {
                        ChatView.this.m60099lP(false);
                    }
                }
                if (ChatView.this.f56792R0.m64568x1() != null) {
                    ChatView.this.f56792R0.m64568x1().m104008S(recyclerView, i11);
                }
                ChatView chatView2 = ChatView.this;
                if (chatView2.f56755G2) {
                    AbstractC19444a.m101696d(chatView2.f56770K2);
                    if (z11) {
                        AbstractC19444a.m101694b(ChatView.this.f56770K2, 300L);
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("ChatView", e12);
                ChatView.this.f56784P0.mo60824w7();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            boolean z11;
            C20040b.b bVar;
            try {
                if (ChatView.this.mo60098lG() && !ChatView.this.f56793R1.m64756a1()) {
                    ChatView chatView = ChatView.this;
                    long j11 = chatView.f56892q1 + i12;
                    chatView.f56892q1 = j11;
                    if (Math.abs(j11) > AbstractC23136l9.m118763y(ChatView.this.getContext())) {
                        AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_HIDE_CHAT_SUGGEST_PHOTO", new Runnable() { // from class: com.zing.zalo.ui.chat.d0
                            public /* synthetic */ RunnableC11569d0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ChatView.C11292l0.this.m60380g();
                            }
                        }, 200L);
                    }
                }
                if (ChatView.this.f56796S0.m76950t2()) {
                    return;
                }
                int mo59968co = ChatView.this.mo59968co();
                int lastVisiblePosition = ChatView.this.f56796S0.getLastVisiblePosition();
                ChatView.this.f56784P0.mo60847zo(i12, ChatView.this.f56796S0.m76947q2(), ChatView.this.f56921x2);
                ChatView chatView2 = ChatView.this;
                if (lastVisiblePosition >= mo59968co - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                chatView2.f56888p1 = z11;
                if (ChatView.this.f56792R0.m64568x1() != null) {
                    C20040b m64568x1 = ChatView.this.f56792R0.m64568x1();
                    String m17944I0 = ChatView.this.m60020gQ().mo60615Oc().m17944I0();
                    SwipeItemListView swipeItemListView = ChatView.this.f56796S0;
                    int m59934aQ = ChatView.this.m59934aQ();
                    int childCount = ChatView.this.f56796S0.getChildCount();
                    if (i12 >= 0) {
                        bVar = C20040b.b.f98514q;
                    } else {
                        bVar = C20040b.b.f98513p;
                    }
                    m64568x1.m104007R(m17944I0, swipeItemListView, m59934aQ, childCount, bVar);
                }
                if ((!(recyclerView instanceof TouchListView) || !((TouchListView) recyclerView).m76947q2()) && this.f56973a && i12 < 0) {
                    ChatView.this.mo60088ki();
                    this.f56973a = false;
                }
                ChatView.this.mo59619Dz();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$m */
    /* loaded from: classes5.dex */
    public class C11293m extends C7145n.g {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f56975a;

        /* renamed from: b */
        final /* synthetic */ String f56976b;

        C11293m(ContactProfile contactProfile, String str) {
            this.f56975a = contactProfile;
            this.f56976b = str;
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            ContactProfile contactProfile;
            if (i11 == AbstractC8020f0.bump_add_friend) {
                ChatView.this.f56784P0.mo60571Hb(this.f56975a);
                return;
            }
            if (i11 == AbstractC8020f0.str_send_private_message) {
                ChatView.this.f56784P0.mo60805tm(this.f56976b);
                return;
            }
            if (i11 == AbstractC8020f0.str_view_profile) {
                ChatView.this.f56784P0.mo60715em(this.f56976b);
                return;
            }
            if (i11 == AbstractC8020f0.str_remove_user_from_group) {
                ChatView.this.f56784P0.mo60569Gn(this.f56976b, -1);
                return;
            }
            if (i11 == AbstractC8020f0.str_reportabuse) {
                ChatView.this.f56784P0.mo60753k8(this.f56976b);
                return;
            }
            if (i11 == AbstractC8020f0.str_mention) {
                if (this.f56975a != null) {
                    AbstractC23647d.m123897g("1591107");
                    ChatView.this.m60145oQ(this.f56975a.mo2475c(), Long.parseLong(this.f56975a.f42434r));
                    ChatView.this.mo60044hz();
                    return;
                }
                return;
            }
            if (i11 == AbstractC8020f0.str_call_zalo_for_free && (contactProfile = this.f56975a) != null) {
                ChatView chatView = ChatView.this;
                chatView.f56747E2 = contactProfile;
                AbstractC3102n.m15598q(chatView.f72421L0, 97, contactProfile);
                ChatView.this.mo60044hz();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$m0 */
    /* loaded from: classes5.dex */
    class C11294m0 extends C23999j {
        C11294m0() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            ChatView.this.f56836c1.setImageInfo(c3979l);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$n */
    /* loaded from: classes5.dex */
    public class C11295n implements ChatAttachmentContainer.InterfaceC11727b {
        C11295n() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer.InterfaceC11727b
        /* renamed from: e4 */
        public void mo60381e4(ChatAttachmentContainer.C11728c c11728c) {
            ChatView.this.f56784P0.mo60707e4(c11728c);
            ChatView chatView = ChatView.this;
            chatView.m59911YT(chatView.f56824Z0);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer.InterfaceC11727b
        /* renamed from: ti */
        public void mo60382ti(ChatAttachmentContainer.C11728c c11728c) {
            ChatView.this.mo60133na();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer.InterfaceC11727b
        /* renamed from: um */
        public void mo60383um(ChatAttachmentContainer.C11728c c11728c) {
            ChatView.this.mo60026gi();
            ChatView.this.m59335PU(c11728c);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$n0 */
    /* loaded from: classes5.dex */
    class C11296n0 implements LocationPickerView.InterfaceC12771b {
        C11296n0() {
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: a */
        public void mo60384a(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            ChatView.this.mo59698K(c18460c, str, str2, i11, footerLogData);
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: h */
        public void mo60385h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.ChatView$o */
    /* loaded from: classes5.dex */
    public class C11297o extends C20275e {
        C11297o() {
        }

        @Override // i40.C20275e
        /* renamed from: k */
        public int mo60386k(MessageId messageId) {
            return ChatView.this.m59435hQ(messageId);
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$o0 */
    /* loaded from: classes5.dex */
    class C11298o0 implements LocationPickerView.InterfaceC12771b {
        C11298o0() {
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: a */
        public void mo60384a(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            ChatView.this.mo59698K(c18460c, str, str2, i11, footerLogData);
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: h */
        public void mo60385h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.ChatView$p */
    /* loaded from: classes5.dex */
    public class C11299p extends C20275e {
        C11299p() {
        }

        @Override // i40.C20275e
        /* renamed from: k */
        public int mo60386k(MessageId messageId) {
            return ChatView.this.m59435hQ(messageId);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$p0 */
    /* loaded from: classes5.dex */
    class RunnableC11300p0 implements Runnable {
        RunnableC11300p0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ChatView.this.f56848f1 == null) {
                    ChatView chatView = ChatView.this;
                    chatView.f56848f1 = (TextView) chatView.f56793R1.f60408d.m59170J();
                }
                ChatView.this.f56848f1.setText(AbstractC8020f0.str_menu_page_sending_query);
                ChatView.this.mo60047iC(true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.ChatView$q */
    /* loaded from: classes5.dex */
    public class C11301q implements ContentPickerPopupView.InterfaceC16568b {
        C11301q() {
        }

        @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView.InterfaceC16568b
        /* renamed from: a */
        public void mo60387a() {
            ChatView.this.m59444iT();
        }

        @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView.InterfaceC16568b
        public void onDismiss() {
            ChatView.this.m59444iT();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$q0 */
    /* loaded from: classes5.dex */
    public class C11302q0 extends AbstractC28207v1.g0 {

        /* renamed from: a */
        final /* synthetic */ String f56986a;

        /* renamed from: b */
        final /* synthetic */ String f56987b;

        C11302q0(String str, String str2) {
            this.f56986a = str;
            this.f56987b = str2;
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: h */
        public void mo40743h() {
            ChatView.this.m78964sL();
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: j */
        public void mo40745j(String str) {
            ChatView.this.m78968wL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: m */
        public void mo40748m(String str) {
            ChatView.this.m78962rL(str, false);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: q */
        public void mo40752q(String str) {
            ChatView.this.m78961qL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: r */
        public void mo40753r(String str, String str2, String str3) {
            ChatView.this.m78965tL(str2, str, 3, this.f56986a, this.f56987b, str3);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: s */
        public void mo40754s(String str) {
            ChatView.this.m78962rL(str, true);
            C23744a.m124114c().m124116d(2, new Object[0]);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$r */
    /* loaded from: classes5.dex */
    public class RunnableC11303r implements Runnable {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.ChatView$r$a */
        /* loaded from: classes5.dex */
        public class a implements ChatEmptyView.InterfaceC11322a {

            /* renamed from: com.zing.zalo.ui.chat.ChatView$r$a$a */
            /* loaded from: classes5.dex */
            class C32750a extends C20275e {
                C32750a() {
                }

                @Override // i40.C20275e
                /* renamed from: h */
                public int mo36887h(int i11) {
                    return i11;
                }

                @Override // i40.C20275e
                /* renamed from: s */
                public boolean mo36888s() {
                    return true;
                }
            }

            a() {
            }

            @Override // com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView.InterfaceC11322a
            /* renamed from: a */
            public void mo60390a(C32006l8 c32006l8) {
                try {
                    ChatView chatView = ChatView.this;
                    if (chatView.f56778N1 && chatView.f56775M1 != null && c32006l8 != null && chatView.m60020gQ().mo60718f4(c32006l8.f147278e)) {
                        ChatView.this.m60066jU();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ChatView", e11);
                }
            }

            @Override // com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView.InterfaceC11322a
            /* renamed from: b */
            public void mo60391b() {
                ChatView.this.f56784P0.mo60735hd();
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[Catch: Exception -> 0x0039, TRY_ENTER, TryCatch #0 {Exception -> 0x0039, blocks: (B:2:0x0000, B:5:0x0019, B:8:0x0024, B:9:0x003f, B:12:0x0047, B:13:0x0050, B:15:0x0056, B:17:0x0065, B:18:0x007e, B:20:0x0089, B:21:0x0095, B:23:0x00a2, B:24:0x00b8, B:28:0x006e, B:29:0x003c), top: B:1:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:2:0x0000, B:5:0x0019, B:8:0x0024, B:9:0x003f, B:12:0x0047, B:13:0x0050, B:15:0x0056, B:17:0x0065, B:18:0x007e, B:20:0x0089, B:21:0x0095, B:23:0x00a2, B:24:0x00b8, B:28:0x006e, B:29:0x003c), top: B:1:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:2:0x0000, B:5:0x0019, B:8:0x0024, B:9:0x003f, B:12:0x0047, B:13:0x0050, B:15:0x0056, B:17:0x0065, B:18:0x007e, B:20:0x0089, B:21:0x0095, B:23:0x00a2, B:24:0x00b8, B:28:0x006e, B:29:0x003c), top: B:1:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:2:0x0000, B:5:0x0019, B:8:0x0024, B:9:0x003f, B:12:0x0047, B:13:0x0050, B:15:0x0056, B:17:0x0065, B:18:0x007e, B:20:0x0089, B:21:0x0095, B:23:0x00a2, B:24:0x00b8, B:28:0x006e, B:29:0x003c), top: B:1:0x0000 }] */
            @Override // com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView.InterfaceC11322a
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void mo60392c(ArrayList arrayList, int i11, AnimationTarget animationTarget, C16719g c16719g) {
                try {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) arrayList.get(i11);
                    Bundle bundle = new Bundle();
                    if (!ChatView.this.mo60124n3() && !ChatView.this.mo60244v2()) {
                        bundle.putBoolean("extra_profile_latest_photos", true);
                        bundle.putBoolean("hideImageFunction", false);
                        bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 3);
                        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                        if (arrayList.size() <= 1) {
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new ItemAlbumMobile((ItemAlbumMobile) it.next()));
                            }
                            bundle.putParcelableArrayList("medialist", arrayList2);
                            bundle.putInt("currentIndex", i11);
                        } else {
                            ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                            arrayList3.add(new ItemAlbumMobile(itemAlbumMobile));
                            bundle.putParcelableArrayList("medialist", arrayList3);
                        }
                        C32750a c32750a = new C32750a();
                        if (c16719g.m89119T() != null) {
                            c32750a.m105861G(new C2370r0(c16719g.m89119T()));
                        }
                        c32750a.m105865K(i11);
                        if (ChatView.this.m92676n2() != null) {
                            ChatView.this.m92676n2().mo35551H2(animationTarget, ((ItemAlbumMobile) arrayList.get(i11)).f42607x, bundle, c32750a, 10000);
                        }
                        ChatView.this.m60020gQ().mo60832x4(false);
                    }
                    bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 1);
                    if (arrayList.size() <= 1) {
                    }
                    C32750a c32750a2 = new C32750a();
                    if (c16719g.m89119T() != null) {
                    }
                    c32750a2.m105865K(i11);
                    if (ChatView.this.m92676n2() != null) {
                    }
                    ChatView.this.m60020gQ().mo60832x4(false);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ChatView", e11);
                }
            }
        }

        RunnableC11303r() {
        }

        /* renamed from: b */
        public /* synthetic */ void m60389b(C16719g c16719g) {
            ChatView.this.m60020gQ().mo60832x4(false);
            if (!ChatView.this.f56793R1.m64753Y0()) {
                ChatView.this.f56793R1.m64779h2();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ChatView chatView = ChatView.this;
                if (chatView.f56775M1 == null) {
                    chatView.f56781O1 = true;
                    return;
                }
                chatView.f56781O1 = false;
                chatView.f56778N1 = true;
                if (chatView.f56784P0.mo60624Q7()) {
                    ChatView.this.f56775M1.getMainContainer().mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.chat.t
                        public /* synthetic */ C11714t() {
                        }

                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            ChatView.RunnableC11303r.this.m60389b(c16719g);
                        }
                    });
                    ChatView.this.f56775M1.m60859b0(C0943w.m4462l().m4473g(ChatView.this.m60020gQ().mo60615Oc().m17944I0()));
                    ChatView.this.m60066jU();
                    return;
                }
                ChatView.this.f56775M1.setListener(new a());
                ChatView.this.f56775M1.setVisibility(4);
                ChatView chatView2 = ChatView.this;
                chatView2.mo59924ZF(chatView2.m60020gQ().mo60615Oc().m17944I0(), true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$r0 */
    /* loaded from: classes5.dex */
    public enum EnumC11304r0 {
        CALL,
        CALL_OA,
        VIDEO_CALL,
        VIDEO_CALL_OA
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$s */
    /* loaded from: classes5.dex */
    public class C11305s extends C19406k {
        C11305s(InterfaceC19397b interfaceC19397b) {
            super(interfaceC19397b);
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: c */
        public void mo60353c() {
            if (!ChatView.this.f56931z4.get()) {
                ChatView.this.f56927y4.set(true);
            }
            super.mo60353c();
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: h */
        public void mo60357h(Exception exc) {
            super.mo60357h(exc);
            mo60356j();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$s0 */
    /* loaded from: classes5.dex */
    public class C11306s0 implements AbstractC11316a.a {
        /* synthetic */ C11306s0(ChatView chatView, AbstractC27702jb abstractC27702jb) {
            this();
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: A */
        public boolean mo60394A(String str, MessageId messageId) {
            try {
                return ChatView.this.m59975dR(str, messageId);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
                return false;
            }
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: O0 */
        public void mo60395O0(int i11, String str, MessageId messageId) {
            ChatView.this.f56784P0.mo60612O0(i11, str, messageId);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: P0 */
        public void mo60396P0(ChatRow chatRow) {
            try {
                if (!chatRow.getMessage().m95032V6()) {
                    AbstractC23306f.m120562A().m2546l(ChatView.this.m60020gQ().mo60615Oc().m17944I0());
                    ChatView.this.f56920x1 = false;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: Q0 */
        public void mo60397Q0() {
            C23744a.m124114c().m124116d(4, new Object[0]);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: R0 */
        public boolean mo60398R0() {
            return ChatView.this.m59896XQ();
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: S */
        public boolean mo60399S(C17945a0 c17945a0) {
            if (ChatView.this.f56784P0 != null) {
                return ChatView.this.f56784P0.mo60637S(c17945a0);
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: S0 */
        public boolean mo60400S0(String str) {
            return ChatView.this.m59960cR(str);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: T0 */
        public void mo60401T0() {
            AbstractC28207v1.m141994i3("action.open.e2ee.intro", 3, ChatView.this.m92676n2(), ChatView.this, null, null);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: h0 */
        public boolean mo60402h0(C17945a0 c17945a0) {
            if (ChatView.this.f56784P0 != null) {
                return ChatView.this.f56784P0.mo60730h0(c17945a0);
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: i0 */
        public void mo60403i0() {
            AbstractC23034c6.m118184v0(ChatView.this, AbstractC23034c6.f112036m, 0);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: j */
        public void mo60404j(C7853b.b bVar) {
            ChatView.this.f56784P0.mo60748j(bVar);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: k */
        public void mo60405k() {
            ChatView.this.mo59714LA();
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: m */
        public void mo60406m(C7853b.d dVar) {
            ChatView.this.f56784P0.mo60763m(dVar);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: o */
        public void mo60407o() {
            if (ChatView.this.f56784P0 != null) {
                ChatView.this.f56784P0.mo60776o();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: z */
        public boolean mo60408z(C17945a0 c17945a0) {
            if (ChatView.this.f56784P0 != null) {
                return ChatView.this.f56784P0.mo60842z(c17945a0);
            }
            return false;
        }

        private C11306s0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.ChatView$t */
    /* loaded from: classes5.dex */
    public class C11307t implements ChatSearchToolbarView.InterfaceC11797a {
        C11307t() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatSearchToolbarView.InterfaceC11797a
        /* renamed from: a */
        public void mo60409a() {
            ChatView.this.f56784P0.mo60720fk();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatSearchToolbarView.InterfaceC11797a
        /* renamed from: b */
        public void mo60410b() {
            ChatView.this.f56784P0.mo60740hm();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatSearchToolbarView.InterfaceC11797a
        /* renamed from: c */
        public void mo60411c() {
            AbstractC28025b8.m141441L("tip.search.bysender.entry");
            ChatView.this.mo59663H7("");
            ChatView.this.m60020gQ().mo60579Id(1);
            ChatView.this.m60020gQ().mo60586Je("");
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$t0 */
    /* loaded from: classes5.dex */
    public class C11308t0 implements PushToTalkControl.InterfaceC16483d {
        /* synthetic */ C11308t0(ChatView chatView, AbstractC27716kb abstractC27716kb) {
            this();
        }

        /* renamed from: u */
        public /* synthetic */ void m60413u() {
            try {
                ChatView.this.m59973dP();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: X1 */
        public boolean mo60414X1() {
            return ChatView.this.f56784P0.mo60663X1();
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: a */
        public void mo60415a(byte[] bArr, boolean z11) {
            try {
                ChatView.this.m60146oT();
                ChatView.this.f56789Q1.m153906T0(bArr, z11);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: a3 */
        public void mo60416a3(C18888h c18888h) {
            ChatView.this.f56763I2 = 0;
            ChatView.this.f56784P0.mo60681a3(c18888h);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: b */
        public void mo60417b() {
            try {
                ChatView.this.m59973dP();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: c */
        public boolean mo60418c(View view, MotionEvent motionEvent) {
            return ChatView.this.m60161pQ(motionEvent);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: d */
        public void mo60419d() {
            ChatView.this.mo60240ul(124);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: e */
        public void mo60420e(int i11) {
            try {
                ChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.f0
                    public /* synthetic */ RunnableC11601f0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.C11308t0.this.m60413u();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: f */
        public void mo60421f() {
            ChatView.this.m59460kT();
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: g */
        public void mo60422g() {
            try {
                ChatView.this.m59973dP();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: h */
        public int mo60423h() {
            if (ChatView.this.f56824Z0 != null) {
                return ChatView.this.f56824Z0.getHeight();
            }
            return 0;
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: i */
        public void mo60424i() {
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: j */
        public void mo60425j() {
            AbstractC23034c6.m118186w0(ChatView.this.m92692wK(), AbstractC23034c6.m118175r(), 0);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: k */
        public int mo60426k() {
            ActionEditText actionEditText = ChatView.this.f56832b1;
            if (actionEditText != null && actionEditText.getLayout() != null) {
                return Math.max(1, ChatView.this.f56832b1.getLayout().getLineCount());
            }
            return 0;
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: l */
        public boolean mo60427l() {
            if (ChatView.this.m60100lQ() instanceof GroupLiveStreamView) {
                ToastUtils.showMess(false, ChatView.this.m92652XI(AbstractC8020f0.ls_can_not_record_when_live));
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: m */
        public void mo60428m() {
            ChatView.this.m59958cP();
            ChatView.this.m60146oT();
            if (AbstractC23238v2.m119727l()) {
                if (AbstractC23238v2.m119726k()) {
                    AbstractC23059e9.m118319H(ChatView.this.m92676n2(), true);
                    ChatView.this.mo59916Ym();
                    ChatView chatView = ChatView.this;
                    chatView.f56789Q1.m153921t0(1, chatView.m60020gQ().mo60663X1());
                    ChatView chatView2 = ChatView.this;
                    if ((chatView2.f56860i1 instanceof PushToTalkControl) && !chatView2.mo60301zB()) {
                        ChatView.this.m59973dP();
                    }
                    ChatView.this.mo60028gz();
                    return;
                }
                return;
            }
            ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: n */
        public void mo60429n(String str, int i11) {
            ChatView.this.f56784P0.mo60761ll(str, i11);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: o */
        public void mo60430o() {
            ToastUtils.m89266n(AbstractC8020f0.str_alertMsgShort, new Object[0]);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: o2 */
        public void mo60431o2(String str) {
            ChatView.this.mo60140o2(str);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: p */
        public void mo60432p(String str, boolean z11, InterfaceC20098e interfaceC20098e) {
            ChatView.this.m59624EU();
            ChatView.this.mo60051id(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
            boolean mo60414X1 = mo60414X1();
            if (ChatView.this.m60020gQ().mo60568Gd(z11, mo60414X1)) {
                ChatView.this.f56789Q1.m153908c0(str, z11, mo60414X1, interfaceC20098e);
            }
            if (z11) {
                ChatView.this.mo59915Yi();
                ChatView chatView = ChatView.this;
                chatView.f56763I2 = chatView.mo59889Wr();
                ChatView chatView2 = ChatView.this;
                chatView2.f56832b1.setSelection(chatView2.f56763I2);
                C23744a.m124114c().m124115b(ChatView.this, 74);
            } else {
                ChatView.this.mo59922Z6();
            }
            ChatView.this.m60020gQ().mo60604Md();
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: p4 */
        public void mo60433p4(int i11) {
            ChatView.this.mo60156p4(i11);
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: q */
        public void mo60434q() {
            ChatView.this.m60084kU();
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: r */
        public void mo60435r() {
            C31983k0 c31983k0 = ChatView.this.f56789Q1;
            if (c31983k0 != null) {
                c31983k0.m153929y();
            }
        }

        @Override // com.zing.zalo.uicontrol.PushToTalkControl.InterfaceC16483d
        /* renamed from: s */
        public void mo60436s() {
            try {
                ChatView.this.m59973dP();
                ChatView chatView = ChatView.this;
                AbstractPushToTalkControl abstractPushToTalkControl = chatView.f56860i1;
                if (abstractPushToTalkControl instanceof PushToTalkSpeechToText) {
                    if (((PushToTalkSpeechToText) abstractPushToTalkControl).m87983c0()) {
                        ChatView.this.mo60240ul(125);
                    } else {
                        ChatView.this.mo60240ul(123);
                    }
                } else if (abstractPushToTalkControl instanceof PushToTalkControl) {
                    chatView.mo60240ul(121);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        private C11308t0() {
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$u */
    /* loaded from: classes5.dex */
    public class C11309u implements ChatSearchBarView.InterfaceC11796a {
        C11309u() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatSearchBarView.InterfaceC11796a
        /* renamed from: a */
        public void mo60437a() {
            ChatView.this.f56784P0.mo60570Go(ChatView.this.f56853g2);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatSearchBarView.InterfaceC11796a
        /* renamed from: m */
        public void mo60438m() {
            try {
                ChatView.this.mo37491QJ(R.id.home);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$u0 */
    /* loaded from: classes5.dex */
    public interface InterfaceC11310u0 {
        /* renamed from: a */
        void mo60439a();

        /* renamed from: b */
        void mo60440b();

        /* renamed from: c */
        void mo60441c();

        /* renamed from: d */
        void mo60442d();

        /* renamed from: e */
        void mo60443e();

        /* renamed from: f */
        void mo60444f();

        /* renamed from: g */
        void mo60445g();

        /* renamed from: h */
        void mo60446h();
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$v */
    /* loaded from: classes5.dex */
    public class C11311v extends EditTextWithContextMenu.AbstractC13498a {
        C11311v() {
        }

        @Override // com.zing.zalo.p077ui.widget.EditTextWithContextMenu.AbstractC13498a
        /* renamed from: b */
        public void mo60447b(CharSequence charSequence, int i11, int i12) {
            try {
                ClipData m15b = new C0012a((ClipboardManager) ChatView.this.m92686rK().getSystemService("clipboard"), new SensitiveData("clipboard_access_text_csc", "comm_csc")).m15b();
                if (m15b != null && ChatView.this.f56830a3 != null) {
                    ChatView.this.f56830a3.m155301d(m15b, 99, null, null);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$w */
    /* loaded from: classes5.dex */
    public class C11312w extends AbstractC18391a {
        C11312w() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ChatView.this.f56784P0.mo60610Nl(editable.toString(), ChatView.this.f56853g2);
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            super.beforeTextChanged(charSequence, i11, i12, i13);
            if (i11 == 0 && i12 == 0 && i13 == 0 && ChatView.this.f56784P0.mo60800t9()) {
                ChatView.this.f56784P0.mo60819va(1);
                ChatView.this.f56784P0.mo60579Id(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$x */
    /* loaded from: classes5.dex */
    public class C11313x implements ChatFilterSearchAdapter.InterfaceC11794f {
        C11313x() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter.InterfaceC11794f
        /* renamed from: b */
        public void mo60448b() {
            ChatView.this.f56784P0.mo60717ep(ChatView.this);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter.InterfaceC11794f
        /* renamed from: c */
        public void mo60449c(ChatFilterSearchAdapter.C11795g c11795g) {
            if (c11795g != null && c11795g.m65605a() == 1) {
                ChatView.this.m60020gQ().mo60664X5(((ChatFilterSearchAdapter.C11792d) c11795g).f61345b);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$y */
    /* loaded from: classes5.dex */
    class C11314y extends C23999j {
        C11314y() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.ChatView$z */
    /* loaded from: classes5.dex */
    public class C11315z implements LiveEmojiButton.InterfaceC13682e {
        C11315z() {
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: b */
        public void mo60450b() {
            ChatView.this.f56784P0.mo60771na();
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: c */
        public void mo60451c() {
            boolean z11;
            try {
                ChatView.this.m59466lU();
                ImageView imageView = (ImageView) ChatView.this.f56793R1.f60408d.getLiveEmojiCloseButton();
                int[] m59418eQ = ChatView.this.m59418eQ();
                if (m59418eQ != null) {
                    if (m59418eQ[0] >= imageView.getLeft() && m59418eQ[0] <= imageView.getRight() && m59418eQ[1] >= imageView.getTop() && m59418eQ[1] <= imageView.getBottom()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && !ChatView.this.f56835b4) {
                        ChatView.this.f56835b4 = true;
                        ChatView.this.m59531vT(imageView, 1.25f);
                    } else if (!z11 && ChatView.this.f56835b4) {
                        ChatView.this.f56835b4 = false;
                        ChatView.this.m59531vT(imageView, 1.0f);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: d */
        public int mo60452d() {
            Rect bubbleRect;
            try {
                ChatView.this.m59519uQ();
                if (!ChatView.this.f56835b4) {
                    int[] m59418eQ = ChatView.this.m59418eQ();
                    if (m59418eQ == null) {
                        return 2;
                    }
                    int i11 = m59418eQ[0];
                    int i12 = m59418eQ[1];
                    ChatView.this.f56796S0.getLocationOnScreen(new int[2]);
                    View m9893m0 = ChatView.this.f56796S0.m9893m0(i11 - r5[0], i12 - r5[1]);
                    if (!(m9893m0 instanceof InterfaceC11475g0) || (bubbleRect = ((InterfaceC11475g0) m9893m0).getBubbleRect()) == null) {
                        return 2;
                    }
                    int[] iArr = new int[2];
                    m9893m0.getLocationOnScreen(iArr);
                    int i13 = bubbleRect.left;
                    int i14 = iArr[0];
                    int i15 = i13 + i14;
                    bubbleRect.left = i15;
                    int i16 = bubbleRect.right + i14;
                    bubbleRect.right = i16;
                    int i17 = bubbleRect.top;
                    int i18 = iArr[1];
                    int i19 = i17 + i18;
                    bubbleRect.top = i19;
                    int i21 = bubbleRect.bottom + i18;
                    bubbleRect.bottom = i21;
                    if (i11 < i15 || i11 > i16 || i12 < i19 || i12 > i21 || !ChatView.this.f56784P0.mo60667Xb(((InterfaceC11475g0) m9893m0).getMessage(), i11, i12)) {
                        return 2;
                    }
                    return 1;
                }
                ChatView.this.f56839c4.f70651N = false;
                ChatView.this.f56784P0.mo60553Dj();
                return 0;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
                return 2;
            }
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton.InterfaceC13682e
        /* renamed from: e */
        public void mo60453e(float f11) {
            ChatView.this.f56784P0.mo60794se(f11, ChatView.this.f56839c4.getEmoji());
        }
    }

    static {
        m59276HT();
        f56729M4 = new Hashtable();
    }

    /* renamed from: A */
    private void m59222A() {
        this.f56784P0.mo60527A();
    }

    /* renamed from: AQ */
    private ChatSearchBarView m59226AQ() {
        try {
            ChatSearchBarView m59182V = this.f56793R1.f60408d.m59182V();
            m59182V.setListener(new C11309u());
            if (AbstractC32226c.m155415n(m92692wK())) {
                m59182V.setPadding(0, AbstractC32226c.m155411j(m92676n2()).top, 0, 0);
            }
            m59182V.setOnClickListener(AbstractC23136l9.f112240a);
            View findViewById = m59182V.findViewById(AbstractC6918a0.btn_search_back);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: v50.x9
                    public /* synthetic */ ViewOnClickListenerC27896x9() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatView.this.m59520uR(view);
                    }
                });
            }
            EditText editText = (EditText) this.f56788Q0.findViewById(AbstractC6918a0.chat_search_edittext);
            this.f56865j2 = editText;
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: v50.y9
                public /* synthetic */ C27910y9() {
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m59529vR;
                    m59529vR = ChatView.this.m59529vR(textView, i11, keyEvent);
                    return m59529vR;
                }
            });
            this.f56865j2.setOnKeyListener(new View.OnKeyListener() { // from class: v50.z9
                public /* synthetic */ ViewOnKeyListenerC27924z9() {
                }

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                    boolean m59535wR;
                    m59535wR = ChatView.this.m59535wR(view, i11, keyEvent);
                    return m59535wR;
                }
            });
            this.f56865j2.addTextChangedListener(new C11312w());
            this.f56865j2.setOnTouchListener(new View.OnTouchListener() { // from class: v50.aa
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m59543xR;
                    m59543xR = ChatView.m59543xR(view, motionEvent);
                    return m59543xR;
                }
            });
            if (this.f56784P0.mo60624Q7() && AbstractC0924m0.m3986la()) {
                this.f56873l2 = (RecyclerView) this.f56788Q0.findViewById(AbstractC6918a0.list_filter_search);
                this.f56873l2.setLayoutManager(new LinearLayoutManager(getContext()));
                ChatFilterSearchAdapter chatFilterSearchAdapter = new ChatFilterSearchAdapter(getContext());
                this.f56877m2 = chatFilterSearchAdapter;
                chatFilterSearchAdapter.m65596R(new C11313x());
                this.f56873l2.setAdapter(this.f56877m2);
            }
            return m59182V;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
            return null;
        }
    }

    /* renamed from: AR */
    public /* synthetic */ void m59227AR(boolean z11) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.m64832y0() != null) {
            this.f56793R1.m64832y0().setListMediaItemHD(z11);
        }
    }

    /* renamed from: AS */
    public /* synthetic */ void m59228AS() {
        mo60094l7(0, false);
        mo59989ek();
        InterfaceC11320c interfaceC11320c = this.f56784P0;
        if (interfaceC11320c != null && (interfaceC11320c.mo60547Cd() == 2 || this.f56784P0.mo60547Cd() == 4)) {
            m60033hP(3);
        } else {
            m60033hP(2);
        }
    }

    /* renamed from: AU */
    private void m59229AU() {
        if (!this.f56906t3.isEmpty()) {
            Iterator it = this.f56906t3.iterator();
            while (it.hasNext()) {
                ((C26277b) it.next()).m135211x();
            }
        }
        if (!this.f56910u3.isEmpty()) {
            Iterator it2 = this.f56910u3.iterator();
            while (it2.hasNext()) {
                ObjectAnimator objectAnimator = (ObjectAnimator) it2.next();
                if (!objectAnimator.isRunning()) {
                    objectAnimator.start();
                }
            }
        }
    }

    /* renamed from: BQ */
    private void m59233BQ() {
        int i11;
        int i12;
        C11621p0 c11621p0;
        try {
            if (this.f56819X3 == null && (c11621p0 = this.f56793R1) != null && c11621p0.f60408d != null) {
                Conversation m17971y0 = m60020gQ().mo60615Oc().m17971y0();
                ChatComposePanelNew chatComposePanelNew = new ChatComposePanelNew(getContext(), this.f56824Z0, this.f56782O2);
                this.f56819X3 = chatComposePanelNew;
                chatComposePanelNew.setId(AbstractC6918a0.chat_compose_panel);
                this.f56819X3.setSendToConversation(m17971y0);
                this.f56819X3.setStrSendTo(m17971y0.m41000c(true, true, true));
                this.f56819X3.setGroup(m17971y0.m41013q());
                this.f56819X3.setIsCommunity(m17971y0.m41012p());
                this.f56793R1.f60408d.addView(this.f56819X3);
            }
            if (this.f56784P0.mo60624Q7()) {
                i11 = this.f56784P0.mo60607N6();
            } else {
                i11 = 0;
            }
            if (this.f56784P0.mo60640T8()) {
                i12 = f56726J4;
            } else {
                i12 = 0;
            }
            this.f56826Z2 = i12;
            ChatComposePanelNew chatComposePanelNew2 = this.f56819X3;
            if (chatComposePanelNew2 != null) {
                chatComposePanelNew2.m75608w(m92649TI(), m60020gQ().mo60798sp(), this.f56784P0.mo60821vg(), this.f56789Q1.m153886E(), this.f56784P0.mo60615Oc().m17944I0(), i11, this.f56784P0.mo60829wm(), this.f56826Z2, this.f56784P0.mo60661Wj());
                this.f56819X3.setListener(this.f56784P0.mo60597L5());
                int i13 = this.f56846e3;
                if (i13 == 4) {
                    this.f56819X3.setMode(1);
                } else if (i13 == 6) {
                    this.f56819X3.setMode(2);
                } else if (i13 == 7) {
                    this.f56819X3.setMode(3);
                } else if (i13 == 8) {
                    this.f56819X3.setMode(4);
                } else if (i13 == 9) {
                    this.f56819X3.setMode(5);
                } else {
                    this.f56819X3.setMode(0);
                }
                if (this.f56819X3.m75574B()) {
                    mo59916Ym();
                }
                this.f56819X3.setZinstantOAListener(new C11305s(this.f56737B4));
                synchronized (this.f56753F4) {
                    try {
                        if (this.f56749E4) {
                            this.f56819X3.setZinstantOAListener(null);
                            this.f56745D4 = null;
                        } else {
                            C3545m c3545m = this.f56745D4;
                            if (c3545m != null && c3545m.m18020f()) {
                                this.f56819X3.m75584N(this.f56745D4.m18018d());
                            }
                            C3545m c3545m2 = this.f56745D4;
                            if (c3545m2 != null) {
                                m59935aT(c3545m2.m18018d());
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: BR */
    public /* synthetic */ void m59234BR(View view) {
        this.f56784P0.mo60689b5();
    }

    /* renamed from: BS */
    public /* synthetic */ void m59235BS(InterfaceC11310u0 interfaceC11310u0, View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_add_item_to_collection) {
            interfaceC11310u0.mo60440b();
            return;
        }
        if (id2 == AbstractC6918a0.btn_back) {
            if (!this.f56784P0.mo60583J0()) {
                mo37491QJ(R.id.home);
                return;
            } else {
                this.f56784P0.mo60729gp(false);
                return;
            }
        }
        if (id2 == AbstractC6918a0.btn_share) {
            interfaceC11310u0.mo60445g();
            return;
        }
        if (id2 == AbstractC6918a0.btn_undo) {
            interfaceC11310u0.mo60441c();
            return;
        }
        if (id2 == AbstractC6918a0.btn_delete) {
            interfaceC11310u0.mo60442d();
            return;
        }
        if (id2 == AbstractC6918a0.btn_delete_for_me) {
            interfaceC11310u0.mo60439a();
            return;
        }
        if (id2 == AbstractC6918a0.btn_delete_for_all_members) {
            interfaceC11310u0.mo60444f();
            return;
        }
        if (id2 == AbstractC6918a0.btn_exit_delete_for_admin_mode) {
            interfaceC11310u0.mo60446h();
            return;
        }
        if (id2 == AbstractC6918a0.btn_save_message) {
            interfaceC11310u0.mo60443e();
        } else if (id2 == AbstractC6918a0.btn_report) {
            this.f56784P0.mo60729gp(true);
        } else if (id2 == AbstractC6918a0.viewReportAttachMsgTypeBanner) {
            m59522uT();
        }
    }

    /* renamed from: BT */
    private void m59236BT() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75582J()) {
            C23744a.m124114c().m124116d(8007, new Object[0]);
        }
    }

    /* renamed from: CQ */
    private void m59240CQ(boolean z11) {
        ZaloView m92996E0;
        String str;
        if (z11) {
            try {
                if (m59375WQ()) {
                    m92996E0 = m92649TI().m92996E0("SMLMyCloudQuotaManagementView");
                } else {
                    m92996E0 = m92649TI().m92996E0("ChatInfoView");
                }
                if (m92996E0 instanceof ChatInfoView) {
                    this.f56812W0 = (ChatInfoView) m92996E0;
                }
                if (m92996E0 instanceof MyCloudQuotaManagementView) {
                    this.f56812W0 = (MyCloudQuotaManagementView) m92996E0;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
                return;
            }
        }
        if (this.f56812W0 == null) {
            if (m59375WQ()) {
                this.f56812W0 = new MyCloudQuotaManagementView();
                str = "SMLMyCloudQuotaManagementView";
            } else {
                this.f56812W0 = new ChatInfoView();
                str = "ChatInfoView";
            }
            m92649TI().m93058d2(AbstractC6918a0.chat_right_drawer_layout, this.f56812W0, 0, str, 0, false);
        }
        if (m59375WQ()) {
            m59353ST();
        }
        this.f56812W0.m65170TM(this.f56784P0.mo60615Oc(), this.f56784P0.mo60837xo(), this.f56784P0);
        this.f56812W0.m65175XM(this.f56784P0.mo60676Zd(), false);
        this.f56793R1.m64727I2(new C11285i());
        if (this.f56784P0.mo60624Q7()) {
            this.f56784P0.mo60631R5();
        }
    }

    /* renamed from: CR */
    public /* synthetic */ void m59241CR(C3535c c3535c) {
        if (c3535c != null) {
            try {
                if (m60020gQ().mo60718f4(c3535c.m17944I0())) {
                    this.f56779N2.post(this.f56787P3);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: CS */
    public /* synthetic */ void m59242CS(WalkThroughOnboardView walkThroughOnboardView) {
        mo59837Tc("attachment", true);
    }

    /* renamed from: CU */
    public void m59243CU() {
        C32100s1.m154953d().m154968r();
        if (!this.f56906t3.isEmpty()) {
            Iterator it = this.f56906t3.iterator();
            while (it.hasNext()) {
                ((C26277b) it.next()).m135212z();
            }
        }
        if (!this.f56910u3.isEmpty()) {
            Iterator it2 = this.f56910u3.iterator();
            while (it2.hasNext()) {
                ObjectAnimator objectAnimator = (ObjectAnimator) it2.next();
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                }
            }
        }
    }

    /* renamed from: DR */
    public /* synthetic */ void m59247DR() {
        try {
            C11621p0 c11621p0 = this.f56793R1;
            if (c11621p0 != null && c11621p0.m64818t0() != null) {
                this.f56793R1.m64818t0().m65355e();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: DS */
    public /* synthetic */ void m59248DS(List list, ContactProfile contactProfile, String str, Rect rect) {
        SimpleMenuListPopupView m87993NL = SimpleMenuListPopupView.m87993NL(list, new C11293m(contactProfile, str), rect, AbstractC8020f0.str_remove_user_from_group);
        mo59922Z6();
        m92649TI().m93060e2(0, m87993NL, "TAG_SHOW_POPUP_MENU_PROFILE_MORE", 0, false);
    }

    /* renamed from: EP */
    private void m59252EP(MessageId messageId, String str) {
        ChatDetailsView chatDetailsView;
        List list;
        C17945a0 c17945a0;
        if (mo60249vF() && (c17945a0 = this.f56730A1) != null && c17945a0.m95135f9(messageId)) {
            mo60149oe();
        }
        if (mo60249vF() && (list = this.f56734B1) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C17945a0) it.next()).m95135f9(messageId)) {
                    m59591CP();
                    break;
                }
            }
        }
        if (mo59727Ly() && (chatDetailsView = this.f56816X0) != null && messageId.equals(chatDetailsView.m62803IM())) {
            mo60122my(true);
        }
        m60020gQ().mo60563Fk(messageId);
        m59548yP(messageId);
        mo59696Js();
    }

    /* renamed from: ER */
    public /* synthetic */ void m59253ER() {
        if (this.f56784P0.mo60540Bd()) {
            if (!C16805b.m89786h().m89809x()) {
                return;
            }
        } else if (!AbstractC3489d.m17501i() || !C24252c.f117152a.m126600f(EnumC24251b.f117146q)) {
            return;
        }
        boolean m59542xP = m59542xP();
        this.f56755G2 = !m59542xP;
        if (m59542xP) {
            this.f56796S0.f71285l1 = false;
            if (m59312MQ()) {
                this.f56793R1.m64829x0().setPreventTouch(true);
            }
        }
    }

    /* renamed from: ES */
    public /* synthetic */ void m59254ES(String str, boolean z11, C31973j5 c31973j5, Rect rect) {
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        ArrayList arrayList = new ArrayList();
        if (!AbstractC21935u.m114554u(str) && !AbstractC23063f2.m118359k(str) && m141809c != null && m141809c.f42352K0 <= 0 && !z11) {
            Context m92689tK = m92689tK();
            int i13 = AbstractC8020f0.bump_add_friend;
            arrayList.add(new C7145n.b(m92689tK, 0, i13, AbstractC23136l9.m118743r0(i13), "", false));
            z12 = true;
            z13 = true;
        } else {
            z12 = false;
            z13 = false;
        }
        Context m92689tK2 = m92689tK();
        int i14 = AbstractC8020f0.str_view_profile;
        if (m141809c != null && m141809c.m40387S0()) {
            i11 = AbstractC8020f0.str_view_oa_profile;
        } else {
            i11 = AbstractC8020f0.str_view_profile;
        }
        arrayList.add(new C7145n.b(m92689tK2, 0, i14, AbstractC23136l9.m118743r0(i11), "", z13));
        C32076q5 m4476k = C0943w.m4462l().m4476k(c31973j5.m153781r());
        if (m4476k != null && m4476k.m154722k(str)) {
            Context m92689tK3 = m92689tK();
            int i15 = AbstractC8020f0.str_mention;
            arrayList.add(new C7145n.b(m92689tK3, 0, i15, AbstractC23136l9.m118743r0(i15), "", true));
        }
        Context m92689tK4 = m92689tK();
        int i16 = AbstractC8020f0.str_send_private_message;
        arrayList.add(new C7145n.b(m92689tK4, 0, i16, AbstractC23136l9.m118743r0(i16), "", true));
        if (AbstractC23309i.m121783c9() == 1 && m141809c != null && !C21927m.m114302u().m114357s().m153137g(m141809c.f42434r) && m141809c.f42352K0 <= 0 && !z12) {
            Context m92689tK5 = m92689tK();
            int i17 = AbstractC8020f0.str_call_zalo_for_free;
            arrayList.add(new C7145n.b(m92689tK5, 0, i17, AbstractC23136l9.m118743r0(i17), ""));
        }
        if (!z11 && ((c31973j5.m153778p0() || (c31973j5.m153743U() && !c31973j5.m153744V(str) && !c31973j5.m153780q0(str))) && m4476k != null && m4476k.m154725n(str))) {
            Context m92689tK6 = m92689tK();
            int i18 = AbstractC8020f0.str_remove_user_from_group;
            if (c31973j5.m153747Y()) {
                i12 = AbstractC8020f0.str_menu_item_remove_from_community;
            } else {
                i12 = AbstractC8020f0.str_menu_item_remove_from_group;
            }
            C7145n.b bVar = new C7145n.b(m92689tK6, 0, i18, AbstractC23136l9.m118743r0(i12), "", true);
            bVar.m36363d(C23212s8.m119611s(getContext(), AbstractC7354t0.NotificationColor1));
            arrayList.add(bVar);
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: v50.hb

            /* renamed from: q */
            public final /* synthetic */ List f129702q;

            /* renamed from: r */
            public final /* synthetic */ ContactProfile f129703r;

            /* renamed from: s */
            public final /* synthetic */ String f129704s;

            /* renamed from: t */
            public final /* synthetic */ Rect f129705t;

            public /* synthetic */ RunnableC27673hb(List arrayList2, ContactProfile m141809c2, String str2, Rect rect2) {
                r2 = arrayList2;
                r3 = m141809c2;
                r4 = str2;
                r5 = rect2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59248DS(r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: FQ */
    private boolean m59258FQ(EnumC2667d enumC2667d) {
        if (!this.f56784P0.mo60540Bd()) {
            return false;
        }
        if (!C16805b.m89786h().m89809x() || enumC2667d == EnumC2667d.f10682x || enumC2667d == EnumC2667d.f10683y || enumC2667d == EnumC2667d.f10677s) {
            return false;
        }
        if (enumC2667d.m13113q()) {
            return true;
        }
        long m3562X3 = AbstractC0924m0.m3562X3();
        long millis = TimeUnit.DAYS.toMillis(r0.m89802j().m124105a());
        if (m3562X3 != 0 && millis == 0) {
            return false;
        }
        if (m3562X3 != 0 && System.currentTimeMillis() < m3562X3 + millis) {
            return false;
        }
        return true;
    }

    /* renamed from: FR */
    public /* synthetic */ void m59259FR() {
        if (C29210k.m145804c0().m145888v(this.f56784P0.mo60624Q7(), this.f56784P0.mo60540Bd())) {
            C24860q mo59932Zt = mo59932Zt();
            m60020gQ().mo60796sk(new C28610b(m60020gQ().mo60615Oc(), 3, ((Long) mo59932Zt.m129215c()).longValue(), ((Long) mo59932Zt.m129216d()).longValue()));
        }
    }

    /* renamed from: FS */
    public /* synthetic */ void m59260FS(boolean z11) {
        try {
            this.f56865j2.requestFocus();
            if (z11) {
                AbstractC2379w.m12432f(this.f56865j2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: FT */
    private void m59261FT() {
        if (C3255n.m16556g()) {
            C28181s2.f131306a.m141724e();
        }
    }

    /* renamed from: FU */
    private void m59262FU() {
        C23744a.m124114c().m124115b(this, 5208);
        C23744a.m124114c().m124115b(this, 150);
        C23744a.m124114c().m124115b(this, 51);
        C23744a.m124114c().m124115b(this, 13);
        C23744a.m124114c().m124115b(this, 14);
        C23744a.m124114c().m124115b(this, 138);
        C23744a.m124114c().m124115b(this, 139);
        C23744a.m124114c().m124115b(this, 15);
        C23744a.m124114c().m124115b(this, 21);
        C23744a.m124114c().m124115b(this, 27);
        C23744a.m124114c().m124115b(this, 41);
        C23744a.m124114c().m124115b(this, 44);
        C23744a.m124114c().m124115b(this, 62);
        C23744a.m124114c().m124115b(this, 58);
        C23744a.m124114c().m124115b(this, 91);
        C23744a.m124114c().m124115b(this, 92);
        C23744a.m124114c().m124115b(this, 9);
        C23744a.m124114c().m124115b(this, 127);
        C23744a.m124114c().m124115b(this, 52);
        C23744a.m124114c().m124115b(this, 149);
        C23744a.m124114c().m124115b(this, 132);
        C23744a.m124114c().m124115b(this, 3050);
        C23744a.m124114c().m124115b(this, 143);
        C23744a.m124114c().m124115b(this, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444);
        C23744a.m124114c().m124115b(this, 38);
        C23744a.m124114c().m124115b(this, 145);
        C23744a.m124114c().m124115b(this, 146);
        C23744a.m124114c().m124115b(this, 6021);
        C23744a.m124114c().m124115b(this, 10036);
        C23744a.m124114c().m124115b(this, 6031);
        C23744a.m124114c().m124115b(this, 8);
        C23744a.m124114c().m124115b(this, 153);
        C23744a.m124114c().m124115b(this, 152);
        C23744a.m124114c().m124115b(this, 155);
        C23744a.m124114c().m124115b(this, 6020);
        C23744a.m124114c().m124115b(this, 168);
        C23744a.m124114c().m124115b(this, 169);
    }

    /* renamed from: GQ */
    private boolean m59266GQ() {
        if (m92648SI() != null && AbstractC23034c6.m118167n(m92648SI(), AbstractC23034c6.m118177s()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: GR */
    public /* synthetic */ void m59267GR() {
        try {
            mo60206sG();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: GS */
    public /* synthetic */ void m59268GS() {
        RobotoTextView robotoTextView = this.f56793R1.f60446w;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(0);
        }
    }

    /* renamed from: GU */
    private void m59269GU() {
        try {
            C23744a.m124114c().m124115b(this, 5213);
            C23744a.m124114c().m124115b(this, 4);
            C23744a.m124114c().m124115b(this, 5);
            C23744a.m124114c().m124115b(this, 2);
            C23744a.m124114c().m124115b(this, 3);
            C23744a.m124114c().m124115b(this, 1);
            C23744a.m124114c().m124115b(this, 6);
            C23744a.m124114c().m124115b(this, 7);
            C23744a.m124114c().m124115b(this, 10);
            C23744a.m124114c().m124115b(this, 11);
            C23744a.m124114c().m124115b(this, 12);
            C23744a.m124114c().m124115b(this, 100);
            C23744a.m124114c().m124115b(this, 29);
            C23744a.m124114c().m124115b(this, 40);
            C23744a.m124114c().m124115b(this, 46);
            C23744a.m124114c().m124115b(this, 102);
            C23744a.m124114c().m124115b(this, 111);
            C23744a.m124114c().m124115b(this, 54);
            C23744a.m124114c().m124115b(this, 63);
            C23744a.m124114c().m124115b(this, 69);
            C23744a.m124114c().m124115b(this, 47);
            C23744a.m124114c().m124115b(this, 71);
            C23744a.m124114c().m124115b(this, 84);
            C23744a.m124114c().m124115b(this, 83);
            C23744a.m124114c().m124115b(this, 89);
            C23744a.m124114c().m124115b(this, 114);
            C23744a.m124114c().m124115b(this, 119);
            C23744a.m124114c().m124115b(this, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
            C23744a.m124114c().m124115b(this, 123);
            C23744a.m124114c().m124115b(this, 124);
            C23744a.m124114c().m124115b(this, 125);
            C23744a.m124114c().m124115b(this, 73);
            C23744a.m124114c().m124115b(this, 133);
            C23744a.m124114c().m124115b(this, 131);
            C23744a.m124114c().m124115b(this, 6015);
            C23744a.m124114c().m124115b(this, 141);
            C23744a.m124114c().m124115b(this, 6019);
            C23744a.m124114c().m124115b(this, 147);
            C23744a.m124114c().m124115b(this, 8002);
            C23744a.m124114c().m124115b(this, 6028);
            C23744a.m124114c().m124115b(this, 154);
            C23744a.m124114c().m124115b(this, 6029);
            C23744a.m124114c().m124115b(this, 48);
            C23744a.m124114c().m124115b(this, 6052);
            C23744a.m124114c().m124115b(this, 6055);
            C23744a.m124114c().m124115b(this, 167);
            C23744a.m124114c().m124115b(this, 70);
            C23744a.m124114c().m124115b(this, 6078);
            C23744a.m124114c().m124115b(this, 6075);
            C23744a.m124114c().m124115b(this, IMediaPlayer.MEDIA_INFO_COMPLETED_IN_RANGE);
            C23744a.m124114c().m124115b(this, 75);
            C23744a.m124114c().m124115b(this, 78);
            C23744a.m124114c().m124115b(this, 174);
            C23744a.m124114c().m124115b(this, 175);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:2:0x0000, B:16:0x0064, B:18:0x008b, B:20:0x0093, B:22:0x00ab, B:23:0x00b9, B:24:0x00cc, B:25:0x00bb, B:26:0x00eb, B:27:0x00ef, B:29:0x010c, B:30:0x0116, B:32:0x011a, B:33:0x0123, B:35:0x013c, B:36:0x0146, B:38:0x015b, B:39:0x003a, B:42:0x0047, B:45:0x0051), top: B:1:0x0000 }] */
    /* renamed from: HP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C25297f m59273HP(C28212v6 c28212v6, View view) {
        char c11;
        int right;
        int m118742r;
        try {
            C25297f m130959a = C25297f.Companion.m130959a(MainApplication.getAppContext());
            m130959a.m130907M(c28212v6, view.getContext());
            m130959a.m130925c0(view);
            m130959a.m130920Z(false);
            m130959a.m130918X(EnumC25294c.TOP);
            m130959a.m130923b0(AbstractC23222t7.f112566j);
            String str = c28212v6.f131577c;
            int hashCode = str.hashCode();
            if (hashCode != -1959007900) {
                if (hashCode != -1846653770) {
                    if (hashCode == 456730660 && str.equals("tip.community.auto_upgrade")) {
                        c11 = 2;
                        if (c11 == 0) {
                            if (c11 != 1) {
                                if (c11 == 2) {
                                    m130959a.m130911Q(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_tooltip_community_auto_upgraded_got_it));
                                    m130959a.m130910P(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_tooltip_community_auto_upgraded_learn_more));
                                    m130959a.m130920Z(true);
                                    m130959a.m130912R(EnumC25293b.RECTANGLE);
                                    Rect rect = new Rect();
                                    if (this.f88760a0.getTitleTextView() != null && this.f88760a0.getSubtitleTextView() != null) {
                                        if (this.f88760a0.getTitleTextView().getWidth() >= this.f88760a0.getSubtitleTextView().getWidth()) {
                                            right = this.f88760a0.getTitleTextView().getRight();
                                            m118742r = AbstractC23136l9.m118742r(10.0f);
                                        } else {
                                            right = this.f88760a0.getSubtitleTextView().getRight();
                                            m118742r = AbstractC23136l9.m118742r(40.0f);
                                        }
                                        rect = new Rect(this.f88760a0.getTitleTextView().getLeft() - AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118737p0(), right + m118742r, this.f88760a0.getHeight());
                                    }
                                    m130959a.m130921a0(rect);
                                }
                            } else {
                                m130959a.m130920Z(true);
                                m130959a.m130918X(EnumC25294c.BOTTOM);
                                m130959a.m130912R(EnumC25293b.RECTANGLE);
                                m130959a.m130923b0(AbstractC23136l9.m118742r(8.0f));
                                m130959a.m130917W(false);
                                if (view instanceof ChatRow) {
                                    m130959a.m130921a0(((ChatRow) view).getBubbleRect());
                                }
                                if (view instanceof ChatRowMultiPhotos) {
                                    m130959a.m130921a0(((ChatRowMultiPhotos) view).getOutCloudBubbleRect());
                                }
                                m130959a.m130911Q(m92652XI(AbstractC8020f0.str_outcloud_status_tip_button_right));
                                if (!TextUtils.isEmpty(AbstractC23306f.m120583H().m110204g().f110057K)) {
                                    m130959a.m130910P(m92652XI(AbstractC8020f0.str_outcloud_status_tip_button_left));
                                }
                            }
                        } else {
                            m130959a.m130911Q(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tip_banner_got_it));
                            m130959a.m130920Z(true);
                            m130959a.m130912R(EnumC25293b.RECTANGLE);
                            if (view instanceof ChatRow) {
                                m130959a.m130921a0(((ChatRow) view).getBubbleRect());
                            }
                        }
                        return m130959a;
                    }
                    c11 = 65535;
                    if (c11 == 0) {
                    }
                    return m130959a;
                }
                if (str.equals("tip.csc.voice.to.text")) {
                    c11 = 0;
                    if (c11 == 0) {
                    }
                    return m130959a;
                }
                c11 = 65535;
                if (c11 == 0) {
                }
                return m130959a;
            }
            if (str.equals("tip.zcloud.file.status")) {
                c11 = 1;
                if (c11 == 0) {
                }
                return m130959a;
            }
            c11 = 65535;
            if (c11 == 0) {
            }
            return m130959a;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: HR */
    public /* synthetic */ void m59274HR() {
        this.f56778N1 = false;
        m60222tQ();
    }

    /* renamed from: HS */
    public /* synthetic */ void m59275HS(String str, C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        if (showcaseView == this.f56786P2) {
            this.f56786P2 = null;
        }
        this.f56784P0.mo60530A7(i11, i12, str, c28212v6, z11);
    }

    /* renamed from: HT */
    public static void m59276HT() {
        f56728L4 = C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor);
        f56727K4 = C23212s8.m119606n(AbstractC16781w.CSCPrimaryBackground);
    }

    /* renamed from: HU */
    private void m59277HU() {
        AbstractC23059e9.m118319H(m92676n2(), false);
        mo59580Bi();
    }

    /* renamed from: IP */
    private void m59281IP() {
        C11621p0 c11621p0;
        ChatFrameLayout chatFrameLayout;
        if (this.f56772L1 == null && (c11621p0 = this.f56793R1) != null && (chatFrameLayout = c11621p0.f60408d) != null) {
            PinTopicBanner m59171K = chatFrameLayout.m59171K();
            this.f56772L1 = m59171K;
            m59171K.setListener(new C11273c());
            mo59933aH(123458, "tip.pinboard.expand", 200);
        }
    }

    /* renamed from: IQ */
    private boolean m59282IQ(ChatRow chatRow) {
        int i11;
        int i12;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        Rect bubbleRect = chatRow.getBubbleRect();
        chatRow.getLocationOnScreen(iArr);
        this.f56796S0.getLocationInWindow(iArr2);
        int i13 = iArr[1] + bubbleRect.top;
        if (AbstractC23136l9.m118666N0(this.f56828a1)) {
            i11 = this.f56828a1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        int i14 = iArr2[1];
        int measuredHeight = this.f56796S0.getMeasuredHeight() + i14;
        if (this.f56784P0.mo60540Bd()) {
            i12 = this.f56793R1.m64829x0().getTopItemTotalHeight();
        } else {
            i12 = 0;
        }
        if (i13 >= i14 + i12 && i13 + bubbleRect.height() <= measuredHeight - i11) {
            return true;
        }
        return false;
    }

    /* renamed from: IR */
    public /* synthetic */ void m59283IR(String str) {
        C28023b6.m141250h0().m141310R(str, !mo60244v2(), false, false);
    }

    /* renamed from: IS */
    public /* synthetic */ void m59284IS(View view) {
        try {
            mo60227tk(1);
            C31933ga.f146718a.m153477t(EnumC30859c.f142397q);
            mo59706Ka(4);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: IT */
    private void m59285IT(C27675hd c27675hd) {
        try {
            m59456kP(true);
            this.f56793R1.m64708B2(c27675hd.f129711e, c27675hd.f129712f);
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl != null) {
                abstractPushToTalkControl.m87660m(c27675hd.f129710d);
            }
            ZaloView m59331PP = m59331PP("ManageGroupView");
            if (m59331PP instanceof ManageGroupView) {
                this.f56851f4 = (ManageGroupView) m59331PP;
            }
            ManageGroupView manageGroupView = this.f56851f4;
            if (manageGroupView != null) {
                manageGroupView.m66603wO(this.f56855g4);
            }
            this.f56797S1 = c27675hd.f129708b;
            boolean z11 = c27675hd.f129713g;
            this.f56841d2 = z11;
            if (z11) {
                this.f56845e2 = c27675hd.f129714h;
            } else {
                this.f56845e2 = 0L;
            }
            ZaloView m59331PP2 = m59331PP("ZinstantZaloView");
            if (m59331PP2 instanceof ZinstantZaloView) {
                ((ZinstantZaloView) m59331PP2).mo79514dN(m59865VP());
            }
            ZaloView m92996E0 = m92649TI().m92996E0("ZinstantZaloView");
            if (m92996E0 instanceof ZinstantZaloView) {
                ((ZinstantZaloView) m92996E0).mo79514dN(m59865VP());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: IU */
    private void m59286IU() {
        C23744a.m124114c().m124117e(this, 5208);
        C23744a.m124114c().m124117e(this, 150);
        C23744a.m124114c().m124117e(this, 51);
        C23744a.m124114c().m124117e(this, 13);
        C23744a.m124114c().m124117e(this, 14);
        C23744a.m124114c().m124117e(this, 138);
        C23744a.m124114c().m124117e(this, 139);
        C23744a.m124114c().m124117e(this, 15);
        C23744a.m124114c().m124117e(this, 21);
        C23744a.m124114c().m124117e(this, 27);
        C23744a.m124114c().m124117e(this, 41);
        C23744a.m124114c().m124117e(this, 44);
        C23744a.m124114c().m124117e(this, 62);
        C23744a.m124114c().m124117e(this, 58);
        C23744a.m124114c().m124117e(this, 91);
        C23744a.m124114c().m124117e(this, 92);
        C23744a.m124114c().m124117e(this, 9);
        C23744a.m124114c().m124117e(this, 127);
        C23744a.m124114c().m124117e(this, 52);
        C23744a.m124114c().m124117e(this, 149);
        C23744a.m124114c().m124117e(this, 132);
        C23744a.m124114c().m124117e(this, 3050);
        C23744a.m124114c().m124117e(this, 143);
        C23744a.m124114c().m124117e(this, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444);
        C23744a.m124114c().m124117e(this, 38);
        C23744a.m124114c().m124117e(this, 145);
        C23744a.m124114c().m124117e(this, 146);
        C23744a.m124114c().m124117e(this, 6021);
        C23744a.m124114c().m124117e(this, 10036);
        C23744a.m124114c().m124117e(this, 6031);
        C23744a.m124114c().m124117e(this, 8);
        C23744a.m124114c().m124117e(this, 153);
        C23744a.m124114c().m124117e(this, 152);
        C23744a.m124114c().m124117e(this, 155);
        C23744a.m124114c().m124117e(this, 6020);
        C23744a.m124114c().m124117e(this, 168);
        C23744a.m124114c().m124117e(this, 169);
    }

    /* renamed from: JP */
    private void m59290JP(int i11, String str, String str2, ActionBarMenuItem actionBarMenuItem) {
        int m118742r = AbstractC23136l9.m118742r(24.0f);
        if (TextUtils.isEmpty(str2)) {
            actionBarMenuItem.m92774j(AbstractC23136l9.m118733o(m92689tK(), i11, str, new BitmapDrawable(m92651WI(), Bitmap.createScaledBitmap(Bitmap.createBitmap(m118742r, m118742r, Bitmap.Config.ARGB_8888), m118742r, m118742r, true))));
        } else {
            ((C23528a) this.f56738C1.m123612r(new C3977j(MainApplication.getAppContext()))).m123577A(str2, C23278z2.m120068F(), 10, new C11275d(m118742r, actionBarMenuItem, i11, str));
        }
    }

    /* renamed from: JQ */
    private boolean m59291JQ(C17945a0 c17945a0) {
        C17945a0 mo59952bm = mo59952bm();
        C17945a0 mo60181qu = mo60181qu();
        if (mo59952bm == null || mo60181qu == null || mo59952bm.mo95213o() > c17945a0.mo95213o() || c17945a0.mo95213o() > mo60181qu.mo95213o()) {
            return false;
        }
        return true;
    }

    /* renamed from: JR */
    public /* synthetic */ void m59292JR() {
        C3535c mo60615Oc = this.f56784P0.mo60615Oc();
        mo60615Oc.m17958W0(0);
        mo60615Oc.m17954S0(-1);
        mo60615Oc.m17959X0(0L);
        mo60615Oc.m17955T0(true);
        mo60615Oc.m17957V0(false);
        this.f56921x2 = EnumC20344j.f100335q;
        this.f56784P0.mo60711eb();
        if (this.f56784P0.mo60540Bd()) {
            this.f56784P0.mo60578I9(true);
        }
    }

    /* renamed from: JS */
    public /* synthetic */ void m59293JS() {
        mo60227tk(2);
    }

    /* renamed from: JT */
    public C24848g0 m59294JT() {
        this.f56784P0.mo60668Xd();
        return C24848g0.f119245a;
    }

    /* renamed from: JU */
    private void m59295JU() {
        try {
            C23744a.m124114c().m124117e(this, 5213);
            C23744a.m124114c().m124117e(this, 4);
            C23744a.m124114c().m124117e(this, 5);
            C23744a.m124114c().m124117e(this, 2);
            C23744a.m124114c().m124117e(this, 3);
            C23744a.m124114c().m124117e(this, 1);
            C23744a.m124114c().m124117e(this, 6);
            C23744a.m124114c().m124117e(this, 7);
            C23744a.m124114c().m124117e(this, 10);
            C23744a.m124114c().m124117e(this, 11);
            C23744a.m124114c().m124117e(this, 12);
            C23744a.m124114c().m124117e(this, 100);
            C23744a.m124114c().m124117e(this, 29);
            C23744a.m124114c().m124117e(this, 40);
            C23744a.m124114c().m124117e(this, 46);
            C23744a.m124114c().m124117e(this, 102);
            C23744a.m124114c().m124117e(this, 111);
            C23744a.m124114c().m124117e(this, 54);
            C23744a.m124114c().m124117e(this, 63);
            C23744a.m124114c().m124117e(this, 69);
            C23744a.m124114c().m124117e(this, 47);
            C23744a.m124114c().m124117e(this, 71);
            C23744a.m124114c().m124117e(this, 84);
            C23744a.m124114c().m124117e(this, 83);
            C23744a.m124114c().m124117e(this, 89);
            C23744a.m124114c().m124117e(this, 114);
            C23744a.m124114c().m124117e(this, 119);
            C23744a.m124114c().m124117e(this, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
            C23744a.m124114c().m124117e(this, 123);
            C23744a.m124114c().m124117e(this, 124);
            C23744a.m124114c().m124117e(this, 125);
            C23744a.m124114c().m124117e(this, 73);
            C23744a.m124114c().m124117e(this, 133);
            C23744a.m124114c().m124117e(this, 131);
            C23744a.m124114c().m124117e(this, 6015);
            C23744a.m124114c().m124117e(this, 141);
            C23744a.m124114c().m124117e(this, 6019);
            C23744a.m124114c().m124117e(this, 147);
            C23744a.m124114c().m124117e(this, 8002);
            C23744a.m124114c().m124117e(this, 6028);
            C23744a.m124114c().m124117e(this, 154);
            C23744a.m124114c().m124117e(this, 6029);
            C23744a.m124114c().m124117e(this, 48);
            C23744a.m124114c().m124117e(this, 6052);
            C23744a.m124114c().m124117e(this, 6055);
            C23744a.m124114c().m124117e(this, 167);
            C23744a.m124114c().m124117e(this, 70);
            C23744a.m124114c().m124117e(this, 6078);
            C23744a.m124114c().m124117e(this, 6075);
            C23744a.m124114c().m124117e(this, IMediaPlayer.MEDIA_INFO_COMPLETED_IN_RANGE);
            C23744a.m124114c().m124117e(this, 75);
            C23744a.m124114c().m124117e(this, 78);
            C23744a.m124114c().m124117e(this, 174);
            C23744a.m124114c().m124117e(this, 175);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: KP */
    private AnimTypingTextView m59299KP() {
        return this.f56793R1.f60408d.m59184X();
    }

    /* renamed from: KR */
    public /* synthetic */ void m59300KR() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            c11603g0.m64562i2();
        }
    }

    /* renamed from: KS */
    public /* synthetic */ void m59301KS(C28212v6 c28212v6, C17945a0 c17945a0, View view) {
        String str;
        String str2;
        if ("tip.zcloud.file.status".equals(c28212v6.f131577c)) {
            if (c17945a0 != null && c17945a0.m95216o5() == EnumC24253d.f117156s) {
                str2 = AbstractC23306f.m120583H().m110204g().f110064R;
            } else {
                str2 = AbstractC23306f.m120583H().m110204g().f110057K;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            AbstractC23152n3.m119050j0(getContext(), str2);
            return;
        }
        if ("tip.community.auto_upgrade".equals(c28212v6.f131577c)) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f56784P0.getGroupId());
            if (m4472f != null) {
                if (m4472f.m153778p0()) {
                    str = "ow";
                } else if (m4472f.m153743U()) {
                    str = "ad";
                } else {
                    str = "mem";
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("member_role", str);
                } catch (JSONException e11) {
                    AbstractC23350e.m122776f("ChatView", e11);
                }
                C20379a.f100400a.m106159a(null, 0, "community_onboarding_tooltip", jSONObject.toString());
            }
            AbstractC28207v1.m141994i3("action.open.inapp", 3, m92676n2(), this, AbstractC23306f.m120583H().m110204g().m116315g(), null);
        }
    }

    /* renamed from: KU */
    private void m59302KU() {
        if (this.f88760a0 == null) {
            return;
        }
        if (mo60124n3()) {
            this.f88760a0.setBackButtonImage(0);
        } else if (mo60244v2()) {
            this.f88760a0.setBackButtonDrawable(m59350SP(m92689tK(), AbstractC16803z.icn_bubble_back_csc_white));
        } else {
            this.f88760a0.setBackButtonDrawable(m59350SP(m92689tK(), AbstractC16803z.stencils_ic_head_back_white));
        }
        this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
    }

    /* renamed from: LP */
    private void m59306LP() {
        ChatInputBar chatInputBar = new ChatInputBar(getContext(), this.f56789Q1.m153886E(), this.f56784P0.getCurrMyCloudChatMode());
        this.f56824Z0 = chatInputBar;
        chatInputBar.setOnScaleMessageListener(this.f56847e4);
        this.f56824Z0.setId(AbstractC6918a0.chat_input_bar_container);
        this.f56824Z0.setOnChatInputActionListener(this.f56784P0.mo60641Tc());
        this.f56793R1.f60408d.m59205s(this.f56824Z0);
        this.f56806U2 = this.f56824Z0.findViewById(AbstractC6918a0.new_chat_input_btn_attach);
        this.f56832b1 = (ActionEditText) this.f56824Z0.findViewById(AbstractC6918a0.chatinput_text);
        this.f56802T2 = this.f56824Z0.findViewById(AbstractC6918a0.new_chat_input_btn_chat_send);
        this.f56798S2 = this.f56824Z0.findViewById(AbstractC6918a0.new_chat_input_btn_show_gallery);
        this.f56836c1 = (RedDotImageButton) this.f56824Z0.findViewById(AbstractC6918a0.new_chat_input_btn_chat_emoji);
        this.f56810V2 = (RedDotImageButton) this.f56824Z0.findViewById(AbstractC6918a0.new_chat_input_btn_show_voice);
        this.f56814W2 = this.f56824Z0.findViewById(AbstractC6918a0.new_chat_input_btn_mention);
        this.f56784P0.mo60766me();
        this.f56832b1.setTextContextChangeListener(new C11311v());
        this.f56832b1.addTextChangedListener(this);
        this.f56832b1.setFocusableInTouchMode(true);
        this.f56832b1.setOnClickListener(this);
        this.f56832b1.setOnTouchListener(new View.OnTouchListener() { // from class: v50.p7
            public /* synthetic */ ViewOnTouchListenerC27782p7() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m59488pR;
                m59488pR = ChatView.this.m59488pR(view, motionEvent);
                return m59488pR;
            }
        });
        this.f56832b1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: v50.q7
            public /* synthetic */ C27796q7() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m59495qR;
                m59495qR = ChatView.this.m59495qR(textView, i11, keyEvent);
                return m59495qR;
            }
        });
        SwipeItemListView swipeItemListView = (SwipeItemListView) this.f56788Q0.findViewById(AbstractC6918a0.chatlinelist);
        this.f56796S0 = swipeItemListView;
        swipeItemListView.setVerticalScrollBarEnabled(true);
        this.f56796S0.setOnTouchListener(new ViewOnTouchListenerC11282g0());
        LinearLayoutManagerFixed linearLayoutManagerFixed = new LinearLayoutManagerFixed(m92648SI(), 1, false, true);
        this.f56800T0 = linearLayoutManagerFixed;
        linearLayoutManagerFixed.mo9649E2(true);
        this.f56796S0.setLayoutManager(this.f56800T0);
        C11603g0 c11603g0 = new C11603g0(this, this.f56738C1, 1, AbstractC23306f.m120579F1());
        this.f56792R0 = c11603g0;
        c11603g0.m9999J(true);
        this.f56792R0.m60474F0(new C11306s0());
        this.f56796S0.setAdapter(this.f56792R0);
        this.f56792R0.m64565t1();
        this.f56796S0.setOnDispatchDrawListener(new TouchListView.InterfaceC13770d() { // from class: v50.r7
            public /* synthetic */ C27810r7() {
            }

            @Override // com.zing.zalo.p077ui.widget.recyclerview.TouchListView.InterfaceC13770d
            /* renamed from: a */
            public final void mo76953a() {
                ChatView.this.m59501rR();
            }
        });
        this.f56796S0.m9826E(new C11292l0());
        if (m60020gQ().mo60798sp()) {
            m59233BQ();
        }
    }

    /* renamed from: LR */
    public /* synthetic */ void m59307LR() {
        C27856ub c27856ub = this.f56884o1;
        if (c27856ub != null && c27856ub.f130051I != Integer.MIN_VALUE && this.f56846e3 != 8) {
            mo59706Ka(8);
        }
    }

    /* renamed from: LS */
    public /* synthetic */ void m59308LS(C28212v6 c28212v6, C17945a0 c17945a0, TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f56794R2) {
            this.f56794R2 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
        if ("tip.zcloud.file.status".equals(c28212v6.f131577c)) {
            if (c17945a0 != null) {
                int i13 = C11290k0.f56971d[c17945a0.m95216o5().ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            AbstractC0924m0.m3261Ml(true);
                        }
                    } else {
                        AbstractC0924m0.m3232Ll(true);
                    }
                } else {
                    AbstractC0924m0.m3203Kl(true);
                }
            }
            this.f56796S0.f71285l1 = true;
            if (m59312MQ()) {
                this.f56793R1.m64829x0().setPreventTouch(false);
                return;
            }
            return;
        }
        if ("tip.csc.voice.to.text".equals(c28212v6.f131577c)) {
            C20529b.f100835a.m106669x(m60004fQ());
            this.f56784P0.mo60557Eb();
        }
    }

    /* renamed from: MQ */
    public boolean m59312MQ() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.m64829x0() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: MR */
    public /* synthetic */ void m59313MR() {
        if (m92672lJ()) {
            this.f56784P0.mo60816v5("tip.any");
        }
    }

    /* renamed from: MS */
    public /* synthetic */ void m59314MS() {
        this.f56793R1.m64776g3();
    }

    /* renamed from: MU */
    private void m59315MU(boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        try {
            boolean z14 = true;
            switch (this.f56846e3) {
                case 0:
                    this.f56784P0.mo60765m9();
                    ChatDetailsView chatDetailsView = this.f56816X0;
                    if (chatDetailsView == null || !chatDetailsView.m92674mJ()) {
                        this.f56793R1.m64712D0();
                        if (mo59728M6()) {
                            this.f56860i1.requestLayout();
                        }
                        ChatFrameLayout chatFrameLayout = this.f56793R1.f60408d;
                        if (chatFrameLayout != null) {
                            chatFrameLayout.requestLayout();
                        }
                    }
                    if (z13) {
                        mo60026gi();
                    }
                    mo59796Qt(false);
                    m59651GT();
                    ChatComposePanelNew chatComposePanelNew = this.f56819X3;
                    if (chatComposePanelNew != null) {
                        chatComposePanelNew.setMode(0);
                    }
                    if (!this.f56853g2 && z11 && (!m60020gQ().mo60615Oc().m136046L() || !mo59707Kd())) {
                        m60020gQ().mo60682a9();
                    }
                    this.f56793R1.m64808p3(true);
                    this.f56793R1.m64804o3(false);
                    m59705KT(true);
                    m59551yU();
                    break;
                case 1:
                case 2:
                    ChatComposePanelNew chatComposePanelNew2 = this.f56819X3;
                    if (chatComposePanelNew2 != null) {
                        chatComposePanelNew2.setMode(0);
                    }
                    int i13 = this.f56846e3;
                    if (i13 == 1) {
                        if (!this.f56924y1) {
                            mo59921Z4();
                        }
                        this.f56784P0.mo60767mh();
                        this.f56793R1.m64808p3(false);
                        this.f56793R1.m64804o3(true);
                        if (mo60098lG() || mo60127nB()) {
                            AbstractC17927b.m94533b().mo94529c("THROTTLE_LAST_HIDE_CHAT_SUGGEST_PHOTO", new Runnable() { // from class: v50.s7
                                public /* synthetic */ RunnableC27824s7() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChatView.this.m59346RS();
                                }
                            }, 3000L);
                        }
                    } else if (i13 == 2) {
                        mo60026gi();
                        this.f56793R1.m64808p3(true);
                        this.f56793R1.m64804o3(false);
                    }
                    if (AbstractC2379w.m12431e() || ((m59817SQ() && !mo60244v2()) || !this.f56742D1)) {
                        this.f56793R1.m64712D0();
                    }
                    mo59796Qt(false);
                    if ((this.f56812W0 == null || !mo60273x4()) && !AbstractC23304d.f113385g) {
                        mo59915Yi();
                    }
                    ActionEditText actionEditText = this.f56832b1;
                    if (actionEditText != null) {
                        actionEditText.setFocusable(true);
                    }
                    mo60118mj();
                    if (mo60301zB() || mo59778Pu()) {
                        m59651GT();
                    }
                    if (!this.f56853g2 && z11) {
                        m60020gQ().mo60682a9();
                    }
                    m59705KT(true);
                    if (m60020gQ().mo60808u8()) {
                        this.f56784P0.mo60646Ua();
                    }
                    m60290yQ(false);
                    break;
                case 4:
                    mo60026gi();
                    if (this.f56784P0.mo60640T8()) {
                        i11 = f56726J4;
                    } else {
                        i11 = 0;
                    }
                    this.f56826Z2 = i11;
                    this.f56793R1.m64811q3(i11);
                    ChatComposePanelNew chatComposePanelNew3 = this.f56819X3;
                    if (chatComposePanelNew3 != null) {
                        chatComposePanelNew3.m75600g0(this.f56826Z2);
                    }
                    this.f56793R1.f60408d.requestLayout();
                    ChatComposePanelNew chatComposePanelNew4 = this.f56819X3;
                    if (chatComposePanelNew4 != null) {
                        chatComposePanelNew4.setMode(1);
                    }
                    mo59915Yi();
                    m59651GT();
                    if (!this.f56853g2 && z11) {
                        m60020gQ().mo60682a9();
                    }
                    m59493qP();
                    m60290yQ(false);
                    break;
                case 5:
                    ChatComposePanelNew chatComposePanelNew5 = this.f56819X3;
                    if (chatComposePanelNew5 != null) {
                        chatComposePanelNew5.setMode(0);
                    }
                    m59512tP();
                    break;
                case 6:
                    m59500rP();
                    if (!this.f56784P0.mo60627Qg()) {
                        C32050o7.m154655h().f147588f = 0L;
                    }
                    mo60026gi();
                    this.f56793R1.m64811q3(0);
                    this.f56793R1.f60408d.requestLayout();
                    ChatComposePanelNew chatComposePanelNew6 = this.f56819X3;
                    if (chatComposePanelNew6 != null) {
                        chatComposePanelNew6.m75593X(2, z12);
                    }
                    if (!this.f56853g2 && z11) {
                        m60020gQ().mo60682a9();
                    }
                    if (AbstractC23309i.m121069J() == 1) {
                        m60146oT();
                        break;
                    }
                    break;
                case 7:
                    m59518uP();
                    mo60026gi();
                    this.f56793R1.m64811q3(0);
                    this.f56793R1.f60408d.requestLayout();
                    ChatComposePanelNew chatComposePanelNew7 = this.f56819X3;
                    if (chatComposePanelNew7 != null) {
                        chatComposePanelNew7.setMode(3);
                    }
                    if (!this.f56853g2 && z11) {
                        m60020gQ().mo60682a9();
                        break;
                    }
                    break;
                case 8:
                    m59506sP();
                    mo60026gi();
                    this.f56793R1.m64811q3(0);
                    this.f56793R1.f60408d.requestLayout();
                    ChatComposePanelNew chatComposePanelNew8 = this.f56819X3;
                    if (chatComposePanelNew8 != null) {
                        chatComposePanelNew8.setMode(4);
                    }
                    if (!this.f56853g2 && z11) {
                        m60020gQ().mo60682a9();
                        break;
                    }
                    break;
                case 9:
                    m59527vP();
                    mo60026gi();
                    m59327OU();
                    this.f56793R1.m64811q3(this.f56761H4);
                    this.f56793R1.f60408d.requestLayout();
                    ChatComposePanelNew chatComposePanelNew9 = this.f56819X3;
                    if (chatComposePanelNew9 != null) {
                        chatComposePanelNew9.m75595Z(this.f56761H4, this.f56757G4);
                        this.f56819X3.setMode(5);
                    }
                    if (!this.f56853g2 && z11) {
                        m60020gQ().mo60682a9();
                        break;
                    }
                    break;
            }
            mo59847U8();
            m59946bT(this.f56846e3);
            if (AbstractC23309i.m121232Ne()) {
                C23744a m124114c = C23744a.m124114c();
                if (this.f56846e3 == 6) {
                    i12 = 96;
                } else {
                    i12 = 97;
                }
                m124114c.m124116d(i12, new Object[0]);
            }
            if (C21373a.f104231a.m110807w().m110825b() && m59312MQ()) {
                EmbeddedMyCloudPagesLayout m64829x0 = this.f56793R1.m64829x0();
                if (this.f56846e3 == 0) {
                    z14 = false;
                }
                m64829x0.m70169Z0(z14);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: NR */
    public /* synthetic */ void m59319NR() {
        C21373a c21373a = C21373a.f104231a;
        if (c21373a.m110797i()) {
            if (!this.f56784P0.mo60816v5("tip.mycloud.attachment.flow3.step1")) {
                c21373a.m110787J(false);
            }
        } else if (c21373a.m110796h()) {
            this.f56784P0.mo60816v5("tip.mycloud.attachment.flow4.step2");
        }
    }

    /* renamed from: NS */
    public /* synthetic */ void m59320NS() {
        if (this.f56846e3 != 0 && !mo60294yp()) {
            mo59706Ka(0);
        }
    }

    /* renamed from: OP */
    private void m59324OP(View view, boolean z11) {
        float f11;
        if (view != null) {
            view.setEnabled(z11);
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            view.setAlpha(f11);
        }
    }

    /* renamed from: OR */
    public /* synthetic */ void m59325OR() {
        try {
            mo60092kz();
            if (this.f56848f1.getVisibility() == 0) {
                this.f56848f1.setText(AbstractC8020f0.str_menu_page_sent_query_failed);
            }
            this.f56779N2.postDelayed(this.f56862i3, 2000L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: OS */
    public /* synthetic */ void m59326OS() {
        try {
            m59609DU();
            C23744a.m124114c().m124116d(4, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: OU */
    private void m59327OU() {
        int m122007i5 = AbstractC23309i.m122007i5(m92689tK());
        this.f56757G4 = m122007i5;
        int i11 = this.f56733A4;
        if (i11 == -1) {
            this.f56761H4 = 0;
        } else {
            this.f56761H4 = Math.min(i11, m122007i5) - this.f56757G4;
        }
    }

    /* renamed from: PP */
    private ZaloView m59331PP(String str) {
        if (m92662fJ() != null) {
            return m92662fJ().m92996E0(str);
        }
        return null;
    }

    /* renamed from: PR */
    public /* synthetic */ void m59332PR() {
        C11621p0 c11621p0;
        try {
            int i11 = this.f56846e3;
            if (i11 != 0 && i11 != 1 && i11 != 5 && ((c11621p0 = this.f56793R1) == null || c11621p0.m64824v0() == null || !this.f56793R1.m64824v0().m88326C(8388613))) {
                return;
            }
            if (this.f56788Q0.findFocus() instanceof ZinstantInputText) {
                this.f56788Q0.findFocus().clearFocus();
            }
            m59803RT(0, false, false, false);
            C23744a.m124114c().m124116d(4, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: PS */
    public /* synthetic */ void m59333PS() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75599f0(this.f56858h3);
        }
    }

    /* renamed from: PT */
    private void m59334PT(boolean z11) {
        int i11;
        View view = this.f56852g1;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: PU */
    public void m59335PU(ChatAttachmentContainer.C11728c c11728c) {
        C32596l.c.C33080c m157839b;
        if (c11728c != null) {
            try {
                int m65330h = c11728c.m65330h();
                if (m65330h != 1 && m65330h != 2 && m65330h != 6) {
                    if (m65330h != 7) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("viewAttachment() with unsupported type: ");
                        sb2.append(c11728c.m65330h());
                    } else {
                        C32596l.b m65327e = c11728c.m65327e();
                        if (m65327e != null && (m157839b = m65327e.m157839b()) != null) {
                            String m157851f = m157839b.m157851f();
                            if (!TextUtils.isEmpty(m157851f)) {
                                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                                ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                                itemAlbumMobile.f42607x = m157851f;
                                arrayList.add(itemAlbumMobile);
                                Bundle bundle = new Bundle();
                                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 1);
                                bundle.putParcelableArrayList("medialist", arrayList);
                                bundle.putInt("currentIndex", 0);
                                bundle.putString("EXTRA_STR_CONVERSATION_ID", m60020gQ().mo60615Oc().m17944I0());
                                bundle.putBoolean("hideImageFunction", true);
                                bundle.putBoolean("viewOnly", true);
                                m59577BU(m157851f, bundle, 0, 1018);
                            }
                        }
                    }
                } else {
                    String m65326d = c11728c.m65326d();
                    if (!TextUtils.isEmpty(m65326d)) {
                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                        ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile();
                        itemAlbumMobile2.f42607x = m65326d;
                        arrayList2.add(itemAlbumMobile2);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 1);
                        bundle2.putParcelableArrayList("medialist", arrayList2);
                        bundle2.putInt("currentIndex", 0);
                        bundle2.putString("EXTRA_STR_CONVERSATION_ID", m60020gQ().mo60615Oc().m17944I0());
                        bundle2.putBoolean("hideImageFunction", true);
                        bundle2.putBoolean("viewOnly", true);
                        m59577BU(m65326d, bundle2, 0, 1018);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: QR */
    public static /* synthetic */ String m59339QR() {
        return "Reaction ChatView->onKeyboardShown->skip";
    }

    /* renamed from: QS */
    public /* synthetic */ void m59340QS() {
        mo60206sG();
        invalidateOptionsMenu();
    }

    /* renamed from: RP */
    private TextView m59344RP() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            return actionBar.getSubtitleTextView();
        }
        return null;
    }

    /* renamed from: RR */
    public /* synthetic */ void m59345RR(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            C8009j c8009j = this.f56912v1;
            if (c8009j != null) {
                c8009j.dismiss();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: RS */
    public /* synthetic */ void m59346RS() {
        if (this.f56924y1) {
            if (mo60098lG() && !mo59862V8()) {
                this.f56793R1.m64721G0();
            }
            mo60201rw();
        }
    }

    /* renamed from: SP */
    public static Drawable m59350SP(Context context, int i11) {
        if (i11 != 0) {
            Map map = f56729M4;
            Drawable drawable = (Drawable) map.get(Integer.valueOf(i11));
            if (drawable == null) {
                Drawable m118665N = AbstractC23136l9.m118665N(context, i11);
                if (m118665N != null) {
                    map.put(Integer.valueOf(i11), m118665N);
                    return m118665N;
                }
                return m118665N;
            }
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|3|(10:5|(1:7)|8|9|10|(1:12)|14|(1:16)|17|19)|23|8|9|10|(0)|14|(0)|17|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:            r8 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:            mm0.AbstractC23350e.m122776f("ChatView", r8);     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #1 {Exception -> 0x0038, blocks: (B:10:0x0025, B:12:0x0033), top: B:9:0x0025, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0004, B:5:0x0012, B:8:0x001f, B:14:0x003c, B:16:0x0040, B:17:0x0043, B:22:0x0039, B:10:0x0025, B:12:0x0033), top: B:2:0x0004, inners: #1 }] */
    /* renamed from: SR */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m59351SR(int i11, ActionLogChatLocation.FooterLogData footerLogData, C18460c c18460c, String str, String str2, InterfaceC17463d interfaceC17463d, int i12) {
        C8009j c8009j;
        try {
            String mo60638S2 = this.f56784P0.mo60638S2();
            if (!mo60638S2.equals("3")) {
                if (mo60638S2.equals("4")) {
                }
                ActionLogChatLocation.f55164a.m56651e(mo60638S2, i11, false, footerLogData);
                if (this.f56850f3.equals(this.f56843d4.trim())) {
                    this.f56843d4 = "";
                    this.f56850f3 = "";
                }
                c8009j = this.f56912v1;
                if (c8009j != null) {
                    c8009j.dismiss();
                }
                m59606DP(c18460c);
                C31868c5 c31868c5 = new C31868c5();
                c31868c5.m153171c(c18460c.f93026g);
                c31868c5.m153172d(c18460c.f93025f);
                this.f56789Q1.m153918p0(c31868c5, str, str2, c18460c.f93021b, c18460c.f93022c, "vitrihientai".equals(c18460c.f93020a));
                AbstractC23647d.m123893c();
            }
            mo60638S2 = "1";
            ActionLogChatLocation.f55164a.m56651e(mo60638S2, i11, false, footerLogData);
            if (this.f56850f3.equals(this.f56843d4.trim())) {
            }
            c8009j = this.f56912v1;
            if (c8009j != null) {
            }
            m59606DP(c18460c);
            C31868c5 c31868c52 = new C31868c5();
            c31868c52.m153171c(c18460c.f93026g);
            c31868c52.m153172d(c18460c.f93025f);
            this.f56789Q1.m153918p0(c31868c52, str, str2, c18460c.f93021b, c18460c.f93022c, "vitrihientai".equals(c18460c.f93020a));
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: SS */
    public /* synthetic */ void m59352SS() {
        this.f56775M1.m60859b0(C0943w.m4462l().m4473g(m60020gQ().mo60615Oc().m17944I0()));
    }

    /* renamed from: ST */
    private void m59353ST() {
        ((MyCloudQuotaManagementView) this.f56812W0).m70253wN(new C11287j());
    }

    /* renamed from: TR */
    public /* synthetic */ void m59357TR(String str, boolean z11) {
        if (mo59728M6()) {
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl instanceof PushToTalkSpeechToText) {
                ((PushToTalkSpeechToText) abstractPushToTalkControl).m87981O0(str, z11);
            }
        }
    }

    /* renamed from: TS */
    public /* synthetic */ void m59358TS() {
        SwipeItemListView swipeItemListView = this.f56796S0;
        AbstractC23136l9.m118714h1(swipeItemListView, swipeItemListView.getPaddingBottom() + this.f56828a1.getHeight());
    }

    /* renamed from: TT */
    private void m59359TT(boolean z11) {
        int i11;
        PageMenuView pageMenuView = this.f56840d1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        pageMenuView.setVisibility(i11);
    }

    /* renamed from: UP */
    private C17945a0 m59363UP(C28212v6 c28212v6, View view) {
        if ("tip.zcloud.file.status".equals(c28212v6.f131577c)) {
            if (view instanceof ChatRowMultiItems) {
                return ((ChatRowMultiItems) view).getMsgShowTipNonCloud();
            }
            if (view instanceof ChatRow) {
                return ((ChatRow) view).getMessage();
            }
            if (view instanceof GridChatItemViewBase) {
                GridChatItemViewBase gridChatItemViewBase = (GridChatItemViewBase) view;
                if (gridChatItemViewBase.getData() != null) {
                    return gridChatItemViewBase.getData().m71033m();
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: UR */
    public /* synthetic */ void m59364UR() {
        this.f56919w4 = false;
    }

    /* renamed from: US */
    public /* synthetic */ void m59365US() {
        if (m59896XQ()) {
            invalidateOptionsMenu();
        }
    }

    /* renamed from: VR */
    public /* synthetic */ void m59369VR(View view) {
        try {
            if (m92687sJ() && this.f72421L0.m92674mJ() && !mo60294yp() && !this.f56793R1.m64763d1() && !this.f56853g2 && !mo59727Ly() && !this.f56793R1.f60417h0) {
                this.f56784P0.mo60608Na();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: VS */
    public /* synthetic */ void m59370VS() {
        if (this.f56846e3 != 0 && !mo60294yp()) {
            mo60094l7(0, false);
        }
    }

    /* renamed from: WP */
    private String m59374WP() {
        EditText editText = this.f56865j2;
        if (editText != null) {
            return editText.getText().toString();
        }
        return null;
    }

    /* renamed from: WQ */
    private boolean m59375WQ() {
        if (this.f56784P0.mo60540Bd() && C16805b.m89786h().m89809x()) {
            return true;
        }
        return false;
    }

    /* renamed from: WR */
    public /* synthetic */ void m59376WR(String str, JSONObject jSONObject, ZaloView zaloView, AbstractC28207v1.h0 h0Var) {
        this.f56807U3 = null;
        AbstractC28207v1.m142049t3(str, jSONObject, zaloView.m92676n2(), zaloView.m92662fJ(), zaloView.m92649TI(), m60020gQ(), m59865VP(), h0Var);
    }

    /* renamed from: WS */
    public /* synthetic */ void m59377WS() {
        if (this.f56846e3 != 0 && !mo60294yp()) {
            mo60094l7(0, false);
        }
    }

    /* renamed from: WU */
    public static void m59378WU() {
        try {
            m59350SP(MainApplication.getAppContext(), AbstractC16803z.stencils_ic_head_back_white);
            m59350SP(MainApplication.getAppContext(), m59382XP());
            m59350SP(MainApplication.getAppContext(), AbstractC16803z.icn_header_voicecall_white);
            m59350SP(MainApplication.getAppContext(), AbstractC16803z.btn_videocall_white);
            m59386XU();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: XP */
    private static int m59382XP() {
        return AbstractC16803z.ic_header_list;
    }

    /* renamed from: XR */
    public /* synthetic */ void m59383XR(C1421e c1421e) {
        ChatInputBar chatInputBar = this.f56824Z0;
        chatInputBar.setPadding(chatInputBar.getPaddingLeft(), this.f56824Z0.getPaddingTop(), this.f56824Z0.getPaddingRight(), c1421e.f6233d);
        try {
            int[] iArr = new int[2];
            this.f56824Z0.getLocationInWindow(iArr);
            C24559a.m127933c("[KeyboardInfo]", "mChatInputBar location =(" + iArr[0] + "," + iArr[1] + ")\n insetBottom: " + c1421e.f6233d);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: XS */
    public /* synthetic */ void m59384XS() {
        if (this.f56846e3 != 0 && !mo60294yp()) {
            mo60094l7(0, false);
        }
    }

    /* renamed from: XT */
    public void m59385XT(boolean z11) {
        int i11;
        AnimTypingTextView animTypingTextView = this.f56864j1;
        if (animTypingTextView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            animTypingTextView.setVisibility(i11);
        }
    }

    /* renamed from: XU */
    public static void m59386XU() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C32084r m120721w = AbstractC23306f.m120721w();
        linkedHashSet.addAll(m120721w.m154788b(EnumC18030a.GROUP));
        linkedHashSet.addAll(m120721w.m154788b(EnumC18030a.SINGLE_USER));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                switch (((Integer) it2.next()).intValue()) {
                    case 1:
                        m59350SP(MainApplication.getAppContext(), AbstractC16803z.ic_add_member_white_24);
                        break;
                    case 2:
                        m59350SP(MainApplication.getAppContext(), AbstractC16803z.icn_groupcall);
                        break;
                    case 3:
                        m59350SP(MainApplication.getAppContext(), AbstractC16803z.icn_kho_media);
                        break;
                    case 4:
                        m59350SP(MainApplication.getAppContext(), AbstractC16803z.icn_header_search);
                        break;
                    case 5:
                        m59350SP(MainApplication.getAppContext(), AbstractC16803z.icn_header_voicecall_white);
                        break;
                    case 6:
                        m59350SP(MainApplication.getAppContext(), AbstractC16803z.btn_videocall_white);
                        break;
                }
            }
        }
    }

    /* renamed from: YR */
    public /* synthetic */ void m59390YR(int i11, CameraInputParams cameraInputParams) {
        AbstractC22470k.m116167s(m92676n2(), i11, 0, cameraInputParams);
    }

    /* renamed from: YS */
    public /* synthetic */ void m59391YS() {
        if (this.f56846e3 != 0 && !mo60294yp()) {
            mo60094l7(0, false);
        }
    }

    /* renamed from: ZP */
    private ChatRow m59395ZP() {
        int m9740Y1 = this.f56800T0.m9740Y1();
        int m9745c2 = this.f56800T0.m9745c2();
        if (m9740Y1 >= 0 && m9745c2 >= m9740Y1) {
            while (m9745c2 >= m9740Y1) {
                View mo9732P = this.f56800T0.mo9732P(m9745c2);
                if (mo9732P instanceof ChatRow) {
                    ChatRow chatRow = (ChatRow) mo9732P;
                    if (m59430gR(chatRow)) {
                        return chatRow;
                    }
                }
                m9745c2--;
            }
        }
        return null;
    }

    /* renamed from: ZR */
    public /* synthetic */ void m59396ZR(C17945a0 c17945a0, int i11) {
        try {
            if (!TextUtils.isEmpty(c17945a0.m94983Q3())) {
                CameraInputParams m39199i = CameraInputParams.m39199i(AbstractC23078g6.m118383a(c17945a0.m94983Q3()));
                m39199i.f41130s0 = this.f56784P0.mo60638S2();
                m39199i.f41128r0 = "csc_msgmenu";
                m39199i.f41132t0 = c17945a0.m94974P4();
                m39199i.f41134u0 = c17945a0.m95041W4();
                m39199i.f41136v0 = c17945a0.mo95039W2();
                mo70710wy(new Runnable() { // from class: v50.eb

                    /* renamed from: q */
                    public final /* synthetic */ int f129630q;

                    /* renamed from: r */
                    public final /* synthetic */ CameraInputParams f129631r;

                    public /* synthetic */ RunnableC27628eb(int i112, CameraInputParams m39199i2) {
                        r2 = i112;
                        r3 = m39199i2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.this.m59390YR(r2, r3);
                    }
                });
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_must_download_file_before_edit));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: ZS */
    public /* synthetic */ void m59397ZS() {
        if (this.f56846e3 != 0 && !mo60294yp()) {
            mo60094l7(0, false);
        }
    }

    /* renamed from: aR */
    private boolean m59401aR() {
        if (m92649TI().m92996E0("CHAT_DIALOG_VIEW_203") != null) {
            return true;
        }
        return false;
    }

    /* renamed from: aS */
    public /* synthetic */ void m59402aS(String str, int i11, int i12) {
        mo59990em();
        if (this.f56762I1 != null && !TextUtils.isEmpty(str)) {
            this.f56762I1.m76123v0(str, i11, (this.f56793R1.f60408d.getHeight() - this.f56793R1.f60408d.getPaddingBottom()) - i12, 50.0f, 7);
        }
    }

    /* renamed from: aU */
    private void m59403aU() {
        View view = this.f56788Q0;
        if (view != null) {
            view.setOnDragListener(new View.OnDragListener() { // from class: v50.y7
                public /* synthetic */ ViewOnDragListenerC27908y7() {
                }

                @Override // android.view.View.OnDragListener
                public final boolean onDrag(View view2, DragEvent dragEvent) {
                    boolean m59443iS;
                    m59443iS = ChatView.this.m59443iS(view2, dragEvent);
                    return m59443iS;
                }
            });
        }
        if (this.f56830a3 == null) {
            this.f56830a3 = new C32205z8(this.f56784P0);
        }
        for (View view2 : Arrays.asList(this.f56788Q0, this.f56832b1)) {
            if (view2 != null) {
                AbstractC1579n0.m7835R0(view2, C32205z8.Companion.m155302a(), this.f56830a3);
            }
        }
    }

    /* renamed from: bR */
    private boolean m59407bR() {
        if (getContext() != null && AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.f112032i) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: bS */
    public /* synthetic */ void m59408bS() {
        if (m92662fJ() != null) {
            m92662fJ().m93030Q1();
        }
    }

    /* renamed from: cS */
    public /* synthetic */ void m59411cS() {
        if (this.f56796S0 == null) {
            return;
        }
        this.f56779N2.removeCallbacks(this.f56834b3);
        m60020gQ().mo60793sd(true);
        m60020gQ().mo60726gd(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:            if (p279jw.C21373a.f104231a.m110807w().m110825b() != false) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0031, code lost:            if (am.AbstractC0924m0.m3568X9() == false) goto L54;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:8:0x0035, B:10:0x0040, B:11:0x0059, B:15:0x004c, B:16:0x0050, B:18:0x0054, B:19:0x0011, B:21:0x0019, B:23:0x0021, B:25:0x002d), top: B:1:0x0000 }] */
    /* renamed from: dS */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m59414dS(C7904b c7904b, int i11, boolean z11) {
        PinTopicBanner pinTopicBanner;
        try {
            if (this.f56784P0.mo60624Q7()) {
                if (!AbstractC0924m0.m3539W9()) {
                }
                if (c7904b != null) {
                    m59281IP();
                    if (!this.f56784P0.mo60741i0()) {
                        this.f56772L1.setVisibility(0);
                        this.f56772L1.m48428d0(c7904b, i11, z11);
                    } else {
                        m60267wQ();
                    }
                    this.f56784P0.mo60751jn();
                }
                pinTopicBanner = this.f56772L1;
                if (pinTopicBanner != null) {
                    pinTopicBanner.setVisibility(8);
                }
                this.f56784P0.mo60751jn();
            }
            if (!this.f56784P0.mo60587Jf()) {
                if (this.f56784P0.mo60540Bd()) {
                }
                pinTopicBanner = this.f56772L1;
                if (pinTopicBanner != null) {
                }
                this.f56784P0.mo60751jn();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: eP */
    private boolean m59417eP(String str) {
        int i11;
        SwipeItemListView swipeItemListView;
        if (!this.f56841d2 && !AbstractC31990k7.m154227h(str) && !mo59988eh() && !mo59727Ly() && !mo60249vF() && !m59401aR() && !m59927ZQ() && !m92649TI().m93051Z0("CHAT_DIALOG_VIEW_") && !mo60273x4() && (((i11 = this.f56846e3) == 1 || i11 == 0) && TextUtils.isEmpty(mo59808Rl()) && (swipeItemListView = this.f56796S0) != null && swipeItemListView.getScrollState() == 0 && AbstractC23309i.m122525w0() == 1 && AbstractC23309i.m121415Sc() <= System.currentTimeMillis())) {
            return true;
        }
        return false;
    }

    /* renamed from: eQ */
    public int[] m59418eQ() {
        LiveEmojiButton liveEmojiButton = this.f56839c4;
        if (liveEmojiButton != null) {
            liveEmojiButton.getLocationOnScreen(r2);
            int height = r2[1] + (this.f56839c4.getHeight() / 2);
            int[] iArr = {((iArr[0] + this.f56839c4.getWidth()) - LiveEmojiButton.f70634f0) - (LiveEmojiButton.f70635g0 / 2), height};
            iArr[1] = height - AbstractC23136l9.m118740q0(MainApplication.getAppContext());
            return iArr;
        }
        return null;
    }

    /* renamed from: eR */
    private boolean m59419eR() {
        if (!C31948ha.m153587d().m153595i() && !C31948ha.m153587d().m153596j()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x001f, B:9:0x002a, B:10:0x0043, B:14:0x0036, B:15:0x0011, B:17:0x0019, B:19:0x003a, B:21:0x003e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x001f, B:9:0x002a, B:10:0x0043, B:14:0x0036, B:15:0x0011, B:17:0x0019, B:19:0x003a, B:21:0x003e), top: B:1:0x0000 }] */
    /* renamed from: eS */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m59420eS(C19411c c19411c, int i11, boolean z11) {
        try {
            if (this.f56784P0.mo60624Q7()) {
                if (!AbstractC0924m0.m3539W9()) {
                }
                m59281IP();
                if (this.f56784P0.mo60741i0()) {
                    this.f56772L1.setVisibility(0);
                    this.f56772L1.m48429e0(c19411c, i11, z11);
                } else {
                    m60267wQ();
                }
                this.f56784P0.mo60751jn();
            }
            if (!this.f56784P0.mo60587Jf() || !AbstractC0924m0.m3568X9()) {
                PinTopicBanner pinTopicBanner = this.f56772L1;
                if (pinTopicBanner != null) {
                    pinTopicBanner.setVisibility(8);
                }
                this.f56784P0.mo60751jn();
            }
            m59281IP();
            if (this.f56784P0.mo60741i0()) {
            }
            this.f56784P0.mo60751jn();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: eU */
    private void m59421eU() {
        CameraInputParams m39200j = CameraInputParams.m39200j();
        m39200j.f41138w0 = new SensitiveData("csc_group_rmenu_avatar_camera", "group_avatar");
        AbstractC22470k.m116167s(m92676n2(), 1020, 1, m39200j);
    }

    /* renamed from: fP */
    private boolean m59424fP(boolean z11) {
        if (mo60148ob() || !AbstractC22470k.m116151c()) {
            return false;
        }
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && (chatComposePanelNew.m75576D() || this.f56819X3.m75575C())) {
            return false;
        }
        String[] m118181u = AbstractC23034c6.m118181u();
        if (getContext() != null && AbstractC23034c6.m118167n(getContext(), m118181u) != 0) {
            if (z11) {
                AbstractC23034c6.m118186w0(m92692wK(), m118181u, 111);
            }
            return false;
        }
        return true;
    }

    /* renamed from: fS */
    public /* synthetic */ void m59425fS() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75590T();
        }
    }

    /* renamed from: fT */
    private void m59426fT() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75604r(m60004fQ(), false);
        }
    }

    /* renamed from: gR */
    private boolean m59430gR(ChatRow chatRow) {
        boolean m95278v8;
        if (chatRow instanceof ChatRowMultiPhotos) {
            m95278v8 = ((ChatRowMultiPhotos) chatRow).m61494l4();
        } else {
            m95278v8 = chatRow.getMessage().m95278v8();
        }
        if (m95278v8 && m59282IQ(chatRow)) {
            return true;
        }
        return false;
    }

    /* renamed from: gS */
    public /* synthetic */ void m59431gS() {
        int top;
        if (this.f56792R0 == null) {
            return;
        }
        int m9740Y1 = this.f56800T0.m9740Y1();
        View mo9732P = this.f56800T0.mo9732P(m9740Y1);
        if (mo9732P == null) {
            top = 0;
        } else {
            top = mo9732P.getTop();
        }
        int paddingTop = top - this.f56796S0.getPaddingTop();
        mo60171q5();
        this.f56800T0.m9721B2(m9740Y1, paddingTop);
    }

    /* renamed from: hQ */
    public int m59435hQ(MessageId messageId) {
        List<C28771c> mo60200rp = mo60200rp();
        if (mo60200rp == null) {
            return 0;
        }
        for (C28771c c28771c : mo60200rp) {
            for (int i11 = 0; i11 < c28771c.m143950j().size(); i11++) {
                C17945a0 m143953m = c28771c.m143953m(i11);
                if (m143953m != null) {
                    boolean m94871D7 = m143953m.m94871D7();
                    boolean m95306y8 = m143953m.m95306y8();
                    if ((m94871D7 || m95306y8) && m143953m.m95135f9(messageId)) {
                        return i11;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: hS */
    public /* synthetic */ void m59436hS() {
        mo59706Ka(8);
    }

    /* renamed from: hU */
    private void m59437hU(C17945a0 c17945a0, C20343i c20343i) {
        int i11;
        if (this.f56796S0 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showChatRowOfMessage(");
        sb2.append(c17945a0);
        sb2.append(")");
        int mo59914Yh = mo59914Yh(c17945a0.m95029V3());
        if (mo59914Yh >= 0) {
            if (c20343i != null) {
                if (c20343i.m106063c()) {
                    i11 = 0;
                } else if (c20343i.m106069i()) {
                    i11 = (this.f56796S0.getEstimatedHeight() / 5) - (C29384b.f135890k / 2);
                }
                this.f56796S0.m76941C2(mo59914Yh + m59959cQ(), i11);
            }
            i11 = Integer.MIN_VALUE;
            this.f56796S0.m76941C2(mo59914Yh + m59959cQ(), i11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: iQ */
    private View m59441iQ(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2021862077:
                if (str.equals("tip.search.bysender.entry")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1959007900:
                if (str.equals("tip.zcloud.file.status")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1846653770:
                if (str.equals("tip.csc.voice.to.text")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1742293804:
                if (str.equals("tip.csc.fullscreensticker")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1583123428:
                if (str.equals("tip.csc.mention")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1444933852:
                if (str.equals("tip.group.summary")) {
                    c11 = 5;
                    break;
                }
                break;
            case -1441895916:
                if (str.equals("tip.file_persist.save_file")) {
                    c11 = 6;
                    break;
                }
                break;
            case -1420102874:
                if (str.equals("tip.csc.headername")) {
                    c11 = 7;
                    break;
                }
                break;
            case -1377754772:
                if (str.equals("tip.csc.call")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -1377356632:
                if (str.equals("tip.csc.plus")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -1377274218:
                if (str.equals("tip.csc.send")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -1157425028:
                if (str.equals("tip.csc.nickname")) {
                    c11 = 11;
                    break;
                }
                break;
            case -1130174775:
                if (str.equals("tip.csc.reaction.button")) {
                    c11 = '\f';
                    break;
                }
                break;
            case -1023000389:
                if (str.equals("tip.quickmessage.onboard_done")) {
                    c11 = '\r';
                    break;
                }
                break;
            case -985269459:
                if (str.equals("tip.csc.rightmenu")) {
                    c11 = 14;
                    break;
                }
                break;
            case -949129045:
                if (str.equals("tip.csc.ttl.rightmenu")) {
                    c11 = 15;
                    break;
                }
                break;
            case -941645054:
                if (str.equals("tip.csc.plus.file")) {
                    c11 = 16;
                    break;
                }
                break;
            case -871940571:
                if (str.equals("tip.csc.sticker.emoticon")) {
                    c11 = 17;
                    break;
                }
                break;
            case -675379003:
                if (str.equals("tip.csc.sticker.gif")) {
                    c11 = 18;
                    break;
                }
                break;
            case -649014076:
                if (str.equals("tip.csc.sticker.trending")) {
                    c11 = 19;
                    break;
                }
                break;
            case -523397399:
                if (str.equals("tip.file_persist.download_file")) {
                    c11 = 20;
                    break;
                }
                break;
            case -487737950:
                if (str.equals("tip.csc.sticker.store")) {
                    c11 = 21;
                    break;
                }
                break;
            case -298881273:
                if (str.equals("tip.csc.sticker.ai")) {
                    c11 = 22;
                    break;
                }
                break;
            case -220238999:
                if (str.equals("tip.mycloud.attachment.flow3.step1")) {
                    c11 = 23;
                    break;
                }
                break;
            case -206664817:
                if (str.equals("tip.csc.switch.viewmode.mycloud")) {
                    c11 = 24;
                    break;
                }
                break;
            case -204920476:
                if (str.equals("tip.pinboard.expand")) {
                    c11 = 25;
                    break;
                }
                break;
            case -128753809:
                if (str.equals("tip.csc.sticker")) {
                    c11 = 26;
                    break;
                }
                break;
            case 190187379:
                if (str.equals("tip.csc.liveicon")) {
                    c11 = 27;
                    break;
                }
                break;
            case 238545312:
                if (str.equals("tip.groupcall.csc.group")) {
                    c11 = 28;
                    break;
                }
                break;
            case 240155518:
                if (str.equals("tip.csc.have.request.joingroup")) {
                    c11 = 29;
                    break;
                }
                break;
            case 251492580:
                if (str.equals("tip.csc.photo")) {
                    c11 = 30;
                    break;
                }
                break;
            case 257235940:
                if (str.equals("tip.csc.voice")) {
                    c11 = 31;
                    break;
                }
                break;
            case 262238436:
                if (str.equals("tip.csc.sticker.promotion")) {
                    c11 = ' ';
                    break;
                }
                break;
            case 456730660:
                if (str.equals("tip.community.auto_upgrade")) {
                    c11 = '!';
                    break;
                }
                break;
            case 667264682:
                if (str.equals("tip.mycloud.attachment.flow4.step1")) {
                    c11 = '\"';
                    break;
                }
                break;
            case 667264683:
                if (str.equals("tip.mycloud.attachment.flow4.step2")) {
                    c11 = '#';
                    break;
                }
                break;
            case 725827834:
                if (str.equals("tip.csc.rightmenu.addmember")) {
                    c11 = '$';
                    break;
                }
                break;
            case 743118784:
                if (str.equals("tip.attachment.promotetool")) {
                    c11 = '%';
                    break;
                }
                break;
            case 897562730:
                if (str.equals("tip.csc.reaction.add")) {
                    c11 = '&';
                    break;
                }
                break;
            case 1118471464:
                if (str.equals("tip.csc.rightmenu.groupboard")) {
                    c11 = '\'';
                    break;
                }
                break;
            case 1139900623:
                if (str.equals("tip.csc.rightmenu.setalias")) {
                    c11 = '(';
                    break;
                }
                break;
            case 1286169602:
                if (str.equals("tip.csc.plus.hd")) {
                    c11 = ')';
                    break;
                }
                break;
            case 1314314285:
                if (str.equals("tip.csc.addmember")) {
                    c11 = '*';
                    break;
                }
                break;
            case 1455495739:
                if (str.equals("tip.csc.plus.location")) {
                    c11 = '+';
                    break;
                }
                break;
            case 1883306292:
                if (str.equals("tip.csc.sharedtimeline")) {
                    c11 = ',';
                    break;
                }
                break;
            case 1914687332:
                if (str.equals("tip.long.hold.voice.icon.onboarding")) {
                    c11 = '-';
                    break;
                }
                break;
            case 1916496651:
                if (str.equals("tip.csc.videocall")) {
                    c11 = '.';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                ChatSearchToolbarView chatSearchToolbarView = this.f56869k2;
                if (chatSearchToolbarView == null) {
                    return null;
                }
                return chatSearchToolbarView.getMBtnOpenSearchBySender();
            case 1:
                if (this.f56784P0.mo60540Bd()) {
                    if (this.f56784P0.getCurrMyCloudChatMode() == C11598e.e.f60096p) {
                        return m59395ZP();
                    }
                    return this.f56793R1.m64829x0().getFirstCompletelyVisibleOutCloudBubble();
                }
                return m59395ZP();
            case 2:
                return m59457kQ(str, false);
            case 3:
            case 19:
            case 22:
            case 26:
                return this.f56836c1;
            case 4:
                return this.f56814W2;
            case 5:
                ChatInfoView chatInfoView = this.f56812W0;
                if (chatInfoView != null) {
                    return chatInfoView.m65196uM(67);
                }
                return null;
            case 6:
            case '\f':
            case 20:
            case '&':
                return m59449jQ(str);
            case 7:
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    return actionBar.getSubtitleTextView();
                }
                return null;
            case '\b':
                return this.f56878m3;
            case '\t':
            case '%':
                return this.f56806U2;
            case '\n':
                return this.f56802T2;
            case 11:
                ChatInfoView chatInfoView2 = this.f56812W0;
                if (chatInfoView2 != null) {
                    return chatInfoView2.m65196uM(23);
                }
                return null;
            case '\r':
                return this.f56832b1;
            case 14:
            case 15:
            case 29:
            case '\'':
                return this.f56874l3;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return this.f56819X3.getQuickPickerView().m71273lM(11);
            case 17:
                ChatComposePanelNew chatComposePanelNew = this.f56819X3;
                if (chatComposePanelNew != null) {
                    return chatComposePanelNew.getEmojiIndicatorViewInPanel();
                }
                return null;
            case 18:
                ChatComposePanelNew chatComposePanelNew2 = this.f56819X3;
                if (chatComposePanelNew2 != null) {
                    return chatComposePanelNew2.getSearchGifIndicatorViewInPanel();
                }
                return null;
            case 21:
                ChatComposePanelNew chatComposePanelNew3 = this.f56819X3;
                if (chatComposePanelNew3 != null) {
                    return chatComposePanelNew3.getBtnStickerStoreViewInPanel();
                }
                return null;
            case 23:
            case '#':
                return this.f56819X3.getQuickPickerView().m71273lM(24);
            case 24:
                return this.f56902s3;
            case 25:
                return this.f56772L1;
            case 27:
                LiveEmojiButton liveEmojiButton = this.f56839c4;
                if (liveEmojiButton == null) {
                    return null;
                }
                return liveEmojiButton.getEmojiView();
            case 28:
                return this.f56898r3;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                return this.f56798S2;
            case 31:
            case '-':
                return this.f56810V2;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                ChatComposePanelNew chatComposePanelNew4 = this.f56819X3;
                if (chatComposePanelNew4 != null) {
                    return chatComposePanelNew4.getDisplayingStickerCateMoreViewInPanel();
                }
                return null;
            case '!':
                return this.f88760a0;
            case '\"':
                return this.f56806U2;
            case '$':
                ChatInfoView chatInfoView3 = this.f56812W0;
                if (chatInfoView3 != null) {
                    return chatInfoView3.m65198vM(60);
                }
                return null;
            case '(':
                ChatInfoView chatInfoView4 = this.f56812W0;
                if (chatInfoView4 != null) {
                    return chatInfoView4.m65196uM(45);
                }
                return null;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                ChatComposePanelNew chatComposePanelNew5 = this.f56819X3;
                if (chatComposePanelNew5 != null && chatComposePanelNew5.m75575C() && this.f56819X3.getQuickPickerView() != null) {
                    return this.f56819X3.getQuickPickerView().m71270hM();
                }
                ChatInputBar chatInputBar = this.f56824Z0;
                if (chatInputBar == null) {
                    return null;
                }
                return chatInputBar.getCbHQ();
            case '*':
                return this.f56886o3;
            case '+':
                return this.f56819X3.getQuickPickerView().m71273lM(13);
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                ChatInfoView chatInfoView5 = this.f56812W0;
                if (chatInfoView5 != null) {
                    return chatInfoView5.m65196uM(25);
                }
                return null;
            case '.':
                return this.f56882n3;
            default:
                return null;
        }
    }

    /* renamed from: iR */
    public /* synthetic */ void m59442iR(C16719g c16719g) {
        this.f56784P0.mo60660Wg();
    }

    /* renamed from: iS */
    public /* synthetic */ boolean m59443iS(View view, DragEvent dragEvent) {
        C11621p0 c11621p0;
        int action = dragEvent.getAction();
        if (action != 1) {
            if (action != 4) {
                return false;
            }
            C11621p0 c11621p02 = this.f56793R1;
            if (c11621p02 != null) {
                c11621p02.m64710C0();
            }
            return true;
        }
        if (this.f56784P0.mo64111Jm() && (c11621p0 = this.f56793R1) != null) {
            c11621p0.m64788j3();
        }
        return true;
    }

    /* renamed from: iT */
    public void m59444iT() {
        try {
            m59790QT(false);
            this.f56820Y0 = null;
            mo59702KH("MessageContextMenuView");
            this.f56796S0.requestDisallowInterceptTouchEvent(false);
            C11603g0 c11603g0 = this.f56792R0;
            if (c11603g0 != null) {
                c11603g0.m64557a2();
                mo59806Rh();
            }
            this.f56793R1.m64757a2();
            m59236BT();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: jP */
    private void m59448jP() {
        ArrayList arrayList = AbstractC23304d.f113413n;
        if (arrayList.size() == 0) {
            return;
        }
        try {
            for (C20568e c20568e : new ArrayList(arrayList)) {
                if (c20568e != null && c20568e.m107020d().equals(this.f56784P0.mo60615Oc().m17944I0())) {
                    mo59755Nw(c20568e.m107018b(), c20568e.m107020d(), c20568e.m107023g(), c20568e.m107021e());
                }
            }
            AbstractC23304d.f113413n.clear();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: jQ */
    private View m59449jQ(String str) {
        return m59457kQ(str, true);
    }

    /* renamed from: jR */
    public /* synthetic */ void m59450jR(int i11, C16719g c16719g) {
        if (i11 == 0) {
            this.f56784P0.mo60804tl();
        } else if (i11 == 1) {
            this.f56784P0.mo60529A4();
        }
    }

    /* renamed from: jS */
    public /* synthetic */ void m59451jS(View view) {
        this.f56784P0.mo60555E8();
        mo59656Gk(200L);
    }

    /* renamed from: jT */
    private void m59452jT() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75587Q();
        }
    }

    /* renamed from: kP */
    private void m59456kP(boolean z11) {
        if (!mo60124n3() && this.f56812W0 == null) {
            m59240CQ(z11);
            m59622EQ(m60020gQ().mo60615Oc());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: kQ */
    private View m59457kQ(String str, boolean z11) {
        InterfaceC11475g0 interfaceC11475g0;
        C17945a0 message;
        int m9740Y1 = this.f56800T0.m9740Y1();
        int m9745c2 = this.f56800T0.m9745c2();
        if (m9740Y1 >= 0 && m9745c2 >= m9740Y1) {
            if (!z11 || m9745c2 == this.f56800T0.m10127i() - 1) {
                while (m9745c2 >= 0 && m9745c2 >= m9740Y1) {
                    View mo9732P = this.f56800T0.mo9732P(m9745c2);
                    if ((mo9732P instanceof InterfaceC11475g0) && (message = (interfaceC11475g0 = (InterfaceC11475g0) mo9732P).getMessage()) != null) {
                        if (!"tip.csc.reaction.add".equals(str) && !"tip.csc.reaction.button".equals(str)) {
                            if ("tip.file_persist.download_file".equals(str)) {
                                if (C23594g.f114421a.m123699l(message)) {
                                    return mo9732P;
                                }
                            } else if ("tip.file_persist.save_file".equals(str)) {
                                if (C23594g.f114421a.m123700m(message)) {
                                    return mo9732P;
                                }
                            } else if ("tip.csc.voice.to.text".equals(str) && C20529b.f100835a.m106662m(message)) {
                                return mo9732P;
                            }
                        } else if (message.m95144g8() && !message.m95032V6() && (!"tip.csc.reaction.button".equals(str) || interfaceC11475g0.getReactionRect() != null)) {
                            return mo9732P;
                        }
                    }
                    m9745c2--;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: kR */
    public /* synthetic */ void m59458kR(int i11, C16719g c16719g) {
        if (i11 == 0) {
            this.f56784P0.mo60639Sg();
        } else if (i11 == 1) {
            this.f56784P0.mo60788r5();
        }
    }

    /* renamed from: kS */
    public /* synthetic */ void m59459kS(C17945a0 c17945a0, View view) {
        this.f56784P0.mo60694bn(c17945a0.m95029V3());
    }

    /* renamed from: kT */
    public void m59460kT() {
        C23744a.m124114c().m124117e(this, 74);
        mo59915Yi();
        m59277HU();
    }

    /* renamed from: lR */
    public /* synthetic */ void m59464lR() {
        this.f56885o2 = null;
        mo59806Rh();
    }

    /* renamed from: lS */
    public /* synthetic */ void m59465lS() {
        this.f56756G3.m65426a();
    }

    /* renamed from: lU */
    public void m59466lU() {
        try {
            if (!this.f56831a4) {
                ObjectAnimator.ofFloat((ImageView) this.f56793R1.f60408d.m59158B0(), "alpha", 0.0f, 1.0f).start();
                this.f56831a4 = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: mR */
    public /* synthetic */ void m59470mR(int i11) {
        boolean z11;
        ChatInputBar chatInputBar;
        if (i11 != 0) {
            boolean z12 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 && (chatInputBar = this.f56824Z0) != null) {
                        chatInputBar.m65395M();
                        InterfaceC11320c interfaceC11320c = this.f56784P0;
                        if (interfaceC11320c != null) {
                            if (interfaceC11320c.mo60547Cd() == 2) {
                                this.f56824Z0.setBlockedChatTypeLimitReplyStranger(C29583g.f136521a.m146997i(this.f56784P0.mo60615Oc().m17944I0()));
                                return;
                            } else {
                                if (this.f56784P0.mo60547Cd() == 4) {
                                    this.f56824Z0.setBlockedChat(C21914b.f107731a.m114200k(this.f56784P0.mo60615Oc().m17944I0()));
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (this.f56824Z0 != null) {
                    C31973j5 m4473g = C0943w.m4462l().m4473g(this.f56789Q1.m153888F().m17944I0());
                    ChatInputBar chatInputBar2 = this.f56824Z0;
                    if (m4473g != null && m4473g.m153747Y()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatInputBar2.m65396N(z11);
                    InterfaceC11320c interfaceC11320c2 = this.f56784P0;
                    if (interfaceC11320c2 != null) {
                        if (interfaceC11320c2.mo60547Cd() == 1) {
                            C32058p1 m132048j = C25489b.f122105a.m132048j(AbstractC25495a.m132076a(this.f56784P0.getGroupId()));
                            if (m132048j == null || !m132048j.m154671e().m153747Y()) {
                                z12 = false;
                            }
                            this.f56824Z0.setCannotChatTypeDeletedGroup(z12);
                            return;
                        }
                        if (this.f56784P0.mo60547Cd() == 3) {
                            this.f56824Z0.setCannotChatTextInChatInput(AbstractC23136l9.m118743r0(AbstractC8020f0.str_description_lock_chat_bar_banned_account));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ChatInputBar chatInputBar3 = this.f56824Z0;
            if (chatInputBar3 != null) {
                chatInputBar3.m65398P();
                return;
            }
            return;
        }
        ChatInputBar chatInputBar4 = this.f56824Z0;
        if (chatInputBar4 != null) {
            chatInputBar4.m65397O();
        }
    }

    /* renamed from: mS */
    public /* synthetic */ void m59471mS(C17945a0 c17945a0, View view) {
        this.f56784P0.mo60797sl(c17945a0.m95029V3());
    }

    /* renamed from: mT */
    private void m59472mT(int i11, C24696p c24696p) {
        if (i11 == 100) {
            new C24699s(this.f56784P0.mo60615Oc().m17944I0(), c24696p, new C11286i0()).m128270d();
        }
    }

    /* renamed from: nR */
    public /* synthetic */ void m59476nR() {
        try {
            mo59806Rh();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: nS */
    public /* synthetic */ void m59477nS(C17945a0 c17945a0, View view) {
        this.f56784P0.mo60797sl(c17945a0.m95029V3());
    }

    /* renamed from: nU */
    private void m59478nU() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64734L2(true);
            AbstractC2379w.m12430d(this.f56788Q0);
            mo59922Z6();
            m92649TI().mo89693h2(this.f56872l1, "LandingPageViewTag", 2, true);
            mo59916Ym();
        }
    }

    /* renamed from: oP */
    private void m59482oP(boolean z11) {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (this.f56784P0.mo60566G5(m92642L3.getString("postAction"), z11)) {
                m92642L3.remove("postAction");
            }
        }
    }

    /* renamed from: oR */
    public static /* synthetic */ void m59483oR() {
        try {
            C23744a.m124114c().m124116d(2, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: oS */
    public /* synthetic */ void m59484oS(View view) {
        this.f56784P0.mo60561Ff();
    }

    /* renamed from: pR */
    public /* synthetic */ boolean m59488pR(View view, MotionEvent motionEvent) {
        this.f56750F1 = System.currentTimeMillis();
        return false;
    }

    /* renamed from: pS */
    public /* synthetic */ void m59489pS(View view) {
        this.f56784P0.mo60598L7();
        mo59656Gk(200L);
    }

    /* renamed from: qP */
    private void m59493qP() {
        this.f56793R1.m64715E0();
        mo60028gz();
        this.f56793R1.m64808p3(false);
        this.f56793R1.m64804o3(false);
    }

    /* renamed from: qQ */
    private void m59494qQ(Intent intent) {
        this.f56784P0.mo60815up(intent.getIntExtra("maxUsers", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE));
    }

    /* renamed from: qR */
    public /* synthetic */ boolean m59495qR(TextView textView, int i11, KeyEvent keyEvent) {
        if (mo60172qA()) {
            return false;
        }
        if (i11 != 6 && i11 != 4 && (i11 != 0 || keyEvent.getKeyCode() != 66 || !AbstractC23309i.m121699a0())) {
            return false;
        }
        this.f56784P0.mo60539Bc();
        return true;
    }

    /* renamed from: qS */
    public /* synthetic */ void m59496qS(MessageId messageId, View view) {
        this.f56784P0.mo60600Li(messageId);
    }

    /* renamed from: rP */
    private void m59500rP() {
        if (!mo59892Wz() && !this.f56793R1.m64806p1()) {
            this.f56784P0.mo60602M5();
        }
        mo60152os();
        mo59677Hq();
        mo60028gz();
        this.f56793R1.m64808p3(false);
        this.f56793R1.m64804o3(false);
        m60290yQ(false);
        m59705KT(mo60215sw());
    }

    /* renamed from: rR */
    public /* synthetic */ void m59501rR() {
        this.f56784P0.mo60831wo();
    }

    /* renamed from: rS */
    public /* synthetic */ void m59502rS(C17945a0 c17945a0, View view) {
        this.f56784P0.mo60810ub(c17945a0);
    }

    /* renamed from: sP */
    private void m59506sP() {
        if (!mo59892Wz() && !this.f56793R1.m64806p1()) {
            this.f56784P0.mo60602M5();
        }
        this.f56793R1.m64715E0();
        this.f56793R1.m64808p3(false);
        this.f56793R1.m64804o3(false);
        m60290yQ(false);
    }

    /* renamed from: sR */
    public /* synthetic */ void m59507sR(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
        ZaloView zaloView2;
        if (zaloView == null) {
            zaloView2 = this;
        } else {
            zaloView2 = zaloView;
        }
        m60291yT(zaloView2, str, i11, str2, h0Var, str3, f0Var, c31877d);
    }

    /* renamed from: sS */
    public /* synthetic */ void m59508sS() {
        this.f56764I3.m65439a();
    }

    /* renamed from: tP */
    private void m59512tP() {
        this.f56793R1.m64808p3(false);
        this.f56793R1.m64804o3(this.f56924y1);
    }

    /* renamed from: tR */
    public static /* synthetic */ int m59513tR(C7907e.a aVar, C7907e.a aVar2) {
        int i11 = aVar.f42795e;
        int i12 = aVar2.f42795e;
        if (i11 == i12) {
            return 0;
        }
        if (i11 < i12) {
            return -1;
        }
        return 1;
    }

    /* renamed from: tS */
    public /* synthetic */ void m59514tS(InterfaceC17463d interfaceC17463d, int i11) {
        this.f56784P0.mo60656W4(true, C20336b.m106034a());
    }

    /* renamed from: uP */
    private void m59518uP() {
        if (!mo59892Wz() && !this.f56793R1.m64806p1()) {
            this.f56784P0.mo60602M5();
        }
        this.f56793R1.m64715E0();
        this.f56793R1.m64808p3(false);
        this.f56793R1.m64804o3(false);
        m60290yQ(false);
    }

    /* renamed from: uQ */
    public void m59519uQ() {
        try {
            if (this.f56831a4) {
                this.f56793R1.f60408d.m59185Y();
                this.f56831a4 = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: uR */
    public /* synthetic */ void m59520uR(View view) {
        mo37491QJ(R.id.home);
    }

    /* renamed from: uS */
    public static /* synthetic */ void m59521uS(CheckBox checkBox, View view) {
        try {
            checkBox.setChecked(!checkBox.isChecked());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: uT */
    private void m59522uT() {
        if (m92662fJ() != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_is_from_e2ee_conversation", m60020gQ().mo60663X1());
            m92662fJ().m93069k2(BottomSheetReportAttachMsgTypeDetail.class, bundle, 2, true);
        }
    }

    /* renamed from: uU */
    private boolean m59523uU(C28212v6 c28212v6) {
        if (c28212v6 != null) {
            try {
                if (!TextUtils.isEmpty(c28212v6.f131581g)) {
                    this.f56732A3 = true;
                    this.f56793R1.m64793l3(c28212v6.f131581g, new View.OnClickListener() { // from class: v50.j9
                        public /* synthetic */ ViewOnClickListenerC27700j9() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ChatView.this.m59284IS(view);
                        }
                    });
                    if (c28212v6.f131592r > 0) {
                        Runnable runnable = this.f56930z3;
                        if (runnable == null) {
                            this.f56930z3 = new Runnable() { // from class: v50.k9
                                public /* synthetic */ RunnableC27714k9() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChatView.this.m59293JS();
                                }
                            };
                        } else {
                            this.f56779N2.removeCallbacks(runnable);
                        }
                        this.f56779N2.postDelayed(this.f56930z3, c28212v6.f131592r * 1000);
                    }
                    return true;
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: vP */
    private void m59527vP() {
        if (!mo59892Wz() && !this.f56793R1.m64806p1()) {
            this.f56784P0.mo60602M5();
        }
        this.f56793R1.m64715E0();
        this.f56793R1.m64808p3(false);
        this.f56793R1.m64804o3(false);
        m60290yQ(false);
    }

    /* renamed from: vQ */
    private void m59528vQ() {
        PageMenuView pageMenuView = this.f56840d1;
        if (pageMenuView != null) {
            pageMenuView.m65418f();
        }
    }

    /* renamed from: vR */
    public /* synthetic */ boolean m59529vR(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 3) {
            mo60026gi();
            return true;
        }
        return false;
    }

    /* renamed from: vS */
    public static /* synthetic */ void m59530vS(CheckBox checkBox, View view) {
        try {
            checkBox.setChecked(!checkBox.isChecked());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: vT */
    public void m59531vT(ImageView imageView, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(imageView, "scaleX", f11), ObjectAnimator.ofFloat(imageView, "scaleY", f11));
        animatorSet.start();
    }

    /* renamed from: wR */
    public /* synthetic */ boolean m59535wR(View view, int i11, KeyEvent keyEvent) {
        if (i11 != 67 || keyEvent.getAction() != 0 || this.f56865j2.getSelectionStart() != 0 || this.f56865j2.getSelectionEnd() != 0 || !this.f56784P0.mo60800t9()) {
            return false;
        }
        this.f56784P0.mo60819va(1);
        this.f56784P0.mo60579Id(0);
        return true;
    }

    /* renamed from: wS */
    public /* synthetic */ void m59536wS(String str, CheckBox checkBox, int i11, CheckBox checkBox2, InterfaceC17463d interfaceC17463d, int i12) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (str != null) {
            if (checkBox.isChecked()) {
                this.f56784P0.mo60818v7(str);
            } else {
                this.f56784P0.mo60655Vn(str, i11);
            }
            if (checkBox2.isChecked()) {
                this.f56784P0.mo60753k8(str);
            }
        }
    }

    /* renamed from: wT */
    private void m59537wT(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26 && mo60124n3() && this.f56846e3 == 1) {
            mo59706Ka(2);
        }
        mo59714LA();
        mo60056iu(115, bundle);
    }

    /* renamed from: wU */
    private void m59538wU(Class cls, Bundle bundle, int i11) {
        m60278xU(cls, bundle, 0, i11, true);
    }

    /* renamed from: xP */
    private boolean m59542xP() {
        C11621p0 c11621p0;
        if (!m92672lJ() || mo60273x4() || !this.f56793R1.m64752X0() || this.f56793R1.m64798n1()) {
            return false;
        }
        if (this.f56784P0.mo60540Bd()) {
            if (!C16805b.m89786h().m89809x()) {
                return false;
            }
            if ((AbstractC0924m0.m4401zb() && AbstractC0924m0.m2903Ab()) || !mo59694Jp()) {
                return false;
            }
            if (this.f56784P0.getCurrMyCloudChatMode() == C11598e.e.f60096p && m59852UQ()) {
                return false;
            }
            if ((this.f56784P0.getCurrMyCloudChatMode() == C11598e.e.f60097q && (c11621p0 = this.f56793R1) != null && c11621p0.m64829x0() != null && this.f56793R1.m64829x0().m70157R0()) || AbstractC23306f.m120602N0().m109059L0()) {
                return false;
            }
        } else {
            if (!AbstractC3489d.m17501i()) {
                return false;
            }
            if (AbstractC0924m0.m4401zb() && AbstractC0924m0.m2903Ab() && AbstractC0924m0.m2932Bb()) {
                return false;
            }
        }
        return this.f56784P0.mo60816v5("tip.zcloud.file.status");
    }

    /* renamed from: xR */
    public static /* synthetic */ boolean m59543xR(View view, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: xS */
    public /* synthetic */ void m59544xS(Bundle bundle) {
        mo60056iu(205, bundle);
    }

    /* renamed from: yP */
    private void m59548yP(MessageId messageId) {
        C32596l.b m65327e;
        C32596l.c.C33080c m157839b;
        try {
            if (mo59907YG()) {
                Set<ChatAttachmentContainer.C11728c> mediaAttachment = this.f56856h1.getMediaAttachment();
                if (mediaAttachment == null) {
                    return;
                }
                for (ChatAttachmentContainer.C11728c c11728c : mediaAttachment) {
                    if (c11728c != null) {
                        int m65330h = c11728c.m65330h();
                        if (m65330h != 1 && m65330h != 2) {
                            if (m65330h != 4) {
                                if (m65330h != 6) {
                                    if (m65330h == 7 && ((m65327e = c11728c.m65327e()) == null || (m157839b = m65327e.m157839b()) == null || TextUtils.isEmpty(m157839b.m157851f()))) {
                                        this.f56856h1.m65320k(c11728c);
                                    }
                                }
                            } else if (c11728c.m65329g().m95689f().equals(messageId)) {
                                this.f56856h1.m65320k(c11728c);
                            }
                        }
                        String m65326d = c11728c.m65326d();
                        String str = AbstractC23204s0.m119554e().getPath() + "/";
                        if (AbstractC23238v2.m119727l() && m65326d.contains(str) && !AbstractC23041d2.m118194A(m65326d)) {
                            ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_deleted));
                            this.f56856h1.m65320k(c11728c);
                        }
                    }
                }
            }
            String mo59611Dd = mo59611Dd();
            if (!TextUtils.isEmpty(mo59611Dd)) {
                String str2 = AbstractC23204s0.m119554e().getPath() + "/";
                if (AbstractC23238v2.m119727l() && mo59611Dd.contains(str2) && !new C20556f(mo59611Dd).m106830b()) {
                    ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_deleted));
                    this.f56832b1.setText("");
                    mo59943b6();
                    mo60133na();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: yR */
    public /* synthetic */ void m59549yR(String str) {
        new C0766k().mo1705o9(Long.parseLong(str), m60020gQ().mo60615Oc().m17944I0(), 3, "", 100, AbstractC23304d.f113432r2);
    }

    /* renamed from: yS */
    public /* synthetic */ void m59550yS(List list, View view) {
        long max = Math.max(0L, C23793c.m124316k().mo124319c() - C31950hc.f146830a.m153641s());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dur", max);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        C31950hc.f146830a.m153638L("csc_msgmenu", 0, "msg_chat_delete_undo", list, jSONObject.toString());
        this.f56773L2.m90655n();
        m59222A();
    }

    /* renamed from: yU */
    public void m59551yU() {
        C3545m c3545m;
        if (this.f56741C4.get() && this.f56789Q1 != null && this.f56784P0.mo60837xo() && !mo59878W5() && !this.f56749E4 && (c3545m = this.f56745D4) != null && c3545m.m18018d() != null && this.f56745D4.m18018d().mo2737a() != null) {
            mo70710wy(new Runnable() { // from class: v50.z8
                public /* synthetic */ RunnableC27923z8() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59314MS();
                }
            });
        }
    }

    /* renamed from: zP */
    private void m59555zP() {
        try {
            if (!m59419eR()) {
                m59609DU();
            }
            C20543p.f100876a.m106746K();
            AbstractC23306f.m120562A().m2546l(m60020gQ().mo60615Oc().m17944I0());
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl != null) {
                abstractPushToTalkControl.mo87659l(false);
            }
            this.f56779N2.removeMessages(12342);
            this.f56779N2.removeMessages(12343);
            this.f56779N2.removeMessages(12344);
            this.f56779N2.removeMessages(12345);
            this.f56779N2.removeMessages(123456);
            this.f56866j3 = null;
            AbstractC23304d.f113413n.clear();
            this.f56900s1 = null;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: zQ */
    private void m59556zQ() {
        if (this.f56856h1 == null) {
            ChatAttachmentContainer m59203r = this.f56793R1.f60408d.m59203r();
            this.f56856h1 = m59203r;
            m59203r.setAttachmentListener(new C11295n());
        }
    }

    /* renamed from: zR */
    public /* synthetic */ void m59557zR(int i11, boolean z11, List list, List list2) {
        boolean z12;
        InterfaceC11320c interfaceC11320c = this.f56784P0;
        boolean z13 = false;
        if (i11 == -1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i11 == AbstractC23304d.f113392h2) {
            z13 = true;
        }
        interfaceC11320c.mo60621Ph(z12, z13, z11, list, list2);
    }

    /* renamed from: zS */
    public /* synthetic */ void m59558zS(String str) {
        IntroMyCloudQuickPickerView m72557a = IntroMyCloudQuickPickerView.Companion.m72557a(str);
        m92649TI().m93060e2(0, m72557a, m72557a.m72556qL(), 0, false);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: A2 */
    public boolean mo59559A2() {
        return this.f56782O2.m74707p();
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.AnimReactionCounterView.InterfaceC13727d
    /* renamed from: A3 */
    public void mo59560A3(int i11, int i12) {
        this.f56784P0.mo60528A3(i11, i12);
    }

    @Override // com.zing.zalo.p077ui.zviews.RequestLocationView.InterfaceC14962b
    /* renamed from: AB */
    public void mo59561AB(RequestLocationView requestLocationView, int i11, Location location) {
        double d11;
        double d12;
        try {
            if (m92676n2() != null && !m92676n2().isFinishing()) {
                String str = "";
                if (requestLocationView != null && requestLocationView.m83769gM() != null) {
                    str = requestLocationView.m83769gM();
                }
                String str2 = str;
                if (i11 == 0 && location != null) {
                    double longitude = location.getLongitude();
                    d11 = location.getLatitude();
                    d12 = longitude;
                } else {
                    d11 = 200.0d;
                    d12 = 200.0d;
                }
                this.f56784P0.mo60538Ba(str2, i11, d12, d11);
                this.f56793R1.m64726I0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: AI */
    public void mo59562AI() {
        this.f56779N2.post(new Runnable() { // from class: v50.o9
            public /* synthetic */ RunnableC27770o9() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59340QS();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: AJ */
    public void mo59563AJ() {
        C11826a.b bVar;
        ChatThemePhotoRow chatThemePhotoRow;
        super.mo59563AJ();
        try {
            C11621p0 c11621p0 = this.f56793R1;
            if (c11621p0.f60417h0 && (bVar = (C11826a.b) c11621p0.f60397V.f61524p.m9900t0(0)) != null && (chatThemePhotoRow = bVar.f61549I) != null && chatThemePhotoRow.getParent() != null) {
                bVar.f61549I.m65714g(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: AP */
    public void m59564AP() {
        boolean z11;
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null) {
            if (this.f56846e3 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            abstractPushToTalkControl.mo87659l(z11);
            this.f56793R1.f60408d.removeView(this.f56860i1);
            this.f56793R1.f60408d.f56702n0 = null;
            this.f56860i1 = null;
        }
    }

    /* renamed from: AT */
    public void m59565AT() {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65164MM();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ad */
    public void mo59566Ad() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75576D()) {
            this.f56819X3.setMode(0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ae */
    public void mo59567Ae(String str, ArrayList arrayList) {
        if (m59312MQ()) {
            this.f56793R1.m64829x0().m70179f1(str, arrayList);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ah */
    public void mo59568Ah() {
        boolean z11;
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            ChatInputBar chatInputBar = this.f56824Z0;
            if (chatInputBar != null && chatInputBar.getCbHQ().isChecked()) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatComposePanelNew.m75601h0(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ai */
    public void mo59569Ai() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("STR_SOURCE_START_VIEW", "csc_attach");
            bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
            m60278xU(DrawDoodleView.class, bundle, 1004, 1, true);
            AbstractC23647d.m123898h("9173", mo60287y());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ar */
    public void mo59570Ar(C17988o1 c17988o1) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64706A3(c17988o1);
            this.f56784P0.mo60602M5();
            mo60152os();
            mo59677Hq();
            m60290yQ(true);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Av */
    public void mo59571Av(int i11, String str, ActionLogChatLocation.FooterLogData footerLogData) {
        try {
            SensitiveData sensitiveData = new SensitiveData("csc_share_location", "comm_csc");
            int i12 = 0;
            if (C8967m.f47923r) {
                C11296n0 c11296n0 = new C11296n0();
                if (this.f56924y1) {
                    mo59706Ka(0);
                }
                ShareLocationWithMapView shareLocationWithMapView = new ShareLocationWithMapView();
                shareLocationWithMapView.m72065nM(c11296n0);
                Bundle bundle = new Bundle();
                bundle.putString("extra_conversation_id", m60020gQ().mo60615Oc().m17944I0());
                shareLocationWithMapView.mo60305zK(bundle);
                bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
                bundle.putParcelable("EXTRA_FOOTER_LOG_DATA", footerLogData);
                bundle.putString("STR_SOURCE_START_VIEW", str);
                bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
                shareLocationWithMapView.m72061jM(sensitiveData);
                mo59922Z6();
                m92693xK().mo93055b2(AbstractC6918a0.zalo_view_container, shareLocationWithMapView, bundle, 0, "LOCATION_PICKER_VIEW_TAG", 1, true);
                this.f56854g3 = shareLocationWithMapView;
                return;
            }
            int m122007i5 = AbstractC23309i.m122007i5(m92689tK());
            ChatInputBar chatInputBar = this.f56824Z0;
            if (chatInputBar != null) {
                i12 = chatInputBar.getHeight();
            }
            ShareLocationChatPickerView m84327oL = ShareLocationChatPickerView.m84327oL(m60020gQ().mo60615Oc().m17944I0(), m122007i5 + i12, new C11298o0(), sensitiveData);
            mo59922Z6();
            m92649TI().m93060e2(0, m84327oL, "LOCATION_PICKER_VIEW_TAG", 0, false);
            this.f56854g3 = m84327oL;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
    /* renamed from: B5 */
    public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
        boolean z11;
        if (c31862c != null && c31862c.m153153e()) {
            this.f56784P0.mo60536B3(c31862c);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("action.window.close")) {
                if (!z11 && c31862c != null) {
                    C0815e1.m2075D().m2092K(c31862c, str, 3);
                    this.f56784P0.mo60536B3(c31862c);
                    return;
                }
                return;
            }
            C31877d c31877d = new C31877d();
            if (str.equals("action.change.alias")) {
                Bundle bundle = new Bundle();
                bundle.putInt("INT_ACTION_FROM", 696);
                c31877d.m153185d(bundle);
            } else if (str.equals("open.save.phonenumber")) {
                if (!(m60100lQ() instanceof GroupLiveStreamView) && !this.f56905t2) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("action.open.save.phonenumber.openby", 0);
                    c31877d.m153185d(bundle2);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_save_to_contact_when_live_stream));
                    return;
                }
            }
            if (c31862c != null) {
                C0815e1.m2075D().m2092K(c31862c, str, i11);
            }
            c31877d.m153187f(new TrackingSource((short) 1001));
            mo60271wv(str, str2, null, c31877d);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: B6 */
    public void mo59572B6() {
        if (mo60301zB() || mo59778Pu()) {
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl != null) {
                abstractPushToTalkControl.setRecordCancelled(true);
                this.f56860i1.setFreeHandMode(false);
            }
            m59973dP();
        }
        AbstractPushToTalkControl abstractPushToTalkControl2 = this.f56860i1;
        if (abstractPushToTalkControl2 instanceof PushToTalkSpeechToText) {
            ((PushToTalkSpeechToText) abstractPushToTalkControl2).m87979G0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: BB */
    public void mo59573BB(boolean z11) {
        int i11;
        MyCloudQuotaBanner myCloudQuotaBanner = this.f56828a1;
        if (myCloudQuotaBanner != null) {
            if (z11 && !mo59988eh() && mo59694Jp() && m59258FQ(this.f56828a1.getBannerCurrentState())) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            myCloudQuotaBanner.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: BD */
    public void mo59574BD(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("vipUid", str);
        m60278xU(BroadcastMsgToFriendsView.class, bundle, 10010, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: BE */
    public void mo59575BE() {
        if (this.f56839c4 != null) {
            this.f56793R1.f60408d.m59206s0();
            this.f56839c4 = null;
        }
    }

    /* renamed from: BP */
    public void m59576BP() {
        try {
            mo59580Bi();
            this.f56916w1 = false;
            if (this.f56884o1.f130047E) {
                AbstractC23647d.m123897g("5801124");
            }
            if (!this.f56799S3) {
                this.f56799S3 = true;
                AbstractC23647d.m123897g("5801140");
            }
            this.f56779N2.postDelayed(new Runnable() { // from class: v50.fa
                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.m59483oR();
                }
            }, 200L);
            this.f56784P0.mo60816v5("tip.any");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: BU */
    public void m59577BU(String str, Bundle bundle, int i11, int i12) {
        if (this.f56924y1) {
            mo60026gi();
            return;
        }
        if (System.currentTimeMillis() - this.f56750F1 < 1000) {
            return;
        }
        this.f56779N2.postDelayed(new Runnable() { // from class: v50.sa
            public /* synthetic */ RunnableC27827sa() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59320NS();
            }
        }, 200L);
        C20275e c20275e = new C20275e();
        c20275e.m105865K(i11);
        m59928ZT(c20275e);
        if (m92676n2() != null) {
            m92676n2().mo35556V(null, str, bundle, c20275e, i12);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ba */
    public void mo59578Ba() {
        AbstractC23136l9.m118744r1(this.f56902s3, 8);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Bf */
    public void mo59579Bf(C25630b c25630b, int i11, int i12, int i13) {
        try {
            Bundle bundle = new Bundle();
            bundle.putSerializable("gifInfo", c25630b);
            bundle.putBoolean("showButtons", true);
            bundle.putBoolean("canceledOnTouchOutside", false);
            bundle.putInt("source", i11);
            C28829a c28829a = new C28829a();
            c28829a.f133534p = i13;
            bundle.putSerializable("stickerFromPanelBundle", c28829a);
            m59537wT(bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Bi */
    public void mo59580Bi() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64722G3();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Bj */
    public void mo59581Bj() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64777h0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Bl */
    public void mo59582Bl() {
        try {
            if (m92662fJ() != null && m92656bJ() != null && m92674mJ() && !m92681pJ()) {
                m92662fJ().mo89694j2(BottomSheetUnSupportEditChatTag.class, BottomPickerView.m78535kL(), 0, "BottomSheetE2eeView", 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Br */
    public void mo59583Br(String str, String str2, String str3, boolean z11, boolean z12) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_poll_id", str2);
        bundle.putString("extra_group_id", str);
        bundle.putBoolean("extra_shortcut_groupboard", z11);
        bundle.putBoolean("extra_show_vote_detail", z12);
        bundle.putString("STR_SOURCE_START_VIEW", str3);
        m60278xU(GroupPollVotingView.class, bundle, 1034, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Bx */
    public void mo59584Bx() {
        ActionBar actionBar = this.f56793R1.f60411e0;
        if (actionBar != null) {
            actionBar.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: By */
    public void mo59585By(CharSequence charSequence) {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.setText(charSequence);
            this.f56832b1.setSelection(mo59889Wr());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.detail.ChatDetailsView.InterfaceC11577h
    /* renamed from: C1 */
    public void mo59586C1() {
        this.f56784P0.mo60545C1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: C5 */
    public List mo59587C5() {
        List mo60200rp = mo60200rp();
        ArrayList arrayList = null;
        if (mo60200rp != null && mo60200rp.size() != 0) {
            int m59909YP = m59909YP();
            int mo59967cn = mo59967cn();
            if (m59909YP >= 0 && mo59967cn >= 0 && m59909YP <= mo59967cn && mo59967cn < mo60200rp.size()) {
                arrayList = new ArrayList();
                while (m59909YP <= mo59967cn) {
                    arrayList.addAll(((C28771c) mo60200rp.get(m59909YP)).m143950j());
                    m59909YP++;
                }
            }
        }
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: C6 */
    public void mo59588C6() {
        ActionBarMenuItem actionBarMenuItem = this.f56898r3;
        if (actionBarMenuItem != null && actionBarMenuItem.getParent() == m92647RI()) {
            if (this.f56898r3.getVisibility() != 0) {
                this.f56898r3.setVisibility(0);
                return;
            }
            return;
        }
        this.f56898r3 = m78952hL(AbstractC6918a0.menu_group_call, m59350SP(m92689tK(), AbstractC16803z.icn_groupcall));
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: CF */
    public void mo59589CF(Drawable drawable) {
        ActionBarMenuItem actionBarMenuItem = this.f56902s3;
        if (actionBarMenuItem != null && actionBarMenuItem.getIconView() != null) {
            this.f56902s3.getIconView().getDrawable();
        }
        ActionBarMenuItem actionBarMenuItem2 = this.f56902s3;
        if (actionBarMenuItem2 != null && actionBarMenuItem2.getParent() == m92647RI()) {
            this.f56902s3.setIcon(drawable);
            if (this.f56902s3.getVisibility() != 0) {
                this.f56902s3.setVisibility(0);
            }
        } else {
            this.f56902s3 = m78952hL(AbstractC6918a0.change_mode_chat_view, drawable);
        }
        if (this.f56793R1.m64829x0() != null) {
            this.f56793R1.m64829x0().m70144G1(false, false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: CG */
    public void mo59590CG(boolean z11) {
        if (this.f56779N2.hasMessages(123456)) {
            return;
        }
        int i11 = 12345;
        if (this.f56779N2.hasMessages(12345)) {
            return;
        }
        if (!z11) {
            i11 = 12344;
        }
        if (!this.f56779N2.hasMessages(i11)) {
            this.f56779N2.sendEmptyMessageDelayed(i11, 100L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C23475l.m123241e((byte) 3, "onCreate");
        AbstractC27241b.m139382c("10000024");
        super.mo37111CJ(bundle);
        this.f56889p2 = true;
        this.f56849f2 = System.currentTimeMillis();
        this.f56789Q1 = new C31983k0(this, AbstractC23306f.m120579F1(), AbstractC23306f.m120562A(), AbstractC23306f.m120726x1(), AbstractC23306f.m120694n1(), AbstractC23306f.m120623U0(), AbstractC23306f.m120729y1());
        this.f56793R1 = new C11621p0(this);
        this.f56782O2 = new C13306b(getContext());
        this.f56738C1 = new C23528a(m92648SI());
        this.f56784P0 = new C11598e(this, this.f56789Q1, AbstractC23306f.m120562A(), AbstractC23306f.m120584H0(), C0943w.m4462l(), C19669z.m103146Y(), AbstractC23306f.m120606O1(), C19610a.m102633j(), C0856z.m2393m(), C28203u6.f131407a, C21927m.m114302u(), C18644n.m98531l(), C24261h.m126630v(), C28023b6.m141250h0(), C20014h.Companion.m103880a(), C31894e1.f146524a, AbstractC23306f.m120579F1(), C27517h.m140671J(), C18953k.m99340R(), C25994h.f124017a, AbstractC23306f.m120726x1(), AbstractC23306f.m120583H(), C31904eb.m153357i(), C32190y7.m155216t(), AbstractC23306f.m120730z(), C25244a.f121072a, AbstractC23306f.m120721w());
        this.f56784P0.mo995Nd(C27856ub.m140771a(m92642L3()), C27675hd.m140768a(bundle));
        AbstractC27241b.m139380a("10000024");
        C23475l.m123240d().m123242a("onCreate");
        C23475l.m123240d().m123243b();
        this.f56784P0.mo60739hl(this.f56884o1.f130052J);
        C28020b3 c28020b3 = C28020b3.f130648a;
        this.f56929z2 = c28020b3.m141208y("STICKER_PANEL_", m92692wK());
        this.f56731A2 = c28020b3.m141208y("CHAT_VIEW_", m92692wK());
        this.f56735B2 = c28020b3.m141208y("SUGGEST_VIEW_", m92692wK());
        m59262FU();
        C2526d.f10270a.m12734y0(m60004fQ());
        C2546u.f10363a.m12830q();
    }

    /* renamed from: CP */
    public void m59591CP() {
        try {
            mo60051id(174);
            m59790QT(false);
            this.f56734B1 = null;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: CT */
    public void m59592CT() {
        C3246i0.a aVar;
        try {
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f56900s1;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m() && (aVar = this.f56908u1) != null) {
                aVar.m16488s();
                this.f56908u1.m16491v();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Cc */
    public void mo59593Cc() {
        C3535c mo60615Oc = this.f56784P0.mo60615Oc();
        String m17944I0 = mo60615Oc.m17944I0();
        if (!TextUtils.isEmpty(m17944I0)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.o8

                /* renamed from: q */
                public final /* synthetic */ String f129893q;

                public /* synthetic */ RunnableC27769o8(String m17944I02) {
                    r2 = m17944I02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59283IR(r2);
                }
            });
            int i11 = C11290k0.f56969b[this.f56789Q1.m153886E().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f56784P0.mo60768mo();
                }
            } else {
                this.f56784P0.mo60573Hj(m17944I02);
            }
        }
        if (this.f56784P0.mo60624Q7() || this.f56784P0.mo60540Bd()) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.p8
                public /* synthetic */ RunnableC27783p8() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59292JR();
                }
            });
        }
        this.f56784P0.mo60701cp();
        m59456kP(m60020gQ().mo60798sp());
        if (!mo60124n3()) {
            m59791QU(null, true, "");
        }
        m59233BQ();
        Conversation m17971y0 = mo60615Oc.m17971y0();
        if (!m17971y0.m41013q()) {
            this.f56784P0.mo60716en(m17971y0.f42893q);
        }
        this.f56784P0.mo60724g5();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.q8
            public /* synthetic */ RunnableC27797q8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m60130nP();
            }
        });
        if (!m17971y0.m41013q()) {
            C32299k.f149103a.m156155c(m92676n2(), m17971y0.f42893q);
        }
        ShowcaseView showcaseView = this.f56786P2;
        if (showcaseView != null) {
            showcaseView.bringToFront();
        }
        if (m92674mJ() && !m92681pJ()) {
            if (this.f56784P0.mo60546Cc()) {
                try {
                    for (int childCount = this.f56796S0.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = this.f56796S0.getChildAt(childCount);
                        if (((childAt instanceof ChatRow) && !((ChatRow) childAt).getMessage().m95032V6() && ((ChatRow) childAt).m61110s3()) || ((childAt instanceof ChatRowWebContent) && !((ChatRowWebContent) childAt).getMessage().m95032V6() && ((ChatRowWebContent) childAt).m61852l0())) {
                            break;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ChatView", e11);
                }
            }
            this.f56784P0.mo60846zj(this.f56758H1);
            if (m60019gP() && this.f56839c4 == null && C0874h.f3217a.m2589d() != null) {
                mo59601D6();
            }
            this.f56784P0.mo60758la(false);
            this.f56784P0.mo60592K4();
            if (this.f56917w2.get()) {
                this.f56917w2.set(false);
                mo70710wy(new Runnable() { // from class: v50.r8
                    public /* synthetic */ RunnableC27811r8() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.this.m59300KR();
                    }
                });
            }
        }
        this.f56784P0.mo60714ek();
        if (this.f56784P0.mo60624Q7() || ((this.f56784P0.mo60587Jf() && this.f56784P0.mo60617Oi()) || this.f56784P0.mo60540Bd())) {
            C25994h.f124017a.m133919h(mo60615Oc.m17944I0()).m133959j();
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: v50.s8
            public /* synthetic */ RunnableC27825s8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59307LR();
            }
        }, 300L);
        AbstractC19444a.m101694b(new Runnable() { // from class: v50.t8
            public /* synthetic */ RunnableC27839t8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59313MR();
            }
        }, 1000L);
        AbstractC19444a.m101694b(this.f56770K2, 1000L);
        m59482oP(true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ch */
    public void mo59594Ch(int i11, ContactProfile contactProfile) {
        if (!m59879W8()) {
            this.f56739C2 = i11;
            this.f56747E2 = contactProfile;
            AbstractC23034c6.m118184v0(this, new String[]{"android.permission.RECORD_AUDIO"}, 117);
        } else {
            this.f56784P0.mo60585Jb(EnumC11304r0.CALL, i11, contactProfile, null);
            this.f56739C2 = 0;
            this.f56747E2 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ci */
    public void mo59595Ci() {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.m65402T();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Cl */
    public void mo59596Cl() {
        mo70710wy(new Runnable() { // from class: v50.ab
            public /* synthetic */ RunnableC27568ab() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59431gS();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Cq */
    public void mo59597Cq() {
        AbstractC28207v1.m141994i3("action.open.e2ee.intro", 3, m92676n2(), this, this.f56784P0.mo60615Oc().m17944I0(), null);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Cv */
    public boolean mo59598Cv(int i11) {
        return this.f56858h3 == i11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Cx */
    public void mo59599Cx(String str, boolean z11, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putBoolean("EXTRA_IS_SHOW_SEARCH_MODE", z11);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        if (str3 != null) {
            bundle.putString("actionCommonData", str3);
        }
        m60278xU(ManageMembersView.class, bundle, 0, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Cy */
    public void mo59600Cy() {
        try {
            if (mo60273x4()) {
                this.f56779N2.post(this.f56795R3);
            } else {
                this.f56779N2.postDelayed(this.f56795R3, 400L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: D6 */
    public void mo59601D6() {
        if (m60019gP() && this.f56839c4 == null) {
            C0874h c0874h = C0874h.f3217a;
            if (c0874h.m2589d() != null) {
                LiveEmojiButton liveEmojiButton = (LiveEmojiButton) this.f56793R1.f60408d.m59157B(c0874h.m2589d());
                this.f56839c4 = liveEmojiButton;
                liveEmojiButton.setListener(new C11315z());
                this.f56839c4.m76400k(1000);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: D7 */
    public void mo59602D7() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null) {
            abstractPushToTalkControl.mo87648a();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: DC */
    public void mo59603DC(ArrayList arrayList) {
        this.f56793R1.m64739N3(arrayList);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: DD */
    public void mo59604DD(String str, String str2, long j11, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_topic_id", str2);
        bundle.putString("extra_group_id", str);
        if (j11 > 0) {
            bundle.putLong("LONG_EXTRA_EVENT_START_TIME", j11);
        }
        bundle.putBoolean("extra_shortcut_groupboard", z11);
        m59538wU(GroupPostDetailViewV2.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: DH */
    public boolean mo59605DH() {
        return this.f56880n1;
    }

    /* renamed from: DP */
    void m59606DP(C18460c c18460c) {
        ZaloView zaloView = this.f56854g3;
        if (zaloView instanceof ShareLocationChatPickerView) {
            ((ShareLocationChatPickerView) zaloView).dismiss();
            return;
        }
        if (zaloView instanceof ShareLocationWithMapView) {
            if (c18460c != null) {
                try {
                    ((ShareLocationWithMapView) zaloView).m72066oM(c18460c.f93020a);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            ZaloView zaloView2 = this.f56854g3;
            zaloView2.f88756W = 0;
            zaloView2.finish();
            this.f56854g3 = null;
        }
    }

    /* renamed from: DQ */
    void m59607DQ() {
        LandingPageView landingPageView = this.f56872l1;
        if (landingPageView != null) {
            landingPageView.m71704hP(new LandingPageView.InterfaceC12718q() { // from class: v50.g8
                public /* synthetic */ C27655g8() {
                }

                @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12718q
                /* renamed from: a */
                public final void mo71513a(int i11, boolean z11, List list, List list2) {
                    ChatView.this.m59557zR(i11, z11, list, list2);
                }
            });
            this.f56872l1.m71705iP(new LandingPageView.InterfaceC12719r() { // from class: v50.h8
                public /* synthetic */ C27670h8() {
                }

                @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12719r
                /* renamed from: a */
                public final void mo71514a(boolean z11) {
                    ChatView.this.m59227AR(z11);
                }
            });
        }
    }

    /* renamed from: DT */
    public void m59608DT(C17945a0 c17945a0, boolean z11, int i11, String str, String str2) {
        mo60149oe();
        if (this.f56853g2) {
            this.f56784P0.mo60653Vc();
        }
        this.f56784P0.mo60543Bm();
        this.f56796S0.requestDisallowInterceptTouchEvent(true);
        mo59922Z6();
        this.f56827Z3 = RemindChatMessageView.m83573VK(c17945a0, i11, this.f56784P0.mo60624Q7(), z11, str, str2, this.f56784P0.mo60638S2());
        m92693xK().mo89692g2(this.f56827Z3, 0, 2, true);
    }

    /* renamed from: DU */
    void m59609DU() {
        try {
            C31967j.m153687a().m153695i();
            C28719g.f133214a.m143843M(false);
            AbstractC23059e9.m118319H(m92676n2(), false);
            C3246i0.a aVar = this.f56908u1;
            if (aVar != null) {
                aVar.m16482A();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Dc */
    public int mo59610Dc() {
        return this.f56796S0.getLastVisiblePosition();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Dd */
    public String mo59611Dd() {
        Editable text;
        try {
            ActionEditText actionEditText = this.f56832b1;
            if (actionEditText == null || (text = actionEditText.getText()) == null) {
                return "";
            }
            return text.toString();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: De */
    public void mo59612De() {
        if (this.f56793R1.m64829x0() != null) {
            this.f56793R1.m64829x0().m70173c1();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Df */
    public boolean mo59613Df() {
        return this.f56793R1 != null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Dk */
    public void mo59614Dk(int i11, ContactProfile contactProfile) {
        if (m59896XQ()) {
            return;
        }
        this.f56784P0.mo60565Fn(EnumC11304r0.CALL, i11, contactProfile, null);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Dl */
    public void mo59615Dl(C31902e9 c31902e9, C25630b c25630b, C18946d c18946d, AbstractC19215a abstractC19215a) {
        try {
            Bundle bundle = new Bundle();
            if (c25630b != null) {
                bundle.putSerializable("gifInfo", c25630b);
            }
            bundle.putSerializable("search_inline_result", c31902e9);
            bundle.putBoolean("showButtons", true);
            bundle.putBoolean("canceledOnTouchOutside", false);
            bundle.putSerializable("searchInlineAdditionalInfo", c18946d);
            if (abstractC19215a != null) {
                bundle.putSerializable("tracking_data", abstractC19215a);
            }
            m59537wT(bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Do */
    public void mo59616Do(ContactProfile contactProfile) {
        Bundle bundle = new Bundle();
        bundle.putString("uid", contactProfile.f42434r);
        bundle.putString("dpn", contactProfile.f42437s);
        bundle.putString("avatar", contactProfile.f42446v);
        bundle.putString("phone", contactProfile.f42455y);
        bundle.putInt("inviteFrom", 1);
        this.f56837c2 = true;
        m60278xU(WriteInvitationView.class, bundle, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Du */
    public void mo59617Du() {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65157Du();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Dx */
    public void mo59618Dx(Conversation conversation, String str, int i11, String str2) {
        JSONArray optJSONArray;
        Bundle bundle = new Bundle();
        bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 1);
        bundle.putString("STR_EXTRA_JSON_EVENT_DETAIL", "");
        bundle.putString("STR_EXTRA_CONTACT_UID", conversation.f42893q);
        bundle.putString("STR_EXTRA_CONTACT_NAME", conversation.f42894r);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("title")) {
                    bundle.putString("EXTRA_POST_CONTENT", jSONObject.optString("title"));
                }
                if (jSONObject.has("startTime")) {
                    bundle.putLong("EXTRA_START_TIME", jSONObject.optLong("startTime"));
                }
                if (jSONObject.has("emoji")) {
                    bundle.putString("EXTRA_EMOJI", jSONObject.optString("emoji"));
                }
                if (jSONObject.has("calendarType")) {
                    bundle.putInt("INT_EXTRA_CALENDAR_TYPE", jSONObject.optInt("calendarType"));
                }
                if (jSONObject.has("openTimePicker")) {
                    bundle.putBoolean("BOL_EXTRA_OPEN_TIME_PICKER", jSONObject.optBoolean("openTimePicker"));
                }
                if (jSONObject.has("repeat") && (optJSONArray = jSONObject.optJSONArray("repeat")) != null) {
                    bundle.putString("STR_EXTRA_REPEAT_RULE", optJSONArray.toString());
                }
                if (jSONObject.has("trackingSrc") && i11 == -2) {
                    bundle.putInt("INT_EXTRA_TRACKING_SOURCE", jSONObject.optInt("trackingSrc", -2));
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
        m60278xU(GroupReminderComposeView.class, bundle, 1050, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Dz */
    public void mo59619Dz() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null && c11603g0.m64551E1() && !this.f56792R0.m64552K1()) {
            this.f56792R0.m64566u1();
            this.f56779N2.post(new Runnable() { // from class: v50.z7
                public /* synthetic */ RunnableC27922z7() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59476nR();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: E4 */
    public void mo59620E4() {
        m60020gQ().mo60793sd(false);
        if (m60020gQ().mo60609Nf()) {
            mo70710wy(new Runnable() { // from class: v50.n9
                public /* synthetic */ RunnableC27756n9() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59408bS();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: E7 */
    public void mo59621E7() {
        if (!mo59664HB() && !m60034hR()) {
            return;
        }
        this.f56792R0.m60476H0(null);
        this.f56792R0.m60477I0(null);
        this.f56792R0.m64561h2();
    }

    /* renamed from: EQ */
    void m59622EQ(C3535c c3535c) {
        mo70710wy(new Runnable() { // from class: v50.k8

            /* renamed from: q */
            public final /* synthetic */ C3535c f129794q;

            public /* synthetic */ RunnableC27713k8(C3535c c3535c2) {
                r2 = c3535c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59241CR(r2);
            }
        });
    }

    /* renamed from: ET */
    public void m59623ET() {
        this.f56784P0.mo60614Ob();
    }

    /* renamed from: EU */
    public void m59624EU() {
        try {
            C31967j.m153687a().m153695i();
            C28719g.f133214a.m143843M(false);
            C3246i0.a aVar = this.f56908u1;
            if (aVar != null) {
                aVar.m16482A();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        C23744a.m124114c().m124116d(4, new Object[0]);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ec */
    public void mo59625Ec(long j11) {
        this.f56779N2.postDelayed(this.f56834b3, j11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: El */
    public void mo59626El(C31902e9 c31902e9) {
        try {
            if (Build.VERSION.SDK_INT >= 26 && mo60124n3() && this.f56846e3 == 1) {
                mo59706Ka(2);
            }
            mo59714LA();
            Bundle bundle = new Bundle();
            bundle.putSerializable("search_inline_result", c31902e9);
            mo60056iu(166, bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Es */
    public void mo59627Es(String str, boolean z11, boolean z12, String str2, String str3, boolean z13) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putBoolean("BOL_EXTRA_HAVE_ADMIN_ROLE", z11);
        bundle.putBoolean("EXTRA_IS_FINISH_VIEW", z12);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        bundle.putString("STR_EXTRA_GROUP_LINK_URL", str3);
        bundle.putBoolean("EXTRA_IS_COMMUNITY", z13);
        m59538wU(ManageGroupLinkView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Et */
    public void mo59628Et() {
        try {
            mo59702KH("ReactionDetailView");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: F0 */
    public void mo59629F0(String str, String str2) {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65159F0(str, str2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: F6 */
    public void mo59630F6(String str) {
        AnimChat animChat = this.f56762I1;
        if (animChat != null) {
            animChat.m76116a0(str);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: FC */
    public void mo59631FC(int i11) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64761c2(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: FD */
    public void mo59632FD() {
        ChatEmptyView chatEmptyView;
        if (this.f56789Q1.m153886E() == EnumC18030a.GROUP && (chatEmptyView = this.f56775M1) != null && chatEmptyView.getUiMode() == 5) {
            this.f56779N2.post(new Runnable() { // from class: v50.o7
                public /* synthetic */ RunnableC27768o7() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59352SS();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: FI */
    public void mo59633FI() {
        if (this.f56740C3 == null) {
            View m59198n = this.f56793R1.f60408d.m59198n();
            this.f56740C3 = m59198n;
            m59198n.setOnClickListener(new View.OnClickListener() { // from class: v50.bb
                public /* synthetic */ ViewOnClickListenerC27583bb() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatView.this.m59489pS(view);
                }
            });
        }
        this.f56740C3.setVisibility(0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (m92676n2() != null && m92674mJ() && !m92681pJ() && !mo60301zB() && !mo59778Pu()) {
            try {
                this.f56784P0.mo60817v6(this.f56853g2, m59374WP(), this.f56793R1.f60417h0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: FP */
    void m59634FP() {
        try {
            mo59702KH(ReplyStickerPopupView.f76956f1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fb */
    public void mo59635Fb(boolean z11) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64741O3(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fc */
    public void mo59636Fc(C11598e.e eVar) {
        AbstractC2379w.m12430d(this.f56788Q0);
        this.f56824Z0.m65392E(eVar);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fe */
    public void mo59637Fe() {
        mo70710wy(this.f56862i3);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fl */
    public boolean mo59638Fl() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl instanceof PushToTalkSpeechToText) {
            PushToTalkSpeechToText pushToTalkSpeechToText = (PushToTalkSpeechToText) abstractPushToTalkControl;
            if (pushToTalkSpeechToText.m87657j() && pushToTalkSpeechToText.m87983c0()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fp */
    public boolean mo59639Fp() {
        if (mo60120mu() && !mo59638Fl()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fu */
    public void mo59640Fu(C17914d.b bVar) {
        mo60056iu(420, bVar);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fv */
    public void mo59641Fv() {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.setSelection(0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Fw */
    public void mo59642Fw(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("KEY_GROUP_ID", str);
        m59538wU(OnboardingCommunityUpgradedView.class, bundle, 0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: G0 */
    public void mo59643G0() {
        mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: G1 */
    public boolean mo59644G1(String str) {
        try {
            new C0012a((ClipboardManager) m92686rK().getSystemService("clipboard"), new SensitiveData("clipboard_copy_link_invited_group", "comm_csc")).m16c(ClipData.newPlainText(str, str));
            return true;
        } catch (SensitiveDataException unused) {
            ToastUtils.showMess(m92652XI(AbstractC8020f0.str_sensitive_clipboard_block_title));
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: G7 */
    public void mo59645G7(String str, boolean z11, ArrayList arrayList) {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            if (!(m92662fJ.m93004H0() instanceof ReportAttachmentView)) {
                C24585b m128025m = C24585b.m128025m();
                ReportInfoCollected m128041t = m128025m.m128041t();
                if (m128041t != null && z11) {
                    m128041t.m50187j(arrayList);
                }
                ReportInfoCollected m128042u = m128025m.m128042u();
                int m128046y = m128025m.m128046y();
                m128025m.m128033h();
                Bundle bundle = new Bundle();
                bundle.putParcelable("report_info", m128042u);
                bundle.putInt("source_action", m128046y);
                bundle.putParcelable("report_info_edited", m128041t);
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                m92662fJ.m93069k2(ReportAttachmentView.class, bundle, 2, true);
                return;
            }
            if (z11) {
                Intent intent = new Intent();
                intent.putExtra("extra_report_session_list_attach_msg", arrayList);
                mo50035CK(-1, intent);
            } else {
                mo50035CK(0, null);
            }
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: G9 */
    public void mo59646G9() {
        C3538f c3538f;
        if (this.f88760a0 != null) {
            if (mo59988eh()) {
                m78941WL(AbstractC16803z.bg_postfeed_actionbar);
                return;
            }
            if (m60020gQ().mo60808u8() && !m60020gQ().mo60617Oi()) {
                m78940VL(-9273977);
                m59302KU();
                m78942XL(-1);
                m59732MT(-1258291201);
                m59746NT(0);
                invalidateOptionsMenu();
                this.f56784P0.mo60701cp();
                return;
            }
            if (this.f56909u2 && (c3538f = this.f56913v2) != null) {
                int i11 = c3538f.f14930f;
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AbstractC23265y.m120022i(i11, 204), AbstractC23265y.m120022i(i11, 5)});
                gradientDrawable.setCornerRadius(0.0f);
                AbstractC23136l9.m118696b1(this.f88760a0, gradientDrawable);
            } else {
                m78941WL(AbstractC16803z.stencil_bg_action_bar);
            }
            m59302KU();
            m78942XL(-1);
            m59732MT(-1258291201);
            m59746NT(0);
            invalidateOptionsMenu();
            this.f56784P0.mo60701cp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0169  */
    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: GA */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo59647GA(InterfaceC11310u0 interfaceC11310u0, boolean z11) {
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        try {
            View m64720F3 = this.f56793R1.m64720F3();
            ViewOnClickListenerC27838t7 viewOnClickListenerC27838t7 = new View.OnClickListener() { // from class: v50.t7

                /* renamed from: q */
                public final /* synthetic */ ChatView.InterfaceC11310u0 f130013q;

                public /* synthetic */ ViewOnClickListenerC27838t7(ChatView.InterfaceC11310u0 interfaceC11310u02) {
                    r2 = interfaceC11310u02;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatView.this.m59235BS(r2, view);
                }
            };
            m64720F3.findViewById(AbstractC6918a0.btn_back).setOnClickListener(viewOnClickListenerC27838t7);
            this.f56863i4 = (TextView) m64720F3.findViewById(AbstractC6918a0.tv_selection_count);
            int i13 = 0;
            mo59657Go(0);
            boolean z14 = true;
            this.f56796S0.setEnableMultiSelection(true);
            this.f56796S0.setEnableSwipeItem(false);
            mo59806Rh();
            View m64823u3 = this.f56793R1.m64823u3();
            this.f56867j4 = m64823u3.findViewById(AbstractC6918a0.layout_multi_selection_actions);
            this.f56907t4 = m64823u3.findViewById(AbstractC6918a0.layout_btn_report);
            if (this.f56784P0.mo60583J0()) {
                this.f56867j4.setVisibility(8);
                this.f56907t4.setVisibility(0);
                Button button = (Button) m64823u3.findViewById(AbstractC6918a0.btn_report);
                this.f56911u4 = button;
                button.setIdTracking("REPORT_CSC_SELECT_MSG");
                this.f56911u4.setOnClickListener(viewOnClickListenerC27838t7);
                View m64762d0 = this.f56793R1.m64762d0();
                this.f56915v4 = m64762d0;
                m64762d0.setOnClickListener(viewOnClickListenerC27838t7);
            } else {
                this.f56907t4.setVisibility(8);
                if (this.f56915v4 != null) {
                    this.f56793R1.m64830x2();
                    this.f56915v4 = null;
                }
                this.f56867j4.setVisibility(0);
                this.f56871k4 = m64823u3.findViewById(AbstractC6918a0.btn_add_item_to_collection);
                this.f56875l4 = m64823u3.findViewById(AbstractC6918a0.btn_share);
                this.f56879m4 = m64823u3.findViewById(AbstractC6918a0.btn_undo);
                AppCompatImageView appCompatImageView = (AppCompatImageView) m64823u3.findViewById(AbstractC6918a0.undo_icon);
                this.f56903s4 = appCompatImageView;
                appCompatImageView.setImageDrawable(C27280g.m139659b(appCompatImageView.getContext(), AbstractC23322a.zds_ic_recall_line_24, AbstractC2808b.or60));
                this.f56883n4 = m64823u3.findViewById(AbstractC6918a0.btn_delete);
                this.f56899r4 = m64823u3.findViewById(AbstractC6918a0.btn_save_message);
                this.f56875l4.setOnClickListener(viewOnClickListenerC27838t7);
                this.f56879m4.setOnClickListener(viewOnClickListenerC27838t7);
                this.f56883n4.setOnClickListener(viewOnClickListenerC27838t7);
                this.f56899r4.setOnClickListener(viewOnClickListenerC27838t7);
                this.f56871k4.setOnClickListener(viewOnClickListenerC27838t7);
                if (z11) {
                    ((TextView) m64823u3.findViewById(AbstractC6918a0.tv_btn_delete)).setText(AbstractC8020f0.str_delete_etc);
                    View inflate = ((ViewStub) m64823u3.findViewById(AbstractC6918a0.viewstub_layout_delete_for_admin_mode)).inflate();
                    this.f56887o4 = inflate;
                    inflate.setVisibility(8);
                    this.f56891p4 = this.f56887o4.findViewById(AbstractC6918a0.btn_delete_for_me);
                    this.f56895q4 = this.f56887o4.findViewById(AbstractC6918a0.btn_delete_for_all_members);
                    this.f56887o4.findViewById(AbstractC6918a0.btn_exit_delete_for_admin_mode).setOnClickListener(viewOnClickListenerC27838t7);
                    this.f56891p4.setOnClickListener(viewOnClickListenerC27838t7);
                    this.f56895q4.setOnClickListener(viewOnClickListenerC27838t7);
                }
                boolean mo60540Bd = this.f56784P0.mo60540Bd();
                if (!mo60540Bd && C21373a.f104231a.m110802n()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view = this.f56899r4;
                if (z12) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                AbstractC23136l9.m118744r1(view, i11);
                if (mo60540Bd && C21373a.f104231a.m110802n()) {
                    z13 = false;
                    View view2 = this.f56879m4;
                    if (!z13) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    AbstractC23136l9.m118744r1(view2, i12);
                    if (mo60540Bd || !C21373a.f104231a.m110807w().m110825b()) {
                        z14 = false;
                    }
                    View view3 = this.f56871k4;
                    if (z14) {
                        i13 = 8;
                    }
                    AbstractC23136l9.m118744r1(view3, i13);
                }
                z13 = true;
                View view22 = this.f56879m4;
                if (!z13) {
                }
                AbstractC23136l9.m118744r1(view22, i12);
                if (mo60540Bd) {
                }
                z14 = false;
                View view32 = this.f56871k4;
                if (z14) {
                }
                AbstractC23136l9.m118744r1(view32, i13);
            }
            mo59833TF();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: GC */
    public void mo59648GC(boolean z11) {
        if (this.f56894q3 != null) {
            if (z11) {
                if (this.f56926y3 == null) {
                    this.f56926y3 = C2040d.m11045b(m92689tK(), AbstractC16803z.icn_khomedia_sync);
                }
                if (this.f56926y3 != null) {
                    this.f56894q3.getIconView().setImageDrawable(this.f56926y3);
                    if (this.f56926y3.isRunning()) {
                        this.f56926y3.stop();
                    }
                    this.f56926y3.start();
                    mo60106lr(2500, true);
                    return;
                }
                return;
            }
            this.f56779N2.removeMessages(123460);
            C2040d c2040d = this.f56926y3;
            if (c2040d != null && c2040d.isRunning()) {
                this.f56926y3.stop();
            }
            this.f56894q3.getIconView().setImageResource(AbstractC16803z.icn_kho_media);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: GG */
    public void mo59649GG(String str, boolean z11) {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75604r(str, z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C23475l.m123241e((byte) 3, "onCreateView");
        AbstractC27241b.m139382c("10000025");
        this.f56788Q0 = this.f56793R1.m64801o0(getContext());
        m59306LP();
        m92637BK(true);
        m59403aU();
        AbstractC27241b.m139380a("10000025");
        C23475l.m123240d().m123242a("onCreateView");
        C23475l.m123240d().m123243b();
        m59482oP(false);
        return this.f56788Q0;
    }

    /* renamed from: GP */
    public void m59650GP() {
        ZaloView m92996E0 = m92676n2().mo35579p().m92996E0("RolledMediaBottomSheet");
        if (m92996E0 != null) {
            m92676n2().mo35579p().mo92702G1(m92996E0, 0);
        }
    }

    /* renamed from: GT */
    public void m59651GT() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl instanceof PushToTalkControl) {
            ((PushToTalkControl) abstractPushToTalkControl).m87890b0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ga */
    public boolean mo59652Ga() {
        return this.f56793R1.m64792l1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gc */
    public boolean mo59653Gc() {
        return this.f56819X3 != null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ge */
    public void mo59654Ge() {
        C3246i0.a aVar = this.f56908u1;
        if (aVar != null) {
            aVar.m16491v();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gh */
    public void mo59655Gh(int i11, ContactProfile contactProfile) {
        if (!mo59769P0()) {
            this.f56743D2 = i11;
            this.f56747E2 = contactProfile;
            mo60233u2(113);
        } else {
            this.f56784P0.mo60585Jb(EnumC11304r0.VIDEO_CALL, i11, contactProfile, null);
            this.f56743D2 = 0;
            this.f56747E2 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gk */
    public void mo59656Gk(long j11) {
        this.f56779N2.removeCallbacks(this.f56777M3);
        this.f56779N2.postDelayed(this.f56777M3, j11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Go */
    public void mo59657Go(int i11) {
        TextView textView = this.f56863i4;
        if (textView != null) {
            textView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num, Integer.valueOf(i11)));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gp */
    public void mo59658Gp(boolean z11) {
        ChatSearchBarView chatSearchBarView = this.f56857h2;
        if (chatSearchBarView != null) {
            chatSearchBarView.m65607b(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gs */
    public void mo59659Gs(boolean z11) {
        this.f56793R1.m64729J2(z11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gt */
    public void mo59660Gt() {
        this.f56870k3 = true;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gx */
    public boolean mo59661Gx() {
        View view = this.f56740C3;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Gy */
    public void mo59662Gy(MessageId messageId, boolean z11) {
        this.f56792R0.m60473E0(messageId).f133329y = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: H7 */
    public void mo59663H7(String str) {
        this.f56865j2.setText(str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: HB */
    public boolean mo59664HB() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null && c11603g0.m60502x0()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: HC */
    public void mo59665HC(Object... objArr) {
        C11621p0 c11621p0;
        try {
            if (C21373a.f104231a.m110807w().m110825b() && (c11621p0 = this.f56793R1) != null) {
                if (c11621p0.m64829x0() != null && !this.f56793R1.m64829x0().m70164V0()) {
                    return;
                }
                if (this.f56793R1.m64829x0() != null && this.f56796S0 != null) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    if (((C23805a.e) objArr[1]) == C23805a.e.f115063p) {
                        SwipeItemListView swipeItemListView = this.f56796S0;
                        swipeItemListView.setPadding(swipeItemListView.getPaddingLeft(), intValue, this.f56796S0.getPaddingRight(), this.f56796S0.getPaddingBottom());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: HD */
    public void mo59666HD(C17945a0 c17945a0, long j11) {
        if (this.f56764I3 == null) {
            WhereLeftJumpFloatingView m59201q = this.f56793R1.f60408d.m59201q();
            this.f56764I3 = m59201q;
            m59201q.setOnClickListener(new View.OnClickListener() { // from class: v50.u9

                /* renamed from: q */
                public final /* synthetic */ C17945a0 f130040q;

                public /* synthetic */ ViewOnClickListenerC27854u9(C17945a0 c17945a02) {
                    r2 = c17945a02;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatView.this.m59502rS(r2, view);
                }
            });
        }
        this.f56764I3.m65440b();
        mo78955kl(new Runnable() { // from class: v50.v9
            public /* synthetic */ RunnableC27868v9() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59508sS();
            }
        }, j11);
        this.f56764I3.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: HH */
    public void mo59667HH() {
        C3554v m60131nQ;
        if (this.f56857h2 == null || (m60131nQ = m60131nQ()) == null) {
            return;
        }
        this.f56885o2 = m60131nQ.m18061c();
        mo59806Rh();
        this.f72827B0.postDelayed(new Runnable() { // from class: v50.ja
            public /* synthetic */ RunnableC27701ja() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59464lR();
            }
        }, 3000L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: HI */
    public boolean mo59668HI(String str) {
        return this.f56782O2.m74706o(str);
    }

    /* renamed from: HQ */
    public boolean m59669HQ() {
        return this.f56812W0 != null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ha */
    public void mo59670Ha(ArrayList arrayList, String str) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64775g2(null, "csc_attach", m60004fQ());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: He */
    public void mo59671He() {
        this.f56781O1 = false;
        if (this.f56775M1 != null) {
            this.f56779N2.removeCallbacks(this.f56815W3);
            this.f56779N2.post(this.f56815W3);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hg */
    public void mo59672Hg(MessageId messageId, String str) {
        try {
            if (m92662fJ() != null && m92656bJ() != null && m92674mJ() && !m92681pJ()) {
                Bundle m78535kL = BottomPickerView.m78535kL();
                BottomSheetExpandReactionPickerView.m76833rM(m78535kL, messageId, 0, str);
                m92662fJ().mo89694j2(BottomSheetExpandReactionPickerView.class, m78535kL, 0, "BottomSheetExpandReactionPickerView", 2, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hh */
    public void mo59673Hh() {
        if (this.f56755G2) {
            AbstractC19444a.m101696d(this.f56770K2);
            AbstractC19444a.m101694b(this.f56770K2, 300L);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hj */
    public void mo59674Hj() {
        UnreadJumpFloatingView unreadJumpFloatingView = this.f56744D3;
        if (unreadJumpFloatingView != null) {
            unreadJumpFloatingView.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hl */
    public void mo59675Hl(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f56878m3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setRedDotColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.badge_background_red));
            this.f56878m3.setReddotRadius(AbstractC23222t7.f112558f);
            this.f56878m3.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hm */
    public int mo59676Hm() {
        return ((C2876h0) this.f56904t1).m13824R();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hq */
    public void mo59677Hq() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64715E0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hu */
    public void mo59678Hu(int i11, boolean z11, boolean z12) {
        m59803RT(i11, z11, z12, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hy */
    public void mo59679Hy(boolean z11) {
        RedDotImageButton redDotImageButton = this.f56836c1;
        if (redDotImageButton != null) {
            redDotImageButton.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Hz */
    public void mo59680Hz(int i11) {
        this.f56858h3 = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: I7 */
    public void mo59681I7() {
        try {
            if (!m59424fP(true)) {
                return;
            }
            if (AbstractC23309i.m121069J() == 1) {
                m60146oT();
            }
            mo60028gz();
            if (this.f56924y1) {
                mo59706Ka(0);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_input_contact_profile", this.f56784P0.mo60615Oc().m17971y0());
            CameraInputParams m39201k = CameraInputParams.m39201k(mo60244v2());
            m39201k.f41138w0 = new SensitiveData("csc_attachment_camera", "comm_csc");
            ZaloCameraView m116168t = AbstractC22470k.m116168t(m92676n2(), 0, 1, m39201k, bundle);
            if (m116168t != null) {
                m116168t.f40833A1 = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: I8 */
    public boolean mo59682I8() {
        return this.f56793R1.m64763d1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: IB */
    public void mo59683IB(C3538f c3538f) {
        this.f56793R1.f60413f0 = c3538f;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: IE */
    public boolean mo59684IE() {
        AnimChat animChat;
        if (!AbstractC19444a.m101693a() && ((animChat = this.f56762I1) == null || animChat.getParent() == null)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            this.f56779N2.removeCallbacksAndMessages(null);
            C11603g0 c11603g0 = this.f56792R0;
            if (c11603g0 != null) {
                c11603g0.m64554V1();
            }
            m59555zP();
            this.f56878m3 = null;
            this.f56882n3 = null;
            this.f56874l3 = null;
            this.f56886o3 = null;
            this.f56898r3 = null;
            this.f56890p3 = null;
            this.f56894q3 = null;
            this.f56902s3 = null;
            ZMediaPlayer.releaseUrlBySection(ZMediaPlayerSettings.getVideoConfig(0));
            Runnable runnable = this.f56930z3;
            if (runnable != null) {
                this.f56779N2.removeCallbacks(runnable);
            }
            this.f56784P0.mo60543Bm();
            this.f56784P0.mo994F2();
            if (AbstractC25495a.m132078c(this.f56784P0.mo60615Oc().m17944I0())) {
                AbstractC23306f.m120602N0().m109079g0();
            }
            m59286IU();
            ((C21272r) C21272r.Companion.m122672a()).m110185n();
            C21270p.m110079C().m110143B0(8);
            C2526d.f10270a.m12734y0("0");
            C2546u.f10363a.m12827n(this.f56784P0.mo60615Oc().m17944I0());
            AbstractC18884d.m99009f();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ia */
    public boolean mo59685Ia() {
        MentionJumpFloatingView mentionJumpFloatingView = this.f56756G3;
        if (mentionJumpFloatingView != null && mentionJumpFloatingView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: If */
    public void mo59686If(long j11) {
        if (mo60273x4()) {
            this.f56793R1.m64797n0(j11);
        }
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65195sM();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Is */
    public void mo59687Is(String str, C28212v6 c28212v6) {
        if (this.f56874l3 != null) {
            mo59840Tj(m59760OQ());
            if (TextUtils.equals("tip.csc.rightmenu", str)) {
                AbstractC28045d8.m141481b(this.f56874l3.getIconView(), c28212v6, this.f56738C1, m59382XP());
            }
            if (m59760OQ()) {
                mo60206sG();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ix */
    public void mo59688Ix(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f56898r3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setRedDotColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.badge_background_red));
            this.f56898r3.setReddotRadius(AbstractC23222t7.f112558f);
            this.f56898r3.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: J4 */
    public void mo59689J4(boolean z11) {
        C18815q.f94092a.m98780b(m92689tK(), new InterfaceC17463d.d() { // from class: v50.c8
            public /* synthetic */ C27595c8() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ChatView.this.m59514tS(interfaceC17463d, i11);
            }
        }, z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        try {
            ShowcaseView showcaseView = this.f56786P2;
            if (showcaseView != null) {
                showcaseView.m74626d();
            }
            ChatComposePanelNew chatComposePanelNew = this.f56819X3;
            if (chatComposePanelNew != null) {
                chatComposePanelNew.f69002C.removeCallbacks(chatComposePanelNew.f69004E);
            }
            if (this.f56793R1.m64778h1()) {
                C2526d.f10270a.m12730w(C17988o1.a.f91106q, this.f56793R1.f60438s.getQuickReplyGlobalMsgId());
            }
            if (this.f56793R1.m64829x0() != null) {
                this.f56793R1.m64829x0().m70175d1();
            }
            if (mo60244v2()) {
                mo60026gi();
            }
            Runnable runnable = this.f56807U3;
            if (runnable != null) {
                this.f72827B0.removeCallbacks(runnable);
                this.f56807U3 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Je */
    public boolean mo59690Je() {
        return this.f56793R1.f60417h0;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Jg */
    public void mo59691Jg() {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null && chatInputBar.getVisibility() != 8) {
            this.f56824Z0.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ji */
    public void mo59692Ji(boolean z11) {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null) {
            abstractPushToTalkControl.setRecordSupport(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Jm */
    public void mo59693Jm() {
        try {
            if (this.f56840d1 != null) {
                mo59706Ka(0);
                ViewGroup viewGroup = (ViewGroup) this.f56840d1.getParent();
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                m59359TT(true);
                m59334PT(true);
                mo59807Rk(false);
                m60276xQ();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Jp */
    public boolean mo59694Jp() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && (c11621p0.m64829x0() == null || this.f56793R1.m64829x0().m70164V0())) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Jr */
    public void mo59695Jr() {
        try {
            if (this.f56864j1 != null) {
                this.f56779N2.post(this.f56783O3);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Js */
    public void mo59696Js() {
        if (m59401aR()) {
            mo60051id(203);
            this.f56796S0.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Jt */
    public boolean mo59697Jt() {
        return this.f56793R1.m64767e1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: K */
    public void mo59698K(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
        String str3;
        try {
            C8009j.a aVar = new C8009j.a(getContext());
            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.location_choose_confirm_dialog_layout, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.location_dialog_name);
            if (c18460c.f93020a.equals("vitrihientai")) {
                str3 = m92651WI().getString(AbstractC8020f0.str_location_current_location);
            } else {
                str3 = c18460c.f93021b;
            }
            textView.setText(str3);
            ((TextView) inflate.findViewById(AbstractC6918a0.location_dialog_address)).setText(c18460c.f93022c);
            RecyclingImageView recyclingImageView = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.location_dialog_icon);
            C23528a c23528a = new C23528a(getContext());
            if (!TextUtils.isEmpty(c18460c.f93023d)) {
                ((C23528a) c23528a.m123612r(recyclingImageView)).m123616v(c18460c.f93023d);
            } else if (c18460c.f93020a.equals("vitrihientai")) {
                ((C23528a) c23528a.m123612r(recyclingImageView)).m123613s(AbstractC16803z.ic_fsquare_curentloc);
            } else {
                ((C23528a) c23528a.m123612r(recyclingImageView)).m123613s(AbstractC16803z.icn_livelocation_default);
            }
            aVar.m43177z(inflate);
            aVar.m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_location_dialog_title, this.f56784P0.mo60752jo()));
            aVar.m43173v(2);
            aVar.m43165n(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: v50.h9
                public /* synthetic */ C27671h9() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ChatView.this.m59345RR(interfaceC17463d, i12);
                }
            });
            aVar.m43169r(AbstractC8020f0.str_send_location_dialog_btn, new InterfaceC17463d.d() { // from class: v50.i9

                /* renamed from: q */
                public final /* synthetic */ int f129740q;

                /* renamed from: r */
                public final /* synthetic */ ActionLogChatLocation.FooterLogData f129741r;

                /* renamed from: s */
                public final /* synthetic */ C18460c f129742s;

                /* renamed from: t */
                public final /* synthetic */ String f129743t;

                /* renamed from: u */
                public final /* synthetic */ String f129744u;

                public /* synthetic */ C27686i9(int i112, ActionLogChatLocation.FooterLogData footerLogData2, C18460c c18460c2, String str4, String str22) {
                    r2 = i112;
                    r3 = footerLogData2;
                    r4 = c18460c2;
                    r5 = str4;
                    r6 = str22;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ChatView.this.m59351SR(r2, r3, r4, r5, r6, interfaceC17463d, i12);
                }
            });
            C8009j c8009j = this.f56912v1;
            if (c8009j != null) {
                c8009j.dismiss();
            }
            C8009j m43152a = aVar.m43152a();
            this.f56912v1 = m43152a;
            m43152a.mo13822K();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: K4 */
    public void mo59699K4(ZaloView zaloView, String str, JSONObject jSONObject, AbstractC28207v1.h0 h0Var) {
        if (this.f56924y1) {
            RunnableC27742m9 runnableC27742m9 = new Runnable() { // from class: v50.m9

                /* renamed from: q */
                public final /* synthetic */ String f129845q;

                /* renamed from: r */
                public final /* synthetic */ JSONObject f129846r;

                /* renamed from: s */
                public final /* synthetic */ ZaloView f129847s;

                /* renamed from: t */
                public final /* synthetic */ AbstractC28207v1.h0 f129848t;

                public /* synthetic */ RunnableC27742m9(String str2, JSONObject jSONObject2, ZaloView zaloView2, AbstractC28207v1.h0 h0Var2) {
                    r2 = str2;
                    r3 = jSONObject2;
                    r4 = zaloView2;
                    r5 = h0Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59376WR(r2, r3, r4, r5);
                }
            };
            this.f56807U3 = runnableC27742m9;
            this.f72827B0.postDelayed(runnableC27742m9, 100L);
            mo60026gi();
            return;
        }
        AbstractC28207v1.m142049t3(str2, jSONObject2, zaloView2.m92676n2(), zaloView2.m92662fJ(), zaloView2.m92649TI(), m60020gQ(), m59865VP(), h0Var2);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: K5 */
    public void mo59700K5(C31973j5 c31973j5, int i11, String str, String str2) {
        JSONArray optJSONArray;
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", c31973j5.m153781r());
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("title")) {
                    bundle.putString("EXTRA_POST_CONTENT", jSONObject.optString("title"));
                }
                if (jSONObject.has("startTime")) {
                    bundle.putLong("EXTRA_START_TIME", jSONObject.optLong("startTime"));
                }
                if (jSONObject.has("emoji")) {
                    bundle.putString("EXTRA_EMOJI", jSONObject.optString("emoji"));
                }
                if (jSONObject.has("calendarType")) {
                    bundle.putInt("INT_EXTRA_CALENDAR_TYPE", jSONObject.optInt("calendarType"));
                }
                if (jSONObject.has("openTimePicker")) {
                    bundle.putBoolean("BOL_EXTRA_OPEN_TIME_PICKER", jSONObject.optBoolean("openTimePicker"));
                }
                if (jSONObject.has("repeat") && (optJSONArray = jSONObject.optJSONArray("repeat")) != null) {
                    bundle.putString("STR_EXTRA_REPEAT_RULE", optJSONArray.toString());
                }
                if (jSONObject.has("eventType") && jSONObject.optInt("eventType") == 4) {
                    bundle.putBoolean("BOL_EXTRA_IS_ANNI", true);
                    bundle.putInt("INT_EXTRA_ALLDAY", 1);
                    if (!bundle.containsKey("EXTRA_EMOJI")) {
                        bundle.putString("EXTRA_EMOJI", "🌟");
                    }
                    if (!bundle.containsKey("STR_EXTRA_REPEAT_RULE")) {
                        bundle.putString("STR_EXTRA_REPEAT_RULE", "[\"RRULE:FREQ=YEARLY\"]");
                    }
                }
                if (jSONObject.has("trackingSrc") && i11 == -2) {
                    bundle.putInt("INT_EXTRA_TRACKING_SOURCE", jSONObject.optInt("trackingSrc", -2));
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        bundle.putBoolean("extra_pin_post", false);
        bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
        m60278xU(GroupReminderComposeView.class, bundle, 1050, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: KC */
    public void mo59701KC(String str, boolean z11) {
        KeyEvent.Callback m59441iQ = m59441iQ(str);
        if (m59441iQ instanceof InterfaceC25728a) {
            ((InterfaceC25728a) m59441iQ).setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: KH */
    public void mo59702KH(String str) {
        try {
            ZaloView m92996E0 = m92649TI().m92996E0(str);
            if (m92996E0 != null) {
                m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: KI */
    public void mo59703KI(String str, boolean z11, C28212v6 c28212v6) {
        KeyEvent.Callback m59441iQ = m59441iQ(str);
        if (m59441iQ instanceof InterfaceC25728a) {
            ((InterfaceC25728a) m59441iQ).setEnableNoti(z11);
        }
        if (m59441iQ instanceof RedDotImageView) {
            AbstractC28045d8.m141480a((RedDotImageView) m59441iQ, c28212v6, this.f56738C1, AbstractC16803z.icn_toolbar_mention);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        try {
            this.f56793R1.m64759b2();
            m59261FT();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        super.mo40200KJ();
    }

    /* renamed from: KQ */
    public boolean m59704KQ() {
        return this.f56742D1;
    }

    /* renamed from: KT */
    public void m59705KT(boolean z11) {
        int i11;
        View view;
        if (mo59907YG()) {
            ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            chatAttachmentContainer.setVisibility(i11);
            if (z11) {
                view = this.f56856h1;
            } else {
                view = this.f56824Z0;
            }
            m59911YT(view);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ka */
    public void mo59706Ka(int i11) {
        mo60094l7(i11, false);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Kd */
    public boolean mo59707Kd() {
        SwipeItemListView swipeItemListView = this.f56796S0;
        if (swipeItemListView != null && swipeItemListView.m76945o2()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Kh */
    public void mo59708Kh(String str, ContactProfile contactProfile, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("uid", str);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        if (contactProfile != null) {
            bundle.putString("avt", contactProfile.f42446v);
            bundle.putString("dpn", contactProfile.f42437s);
            bundle.putString("cover", contactProfile.f42324B);
        }
        m59538wU(MutualFeedView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Kk */
    public boolean mo59709Kk() {
        ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
        if (chatAttachmentContainer != null && chatAttachmentContainer.m65317e(5)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Km */
    public void mo59710Km() {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null && chatInputBar.getVisibility() != 0) {
            this.f56824Z0.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Kn */
    public void mo59711Kn(int i11) {
        Drawable drawable;
        try {
            TextView m59344RP = m59344RP();
            if (m59344RP == null) {
                return;
            }
            if (i11 != -1) {
                drawable = AbstractC1388a.m6964f(m92686rK(), i11);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                m59344RP.setCompoundDrawables(drawable, null, null, null);
                m59344RP.setCompoundDrawablePadding(AbstractC23136l9.m118742r(5.0f));
                return;
            }
            m59344RP.setCompoundDrawables(null, null, null, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Kp */
    public void mo59712Kp(C22499f c22499f) {
        AbstractC23152n3.m119080y0(MainApplication.getAppContext(), m92676n2(), c22499f);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: L9 */
    public void mo59713L9() {
        C23595h.f114432a.m123707a(this);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: LA */
    public void mo59714LA() {
        AbstractC19444a.m101697e(new Runnable() { // from class: v50.u7
            public /* synthetic */ RunnableC27852u7() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59326OS();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: LD */
    public void mo59715LD(String str, C24277c c24277c, String str2) {
        int[] m59418eQ = m59418eQ();
        if (m59418eQ != null) {
            mo60154oz(str, c24277c, str2, m59418eQ[0], m59418eQ[1]);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: LE */
    public void mo59716LE(EnumC19450c enumC19450c, ArrayList arrayList, EnumC19449b enumC19449b, String str, AbstractC19215a abstractC19215a) {
        this.f56793R1.m64714D3(enumC19450c, arrayList, enumC19449b, str, abstractC19215a);
        this.f56793R1.m64749U2();
    }

    /* renamed from: LQ */
    public boolean m59717LQ() {
        return this.f56784P0.mo60584Ja();
    }

    /* renamed from: LT */
    void m59718LT() {
        InterfaceC11706c interfaceC11706c;
        String str;
        String m4156r0;
        String str2;
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null && (interfaceC11706c = chatInfoView.f60841U0) != null) {
            if (interfaceC11706c instanceof C11705b) {
                str = "1_1";
            } else if (interfaceC11706c instanceof C11710g) {
                str = "group";
            } else if (interfaceC11706c instanceof C11711h) {
                str = "oa";
            } else if (interfaceC11706c instanceof C11709f) {
                str = "my_cloud";
            } else {
                str = "";
            }
            if (str.equals("my_cloud") && C16805b.m89786h().m89809x() && mo60273x4()) {
                if (TextUtils.isEmpty(AbstractC0924m0.m4156r0())) {
                    m4156r0 = AbstractC23160o0.m119264k0();
                    AbstractC0924m0.m3781ef(m4156r0);
                } else {
                    m4156r0 = AbstractC0924m0.m4156r0();
                }
                C0697c0.b bVar = C0697c0.Companion;
                bVar.m1054h("mycloud_storage_visit", "first_time", m4156r0);
                bVar.m1054h("mycloud_storage_visit", "source", this.f56759H2.m114667c());
                if (AbstractC3489d.m17505m()) {
                    str2 = "free";
                } else if (C24252c.f117152a.m126600f(EnumC24251b.f117147r)) {
                    str2 = "connected";
                } else {
                    str2 = "no_connect";
                }
                bVar.m1054h("mycloud_storage_visit", "status", str2);
                return;
            }
            C0697c0.b bVar2 = C0697c0.Companion;
            bVar2.m1054h("ChatInfoView", ZinstantMetaConstant.IMPRESSION_META_TYPE, str);
            bVar2.m1054h("ChatInfoView", "threadId", AbstractC0131a.m569a(m60020gQ().mo60615Oc().m17944I0()));
        }
    }

    /* renamed from: LU */
    public void m59719LU(boolean z11, C3538f c3538f) {
        try {
            this.f56909u2 = !z11;
            this.f56913v2 = c3538f;
            mo59646G9();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ld */
    public boolean mo59720Ld() {
        return AbstractC23057e7.m118300g(m92686rK());
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Lg */
    public void mo59721Lg() {
        this.f56865j2.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (!mo60273x4() && !this.f56784P0.mo60786qg() && !mo60301zB() && !mo59727Ly()) {
            if (!mo60120mu() || !mo59778Pu()) {
                AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
                if (!(abstractPushToTalkControl instanceof PushToTalkSpeechToText) || !abstractPushToTalkControl.mo87653f()) {
                    ChatComposePanelNew chatComposePanelNew = this.f56819X3;
                    if (chatComposePanelNew == null || (!chatComposePanelNew.m75574B() && !this.f56819X3.m75575C())) {
                        ZaloView zaloView = this.f56854g3;
                        if (zaloView == null || !zaloView.m92687sJ() || this.f56854g3.m92681pJ()) {
                            LandingPageView landingPageView = this.f56872l1;
                            if (landingPageView == null || !landingPageView.m92687sJ() || this.f56872l1.m92681pJ()) {
                                if ((!m59312MQ() || (!this.f56793R1.m64829x0().m70163U0() && !this.f56793R1.m64829x0().m70166W0())) && !this.f56784P0.mo60583J0()) {
                                    return super.mo37488Li();
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Lq */
    public void mo59722Lq(String str, String str2, boolean z11) {
        ChatSearchToolbarView chatSearchToolbarView = this.f56869k2;
        if (chatSearchToolbarView != null) {
            chatSearchToolbarView.m65609b(z11, z11);
            this.f56869k2.setSearchResultPostion(str2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ls */
    public void mo59723Ls() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64784i3();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Lv */
    public boolean mo59724Lv() {
        View view = this.f56868k1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Lw */
    public void mo59725Lw(C27856ub c27856ub) {
        this.f56884o1 = c27856ub;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Lx */
    public void mo59726Lx(String str, Conversation conversation) {
        m92693xK().m93060e2(AbstractC6918a0.zalo_view_container, GroupNotificationSettingView.m80298mM(str, conversation, 3), "ManageGroupView", 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ly */
    public boolean mo59727Ly() {
        ChatDetailsView chatDetailsView = this.f56816X0;
        if (chatDetailsView != null && chatDetailsView.m92687sJ() && !this.f56816X0.m92681pJ()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: M6 */
    public boolean mo59728M6() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null && abstractPushToTalkControl.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: M7 */
    public void mo59729M7(C31973j5 c31973j5, C32018m5 c32018m5, int i11, String str) {
        Bundle bundle = new Bundle();
        if (c32018m5 != null) {
            bundle.putString("EXTRA_QUESTION", c32018m5.f147392f);
            bundle.putString("STR_EXTRA_KWD", c32018m5.f147398l);
            bundle.putStringArrayList("EXTRA_ANSWER", c32018m5.f147391e);
        }
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        bundle.putString("extra_group_id", c31973j5.m153781r());
        bundle.putString("STR_SOURCE_START_VIEW", str);
        bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
        m60278xU(GroupPollCreatingView.class, bundle, 1033, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: MH */
    public void mo59730MH(String str, C24277c c24277c, String str2) {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew == null || !chatComposePanelNew.m75574B()) {
            mo59715LD(str, c24277c, str2);
        }
    }

    /* renamed from: MP */
    public void m59731MP() {
        if (this.f56812W0 != null) {
            if (this.f56776M2) {
                this.f56776M2 = false;
                C0697c0.Companion.m1048b().m1043u("ChatView");
                m59761OT();
            }
            this.f56812W0.m65195sM();
            m92649TI().mo92702G1(this.f56812W0, 1);
            this.f56812W0 = null;
        }
    }

    /* renamed from: MT */
    public void m59732MT(int i11) {
        TextView m59344RP = m59344RP();
        if (m59344RP == null) {
            return;
        }
        m59344RP.setTextColor(i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Mb */
    public void mo59733Mb(CharSequence charSequence, int i11) {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.setText(charSequence);
            this.f56832b1.setSelection(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Mi */
    public void mo59734Mi() {
        this.f56793R1.m64726I0();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Mj */
    public void mo59735Mj() {
        C11621p0 c11621p0;
        ChatFrameLayout chatFrameLayout;
        if (!this.f56766J1 && (c11621p0 = this.f56793R1) != null && (chatFrameLayout = c11621p0.f60408d) != null) {
            chatFrameLayout.m59162D0();
            this.f56766J1 = true;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Mm */
    public int mo59736Mm() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            return c11603g0.m60494h0().size();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Mn */
    public boolean mo59737Mn() {
        RedDotImageButton redDotImageButton = this.f56836c1;
        if (redDotImageButton != null && redDotImageButton.isShown()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Mu */
    public void mo59738Mu() {
        C11621p0 c11621p0;
        ChatFrameLayout chatFrameLayout;
        if (this.f56766J1 && (c11621p0 = this.f56793R1) != null && (chatFrameLayout = c11621p0.f60408d) != null) {
            chatFrameLayout.m59187a0();
            this.f56766J1 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Mx */
    public boolean mo59739Mx() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75579G()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (z11) {
            m92693xK().m93094z(false);
        } else {
            this.f88756W = 0;
            this.f56784P0.mo60802tb();
        }
        this.f77813M0 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: NA */
    public void mo59741NA() {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.setCaption("");
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: NE */
    public void mo59742NE() {
        C3246i0.a aVar = this.f56908u1;
        if (aVar != null) {
            aVar.m16482A();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: NG */
    public void mo59743NG() {
        mo59933aH(123458, "tip.search.bysender.entry", 200);
    }

    /* renamed from: NP */
    public void m59744NP(C17945a0 c17945a0) {
        this.f56784P0.mo60812ui(c17945a0);
    }

    /* renamed from: NQ */
    public boolean m59745NQ() {
        return this.f56784P0.mo60624Q7();
    }

    /* renamed from: NT */
    public void m59746NT(int i11) {
        TextView m59344RP = m59344RP();
        if (m59344RP == null) {
            return;
        }
        m59344RP.setBackgroundResource(i11);
    }

    /* renamed from: NU */
    void m59747NU(int i11, int i12) {
        C21272r c21272r = (C21272r) C21272r.Companion.m122672a();
        if (i11 == 4 && i12 != 4) {
            if (!c21272r.m110178g()) {
                c21272r.m110177f();
            }
            c21272r.m110183l();
            c21272r.m110179h();
            c21272r.m110185n();
        } else if (i11 != 4 && i12 == 4) {
            c21272r.m110177f();
            c21272r.m110184m();
        }
        if (i12 == 4) {
            C2520a.f10235a.m12619a(m60004fQ());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Na */
    public boolean mo59748Na() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75580H()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nb */
    public void mo59749Nb() {
        try {
            this.f56858h3 = 3;
            if (this.f56924y1) {
                mo60026gi();
            }
            mo59796Qt(true);
            mo59915Yi();
            m59651GT();
            m59705KT(mo60215sw());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ni */
    public void mo59750Ni(C19411c c19411c, int i11, boolean z11) {
        mo70710wy(new Runnable() { // from class: v50.y8

            /* renamed from: q */
            public final /* synthetic */ C19411c f130196q;

            /* renamed from: r */
            public final /* synthetic */ int f130197r;

            /* renamed from: s */
            public final /* synthetic */ boolean f130198s;

            public /* synthetic */ RunnableC27909y8(C19411c c19411c2, int i112, boolean z112) {
                r2 = c19411c2;
                r3 = i112;
                r4 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59420eS(r2, r3, r4);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nj */
    public void mo59751Nj(boolean z11) {
        this.f56793R1.f60392Q = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nm */
    public void mo59752Nm(boolean z11) {
        int i11;
        View view = this.f56861i2;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nt */
    public void mo59753Nt(EnumC2667d enumC2667d) {
        if (this.f56828a1 == null && m59258FQ(enumC2667d)) {
            MyCloudQuotaBanner m59191g = this.f56793R1.f60408d.m59191g();
            this.f56828a1 = m59191g;
            m59191g.post(new Runnable() { // from class: v50.ka
                public /* synthetic */ RunnableC27715ka() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59358TS();
                }
            });
            this.f56828a1.setListener(new C11288j0());
        }
        MyCloudQuotaBanner myCloudQuotaBanner = this.f56828a1;
        if (myCloudQuotaBanner != null) {
            myCloudQuotaBanner.m70233b0(enumC2667d);
            mo59573BB(true);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nv */
    public void mo59754Nv() {
        mo70710wy(new Runnable() { // from class: v50.l9
            public /* synthetic */ RunnableC27728l9() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59333PS();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nw */
    public void mo59755Nw(MessageId messageId, String str, boolean z11, boolean z12) {
        ChatEmptyView chatEmptyView;
        try {
            m59252EP(messageId, str);
            if (this.f56784P0.mo60624Q7() && (chatEmptyView = this.f56775M1) != null) {
                chatEmptyView.m60863k0(messageId, z11, z12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nx */
    public void mo59756Nx() {
        AnimChat animChat = this.f56762I1;
        if (animChat != null) {
            animChat.m76109R();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ny */
    public void mo59757Ny(Editable editable, int i11, int i12, boolean z11) {
        if (this.f56736B3) {
            this.f56736B3 = false;
            return;
        }
        if (editable == null) {
            return;
        }
        try {
            int length = editable.length();
            if (length > 0) {
                int i13 = length - 1;
                int min = Math.min(i13, i11);
                int min2 = Math.min(i13, i11 + i12);
                while (min > 0 && !Character.isWhitespace(editable.charAt(min))) {
                    min--;
                }
                while (min2 < length && !Character.isWhitespace(editable.charAt(min2))) {
                    min2++;
                }
                float f11 = 0.0f;
                if (!this.f56924y1 && z11) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
                    C28652r m143349v = C28652r.m143349v();
                    if (this.f56785P1 > 0) {
                        f11 = this.f56832b1.getTextSize();
                    }
                    if (m143349v.m143363Y(spannableStringBuilder, min, min2, f11)) {
                        this.f56832b1.removeTextChangedListener(this);
                        this.f56832b1.setText(spannableStringBuilder);
                        this.f56832b1.setSelection(min2);
                        this.f56832b1.addTextChangedListener(this);
                        return;
                    }
                    return;
                }
                C28652r m143349v2 = C28652r.m143349v();
                if (this.f56785P1 > 0) {
                    f11 = this.f56832b1.getTextSize();
                }
                m143349v2.m143363Y(editable, min, min2, f11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Nz */
    public void mo59758Nz() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_chat_owner_id", m60020gQ().mo60615Oc().m17944I0());
        m59538wU(AppListingView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: OE */
    public boolean mo59759OE() {
        ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
        if (chatAttachmentContainer != null && chatAttachmentContainer.m65317e(7)) {
            return true;
        }
        return false;
    }

    /* renamed from: OQ */
    public boolean m59760OQ() {
        return this.f56784P0.mo60542Bk();
    }

    /* renamed from: OT */
    void m59761OT() {
        String str;
        boolean mo60624Q7 = m60020gQ().mo60624Q7();
        C0697c0.b bVar = C0697c0.Companion;
        if (mo60624Q7) {
            str = "group";
        } else {
            str = "1_1";
        }
        bVar.m1054h("ChatView", ZinstantMetaConstant.IMPRESSION_META_TYPE, str);
        bVar.m1054h("ChatView", "threadId", AbstractC0131a.m569a(m60020gQ().mo60615Oc().m17944I0()));
        C27856ub c27856ub = this.f56884o1;
        if (c27856ub != null && !TextUtils.isEmpty(c27856ub.f130055M)) {
            bVar.m1054h("ChatView", "openChat", Boolean.TRUE);
            bVar.m1054h("ChatView", "source", this.f56884o1.f130055M);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Oa */
    public void mo59762Oa() {
        try {
            this.f56793R1.m64766e0(true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Od */
    public boolean mo59763Od() {
        return this.f56819X3.m75610y();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Oe */
    public void mo59764Oe() {
        this.f56793R1.m64744Q3();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Oh */
    public void mo59765Oh(String str, boolean z11, boolean z12) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putBoolean("BOL_IS_EDIT_MODE", z11);
        bundle.putBoolean("EXTRA_IS_COMMUNITY", z12);
        m60278xU(GroupInformationView.class, bundle, 0, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Om */
    public boolean mo59766Om() {
        return this.f56881n2 != null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Os */
    public void mo59767Os(ArrayList arrayList, String str, String str2) {
        C23459d.f113954a.m123165d(this.f72421L0, arrayList, str, str2);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ox */
    public void mo59768Ox() {
        try {
            if (this.f56840d1 != null) {
                m59359TT(false);
                m59528vQ();
                m59334PT(false);
                int i11 = this.f56858h3;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                mo60053il();
                            }
                        } else {
                            if (mo59611Dd().length() <= 0 && (!mo59907YG() || mo60215sw())) {
                                mo60150oi();
                            }
                            mo59871Vf();
                        }
                    } else {
                        mo59871Vf();
                    }
                } else {
                    mo60150oi();
                }
            }
            View view = this.f56844e1;
            if (view != null) {
                this.f56793R1.f60408d.removeView(view);
                this.f56793R1.f60408d.f56696h0 = null;
                this.f56844e1 = null;
                this.f56840d1 = null;
                this.f56852g1 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: P0 */
    public boolean mo59769P0() {
        if (getContext() != null && AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.f112033j) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
    /* renamed from: P1 */
    public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: P4 */
    public void mo59770P4(boolean z11) {
        Button button = this.f56911u4;
        if (button != null) {
            button.setEnabled(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: PG */
    public void mo59771PG(String str, long j11, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_event_id", str);
        bundle.putBoolean("extra_shortcut_calendar", true);
        if (j11 > Long.MIN_VALUE) {
            bundle.putLong("LONG_EXTRA_EVENT_START_TIME", j11);
        }
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        m59538wU(GroupEventDetailView.class, bundle, 1);
    }

    /* renamed from: PQ */
    public boolean m59772PQ() {
        if (this.f72421L0.m92662fJ() != null && !(this.f72421L0.m92662fJ().m93012K0() instanceof ChatView)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Pa */
    public void mo59773Pa() {
        Bundle bundle = new Bundle();
        if (AbstractC23304d.f113263C1) {
            bundle.putString("CALL_FROM_STRANGER_SETTING_ENTRY_POINT", "msg_info");
            this.f72421L0.m92662fJ().m93069k2(SettingCallFromStrangerView.class, bundle, 1, true);
        } else {
            bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 149);
            this.f72421L0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Pf */
    public void mo59774Pf(String str, String str2) {
        m59538wU(FrameLayoutKeepBtmSheetZaloView.class, ChangeAliasBottomSheetView.m37079HM(str, str2, 690, "rmenu", "1", new SensitiveData("phonebook_update_alias_in_csc_right_menu", "phonebook_update")), 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ph */
    public void mo59775Ph() {
        if (m92676n2() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (this.f56784P0.mo60587Jf()) {
            bundle.putString("RECEIVER_NAME_FIELD", this.f56784P0.mo60615Oc().m17971y0().m40999b(true, false));
        }
        m92676n2().mo35579p().m93066i2(BottomSheetVideoHdOnboard.class, bundle, 1018, 1, true);
        C2526d.f10270a.m12683I0(m60004fQ());
        AbstractC0924m0.m3882hq(true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Po */
    public void mo59776Po(EnumC19450c enumC19450c, ArrayList arrayList, EnumC19449b enumC19449b, String str) {
        this.f56793R1.m64773f3(arrayList, str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Pp */
    public AbstractC28207v1.f0 mo59777Pp(String str, String str2) {
        return new C11302q0(str, str2);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Pu */
    public boolean mo59778Pu() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null && abstractPushToTalkControl.m87652e()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Pv */
    public void mo59779Pv(MessageId messageId) {
        if (this.f56792R0 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setUnreadSeparator(");
        sb2.append(messageId);
        sb2.append(")");
        this.f56792R0.m60476H0(messageId);
        if (messageId != null) {
            this.f56792R0.m64561h2();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Px */
    public void mo59780Px(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("zinstant_api_info", str);
        bundle.putString("CONVERSATION_ID", this.f56784P0.mo60615Oc().m17944I0());
        bundle.putBoolean("is.group.chat", m59745NQ());
        m60278xU(QRWalletBottomSheetZinstantView.class, bundle, 1062, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Py */
    public void mo59781Py(String str, long j11) {
        ToastUtils.m89266n(AbstractC8020f0.str_feature_disabled, new Object[0]);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Pz */
    public void mo59782Pz(String str) {
        ChatFilterSearchAdapter chatFilterSearchAdapter = this.f56877m2;
        if (chatFilterSearchAdapter != null) {
            chatFilterSearchAdapter.m65597S(str);
            this.f56877m2.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Q1 */
    public void mo59783Q1(String str) {
        C23283z7.m120378k(m92676n2(), str, 0, Integer.valueOf(AbstractC23136l9.m118742r(84.0f)));
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Q4 */
    public void mo59784Q4(String str, String str2, String str3, int i11) {
        int i12;
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", i11);
        bundle.putString("EXTRA_DATA", str);
        bundle.putString("GROUP_ID", str2);
        bundle.putString("CONVERSATION_ID", str3);
        if (i11 == 16) {
            i12 = 1054;
        } else {
            i12 = 0;
        }
        m60278xU(FrameLayoutKeepBtmSheetZaloView.class, bundle, i12, 2, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Q6 */
    public void mo59785Q6() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && !mo60124n3()) {
            AbstractC23136l9.m118686X0(m92676n2.getWindow(), false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: QF */
    public void mo59786QF(int i11) {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75607v(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: QH */
    public boolean mo59787QH() {
        if (m60100lQ() instanceof ChatView) {
            return true;
        }
        if (mo60124n3() && m60100lQ() == null) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        try {
            if (!TextUtils.isEmpty(m60020gQ().mo60615Oc().m17944I0()) && !mo60301zB()) {
                if (mo59727Ly()) {
                    this.f56816X0.mo37491QJ(i11);
                    return true;
                }
                ChatComposePanelNew chatComposePanelNew = this.f56819X3;
                if (chatComposePanelNew != null) {
                    if (!chatComposePanelNew.m75575C() && !this.f56819X3.m75574B()) {
                        this.f56819X3.m75604r(m60004fQ(), false);
                    }
                    this.f56819X3.m75588R(i11);
                    return true;
                }
                if (this.f56793R1.m64763d1()) {
                    if (i11 == 16908332) {
                        this.f56793R1.m64726I0();
                    }
                    return true;
                }
                ContactProfile mo60633Rc = m60020gQ().mo60633Rc();
                if (mo60633Rc != null && mo60633Rc.m40368H0() != 0 && mo60633Rc.m40370I0()) {
                    this.f56784P0.mo60843z4(i11);
                }
                if (i11 == AbstractC6918a0.menu_drawer) {
                    this.f56784P0.mo60822vo();
                    this.f56759H2 = C21956b.b.f108084u;
                    this.f56784P0.mo64157fg("678910000", "678920000", "678930000", "678940000");
                } else if (i11 == AbstractC6918a0.menu_call_video) {
                    if (mo60273x4() && (actionBarMenu2 = this.f88763d0) != null) {
                        actionBarMenu2.m92753w();
                    }
                    this.f56784P0.mo60590Jo(m60100lQ() instanceof GroupLiveStreamView);
                } else if (i11 == AbstractC6918a0.menu_call) {
                    if (mo60273x4() && (actionBarMenu = this.f88763d0) != null) {
                        actionBarMenu.m92753w();
                    }
                    this.f56784P0.mo60827wh(m60100lQ() instanceof GroupLiveStreamView);
                } else if (i11 == AbstractC6918a0.menu_chat_add_member) {
                    this.f56784P0.mo60575Hn();
                } else if (i11 == AbstractC6918a0.menu_group_call) {
                    InterfaceC11320c interfaceC11320c = this.f56784P0;
                    if (interfaceC11320c != null) {
                        interfaceC11320c.mo60678Zf("csc_topbar_icon");
                    }
                } else if (i11 == AbstractC6918a0.menu_chat_search_msg) {
                    this.f56784P0.mo60619Pa();
                } else if (i11 == AbstractC6918a0.menu_mutual_feed) {
                    this.f56784P0.mo60795sg();
                } else if (i11 == AbstractC6918a0.menu_chat_media_store) {
                    this.f56784P0.mo60625Qa();
                } else if (i11 == 16908332) {
                    if (mo60120mu()) {
                        return false;
                    }
                    this.f56784P0.mo60687ak(mo60273x4(), mo59727Ly(), this.f56853g2);
                } else if (i11 == AbstractC6918a0.change_mode_chat_view) {
                    this.f56784P0.mo60601Ln(null);
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: QP */
    public void m59788QP() {
        this.f56854g3.finish();
        this.f56854g3 = null;
    }

    /* renamed from: QQ */
    public boolean m59789QQ(MessageId messageId) {
        MessageId messageId2 = this.f56885o2;
        if (messageId2 != null && messageId2.equals(messageId)) {
            return true;
        }
        return false;
    }

    /* renamed from: QT */
    public void m59790QT(boolean z11) {
        this.f56928z1 = z11;
    }

    /* renamed from: QU */
    public void m59791QU(C17945a0 c17945a0, boolean z11, String str) {
        if (c17945a0 != null) {
            try {
                if (c17945a0.m95250s6()) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
                return;
            }
        }
        if (z11) {
            ZaloView m92996E0 = m92649TI().m92996E0("fragment_chat_details");
            if (m92996E0 instanceof ChatDetailsView) {
                this.f56816X0 = (ChatDetailsView) m92996E0;
                return;
            }
            return;
        }
        this.f56784P0.mo60770n9(c17945a0, str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Qg */
    public void mo59792Qg(ArrayList arrayList) {
        C11815a c11815a = this.f56793R1.f60440t;
        if (c11815a != null) {
            c11815a.m65705w0(arrayList);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Qm */
    public void mo59793Qm() {
        if (!this.f56779N2.hasMessages(123461)) {
            this.f56779N2.sendEmptyMessageDelayed(123461, 100L);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Qp */
    public void mo59794Qp(boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_CONTACT_PROFILE", this.f56784P0.mo60615Oc().m17971y0().m40998a().m40373K());
        if (z11) {
            bundle.putBoolean("EXTRA_BOOL_UNSELECT", true);
        }
        bundle.putInt("EXTRA_ENTRY_SCREEN", BottomSheetBlockView.EnumC11169b.f56202q.m58496c());
        m92676n2().mo35573l4(BottomSheetBlockView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Qr */
    public void mo59795Qr(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", str);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        m60278xU(PinBoardView.class, bundle, 1052, 2, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Qt */
    public void mo59796Qt(boolean z11) {
        try {
            if (z11) {
                if (this.f56860i1 == null) {
                    this.f56860i1 = this.f56793R1.f60408d.m59172L();
                }
                AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
                if (abstractPushToTalkControl != null) {
                    abstractPushToTalkControl.setTrackingLogChatType(m60004fQ());
                    this.f56860i1.setPttListener(new C11308t0());
                    this.f56860i1.setVisibility(0);
                    ChatComposePanelNew chatComposePanelNew = this.f56819X3;
                    if (chatComposePanelNew != null && !chatComposePanelNew.m75574B()) {
                        m59958cP();
                    }
                    if (this.f56925y2) {
                        this.f56860i1.mo87648a();
                        this.f56925y2 = false;
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f56860i1 != null) {
                mo59572B6();
                m60276xQ();
                m59564AP();
                mo60051id(121);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Qu */
    public void mo59797Qu(String str) {
        AbstractC23211s7.m119564D(str, m92676n2(), 1041);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Qz */
    public boolean mo59798Qz() {
        ChatDetailsView chatDetailsView = this.f56816X0;
        if (chatDetailsView != null && chatDetailsView.m92674mJ()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: RB */
    public void mo59799RB(C32002l4 c32002l4) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, c32002l4).m135743b(), 0, 1));
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: RF */
    public void mo59800RF() {
        synchronized (this.f56753F4) {
            try {
                this.f56749E4 = true;
                ChatComposePanelNew chatComposePanelNew = this.f56819X3;
                if (chatComposePanelNew != null) {
                    chatComposePanelNew.m75596c0();
                }
                m60290yQ(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: RH */
    public void mo59801RH(boolean z11) {
        this.f56880n1 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        this.f56892q1 = 0L;
        this.f56784P0.mo60567Ga(this.f56924y1);
        try {
            boolean m136837b = C26664o.m136836a().m136837b(this.f56784P0.mo60615Oc().m17944I0());
            if (!m136837b) {
                m59295JU();
            }
            if (this.f56924y1 && !m136837b && !this.f56837c2) {
                mo60026gi();
            } else {
                this.f56837c2 = false;
            }
            this.f56742D1 = false;
            mo59572B6();
            m59623ET();
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f56904t1;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                this.f56904t1.dismiss();
            }
            mo60051id(169);
            mo60051id(135);
            mo60051id(140);
            this.f56793R1.m64764d2();
            m59528vQ();
            ChatInputBar chatInputBar = this.f56824Z0;
            if (chatInputBar != null) {
                chatInputBar.m65407p();
            }
            ShowcaseView showcaseView = this.f56786P2;
            if (showcaseView != null && showcaseView.getParent() != null) {
                this.f56786P2.m74634n();
            }
            mo60051id(128);
            ZMediaPlayer.setStopAllUrlCaching(ZMediaPlayerSettings.getVideoConfig(0));
            mo59922Z6();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        super.mo13886RJ();
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            c11603g0.m64556Z1();
        }
        KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f56859h4;
        if (keyEventCallbackC17462c2 != null && keyEventCallbackC17462c2.m92868m()) {
            this.f56859h4.dismiss();
        }
        m59243CU();
        if (this.f56776M2) {
            C0697c0.Companion.m1048b().m1035h("ChatInfoView");
        } else {
            C0697c0.Companion.m1048b().m1035h("ChatView");
        }
    }

    /* renamed from: RQ */
    public boolean m59802RQ(MessageId messageId) {
        MessageId messageId2 = this.f56881n2;
        if (messageId2 != null && messageId2.equals(messageId)) {
            return true;
        }
        return false;
    }

    /* renamed from: RT */
    public void m59803RT(int i11, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        if (!m60020gQ().mo60736hf(i11)) {
            return;
        }
        if (i11 == 6) {
            m59452jT();
        }
        if (this.f56846e3 == 6 && i11 != 6) {
            m59426fT();
        }
        m59747NU(this.f56846e3, i11);
        this.f56846e3 = i11;
        m59315MU(z11, z12, z13);
        if (this.f56846e3 == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        mo59573BB(z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: RU */
    public void m59804RU(InterfaceC11475g0 interfaceC11475g0, C31883d5 c31883d5, String str) {
        float dimension;
        try {
            if (!(interfaceC11475g0 instanceof View)) {
                return;
            }
            if (this.f56924y1) {
                mo60094l7(0, false);
            }
            if (System.currentTimeMillis() - this.f56750F1 < 1000) {
                return;
            }
            this.f56779N2.postDelayed(new Runnable() { // from class: v50.fb
                public /* synthetic */ RunnableC27643fb() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59370VS();
                }
            }, 200L);
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_content", c31883d5);
            bundle.putString("extra_title", str);
            if (interfaceC11475g0.getMessage() != null) {
                bundle.putParcelable("extra_cli_id", interfaceC11475g0.getMessage().m95029V3());
            }
            ChatSettingBanner chatSettingBanner = this.f56804U0;
            if (chatSettingBanner != null && chatSettingBanner.getVisibility() == 0) {
                dimension = m92651WI().getDimension(AbstractC17454d.action_bar_default_height) + this.f56804U0.getHeight();
            } else {
                dimension = m92651WI().getDimension(AbstractC17454d.action_bar_default_height);
            }
            int i11 = (int) dimension;
            int dimension2 = (int) m92651WI().getDimension(AbstractC16802y.abs__action_bar_default_height);
            C20275e c20275e = new C20275e();
            c20275e.m105882u(i11);
            c20275e.m105881t(dimension2);
            c20275e.m105860F((View) interfaceC11475g0);
            if (getContext() != null) {
                if (mo60124n3()) {
                    m92693xK().mo57057c2(AbstractC6918a0.chat_head_full_container, GifViewerZView.class, bundle, 0, null, 1, true);
                } else if (getContext() instanceof BaseZaloActivity) {
                    ((BaseZaloActivity) getContext()).m56685I3(interfaceC11475g0, c31883d5.f146450r, bundle, c20275e, 2);
                } else {
                    m59538wU(GifViewerZView.class, bundle, 0);
                }
            }
        } catch (Resources.NotFoundException e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ra */
    public void mo59805Ra(boolean z11) {
        C11621p0 c11621p0;
        if (!mo78963ru() || this.f56796S0 == null) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveListMsgToBottom(");
            sb2.append(z11);
            sb2.append(")");
            this.f56921x2 = EnumC20344j.f100337s;
            if (this.f56849f2 > 0) {
                if (System.currentTimeMillis() - this.f56849f2 >= 1000) {
                }
                this.f56796S0.m76952y2();
                c11621p0 = this.f56793R1;
                if (c11621p0 == null && c11621p0.m64818t0() != null) {
                    this.f56779N2.post(new Runnable() { // from class: v50.ra
                        public /* synthetic */ RunnableC27813ra() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatView.this.m59247DR();
                        }
                    });
                    return;
                }
            }
            if (!m60020gQ().mo60750jl() && !mo59813S7() && this.f56796S0.getChildCount() != 0) {
                this.f56796S0.m76951x2(z11);
                return;
            }
            this.f56796S0.m76952y2();
            c11621p0 = this.f56793R1;
            if (c11621p0 == null) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Rh */
    public void mo59806Rh() {
        if (this.f56792R0 == null) {
            return;
        }
        this.f56792R0.m10008p();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Rk */
    public void mo59807Rk(boolean z11) {
        int i11;
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionEditText.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Rl */
    public Editable mo59808Rl() {
        try {
            ActionEditText actionEditText = this.f56832b1;
            if (actionEditText != null) {
                return actionEditText.getText();
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Rm */
    public void mo59809Rm() {
        RunnableC2375u runnableC2375u = new RunnableC2375u(this.f56832b1);
        this.f56822Y2 = runnableC2375u;
        this.f56779N2.postDelayed(runnableC2375u, 500L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Rv */
    public boolean mo59810Rv() {
        AnimTypingTextView animTypingTextView = this.f56864j1;
        if (animTypingTextView != null && animTypingTextView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Rw */
    public void mo59811Rw(String str, String str2, C31973j5 c31973j5) {
        Bitmap bitmap;
        if (c31973j5 != null) {
            GroupAvatarView groupAvatarView = new GroupAvatarView(getContext());
            if (c31973j5.m153786t0()) {
                groupAvatarView.m75732d(c31973j5.m153756e());
            } else {
                groupAvatarView.m75733e(c31973j5.m153762h());
            }
            bitmap = groupAvatarView.getBitmap();
        } else {
            bitmap = null;
        }
        AbstractC23152n3.m119063q(m92676n2(), str, str2, bitmap);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: S4 */
    public void mo59812S4(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                MediaItem mediaItem = (MediaItem) list.get(i11);
                if (mediaItem != null) {
                    arrayList.add(mediaItem);
                }
            }
        }
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75605s(arrayList);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: S7 */
    public boolean mo59813S7() {
        return this.f56889p2;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: SB */
    public void mo59814SB() {
        ActionBarMenuItem actionBarMenuItem = this.f56882n3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        C32100s1.m154953d().m154968r();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: SC */
    public void mo59815SC() {
        if (this.f56887o4 != null) {
            this.f56867j4.setVisibility(8);
            this.f56887o4.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.slide_left_in);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.slide_left_out);
            this.f56887o4.startAnimation(loadAnimation);
            this.f56867j4.startAnimation(loadAnimation2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: SD */
    public void mo59816SD(ChatAttachmentContainer.C11728c c11728c) {
        this.f56856h1.m65321l(c11728c);
        m59911YT(this.f56856h1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        String str;
        boolean z11;
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                m92642L3.putInt("INT_EXTRA_ATTACHMENT_ID_HIGHLIGHT", Integer.MIN_VALUE);
                mo60305zK(m92642L3);
            }
            InterfaceC19968g mo50381fi = this.f56784P0.mo50381fi();
            if (mo50381fi instanceof C27675hd) {
                C27675hd c27675hd = (C27675hd) mo50381fi;
                c27675hd.f129707a = this.f56846e3;
                c27675hd.f129708b = this.f56797S1;
                AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
                if (abstractPushToTalkControl != null) {
                    str = abstractPushToTalkControl.getFileRecordName();
                } else {
                    str = null;
                }
                c27675hd.f129710d = str;
                c27675hd.f129713g = this.f56841d2;
                c27675hd.f129714h = this.f56845e2;
                ZaloCameraView m94488d = EnumC17910b.INSTANCE.m94488d();
                if (m94488d != null && m60100lQ() == m94488d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c27675hd.f129709c = z11;
                C11621p0 c11621p0 = this.f56793R1;
                if (c11621p0 != null) {
                    c11621p0.m64772f2(c27675hd);
                }
                C27675hd.m140769b(bundle, c27675hd);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        super.mo37118SJ(bundle);
    }

    /* renamed from: SQ */
    public boolean m59817SQ() {
        boolean isInMultiWindowMode;
        if (Build.VERSION.SDK_INT >= 24 && (getContext() instanceof Activity)) {
            isInMultiWindowMode = ((Activity) getContext()).isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: SU */
    public void m59818SU(InterfaceC11475g0 interfaceC11475g0, String str, Bundle bundle, int i11, SparseIntArray sparseIntArray, SparseArray sparseArray) {
        if (this.f56924y1) {
            mo60094l7(0, false);
            return;
        }
        if (System.currentTimeMillis() - this.f56750F1 < 1000) {
            return;
        }
        this.f56779N2.postDelayed(new Runnable() { // from class: v50.gb
            public /* synthetic */ RunnableC27658gb() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59377WS();
            }
        }, 200L);
        if (interfaceC11475g0.getPhotoCoords() == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ((View) interfaceC11475g0).getParent();
        C11297o c11297o = new C11297o();
        c11297o.m105861G(new C2370r0(viewGroup));
        c11297o.m105865K(i11);
        c11297o.m105857C(sparseIntArray);
        c11297o.m105859E(sparseArray);
        c11297o.m105887z(true);
        m59928ZT(c11297o);
        if (m92676n2() != null) {
            m92676n2().mo35551H2(interfaceC11475g0, str, bundle, c11297o, 1018);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Sb */
    public void mo59819Sb() {
        if (this.f56857h2 != null) {
            mo60064jE(false);
            this.f56793R1.f60408d.removeView(this.f56857h2);
            this.f56793R1.f60408d.f56692d0 = null;
            this.f56857h2 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Sd */
    public void mo59820Sd(ArrayList arrayList, int i11, String str, boolean z11, boolean z12) {
        int i12;
        Bundle bundle = new Bundle();
        if (z11) {
            i12 = 8;
        } else {
            i12 = 2;
        }
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", i12);
        bundle.putParcelableArrayList("medialist", arrayList);
        bundle.putInt("currentIndex", i11);
        bundle.putString("EXTRA_STR_CONVERSATION_ID", str);
        bundle.putBoolean("EXTRA_BOL_IS_GROUP_AVATAR", z11);
        bundle.putBoolean("EXTRA_BOL_ENABLE_SHARE", z12);
        C20275e c20275e = new C20275e();
        c20275e.m105883v(true);
        if (m92676n2() != null) {
            m92676n2().mo35556V(null, null, bundle, c20275e, 1039);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Sg */
    public void mo59821Sg() {
        try {
            if (!mo60273x4()) {
                this.f56793R1.m64779h2();
            }
            ChatInfoView chatInfoView = this.f56812W0;
            if (chatInfoView != null) {
                chatInfoView.m65167PM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Sm */
    public boolean mo59822Sm() {
        return this.f56742D1 && this.f56888p1;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Sq */
    public boolean mo59823Sq() {
        return this.f56732A3;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ss */
    public void mo59824Ss(CharSequence charSequence) {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null && actionEditText.getText() != null) {
            Editable text = this.f56832b1.getText();
            int length = text.length();
            int length2 = text.length();
            if (this.f56832b1.isFocused()) {
                int selectionStart = this.f56832b1.getSelectionStart();
                int selectionEnd = this.f56832b1.getSelectionEnd();
                int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                length2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                length = max;
            }
            text.replace(length, length2, charSequence);
            this.f56832b1.setSelection(length + charSequence.length());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Su */
    public void mo59825Su(ArrayList arrayList, String str) {
        int i11;
        Rect bubbleRect;
        if (!m92681pJ() && !m92677nJ() && str != null && !str.isEmpty()) {
            try {
                int m59909YP = m59909YP();
                int mo59967cn = mo59967cn();
                if (m59909YP == 0) {
                    i11 = m59959cQ();
                } else {
                    i11 = 0;
                }
                int i12 = -1;
                for (int i13 = m59909YP; i13 <= mo59967cn && i12 == -1; i13++) {
                    C28771c c28771c = (C28771c) this.f56792R0.m60492f0(i13);
                    if (c28771c != null) {
                        if (c28771c.m143962v()) {
                            for (C17945a0 c17945a0 : c28771c.m143950j()) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (c17945a0.m95135f9((MessageId) it.next())) {
                                            i12 = (i13 - m59909YP) + i11;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (i12 >= 0) {
                                    break;
                                }
                            }
                        } else {
                            C17945a0 m143951k = c28771c.m143951k();
                            if (m143951k != null) {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (m143951k.m95135f9((MessageId) it2.next())) {
                                            i12 = (i13 - m59909YP) + i11;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (i12 >= 0) {
                    View childAt = this.f56796S0.getChildAt(i12);
                    if ((childAt instanceof InterfaceC11475g0) && (bubbleRect = ((InterfaceC11475g0) childAt).getBubbleRect()) != null) {
                        int[] iArr = new int[2];
                        childAt.getLocationInWindow(iArr);
                        int width = iArr[0] + bubbleRect.left + (bubbleRect.width() / 2);
                        int height = iArr[1] + bubbleRect.top + (bubbleRect.height() / 2);
                        if (mo60124n3() && m92656bJ() != null) {
                            height -= m92656bJ().getTop();
                        }
                        mo60199ro(str, width, height);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Sx */
    public boolean mo59826Sx() {
        return this.f56792R0.m60500o0(m59909YP(), mo59967cn());
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: T4 */
    public void mo59827T4(ContactProfile contactProfile, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("wantToAddFriendProfile", contactProfile);
        bundle.putString("errorMsgSendFriendRequest", str);
        if (m92676n2() != null) {
            mo70710wy(new Runnable() { // from class: v50.s9

                /* renamed from: q */
                public final /* synthetic */ Bundle f129989q;

                public /* synthetic */ RunnableC27826s9(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59544xS(r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: T5 */
    public void mo59828T5(C24277c c24277c) {
        LiveEmojiButton liveEmojiButton = this.f56839c4;
        if (liveEmojiButton != null) {
            liveEmojiButton.setEmoji(c24277c);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: T8 */
    public void mo59829T8(String str, boolean z11, InterfaceC3299a interfaceC3299a, boolean z12, boolean z13) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64711C2(str, z11, interfaceC3299a, z12, z13);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: T9 */
    public void mo59830T9() {
        View view;
        this.f56793R1.m64731K0();
        if (mo59907YG()) {
            view = this.f56856h1;
        } else {
            view = this.f56824Z0;
        }
        m59911YT(view);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: TD */
    public void mo59831TD() {
        mo70710wy(this.f56862i3);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: TE */
    public void mo59832TE(C31890dc c31890dc) {
        int i11;
        if (c31890dc != null) {
            try {
                ActionEditText actionEditText = this.f56832b1;
                if (actionEditText != null) {
                    actionEditText.removeTextChangedListener(this);
                    Editable mo59808Rl = mo59808Rl();
                    int selectionStart = this.f56832b1.getSelectionStart();
                    int selectionEnd = this.f56832b1.getSelectionEnd();
                    this.f56832b1.setText("");
                    this.f56832b1.setHintTextColor(c31890dc.m153238c());
                    this.f56832b1.setText(mo59808Rl);
                    this.f56832b1.setSelection(selectionStart, selectionEnd);
                    this.f56832b1.addTextChangedListener(this);
                    this.f56832b1.setTextColor(c31890dc.m153237b());
                    ActionEditText actionEditText2 = this.f56832b1;
                    if (c31890dc.m153249t()) {
                        i11 = c31890dc.f146497c;
                    } else {
                        i11 = c31890dc.f146497c - 6;
                    }
                    actionEditText2.setTextSize(1, i11);
                    Typeface m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
                    if (m153062r0 != null) {
                        this.f56832b1.setTypeface(m153062r0);
                    }
                    if (c31890dc.f146495a == 0) {
                        this.f56832b1.setLineSpacing(0.0f, 1.0f);
                        return;
                    }
                    float f11 = ((r0 - 6) * c31890dc.f146502h) / c31890dc.f146497c;
                    Paint.FontMetrics fontMetrics = this.f56832b1.getPaint().getFontMetrics();
                    this.f56832b1.setLineSpacing((AbstractC23136l9.m118742r(f11) * C13778s1.m76962c()) - ((int) (fontMetrics.descent - fontMetrics.ascent)), 1.0f);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: TF */
    public void mo59833TF() {
        mo60094l7(0, false);
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.setInputMode(0);
        }
        mo59686If(0L);
        mo59916Ym();
        this.f56784P0.mo60602M5();
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null) {
            abstractPushToTalkControl.setRecordSupport(false);
        }
        if (mo59907YG()) {
            this.f56856h1.m65316d();
            mo60133na();
            mo60235u8(true);
        }
        PinTopicBanner pinTopicBanner = this.f56772L1;
        if (pinTopicBanner != null) {
            pinTopicBanner.setVisibility(8);
        }
        View view = this.f56868k1;
        if (view != null) {
            view.setVisibility(8);
        }
        ChatSettingBanner chatSettingBanner = this.f56804U0;
        if (chatSettingBanner != null) {
            chatSettingBanner.setVisibility(8);
        }
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0.f60398W != null) {
            c11621p0.m64808p3(false);
        }
        FloatingPromoteTrendingStickerModulesView floatingPromoteTrendingStickerModulesView = this.f56793R1.f60435q0;
        if (floatingPromoteTrendingStickerModulesView != null) {
            floatingPromoteTrendingStickerModulesView.setVisibility(8);
        }
        StickyNotiLiveStreamingBar stickyNotiLiveStreamingBar = this.f56793R1.f60396U;
        if (stickyNotiLiveStreamingBar != null) {
            stickyNotiLiveStreamingBar.setVisibility(8);
        }
        E2eeWarningBanner e2eeWarningBanner = this.f56876m1;
        if (e2eeWarningBanner != null) {
            e2eeWarningBanner.setVisibility(8);
        }
        mo59573BB(false);
        if (C21373a.f104231a.m110807w().m110825b() && m59312MQ()) {
            this.f56793R1.m64829x0().getCarouselMyCloudCollectionView().m70000w(false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        if (m92676n2() != null && m92674mJ()) {
            if (this.f88760a0 != null) {
                m59302KU();
                this.f88760a0.setTitle("");
                this.f88760a0.setSubtitle("");
                AbstractC23201r8.m119531a(this.f88760a0.getBackButtonImage(), AbstractC8020f0.tb_btn_home);
                mo60001fG(null);
                m59746NT(0);
                mo59711Kn(-1);
                this.f88760a0.setOnClickListener(new View.OnClickListener() { // from class: v50.j8
                    public /* synthetic */ ViewOnClickListenerC27699j8() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatView.this.m59369VR(view);
                    }
                });
            }
            if (this.f56754G1) {
                this.f56784P0.mo60701cp();
            }
            invalidateOptionsMenu();
        }
    }

    /* renamed from: TP */
    public C11603g0 m59834TP() {
        return this.f56792R0;
    }

    /* renamed from: TQ */
    public boolean m59835TQ() {
        return this.f56924y1;
    }

    /* renamed from: TU */
    public void m59836TU(ChatRowVideoLiveStream chatRowVideoLiveStream) {
        float f11;
        float dimension;
        try {
            if (this.f56924y1) {
                mo60094l7(0, false);
            }
            if (System.currentTimeMillis() - this.f56750F1 < 1000) {
                return;
            }
            this.f56779N2.postDelayed(new Runnable() { // from class: v50.db
                public /* synthetic */ RunnableC27613db() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59384XS();
                }
            }, 200L);
            String str = ((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91169C;
            String str2 = ((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91172F;
            if (((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91170D > 0 && ((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91171E > 0) {
                f11 = (((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91170D * 1.0f) / ((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91171E;
            } else {
                f11 = 0.0f;
            }
            Bundle bundle = new Bundle();
            bundle.putString("extra_live_url", str2);
            bundle.putString("extra_playback_url", str);
            bundle.putString("extra_thumb_url", chatRowVideoLiveStream.getMessage().m94929K2().f91013r);
            bundle.putString("extra_uid_live_streaming", chatRowVideoLiveStream.getMessage().m94862C4());
            bundle.putString("extra_ownerid_live", chatRowVideoLiveStream.getMessage().mo95039W2());
            bundle.putLong("extra_timestamp_live", chatRowVideoLiveStream.getMessage().m94974P4());
            bundle.putParcelable("extra_message_id_live", chatRowVideoLiveStream.getMessage().m95029V3());
            bundle.putString("extra_streamId", ((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91173G);
            bundle.putBoolean("extra_bol_ended_live", ((C17999s0) chatRowVideoLiveStream.getMessage().m94929K2()).f91168B);
            bundle.putString("extra_group_id", chatRowVideoLiveStream.getMessage().mo95039W2());
            bundle.putFloat("extra_video_ratio", f11);
            bundle.putBoolean("EXTRA_MINIMIZE", !mo60124n3());
            ChatSettingBanner chatSettingBanner = this.f56804U0;
            if (chatSettingBanner != null && chatSettingBanner.getVisibility() == 0) {
                dimension = m92651WI().getDimension(AbstractC17454d.action_bar_default_height) + this.f56804U0.getHeight();
            } else {
                dimension = m92651WI().getDimension(AbstractC17454d.action_bar_default_height);
            }
            int i11 = (int) dimension;
            int dimension2 = (int) m92651WI().getDimension(AbstractC16802y.abs__action_bar_default_height);
            C20275e c20275e = new C20275e();
            c20275e.m105882u(i11);
            c20275e.m105881t(dimension2);
            c20275e.m105860F(chatRowVideoLiveStream);
            if (getContext() != null) {
                if (getContext() instanceof BaseZaloActivity) {
                    ((BaseZaloActivity) getContext()).m56685I3(chatRowVideoLiveStream, chatRowVideoLiveStream.getMessage().m94929K2().f91013r, bundle, c20275e, 3);
                } else {
                    m59538wU(GroupLiveStreamPlaybackView.class, bundle, 1);
                }
            }
        } catch (Resources.NotFoundException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tc */
    public void mo59837Tc(String str, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("CONVERSATION_ID", this.f56784P0.mo60615Oc().m17944I0());
        bundle.putString("STR_SOURCE_START_VIEW", str);
        bundle.putBoolean("EXTRA_SHOW_ONBOARDING", z11);
        bundle.putInt("EXTRA_MAX_HEIGHT_VIEW", this.f56824Z0.getMeasuredHeight() + AbstractC23309i.m122007i5(m92689tK()));
        m60278xU(QuickMessageBottomSheetView.class, bundle, 1055, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tg */
    public void mo59838Tg(String str, String str2, int i11, String str3, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("STR_EXTRA_GROUP_NAME", str2);
        bundle.putString("extra_group_id", str);
        bundle.putBoolean("BOL_EXTRA_FROM_CHAT", true);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        bundle.putString("STR_SOURCE_START_VIEW", str3);
        bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
        bundle.putBoolean("BOL_EXTRA_HAS_TIP", z11);
        m60278xU(InviteToCreateGroupView.class, bundle, 300, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ti */
    public void mo59839Ti(C3538f c3538f) {
        try {
            this.f56896r1 = C29384b.m146528f();
            C24003n m120062C = C23278z2.m120062C();
            C3979l m125676A2 = C23999j.m125676A2(c3538f.f14931g, m120062C.f116260a, m120062C.f116266g);
            if (m125676A2 == null || m125676A2.m18839c() == null || m125676A2.m18839c().getWidth() <= 0 || m125676A2.m18839c().getHeight() <= 0) {
                if (this.f56823Y3 == null) {
                    this.f56823Y3 = new C3977j(m92689tK());
                }
                ((C23528a) this.f56738C1.m123612r(this.f56823Y3)).m123579C(c3538f.f14931g, m120062C, (C23999j) new C11314y().m125601Y0(10));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tj */
    public void mo59840Tj(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f56874l3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setRedDotColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.badge_background_red));
            this.f56874l3.setReddotRadius(AbstractC23222t7.f112558f);
            this.f56874l3.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tk */
    public void mo59841Tk(MessageId messageId, String str, boolean z11) {
        if (this.f56760H3 == null) {
            this.f56760H3 = this.f56793R1.f60408d.m59199p(z11);
        }
        this.f56760H3.setVisibility(0);
        this.f56760H3.setOnClickListener(new View.OnClickListener() { // from class: v50.w9

            /* renamed from: q */
            public final /* synthetic */ MessageId f130134q;

            public /* synthetic */ ViewOnClickListenerC27882w9(MessageId messageId2) {
                r2 = messageId2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatView.this.m59496qS(r2, view);
            }
        });
        if (TextUtils.isEmpty(str)) {
            str = "/-heart";
        }
        this.f56760H3.m65434a(str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tm */
    public boolean mo59842Tm(String str) {
        Set<ChatAttachmentContainer.C11728c> mediaAttachment;
        if (!mo60139ny() || (mediaAttachment = this.f56856h1.getMediaAttachment()) == null) {
            return false;
        }
        synchronized (this.f56856h1.getMediaAttachmentMap()) {
            try {
                for (ChatAttachmentContainer.C11728c c11728c : mediaAttachment) {
                    if (c11728c.m65330h() == 3 && c11728c.m65328f() != null && TextUtils.equals(c11728c.m65328f().f91014s.replaceFirst("https?://", ""), str.replaceFirst("https?://", ""))) {
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tn */
    public void mo59843Tn(int i11, ContactProfile contactProfile, String str) {
        if (!mo59769P0()) {
            this.f56743D2 = i11;
            this.f56747E2 = contactProfile;
            this.f56751F2 = str;
            mo60233u2(136);
            return;
        }
        this.f56784P0.mo60585Jb(EnumC11304r0.VIDEO_CALL_OA, i11, contactProfile, str);
        this.f56743D2 = 0;
        this.f56747E2 = null;
        this.f56751F2 = null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tp */
    public void mo59844Tp() {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.m65403i();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Tw */
    public boolean mo59845Tw() {
        ImageSpan[] imageSpanArr;
        try {
            Editable mo59808Rl = mo59808Rl();
            if (mo59808Rl == null || (imageSpanArr = (ImageSpan[]) mo59808Rl.getSpans(0, mo59889Wr(), ImageSpan.class)) == null) {
                return false;
            }
            if (imageSpanArr.length <= 30) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: U5 */
    public void mo59846U5(boolean z11) {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.setCanShowBtnPageMenu(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: U8 */
    public void mo59847U8() {
        int i11;
        boolean mo60661Wj = this.f56784P0.mo60661Wj();
        if (this.f56846e3 == 4) {
            RedDotImageButton redDotImageButton = this.f56836c1;
            if (mo60661Wj) {
                i11 = AbstractC16803z.icn_toolbar_keyboard;
            } else {
                i11 = AbstractC16803z.icn_emoji_o;
            }
            redDotImageButton.setImageResource(i11);
            return;
        }
        if (mo60661Wj) {
            this.f56784P0.mo60674Z4();
        } else {
            AbstractC28045d8.m141480a(this.f56836c1, AbstractC28025b8.m141453i("tip.csc.sticker"), this.f56738C1, AbstractC16803z.btn_chat_input_emoticon);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: UA */
    public void mo59848UA(String str) {
        C20534g.f100864a.m106705t(mo60076k(), str, this.f56824Z0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: UB */
    public void mo59849UB() {
        this.f56793R1.m64825v2();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: UC */
    public void mo59850UC() {
        if (this.f56887o4 != null) {
            this.f56867j4.setVisibility(0);
            this.f56887o4.setVisibility(8);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.slide_right_in_200);
            this.f56887o4.startAnimation(AnimationUtils.loadAnimation(getContext(), AbstractC10919t.slide_right_out));
            this.f56867j4.startAnimation(loadAnimation);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: UG */
    public boolean mo59851UG() {
        UnreadJumpFloatingView unreadJumpFloatingView = this.f56744D3;
        if (unreadJumpFloatingView != null && unreadJumpFloatingView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        this.f56784P0.onStart();
        this.f56784P0.mo60680Zl();
    }

    /* renamed from: UQ */
    public boolean m59852UQ() {
        SwipeItemListView swipeItemListView = this.f56796S0;
        if (swipeItemListView != null && swipeItemListView.m76949s2()) {
            return true;
        }
        return false;
    }

    /* renamed from: UT */
    public void m59853UT(boolean z11) {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null) {
            abstractPushToTalkControl.setRecordCancelled(z11);
        }
    }

    /* renamed from: UU */
    public void m59854UU(InterfaceC11475g0 interfaceC11475g0, C17391z c17391z, C27373c c27373c) {
        int i11;
        float dimension;
        int i12;
        try {
            if (this.f56924y1) {
                mo60094l7(0, false);
                return;
            }
            if (System.currentTimeMillis() - this.f56750F1 < 1000) {
                return;
            }
            if (!interfaceC11475g0.getMessage().m95288w8()) {
                C31948ha.m153587d().m153602p();
            }
            this.f56779N2.postDelayed(new Runnable() { // from class: v50.wa
                public /* synthetic */ RunnableC27883wa() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59391YS();
                }
            }, 200L);
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_PLAY_LOOP_VIDEO", true);
            bundle.putInt("EXTRA_INT_REQUEST_CODE", 1044);
            bundle.putString("extra_chat_content_owner_id", interfaceC11475g0.getMessage().mo95039W2());
            bundle.putParcelable("extra_chat_content_message_id", interfaceC11475g0.getMessage().m95029V3());
            bundle.putSerializable("EXTRA_VIDEO_INFO", c27373c);
            bundle.putInt("margin_right", AbstractC23136l9.m118742r(2.0f));
            bundle.putInt("margin_bottom", AbstractC23136l9.m118742r(2.0f) + ((int) m92651WI().getDimension(AbstractC16802y.abs__action_bar_default_height)));
            if (m59745NQ()) {
                i11 = 7;
            } else {
                i11 = 0;
            }
            bundle.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
            bundle.putBoolean("EXTRA_OPEN_EXTERNAL_WHEN_STARTING_FAILED", interfaceC11475g0 instanceof ChatRowFile);
            bundle.putString("extra_chat_conversation_id", interfaceC11475g0.getMessage().mo95039W2());
            bundle.putString("STR_LOG_CHAT_TYPE", this.f56784P0.mo60638S2());
            if (!m59717LQ()) {
                bundle.putBoolean("EXTRA_BOOLEAN_HIDE_OPEN_SHARED_MEDIA", true);
            }
            bundle.putString("video_str", c17391z.m92540e().toString());
            if (interfaceC11475g0.getMessage().m95288w8()) {
                bundle.putBoolean("EXTRA_GIF_MODE", true);
                bundle.putBoolean("EXTRA_BOOLEAN_HANDLE_SCREEN_ORIENTATION", false);
                C17945a0 message = interfaceC11475g0.getMessage();
                ContactProfile m141809c = C28203u6.f131407a.m141809c(message.m94862C4());
                if (m141809c == null) {
                    m141809c = new ContactProfile(message.m94862C4());
                    m141809c.f42437s = message.m94854B4();
                }
                bundle.putString("VIDEO_TITLE_BAR", m141809c.m40383Q(true, false));
            } else if (interfaceC11475g0.getMessage().m95276v6()) {
                bundle.putBoolean("EXTRA_BOOLEAN_IS_MSG_FILE", true);
                bundle.putString("EXTRA_STR_FILE_NAME_DOWNLOAD", AbstractC19646n0.m102974f0(interfaceC11475g0.getMessage(), true));
            }
            ChatSettingBanner chatSettingBanner = this.f56804U0;
            if (chatSettingBanner != null && chatSettingBanner.getVisibility() == 0) {
                dimension = m92651WI().getDimension(AbstractC17454d.action_bar_default_height) + this.f56804U0.getHeight();
            } else {
                dimension = m92651WI().getDimension(AbstractC17454d.action_bar_default_height);
            }
            int i13 = (int) dimension;
            int dimension2 = (int) m92651WI().getDimension(AbstractC16802y.abs__action_bar_default_height);
            C11299p c11299p = new C11299p();
            c11299p.m105882u(i13);
            c11299p.m105881t(dimension2);
            c11299p.m105860F(interfaceC11475g0.getChatRowView());
            c11299p.m105867M(interfaceC11475g0.getMessage().m95029V3());
            if (getContext() != null) {
                if (m59745NQ()) {
                    i12 = 7;
                } else {
                    i12 = 0;
                }
                boolean z11 = interfaceC11475g0 instanceof ChatRowVideoMask;
                if (getContext() instanceof BaseZaloActivity) {
                    ((BaseZaloActivity) getContext()).m56683G3(m92676n2(), interfaceC11475g0, c17391z.f88622e, bundle, c11299p, c17391z, i12, z11);
                } else {
                    C20043e.m104031v(m92676n2(), c17391z, i12, bundle);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ua */
    public void mo59855Ua(int i11, ContactProfile contactProfile) {
        this.f56784P0.mo60565Fn(EnumC11304r0.VIDEO_CALL, i11, contactProfile, null);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ub */
    public void mo59856Ub(String str, JSONObject jSONObject) {
        AbstractC28207v1.m142049t3(str, jSONObject, m92676n2(), null, null, m60020gQ(), m59865VP(), null);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Uh */
    public void mo59857Uh() {
        try {
            if (mo60244v2()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("EXTRA_FORCE_SHOW_TAB_MESSAGE_FROM_BUBBLE", true);
                m92641HK(AbstractC23152n3.m119018R(MainTabView.class, bundle));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Uk */
    public void mo59858Uk() {
        try {
            mo60051id(132);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Un */
    public void mo59859Un(String str) {
        try {
            if (this.f56836c1 != null) {
                if (this.f56893q2 == null) {
                    C24003n c24003n = new C24003n();
                    this.f56893q2 = c24003n;
                    c24003n.f116275p = true;
                    c24003n.f116276q = true;
                    c24003n.f116261b = C27280g.m139660c(getContext(), AbstractC23322a.zds_ic_playground_line_24, AbstractC2807a.icon_02);
                    this.f56893q2.f116260a = AbstractC23136l9.m118742r(24.0f);
                    this.f56893q2.f116266g = EnumC25629a.DEFAULT;
                }
                ((C23528a) this.f56738C1.m123612r(this.f56836c1)).m123579C(str, this.f56893q2, new C11294m0());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Uy */
    public boolean mo59860Uy() {
        if (!this.f56884o1.f130065j && C21927m.m114302u().m114345m(m60020gQ().mo60615Oc().m17944I0()) && !TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: V5 */
    public void mo59861V5(String str) {
        this.f56850f3 = str;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: V8 */
    public boolean mo59862V8() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.m64756a1()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.AnimReactionCounterView.InterfaceC13727d
    /* renamed from: VD */
    public void mo59863VD() {
        try {
            try {
                this.f56842d3.getReactionBar().m115828M();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        } finally {
            this.f56842d3 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: VF */
    public void mo59864VF(ArrayList arrayList) {
        this.f56784P0.mo60790rj();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        C11621p0 c11621p0;
        ChatFrameLayout chatFrameLayout;
        super.mo37712VJ();
        this.f56784P0.onStop();
        mo60057iy(false, false);
        AnimChat animChat = this.f56762I1;
        if (animChat != null && (c11621p0 = this.f56793R1) != null && (chatFrameLayout = c11621p0.f60408d) != null) {
            chatFrameLayout.removeView(animChat);
        }
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            c11603g0.m64558c2();
        }
        C8009j c8009j = this.f56912v1;
        if (c8009j != null) {
            c8009j.dismiss();
        }
        RunnableC2375u runnableC2375u = this.f56822Y2;
        if (runnableC2375u != null) {
            this.f56779N2.removeCallbacks(runnableC2375u);
        }
        this.f56779N2.removeCallbacks(this.f56777M3);
        C20529b.f100835a.m106663r();
        m59295JU();
        AbstractC23047d8.m118262n();
        if (this.f56776M2) {
            C0697c0.Companion.m1048b().m1035h("ChatInfoView");
        } else {
            C0697c0.Companion.m1048b().m1035h("ChatView");
        }
    }

    /* renamed from: VP */
    AbstractC28207v1.j0 m59865VP() {
        if (this.f56803T3 == null) {
            this.f56803T3 = new AbstractC28207v1.j0() { // from class: v50.w8
                public /* synthetic */ C27881w8() {
                }

                @Override // vg.AbstractC28207v1.j0
                /* renamed from: a */
                public final void mo87297a(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
                    ChatView.this.m59507sR(zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
                }
            };
        }
        return this.f56803T3;
    }

    /* renamed from: VQ */
    public boolean m59866VQ() {
        ZaloView zaloView = this.f56854g3;
        if ((zaloView instanceof ShareLocationWithMapView) && zaloView.m92672lJ()) {
            return true;
        }
        return false;
    }

    /* renamed from: VT */
    public void m59867VT(boolean z11) {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65172VM(z11);
        }
    }

    /* renamed from: VU */
    public void m59868VU(C32106s7 c32106s7, C17391z c17391z) {
        if (c32106s7 == null) {
            return;
        }
        try {
            if (this.f56924y1) {
                mo60094l7(0, false);
            }
            if (System.currentTimeMillis() - this.f56750F1 < 1000) {
                return;
            }
            C31948ha.m153587d().m153602p();
            this.f56779N2.postDelayed(new Runnable() { // from class: v50.cb
                public /* synthetic */ RunnableC27598cb() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59397ZS();
                }
            }, 200L);
            m59538wU(OAVideoPlaylistView.class, OAVideoPlaylistView.m82410kM(c32106s7, c17391z, 0), 2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vb */
    public void mo59869Vb(int i11) {
        LiveEmojiButton liveEmojiButton = this.f56839c4;
        if (liveEmojiButton != null) {
            liveEmojiButton.m76396e(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vd */
    public void mo59870Vd() {
        C32100s1.m154953d().m154968r();
        ActionBarMenuItem actionBarMenuItem = this.f56882n3;
        if (actionBarMenuItem != null && actionBarMenuItem.getParent() == m92647RI()) {
            this.f56882n3.setIcon(m59350SP(m92689tK(), AbstractC16803z.btn_videocall_white));
            if (this.f56882n3.getVisibility() != 0) {
                this.f56882n3.setVisibility(0);
            }
        } else {
            this.f56882n3 = m78952hL(AbstractC6918a0.menu_call_video, m59350SP(m92689tK(), AbstractC16803z.btn_videocall_white));
        }
        ActionBarMenuItem actionBarMenuItem2 = this.f56882n3;
        if (actionBarMenuItem2 != null && this.f56922x3 != null) {
            actionBarMenuItem2.getIconView().setImageBitmap(this.f56922x3);
        }
        this.f56784P0.mo60835xa(1000L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vf */
    public void mo59871Vf() {
        try {
            mo59807Rk(true);
            this.f56858h3 = 2;
            m59705KT(true);
            mo59938ah(1);
            View m59441iQ = m59441iQ("tip.csc.send");
            if (m59441iQ != null && m59441iQ.getVisibility() == 0) {
                mo59933aH(123458, "tip.csc.send", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vg */
    public void mo59872Vg() {
        ActionBarMenuItem actionBarMenuItem = this.f56882n3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.m92780y();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vj */
    public boolean mo59873Vj() {
        LandingPageView landingPageView = this.f56872l1;
        if (landingPageView != null && landingPageView.m92674mJ()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vk */
    public void mo59874Vk(int i11, int i12) {
        Editable editableText;
        try {
            ActionEditText actionEditText = this.f56832b1;
            if (actionEditText != null && (editableText = actionEditText.getEditableText()) != null && i11 <= i12 && i11 >= 0 && i12 <= editableText.length()) {
                mo60292yb();
                editableText.setSpan(new ForegroundColorSpan(AbstractC1401h.m7080d(m92651WI(), AbstractC16801x.cLink1, null)), i11, i12, 33);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vl */
    public void mo59875Vl() {
        C11815a c11815a = this.f56793R1.f60440t;
        if (c11815a != null) {
            c11815a.m65705w0(null);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vq */
    public void mo59876Vq() {
        mo59922Z6();
        Bundle bundle = new Bundle();
        bundle.putString("extra_name_send_to", this.f56784P0.mo60752jo());
        m60278xU(FileSelectView.class, bundle, 1026, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Vz */
    public boolean mo59877Vz() {
        if (m59312MQ() && this.f56793R1.m64829x0().m70163U0()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: W5 */
    public boolean mo59878W5() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.m64778h1()) {
            return true;
        }
        return false;
    }

    /* renamed from: W8 */
    public boolean m59879W8() {
        if (getContext() != null && AbstractC23034c6.m118165m(getContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: WA */
    public void mo59880WA() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64733K3();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: WC */
    public void mo59881WC(ArrayList arrayList) {
        this.f56784P0.mo60685ag();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: WD */
    public void mo59882WD(String[] strArr) {
        this.f56782O2.m74704l(strArr);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: WG */
    public void mo59883WG(String str, MessageId messageId) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("message_id", messageId);
        bundle.putString("ratingJsonType", str);
        m60278xU(RatingCallView.class, bundle, 1047, 1, true);
    }

    /* renamed from: WT */
    public void m59884WT(String str) {
        this.f56784P0.mo60650Uk(str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wa */
    public void mo59885Wa() {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.setFilters(new InputFilter[0]);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wb */
    public boolean mo59886Wb() {
        return this.f77813M0;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wc */
    public void mo59887Wc() {
        C11621p0 c11621p0;
        ChatFrameLayout chatFrameLayout;
        if (this.f56769K1 && (c11621p0 = this.f56793R1) != null && (chatFrameLayout = c11621p0.f60408d) != null) {
            chatFrameLayout.m59186Z();
            this.f56769K1 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wq */
    public void mo59888Wq(boolean z11) {
        this.f56793R1.m64738N2(z11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wr */
    public int mo59889Wr() {
        Editable text;
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText == null || (text = actionEditText.getText()) == null) {
            return 0;
        }
        return text.length();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wt */
    public void mo59890Wt(String str) {
        if (this.f56804U0 == null) {
            ChatSettingBanner m59167G = this.f56793R1.f60408d.m59167G();
            this.f56804U0 = m59167G;
            m59167G.f60971M.mo89109M0(new C16719g.c() { // from class: v50.la
                public /* synthetic */ C27729la() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ChatView.this.m59442iR(c16719g);
                }
            });
        }
        this.f56804U0.f60969K.mo44614b1(0);
        this.f56804U0.f60970L.m111959G1(str);
        if (this.f56784P0.mo60583J0() && this.f56784P0.mo60741i0()) {
            this.f56804U0.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wu */
    public void mo59891Wu(String str, boolean z11, boolean z12) {
        this.f56793R1.m64815s0(str, z11, z12);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Wz */
    public boolean mo59892Wz() {
        return this.f56793R1.m64760c1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: X8 */
    public void mo59893X8(C22499f c22499f) {
        int i11;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m59745NQ()) {
            i11 = 14;
        } else {
            i11 = 13;
        }
        AbstractC23152n3.m119064q0(m92676n2, c22499f, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: XD */
    public void mo59894XD() {
        this.f56793R1.m64827w2();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: XF */
    public void mo59895XF() {
        this.f56793R1.m64785j0();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        boolean z13;
        if (m92676n2() != null && m92676n2().getWindow() != null) {
            m92676n2().getWindow().setBackgroundDrawable(new ColorDrawable(f56728L4));
        }
        if (this.f56901s2) {
            mo59706Ka(this.f56897r2);
            this.f56901s2 = false;
        }
        if (z11 && (!z12 || m92683qJ())) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            try {
                this.f56754G1 = true;
                this.f56889p2 = false;
                mo59937ag(false);
                mo59806Rh();
                ActionEditText actionEditText = this.f56832b1;
                if (actionEditText != null) {
                    actionEditText.clearFocus();
                    mo59915Yi();
                    mo60026gi();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
                return;
            }
        }
        if (z11 && this.f56784P0.mo60624Q7()) {
            ActionBarMenuItem actionBarMenuItem = this.f56886o3;
            if (actionBarMenuItem != null && actionBarMenuItem.getVisibility() == 0) {
                this.f56784P0.mo60704dd();
            }
            ActionBarMenuItem actionBarMenuItem2 = this.f56874l3;
            if (actionBarMenuItem2 != null && actionBarMenuItem2.getVisibility() == 0) {
                this.f56784P0.mo60807u7();
            }
        }
        super.mo37122XJ(z11, z12);
        if (z13) {
            this.f56784P0.mo60726gd(3);
        }
    }

    /* renamed from: XQ */
    public boolean m59896XQ() {
        return this.f56784P0.mo60837xo();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xa */
    public void mo59897Xa() {
        this.f56779N2.post(new Runnable() { // from class: v50.n7
            public /* synthetic */ RunnableC27754n7() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59365US();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xc */
    public void mo59898Xc(boolean z11) {
        try {
            this.f56791Q3 = AvatarPickerView.m78263nL(this.f56784P0.mo60840ye(), null, z11);
            m92649TI().m93060e2(0, this.f56791Q3, "AvatarPickerView", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xd */
    public void mo59899Xd() {
        try {
            ZaloView m59331PP = m59331PP("ManageGroupView");
            if (m59331PP != null) {
                m92693xK().mo92702G1(m59331PP, m59331PP.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xf */
    public void mo59900Xf(String str) {
        Bundle bundle = new Bundle();
        bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 4);
        bundle.putString("extra_group_id", str);
        m60278xU(QuickCreateGroupView.class, bundle, 0, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xh */
    public void mo59901Xh(C17945a0 c17945a0, String[] strArr, boolean z11, boolean z12, boolean z13) {
        if (strArr != null && strArr.length != 0) {
            this.f56793R1.m64812r0(c17945a0, strArr[0], z11, z12, z13);
            if (strArr.length == 4) {
                this.f56793R1.m64732K2(true, Float.parseFloat(strArr[1]), Integer.parseInt(strArr[2]), Float.parseFloat(strArr[3]));
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xk */
    public void mo59902Xk() {
        this.f56793R1.m64746R3(this.f56784P0.mo60615Oc(), !this.f56784P0.mo60741i0());
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xp */
    public void mo59903Xp(String str, int i11, String str2, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putInt("extra_tab", i11);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        bundle.putBoolean("EXTRA_IS_COMMUNITY", z11);
        m60278xU(GroupBoardView.class, bundle, 1037, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Xv */
    public void mo59904Xv(List list) {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75591U(list);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Y6 */
    public void mo59905Y6() {
        AbstractC23201r8.m119532b(this.f56874l3, AbstractC8020f0.tb_open_right_menu);
        AbstractC23201r8.m119532b(this.f56878m3, AbstractC8020f0.tb_open_call_voice);
        AbstractC23201r8.m119532b(this.f56882n3, AbstractC8020f0.tb_open_call_video);
        AbstractC23201r8.m119532b(this.f56886o3, AbstractC8020f0.tb_invite_member);
        AbstractC23201r8.m119532b(this.f56890p3, AbstractC8020f0.tb_btn_search_message);
        AbstractC23201r8.m119532b(this.f56898r3, AbstractC8020f0.tb_open_group_call_video);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Y9 */
    public void mo59906Y9(boolean z11) {
        int i11;
        SwipeItemListView swipeItemListView = this.f56796S0;
        if (swipeItemListView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            swipeItemListView.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: YG */
    public boolean mo59907YG() {
        ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
        if (chatAttachmentContainer != null && !chatAttachmentContainer.m65319h()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: YH */
    public boolean mo59908YH() {
        return this.f56793R1.m64798n1();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: YJ */
    public void mo49153YJ(boolean z11, boolean z12) {
        if (!z11 || z12) {
            return;
        }
        this.f56754G1 = false;
    }

    /* renamed from: YP */
    public int m59909YP() {
        if (this.f56796S0 == null) {
            return -1;
        }
        int m59934aQ = m59934aQ();
        if (m59934aQ >= 0) {
            return Math.max(m59934aQ - m59959cQ(), 0);
        }
        return m59934aQ;
    }

    /* renamed from: YQ */
    public boolean m59910YQ() {
        AnimReactionCounterView animReactionCounterView = this.f56838c3;
        if (animReactionCounterView != null && animReactionCounterView.getParent() != null && this.f56842d3 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: YT */
    public void m59911YT(View view) {
        Snackbar snackbar = this.f56773L2;
        if (snackbar != null) {
            snackbar.m90639E(view);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ya */
    public void mo59912Ya() {
        mo70710wy(new Runnable() { // from class: v50.c9
            public /* synthetic */ RunnableC27596c9() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59268GS();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Yg */
    public boolean mo59913Yg() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75609x()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Yh */
    public int mo59914Yh(MessageId messageId) {
        List mo60200rp = mo60200rp();
        if (mo60200rp == null) {
            return -1;
        }
        for (int i11 = 0; i11 < mo60200rp.size(); i11++) {
            C28771c c28771c = (C28771c) mo60200rp.get(i11);
            for (int i12 = 0; i12 < c28771c.m143950j().size(); i12++) {
                C17945a0 m143953m = c28771c.m143953m(i12);
                if (m143953m != null && m143953m.m95135f9(messageId)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Yi */
    public void mo59915Yi() {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.requestFocus();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Ym */
    public void mo59916Ym() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64755Z1();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Yo */
    public void mo59917Yo(String str) {
        ShowcaseView showcaseView = this.f56786P2;
        if (showcaseView != null && showcaseView.getParent() != null && (TextUtils.equals("tip.any", str) || TextUtils.equals(str, this.f56786P2.getShowcaseId()))) {
            this.f56786P2.m74626d();
            this.f56786P2 = null;
        }
        TooltipView tooltipView = this.f56794R2;
        if (tooltipView != null && tooltipView.getParent() != null && (TextUtils.equals("tip.any", str) || TextUtils.equals(str, this.f56794R2.getTooltipId()))) {
            this.f56794R2.m90727Q();
            this.f56794R2 = null;
        }
        if (this.f56732A3 && TextUtils.equals("tip.any", str)) {
            mo60227tk(0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Yt */
    public void mo59918Yt() {
        this.f56881n2 = null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Yu */
    public void mo59919Yu() {
        mo59691Jg();
        m60267wQ();
        View view = this.f56868k1;
        if (view != null) {
            view.setVisibility(8);
        }
        ChatSettingBanner chatSettingBanner = this.f56804U0;
        if (chatSettingBanner != null) {
            chatSettingBanner.setVisibility(8);
        }
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0.f60398W != null) {
            c11621p0.m64808p3(false);
        }
        FloatingPromoteTrendingStickerModulesView floatingPromoteTrendingStickerModulesView = this.f56793R1.f60435q0;
        if (floatingPromoteTrendingStickerModulesView != null) {
            floatingPromoteTrendingStickerModulesView.setVisibility(8);
        }
        StickyNotiLiveStreamingBar stickyNotiLiveStreamingBar = this.f56793R1.f60396U;
        if (stickyNotiLiveStreamingBar != null) {
            stickyNotiLiveStreamingBar.setVisibility(8);
        }
        mo59573BB(false);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Yv */
    public void mo59920Yv() {
        ActionBarMenuItem actionBarMenuItem = this.f56878m3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.m92780y();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Z4 */
    public void mo59921Z4() {
        AbstractC2379w.m12432f(this.f56832b1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Z6 */
    public void mo59922Z6() {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.clearFocus();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Z8 */
    public void mo59923Z8(ZaloView zaloView, C8969o c8969o, int i11) {
        C8967m.m47888f0(zaloView.m92676n2(), null, c8969o.f47981b, c8969o.f47980a, c8969o.f47984e, c8969o.f47985f, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ZF */
    public void mo59924ZF(String str, boolean z11) {
        ChatEmptyView chatEmptyView = this.f56775M1;
        if (chatEmptyView != null) {
            chatEmptyView.m60865m0(str, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ZG */
    public boolean mo59925ZG() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75575C()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ZH */
    public Set mo59926ZH() {
        return this.f56856h1.getMediaAttachment();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(Integer.valueOf(C23212s8.m119607o(getContext(), AbstractC16781w.ChatBarBackgroundColor)));
        m89412p.m89430n(new InterfaceC27367c() { // from class: v50.u8
            public /* synthetic */ C27853u8() {
            }

            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                ChatView.this.m59383XR(c1421e);
            }
        });
        SystemUIUtils.m89444g(m89412p, this);
    }

    /* renamed from: ZQ */
    boolean m59927ZQ() {
        try {
            ZaloView m92996E0 = m92649TI().m92996E0("ReactionDetailView");
            if (m92996E0 == null) {
                return false;
            }
            if (!m92996E0.m92687sJ()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
            return false;
        }
    }

    /* renamed from: ZT */
    void m59928ZT(C20275e c20275e) {
        int i11;
        int dimension = (int) m92651WI().getDimension(AbstractC17454d.action_bar_default_height);
        ChatSettingBanner chatSettingBanner = this.f56804U0;
        if (chatSettingBanner != null && chatSettingBanner.getVisibility() == 0) {
            dimension += this.f56804U0.getHeight();
        }
        PinTopicBanner pinTopicBanner = this.f56772L1;
        if (pinTopicBanner != null && pinTopicBanner.getVisibility() == 0) {
            dimension += this.f56772L1.getHeight();
        }
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            LiveLocationBar liveLocationBar = c11621p0.f60395T;
            if (liveLocationBar != null && liveLocationBar.getVisibility() == 0) {
                dimension += this.f56793R1.f60395T.getHeight();
            }
            StickyMusicPlayer stickyMusicPlayer = this.f56793R1.f60394S;
            if (stickyMusicPlayer != null && stickyMusicPlayer.getVisibility() == 0) {
                dimension += this.f56793R1.f60394S.getHeight();
            }
            QuickActionViewLayout quickActionViewLayout = this.f56793R1.f60398W;
            if (quickActionViewLayout != null && quickActionViewLayout.getVisibility() == 0) {
                dimension += this.f56793R1.f60398W.getHeight();
            }
        }
        c20275e.m105882u(dimension);
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null && chatInputBar.getVisibility() == 0) {
            i11 = this.f56824Z0.getHeight();
        } else {
            i11 = 0;
        }
        c20275e.m105881t(i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Za */
    public void mo59929Za() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl instanceof PushToTalkSpeechToText) {
            ((PushToTalkSpeechToText) abstractPushToTalkControl).m87980J0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Zq */
    public void mo59930Zq(boolean z11) {
        int i11 = 12343;
        if (this.f56779N2.hasMessages(12343)) {
            return;
        }
        if (!z11) {
            i11 = 12342;
        }
        if (!this.f56779N2.hasMessages(i11)) {
            this.f56779N2.sendEmptyMessageDelayed(i11, 100L);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Zs */
    public void mo59931Zs() {
        C27043b c27043b;
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0.f60444v != null && (c27043b = c11621p0.f60448x) != null && c27043b.m139204N()) {
            this.f56793R1.f60444v.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: Zt */
    public C24860q mo59932Zt() {
        C17945a0 m143951k;
        int m59909YP = m59909YP();
        int mo59967cn = mo59967cn();
        if (m59909YP != -1 && mo59967cn != -1) {
            List mo60200rp = mo60200rp();
            if (mo60200rp == null) {
                return new C24860q(0L, 0L);
            }
            long j11 = 0;
            long j12 = 0;
            while (m59909YP <= mo59967cn && m59909YP < mo60200rp.size()) {
                C28771c c28771c = (C28771c) mo60200rp.get(m59909YP);
                if (j11 > 0) {
                    m143951k = c28771c.m143954n();
                } else {
                    m143951k = c28771c.m143951k();
                }
                if (m143951k != null && !TextUtils.isEmpty(m143951k.m95029V3().m41046j())) {
                    j12 = m143951k.m95029V3().m41047k();
                    if (j11 <= 0) {
                        C17945a0 m143954n = ((C28771c) mo60200rp.get(m59909YP)).m143954n();
                        if (m143954n != null && !TextUtils.isEmpty(m143954n.m95029V3().m41046j())) {
                            j11 = j12;
                            j12 = m143954n.m95029V3().m41047k();
                        } else {
                            j11 = j12;
                        }
                    }
                }
                m59909YP++;
            }
            return new C24860q(Long.valueOf(j11), Long.valueOf(j12));
        }
        return new C24860q(0L, 0L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: aH */
    public void mo59933aH(int i11, String str, int i12) {
        this.f56779N2.sendMessageDelayed(this.f56779N2.obtainMessage(i11, str), i12);
    }

    /* renamed from: aQ */
    public int m59934aQ() {
        return this.f56796S0.getFirstVisiblePosition();
    }

    /* renamed from: aT */
    void m59935aT(InterfaceC0887b interfaceC0887b) {
        if (interfaceC0887b != null && interfaceC0887b.mo2737a() != null) {
            this.f56793R1.m64716E2(interfaceC0887b.mo2740d().mo2735a());
            this.f56793R1.m64713D2(new C11278e0(this.f56737B4));
            this.f56793R1.m64836z2(interfaceC0887b.mo2737a());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ac */
    public void mo59936ac() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75589S();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f56784P0.afterTextChanged(editable);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ag */
    public void mo59937ag(boolean z11) {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            c11603g0.m64564m2(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ah */
    public void mo59938ah(int i11) {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null && this.f56824Z0 != null) {
            actionEditText.removeTextChangedListener(this);
            this.f56824Z0.setInputMode(i11);
            this.f56832b1.addTextChangedListener(this);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ai */
    public void mo59939ai() {
        this.f56779N2.removeCallbacks(this.f56811V3);
        this.f56779N2.post(this.f56811V3);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ay */
    public void mo59940ay() {
        AbstractC19444a.m101696d(this.f56770K2);
        AbstractC19444a.m101694b(this.f56770K2, 1000L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: az */
    public void mo59941az() {
        RunnableC27895x8 runnableC27895x8 = new Runnable() { // from class: v50.x8
            public /* synthetic */ RunnableC27895x8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59425fS();
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC27895x8.run();
        } else {
            this.f72827B0.post(runnableC27895x8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: b5 */
    public void mo59942b5() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75604r(m60004fQ(), false);
            this.f56819X3.m75606u(null);
            this.f56819X3.m75605s(null);
            this.f56819X3.m75591U(null);
            if (this.f56846e3 == 6) {
                mo60094l7(0, true);
            }
            mo59612De();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: b6 */
    public void mo59943b6() {
        ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
        if (chatAttachmentContainer != null) {
            chatAttachmentContainer.m65316d();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: b7 */
    public void mo59944b7(int i11) {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.setAttachmentIdHighLight(i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: bK */
    public void mo39045bK(boolean z11) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onWindowFocusChanged:");
            sb2.append(z11);
            if (!this.f56746E1 && z11) {
                this.f56742D1 = true;
            }
            this.f56746E1 = z11;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: bQ */
    public int m59945bQ() {
        return this.f56796S0.getFooterViewsCount();
    }

    /* renamed from: bT */
    void m59946bT(int i11) {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75583M(i11);
        }
    }

    /* renamed from: bU */
    public void m59947bU(C17945a0 c17945a0) {
        this.f56784P0.mo60693bk(c17945a0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ba */
    public boolean mo59948ba(EnumC19450c enumC19450c) {
        return this.f56765I4 == enumC19450c;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: bd */
    public void mo59949bd() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75592V();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        this.f56784P0.mo60784qc(charSequence, i11, i12, i13);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: bf */
    public void mo59950bf() {
        TextView textView = this.f56748E3;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: bj */
    public void mo59951bj(int i11) {
        JumpDownFloatingView jumpDownFloatingView = this.f56768J3;
        if (jumpDownFloatingView != null) {
            jumpDownFloatingView.m65422b(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: bm */
    public C17945a0 mo59952bm() {
        int m59909YP;
        List mo60200rp = mo60200rp();
        if (mo60200rp == null || mo60200rp.size() == 0 || (m59909YP = m59909YP()) < 0 || m59909YP >= mo60200rp.size()) {
            return null;
        }
        return ((C28771c) mo60200rp.get(m59909YP)).m143951k();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: bo */
    public boolean mo59953bo() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f56904t1;
        if ((keyEventCallbackC17462c instanceof C2876h0) && keyEventCallbackC17462c.m92868m()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: bq */
    public void mo59954bq(String str, boolean z11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("extra_create_album_group_id", str);
            bundle.putBoolean("EXTRA_IS_COMMUNITY", z11);
            m60278xU(MediaStoreAvatarPickerView.class, bundle, 1045, 1, true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: br */
    public void mo59955br(ZaloView zaloView) {
        C17487o0 c17487o0;
        if (zaloView.m92676n2() != null) {
            c17487o0 = zaloView.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_return_raw_qr_content", true);
            bundle.putInt("extra_src", 7);
            AbstractC26412d.m136219h(zaloView.m92676n2(), bundle, 1013);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: c9 */
    public void mo59956c9(C31862c c31862c) {
        boolean z11;
        this.f56793R1.m64837z3(c31862c, this);
        int i11 = this.f56846e3;
        if (i11 != 0 && i11 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f56793R1.m64808p3(z11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: cF */
    public void mo59957cF(String str, int i11) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putInt("extra_source_call", i11);
        m60278xU(CreateGroupCallZView.class, bundle, 1040, 1, true);
    }

    /* renamed from: cP */
    public void m59958cP() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null) {
            abstractPushToTalkControl.bringToFront();
        }
    }

    /* renamed from: cQ */
    public int m59959cQ() {
        return this.f56796S0.getHeaderViewsCount();
    }

    /* renamed from: cR */
    public boolean m59960cR(String str) {
        TooltipView tooltipView = this.f56794R2;
        if (tooltipView != null && tooltipView.isShown()) {
            if (TextUtils.equals(str, "tip.any")) {
                return true;
            }
            return TextUtils.equals(str, this.f56794R2.getTooltipId());
        }
        return false;
    }

    /* renamed from: cT */
    public void m59961cT(String str, Rect rect) {
        this.f56784P0.mo60628Qi(str, rect);
    }

    /* renamed from: cU */
    public boolean m59962cU() {
        return this.f56784P0.mo60606Mo();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: cf */
    public void mo59963cf(int i11, String str, String str2, int i12) {
        try {
            if (i12 == 1) {
                m59290JP(i11, str, str2, this.f56878m3);
            } else if (i12 == 2) {
                this.f56878m3.m92774j(AbstractC23136l9.m118721k(m92689tK(), i11, str, str2));
            } else {
                m59290JP(i11, str, "", this.f56878m3);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ci */
    public void mo59964ci() {
        if (MessagePopupActivity.m56886u4() != null) {
            MessagePopupActivity.m56886u4().m56894t4(false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: cj */
    public void mo59965cj(C3545m c3545m) {
        this.f56745D4 = c3545m;
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75584N(c3545m.m18018d());
            m59935aT(c3545m.m18018d());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: cl */
    public void mo59966cl(String str) {
        ActionEditText actionEditText;
        float f11;
        char charAt;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!mo60301zB() && (actionEditText = this.f56832b1) != null) {
                int selectionEnd = actionEditText.getSelectionEnd();
                if (selectionEnd == mo59889Wr() && AbstractC23309i.m121379Rd() == 1) {
                    if (selectionEnd > 0 && (charAt = mo59611Dd().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                        sb2.append(" ");
                        sb2.append(str);
                    }
                    if (selectionEnd == mo59889Wr()) {
                        if (sb2.length() == 0) {
                            sb2.append(str);
                            sb2.append(" ");
                        } else {
                            sb2.append(" ");
                        }
                    }
                    if (!TextUtils.isEmpty(sb2) && sb2.toString().trim().equals(str)) {
                        str = sb2.toString();
                    }
                }
                if ((3000 - this.f56832b1.length()) - str.length() >= 0) {
                    Editable mo59808Rl = mo59808Rl();
                    if (mo59808Rl != null) {
                        SpannableStringBuilder insert = new SpannableStringBuilder(mo59808Rl).insert(selectionEnd, (CharSequence) str);
                        int length = str.length() + selectionEnd;
                        C28652r m143349v = C28652r.m143349v();
                        if (this.f56785P1 > 0) {
                            f11 = this.f56832b1.getTextSize();
                        } else {
                            f11 = 0.0f;
                        }
                        m143349v.m143364Z(insert, selectionEnd, length, f11);
                        this.f56736B3 = true;
                        this.f56832b1.setText(insert);
                        this.f56832b1.setSelection(length);
                        return;
                    }
                    return;
                }
                ToastUtils.showMess(m92652XI(AbstractC8020f0.limit_input_text));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: cn */
    public int mo59967cn() {
        if (this.f56796S0 == null) {
            return -1;
        }
        int mo59610Dc = mo59610Dc();
        if (mo59610Dc >= 0) {
            mo59610Dc = Math.max(mo59610Dc - m59959cQ(), 0);
        }
        if (mo59610Dc >= mo59736Mm()) {
            return mo59610Dc - m59945bQ();
        }
        return mo59610Dc;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: co */
    public int mo59968co() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            return c11603g0.m60499m0();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: cu */
    public void mo59969cu(C31980jc c31980jc, int i11, AbstractC22055v0.g gVar) {
        AbstractC22055v0.m115123M(c31980jc, this, 0, i11, null, gVar);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: cv */
    public EnumC19450c mo59970cv() {
        return this.f56765I4;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: d6 */
    public void mo59971d6(C17945a0 c17945a0) {
        int i11;
        if (this.f56748E3 == null) {
            TextView textView = (TextView) this.f56793R1.f60408d.m59196l();
            this.f56748E3 = textView;
            if (c17945a0.m94986Q6()) {
                i11 = AbstractC8020f0.str_mention_all;
            } else {
                i11 = AbstractC8020f0.str_btn_mention_jump;
            }
            textView.setText(m92652XI(i11));
        }
        this.f56748E3.setOnClickListener(new View.OnClickListener() { // from class: v50.p9

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f129915q;

            public /* synthetic */ ViewOnClickListenerC27784p9(C17945a0 c17945a02) {
                r2 = c17945a02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatView.this.m59477nS(r2, view);
            }
        });
        this.f56748E3.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: d7 */
    public void mo59972d7() {
        this.f56793R1.m64718F0();
    }

    /* renamed from: dP */
    public void m59973dP() {
        try {
            invalidateOptionsMenu();
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl != null) {
                abstractPushToTalkControl.mo87649b();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: dQ */
    public TouchListView m59974dQ() {
        return this.f56796S0;
    }

    /* renamed from: dR */
    public boolean m59975dR(String str, MessageId messageId) {
        if (!mo59727Ly() && C31967j.m153687a().m153691e(str, messageId)) {
            return true;
        }
        return false;
    }

    /* renamed from: dT */
    public void m59976dT(C17945a0 c17945a0) {
        this.f56784P0.mo60649Ui(c17945a0);
    }

    /* renamed from: dU */
    public void m59977dU(String str) {
        try {
            if (m92674mJ() && !m92681pJ()) {
                m92649TI().m93060e2(0, JumpLinkSettingBottomView.Companion.m81043a(str, this.f56784P0.mo60638S2(), "csc"), "JumpLinkSettingBottomView", 0, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: dc */
    public void mo59978dc(String str, String str2, String str3) {
        AbstractC23152n3.m119061p(m92676n2(), str, str2, str3);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: dk */
    public void mo59979dk() {
        this.f56793R1.m64790k2();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: dm */
    public void mo59980dm() {
        ActionBarMenuItem actionBarMenuItem = this.f56878m3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        C32100s1.m154953d().m154968r();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: du */
    public boolean mo59981du(String str) {
        View m59441iQ = m59441iQ(str);
        if (m59441iQ != null && m59441iQ.isShown()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: dw */
    public void mo59982dw() {
        ChatSettingBanner chatSettingBanner = this.f56804U0;
        if (chatSettingBanner != null) {
            chatSettingBanner.setVisibility(8);
            this.f56793R1.f60408d.removeView(this.f56804U0);
            this.f56793R1.f60408d.f56686U = null;
            this.f56804U0 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: dz */
    public void mo59983dz(EnumC19450c enumC19450c) {
        this.f56765I4 = enumC19450c;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: e6 */
    public void mo59984e6(boolean z11) {
        this.f56758H1 = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: eD */
    public void mo59985eD(int i11, ContactProfile contactProfile, String str) {
        if (!m59879W8()) {
            this.f56739C2 = i11;
            this.f56747E2 = contactProfile;
            this.f56751F2 = str;
            AbstractC23034c6.m118184v0(this, new String[]{"android.permission.RECORD_AUDIO"}, 135);
            return;
        }
        this.f56784P0.mo60585Jb(EnumC11304r0.CALL_OA, i11, contactProfile, str);
        this.f56739C2 = 0;
        this.f56747E2 = null;
        this.f56751F2 = null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: eI */
    public void mo59986eI() {
        mo70710wy(new Runnable() { // from class: v50.x7
            public /* synthetic */ RunnableC27894x7() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59325OR();
            }
        });
    }

    /* renamed from: eT */
    public void m59987eT(String str, boolean z11) {
        this.f56784P0.mo60634Rj(str, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: eh */
    public boolean mo59988eh() {
        return this.f56853g2;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ek */
    public void mo59989ek() {
        if (mo59907YG()) {
            this.f56856h1.m65316d();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: em */
    public void mo59990em() {
        C11621p0 c11621p0;
        ChatFrameLayout chatFrameLayout;
        try {
            if (this.f56762I1 == null) {
                AnimChat animChat = new AnimChat(getContext());
                this.f56762I1 = animChat;
                animChat.f69990e0 = true;
                animChat.setListener(new AnimChat.InterfaceC13579e() { // from class: v50.v8
                    public /* synthetic */ C27867v8() {
                    }

                    @Override // com.zing.zalo.p077ui.widget.chat.AnimChat.InterfaceC13579e
                    /* renamed from: a */
                    public final void mo76134a(String str) {
                        ChatView.this.m59549yR(str);
                    }
                });
            }
            if (this.f56762I1.getParent() == null && (c11621p0 = this.f56793R1) != null && (chatFrameLayout = c11621p0.f60408d) != null) {
                chatFrameLayout.addView(this.f56762I1, new FrameLayout.LayoutParams(-1, -1));
                this.f56762I1.m76125x0();
                mo60057iy(true, true);
                this.f56762I1.setVisibility(0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: er */
    public void mo59991er(ChatAttachmentContainer.C11728c c11728c) {
        this.f56793R1.m64814r3(c11728c);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: es */
    public void mo59992es() {
        if (!m92677nJ() && !m92681pJ()) {
            this.f56920x1 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: eu */
    public void mo59993eu(String str) {
        AbstractC23211s7.m119582o(str, m92676n2(), 1041, "rmenu");
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ev */
    public void mo59994ev() {
        WhereLeftJumpFloatingView whereLeftJumpFloatingView = this.f56764I3;
        if (whereLeftJumpFloatingView != null) {
            whereLeftJumpFloatingView.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ex */
    public void mo59995ex(int i11, String str, String str2) {
        C23459d.f113954a.m123170n(this.f72421L0, i11, str, str2);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ey */
    public void mo59996ey(C3545m c3545m) {
        if (this.f56844e1 == null) {
            View m59169I = this.f56793R1.f60408d.m59169I();
            this.f56844e1 = m59169I;
            PageMenuView pageMenuView = (PageMenuView) m59169I.findViewById(AbstractC6918a0.chat_page_menu_view);
            this.f56840d1 = pageMenuView;
            pageMenuView.setPageChatMenuViewListener(this);
            View findViewById = this.f56844e1.findViewById(AbstractC6918a0.btn_close_page_menu);
            this.f56852g1 = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: v50.ya
                public /* synthetic */ ViewOnClickListenerC27911ya() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatView.this.m59234BR(view);
                }
            });
        }
        PageMenuView pageMenuView2 = this.f56840d1;
        if (pageMenuView2 != null) {
            pageMenuView2.setPageMenu(c3545m);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: f0 */
    public void mo59997f0() {
        m60223tT(EnumC2344e0.f9852q, "csc_right_menu", m60020gQ().mo60615Oc().m17971y0());
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: f7 */
    public void mo59998f7(String str) {
        C23744a.m124114c().m124116d(8008, str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fA */
    public boolean mo59999fA() {
        ActionEditText actionEditText;
        ChatComposePanelNew chatComposePanelNew;
        if (m92685rJ() && (actionEditText = this.f56832b1) != null && actionEditText.getVisibility() == 0 && !m92649TI().m93051Z0("CHAT_DIALOG_VIEW_") && !mo60249vF() && m92649TI().m92993D0(ZinstantZaloViewPopup.class) == null && !m59772PQ() && !mo60273x4() && !m59927ZQ() && !m59960cR("tip.any")) {
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if ((!(abstractPushToTalkControl instanceof PushToTalkSpeechToText) || !((PushToTalkSpeechToText) abstractPushToTalkControl).m87982X()) && (chatComposePanelNew = this.f56819X3) != null && !chatComposePanelNew.m75574B() && !this.f56819X3.m75575C() && !this.f56819X3.m75577E() && !this.f56784P0.mo60741i0() && (!this.f56784P0.mo60540Bd() || (mo59694Jp() && !mo59877Vz()))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fE */
    public void mo60000fE() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75604r(m60004fQ(), false);
            this.f56819X3.m75606u(null);
            this.f56819X3.m75605s(null);
            this.f56819X3.m75591U(null);
            if (this.f56846e3 == 6) {
                mo59706Ka(1);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fG */
    public void mo60001fG(CharSequence charSequence) {
        try {
            TextView m59344RP = m59344RP();
            if (m59344RP == null) {
                return;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                m59344RP.setVisibility(0);
                m59344RP.setText(charSequence);
                this.f56784P0.mo60816v5("tip.csc.headername");
            } else {
                m59344RP.setVisibility(8);
                m59344RP.setText("");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fH */
    public void mo60002fH(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        m59324OP(this.f56875l4, z11);
        m59324OP(this.f56879m4, z12);
        m59324OP(this.f56883n4, z13);
        m59324OP(this.f56891p4, z13);
        m59324OP(this.f56895q4, z14);
        m59324OP(this.f56899r4, z15);
        m59324OP(this.f56871k4, z16);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fI */
    public void mo60003fI(C3538f c3538f) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64728I3(c3538f);
        }
    }

    /* renamed from: fQ */
    public String m60004fQ() {
        InterfaceC11320c interfaceC11320c = this.f56784P0;
        if (interfaceC11320c != null) {
            return interfaceC11320c.mo60638S2();
        }
        return "0";
    }

    /* renamed from: fR */
    public boolean m60005fR() {
        return AbstractC23034c6.m118121G();
    }

    /* renamed from: fU */
    public void m60006fU(C17945a0 c17945a0) {
        try {
            if (c17945a0.m95018U0()) {
                C32108s9 m95621c = c17945a0.m95051X3().m95621c();
                m95621c.m154999q(c17945a0.m95029V3().m41046j());
                mo60056iu(408, m95621c);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fb */
    public void mo60007fb(C17945a0 c17945a0, String str) {
        try {
            if (!mo60198rn(c17945a0)) {
                this.f56793R1.m64769e3(c17945a0);
            } else if (m59417eP(str)) {
                this.f56841d2 = true;
                this.f56845e2 = System.currentTimeMillis();
                AbstractC23647d.m123897g("900100");
                this.f56793R1.m64787j2(c17945a0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fd */
    public void mo60008fd() {
        Animator animator = this.f56771K3;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f56774L3;
        if (animator2 == null || !animator2.isRunning()) {
            if (this.f56774L3 == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f56768J3, "alpha", 1.0f, 0.0f);
                this.f56774L3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f56774L3.addListener(new C11279f());
            }
            this.f56774L3.start();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fk */
    public void mo60009fk() {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.m65401S();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fu */
    public void mo60010fu() {
        try {
            if (m92662fJ() != null && m92656bJ() != null && m92674mJ() && !m92681pJ()) {
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 15);
                bundle.putString("CONVERSATION_ID", this.f56784P0.mo60615Oc().m17944I0());
                m92662fJ().mo89694j2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 0, "BottomSheetE2eeView", 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fw */
    public void mo60011fw() {
        if (this.f56869k2 == null) {
            ChatSearchToolbarView chatSearchToolbarView = (ChatSearchToolbarView) this.f56793R1.f60408d.m59178R();
            this.f56869k2 = chatSearchToolbarView;
            chatSearchToolbarView.setListener(new C11307t());
        }
        if (m59312MQ() && !this.f56793R1.m64829x0().m70159S0()) {
            this.f56869k2.setVisibility(8);
        } else {
            this.f56869k2.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: fx */
    public void mo60012fx() {
        this.f56793R1.m64737M3();
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.AnimReactionCounterView.InterfaceC13727d
    /* renamed from: g9 */
    public void mo60013g9() {
        try {
            if (this.f56842d3.getTotalReaction() > 0) {
                this.f56842d3.getReactionBar().m115843r();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gA */
    public void mo60014gA(int i11) {
        Animator animator = this.f56774L3;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f56768J3 == null) {
            JumpDownFloatingView m59193i = this.f56793R1.f60408d.m59193i();
            this.f56768J3 = m59193i;
            m59193i.setOnClickListener(new View.OnClickListener() { // from class: v50.i8
                public /* synthetic */ ViewOnClickListenerC27685i8() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatView.this.m59451jS(view);
                }
            });
        }
        if (this.f56771K3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f56768J3, "alpha", 0.0f, 1.0f);
            this.f56771K3 = ofFloat;
            ofFloat.setDuration(150L);
        }
        this.f56771K3.addListener(new C11277e());
        this.f56771K3.start();
        this.f56768J3.m65422b(i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gB */
    public void mo60015gB(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        m60278xU(GroupMemApprovalView.class, bundle, 1036, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gC */
    public boolean mo60016gC() {
        if (!mo59668HI("tip.csc.plus") && !this.f56793R1.m64778h1()) {
            return TextUtils.isEmpty(mo59808Rl());
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gF */
    public void mo60017gF() {
        this.f56793R1.m64817s3();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gH */
    public void mo60018gH(boolean z11) {
        try {
            if (this.f56793R1.m64824v0() != null) {
                this.f56793R1.m64824v0().setTouchInterceptionListener(null);
            }
            mo59686If(0L);
            this.f56784P0.mo60811uh();
            this.f56779N2.removeCallbacks(this.f56787P3);
            mo60077k1();
            this.f56920x1 = true;
            if (this.f56792R0 != null) {
                mo59937ag(true);
                this.f56792R0.m64567w1();
            }
            this.f56846e3 = 0;
            this.f56784P0.mo60543Bm();
            if (mo60244v2()) {
                m92692wK().finish();
                C28023b6.m141250h0().m141285G(this.f56784P0.mo60615Oc().m17944I0(), true);
                return;
            }
            if (mo60124n3()) {
                C18922m.m99141t().m99145O(m60020gQ().mo60615Oc().m17944I0());
                return;
            }
            if (m92693xK().m93029Q(MainTabView.class)) {
                if (!this.f77813M0) {
                    this.f88756W = 1;
                }
                Bundle m92642L3 = m92642L3();
                if ((m92642L3 != null && m92642L3.getBoolean("from_dynamic_shortcut", false)) || this.f56767J2) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                    bundle.putBoolean("EXTRA_SHOW_SNACKBAR_UNDO_DELETING_CONVERSATION_FROM_RM", this.f56767J2);
                    m59538wU(MainTabView.class, bundle, 0);
                } else {
                    finish();
                }
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
                bundle2.putBoolean("EXTRA_SHOW_SNACKBAR_UNDO_DELETING_CONVERSATION_FROM_RM", this.f56767J2);
                m59538wU(MainTabView.class, bundle2, 2);
            }
            this.f56767J2 = false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: gP */
    public boolean m60019gP() {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        if (!this.f56784P0.mo60789r6() && !this.f56784P0.mo60839yb()) {
            boolean m121220N2 = AbstractC23309i.m121220N2();
            if (AbstractC19646n0.m103025s(this) && m121220N2) {
                if (this.f56784P0.mo60624Q7()) {
                    C31973j5 m4473g = C0943w.m4462l().m4473g(this.f56789Q1.m153888F().m17944I0());
                    if (m4473g == null || m4473g.m153764i0()) {
                        return false;
                    }
                    return true;
                }
                if (this.f56784P0.mo60587Jf()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: gQ */
    public InterfaceC11320c m60020gQ() {
        return this.f56784P0;
    }

    /* renamed from: gT */
    public void m60021gT(String str) {
        try {
            this.f56784P0.mo60595Kl(str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: gU */
    public void m60022gU(int i11) {
        String str;
        if (this.f56812W0 == null) {
            mo59922Z6();
            if (m59375WQ()) {
                this.f56812W0 = new MyCloudQuotaManagementView();
                str = "SMLMyCloudQuotaManagementView";
            } else {
                this.f56812W0 = new ChatInfoView();
                str = "ChatInfoView";
            }
            this.f56812W0.m65170TM(m60020gQ().mo60615Oc(), m59896XQ(), this.f56784P0);
            this.f56812W0.m65175XM(this.f56784P0.mo60676Zd(), false);
            this.f56812W0.m65191ld(i11);
            if (m59375WQ()) {
                m59353ST();
            }
            m92649TI().m93058d2(AbstractC6918a0.main_chat_view, this.f56812W0, 0, str, 1, false);
            ActionBarMenu actionBarMenu = this.f88763d0;
            if (actionBarMenu != null) {
                actionBarMenu.m92753w();
            }
            if (this.f56812W0 instanceof MyCloudQuotaManagementView) {
                C0697c0.Companion.m1048b().m1043u("mycloud_storage_visit");
            } else {
                C0697c0.Companion.m1048b().m1043u("ChatInfoView");
            }
            m59718LT();
            this.f56776M2 = true;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gc */
    public void mo60023gc(C31973j5 c31973j5, String str, boolean z11, Rect rect) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.za

            /* renamed from: q */
            public final /* synthetic */ String f130217q;

            /* renamed from: r */
            public final /* synthetic */ boolean f130218r;

            /* renamed from: s */
            public final /* synthetic */ C31973j5 f130219s;

            /* renamed from: t */
            public final /* synthetic */ Rect f130220t;

            public /* synthetic */ RunnableC27925za(String str2, boolean z112, C31973j5 c31973j52, Rect rect2) {
                r2 = str2;
                r3 = z112;
                r4 = c31973j52;
                r5 = rect2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59254ES(r2, r3, r4, r5);
            }
        });
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gg */
    public boolean mo60024gg() {
        try {
            if (!this.f56784P0.mo60627Qg() || !TextUtils.isEmpty(mo59808Rl())) {
                return false;
            }
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl != null && abstractPushToTalkControl.getVisibility() == 0) {
                return false;
            }
            if (mo59907YG()) {
                return false;
            }
            if (!this.f56793R1.m64792l1() && this.f56793R1.m64802o1()) {
                return false;
            }
            ChatComposePanelNew chatComposePanelNew = this.f56819X3;
            if ((chatComposePanelNew != null && (chatComposePanelNew.m75574B() || this.f56819X3.m75575C())) || mo60273x4() || mo59873Vj() || this.f56793R1.m64778h1()) {
                return false;
            }
            if (this.f56784P0.mo60583J0()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gh */
    public void mo60025gh() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.bringToFront();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gi */
    public void mo60026gi() {
        AbstractC2379w.m12430d(this.f56832b1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gq */
    public void mo60027gq(int i11, ArrayList arrayList) {
        C27043b c27043b = this.f56793R1.f60448x;
        if (c27043b != null) {
            c27043b.m139207R(i11);
            this.f56793R1.f60448x.m139205P(arrayList);
            this.f56793R1.f60448x.m10008p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: gz */
    public void mo60028gz() {
        try {
            ZaloView m60100lQ = m60100lQ();
            if ((m60100lQ instanceof MinimizableVideoPlayerView) && m60100lQ.m92674mJ() && !m60100lQ.m92681pJ() && m60100lQ.m92687sJ() && !m60100lQ.m92677nJ() && ((ZaloView.InterfaceC17423h) m60100lQ).mo66383c8()) {
                ((MinimizableVideoPlayerView) m60100lQ).m81910wM(true);
            } else if ((m60100lQ instanceof GroupLiveStreamPlaybackView) && m60100lQ.m92674mJ() && !m60100lQ.m92681pJ() && m60100lQ.m92687sJ() && !m60100lQ.m92677nJ() && ((ZaloView.InterfaceC17423h) m60100lQ).mo66383c8()) {
                if (AbstractC19444a.m101693a()) {
                    m60100lQ.m92693xK().mo92702G1(m60100lQ, 0);
                } else {
                    m60100lQ.finish();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: h3 */
    public void mo60029h3(ChatWindowReference chatWindowReference) {
        String str;
        if (this.f88760a0.getTitle() != null) {
            str = this.f88760a0.getTitle();
        } else {
            str = "";
        }
        ChatOpenParam chatOpenParam = new ChatOpenParam(false, chatWindowReference.m65296a(), new ChatWindowReference(this.f56784P0.mo60615Oc().m17944I0(), str, chatWindowReference.m65296a(), false), "", "");
        if (AbstractC25495a.m132079d(chatWindowReference.m65298c())) {
            AbstractC23211s7.m119574g(chatWindowReference.m65298c(), m92676n2(), chatOpenParam);
        } else {
            AbstractC23211s7.m119571d(chatWindowReference.m65298c(), m92676n2(), chatOpenParam);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: h5 */
    public void mo60030h5(String str, C7904b c7904b, boolean z11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("extra_topic_id", c7904b.f42715C);
            bundle.putString("extra_group_id", str);
            bundle.putBoolean("extra_shortcut_groupboard", z11);
            m59538wU(GroupPostDetailViewV2.class, bundle, 1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hG */
    public void mo60031hG(String str) {
        mo60056iu(410, str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hI */
    public void mo60032hI(boolean z11) {
        int i11;
        RecyclerView recyclerView = this.f56873l2;
        if (recyclerView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            recyclerView.setVisibility(i11);
            if (z11) {
                this.f56873l2.m9837K1(0);
            }
        }
    }

    /* renamed from: hP */
    public void m60033hP(int i11) {
        mo70710wy(new Runnable() { // from class: v50.qa

            /* renamed from: q */
            public final /* synthetic */ int f129940q;

            public /* synthetic */ RunnableC27799qa(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59470mR(r2);
            }
        });
    }

    /* renamed from: hR */
    public boolean m60034hR() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null && c11603g0.m60472A0()) {
            return true;
        }
        return false;
    }

    /* renamed from: hT */
    public void m60035hT() {
        this.f56924y1 = false;
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if ((chatComposePanelNew == null || !chatComposePanelNew.m75574B()) && !AbstractC22470k.m116161m() && !this.f56784P0.mo60741i0()) {
            RemindChatMessageView remindChatMessageView = this.f56827Z3;
            if (remindChatMessageView != null && remindChatMessageView.m92672lJ()) {
                return;
            }
            this.f56784P0.mo60756kh();
            this.f56779N2.post(new Runnable() { // from class: v50.r9
                public /* synthetic */ RunnableC27812r9() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59332PR();
                }
            });
            try {
                if (m92676n2() != null && m92676n2().getWindow() != null) {
                    C24559a.m127933c("[KeyboardInfo]", "onKeyboardHidden, softInputMode: " + m92676n2().getWindow().getAttributes().softInputMode + ", currentStateInput: " + mo60194rc());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            if (mo60301zB() || mo60120mu()) {
                m59651GT();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ha */
    public void mo60036ha(C17945a0 c17945a0) {
        int i11;
        if (this.f56752F3 == null) {
            this.f56752F3 = (TextView) this.f56793R1.f60408d.m59195k();
        }
        TextView textView = this.f56752F3;
        if (c17945a0.m94986Q6()) {
            i11 = AbstractC8020f0.str_mention_all;
        } else {
            i11 = AbstractC8020f0.str_btn_mention_jump;
        }
        textView.setText(m92652XI(i11));
        this.f56752F3.setOnClickListener(new View.OnClickListener() { // from class: v50.pa

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f129917q;

            public /* synthetic */ ViewOnClickListenerC27785pa(C17945a0 c17945a02) {
                r2 = c17945a02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatView.this.m59471mS(r2, view);
            }
        });
        this.f56752F3.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hh */
    public boolean mo60037hh() {
        return this.f56860i1 == null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hj */
    public void mo60038hj(C31862c c31862c, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            mo60271wv(str, str2, null, null);
        }
        C18434b.m97679l().m97691w(c31862c);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hl */
    public void mo60039hl(C7904b c7904b, int i11, boolean z11) {
        mo70710wy(new Runnable() { // from class: v50.b9

            /* renamed from: q */
            public final /* synthetic */ C7904b f129561q;

            /* renamed from: r */
            public final /* synthetic */ int f129562r;

            /* renamed from: s */
            public final /* synthetic */ boolean f129563s;

            public /* synthetic */ RunnableC27581b9(C7904b c7904b2, int i112, boolean z112) {
                r2 = c7904b2;
                r3 = i112;
                r4 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59414dS(r2, r3, r4);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hn */
    public void mo60040hn(boolean z11) {
        this.f56793R1.m64740O2(z11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hr */
    public void mo60041hr(boolean z11) {
        ActionEditText actionEditText;
        try {
            if (this.f56857h2 == null) {
                ChatSearchBarView m59226AQ = m59226AQ();
                this.f56857h2 = m59226AQ;
                if (m59226AQ == null) {
                    return;
                }
            }
            if (!this.f56924y1) {
                mo60094l7(0, false);
            }
            mo59573BB(false);
            this.f56784P0.mo60602M5();
            this.f56853g2 = true;
            mo59646G9();
            m60020gQ().mo60698ch(1);
            mo59663H7("");
            this.f56865j2.setSelection(0);
            if (this.f56824Z0 != null && (actionEditText = this.f56832b1) != null && actionEditText.getLineCount() > 1) {
                mo59807Rk(false);
            }
            invalidateOptionsMenu();
            mo59686If(0L);
            mo59692Ji(false);
            if (mo59907YG()) {
                this.f56856h1.m65316d();
                mo60133na();
                mo60235u8(true);
            }
            this.f56865j2.postDelayed(new Runnable() { // from class: v50.a9

                /* renamed from: q */
                public final /* synthetic */ boolean f129540q;

                public /* synthetic */ RunnableC27566a9(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.m59260FS(r2);
                }
            }, 200L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ht */
    public void mo60042ht(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        m60278xU(NicknameInGroupView.class, bundle, 0, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hy */
    public void mo60043hy() {
        try {
            mo59702KH("AvatarPickerView");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: hz */
    public void mo60044hz() {
        try {
            ZaloView m92996E0 = m92649TI().m92996E0("TAG_SHOW_POPUP_MENU_PROFILE_MORE");
            if (m92996E0 != null) {
                m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: i6 */
    public boolean mo60045i6(String str) {
        if (!m92672lJ() || !m92687sJ() || this.f56916w1) {
            return false;
        }
        if (this.f56853g2 && !str.equals("tip.search.bysender.entry")) {
            return false;
        }
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && (chatComposePanelNew.m75611z() || this.f56819X3.m75574B())) {
            return false;
        }
        ShowcaseView showcaseView = this.f56786P2;
        if ((showcaseView != null && showcaseView.getParent() != null) || m59401aR() || m59927ZQ() || m59866VQ() || mo59559A2() || mo60120mu()) {
            return false;
        }
        return !this.f56732A3;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: i8 */
    public void mo60046i8() {
        ActionBarMenuItem actionBarMenuItem = this.f56894q3;
        if (actionBarMenuItem == null || actionBarMenuItem.getParent() != m92647RI()) {
            ActionBarMenuItem m78952hL = m78952hL(AbstractC6918a0.menu_chat_media_store, m59350SP(m92689tK(), AbstractC16803z.icn_kho_media));
            this.f56894q3 = m78952hL;
            AbstractC23201r8.m119532b(m78952hL, AbstractC8020f0.tb_open_chat_stored_media);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: iC */
    public void mo60047iC(boolean z11) {
        int i11;
        TextView textView = this.f56848f1;
        if (textView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: iD */
    public void mo60048iD(boolean z11) {
        if (this.f56744D3 == null) {
            UnreadJumpFloatingView m59197m = this.f56793R1.f60408d.m59197m();
            this.f56744D3 = m59197m;
            m59197m.setOnClickListener(new View.OnClickListener() { // from class: v50.ea
                public /* synthetic */ ViewOnClickListenerC27627ea() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatView.this.m59484oS(view);
                }
            });
        }
        this.f56744D3.setVisibility(0);
        this.f56744D3.m65436a(z11);
    }

    /* renamed from: iP */
    public void m60049iP(C17945a0 c17945a0) {
        String str;
        try {
            boolean m121977hc = AbstractC23309i.m121977hc();
            if (m121977hc) {
                str = "9100";
            } else {
                str = "9200";
            }
            AbstractC23647d.m123907q(str, mo60287y());
            AbstractC23309i.m122484ux(!m121977hc);
            mo60118mj();
            if (!m59419eR()) {
                C7853b.m40052a0().m40136j1();
            }
            if (m121977hc) {
                C20529b.f100835a.m106668w(c17945a0);
            }
            mo59600Cy();
            C2546u.f10363a.m12828o(c17945a0, m121977hc);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: iU */
    public void m60050iU(String str) {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65181bN(str);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: id */
    public void mo60051id(int i11) {
        try {
            mo59702KH("CHAT_DIALOG_VIEW_" + i11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ij */
    public boolean mo60052ij() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75582J()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: il */
    public void mo60053il() {
        this.f56858h3 = 4;
        m59705KT(true);
        mo59807Rk(true);
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.setInputMode(2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: iq */
    public void mo60054iq() {
        this.f56843d4 = mo59611Dd();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: is */
    public void mo60055is() {
        try {
            this.f56779N2.removeCallbacks(this.f56834b3);
            this.f56793R1.m64766e0(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: iu */
    public ChatDialogView mo60056iu(int i11, Object obj) {
        try {
            mo60051id(i11);
            InterfaceC11320c interfaceC11320c = this.f56784P0;
            ChatDialogView m62828CM = ChatDialogView.m62828CM(i11, this, interfaceC11320c, obj, interfaceC11320c.mo60638S2());
            mo59922Z6();
            if (m62828CM.m92687sJ()) {
                m62828CM.dismiss();
            }
            m62828CM.m92602UK(m92649TI(), "CHAT_DIALOG_VIEW_" + i11);
            return m62828CM;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: iy */
    public void mo60057iy(boolean z11, boolean z12) {
        AnimChat animChat = this.f56762I1;
        if (animChat != null) {
            animChat.m76101A0(z11, z12);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: iz */
    public void mo60058iz(int i11) {
        try {
            if (this.f56878m3 == null && this.f56882n3 == null) {
                return;
            }
            C32100s1.m154953d().m154961f(i11, m60020gQ().mo60615Oc().m17944I0(), this.f56914v3, TextUtils.equals(AbstractC23160o0.m119285r0(m60020gQ().mo60615Oc().m17944I0()), m92651WI().getString(AbstractC8020f0.str_Online)));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: j1 */
    public void mo60059j1() {
        mo37493TJ();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: j3 */
    public boolean mo60060j3() {
        return this.f56754G1;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: j5 */
    public void mo60061j5(String str, int i11, int i12) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64796m2(str, i11, i12);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: j9 */
    public void mo60062j9(String str) {
        ChatSearchBarView chatSearchBarView = this.f56857h2;
        if (chatSearchBarView != null) {
            chatSearchBarView.setFromSenderSearchName(str);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jA */
    public void mo60063jA(String str) {
        try {
            int m40666e = TrackingSource.m40666e();
            String m40669h = TrackingSource.m40669h(m40666e);
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", str);
            bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
            if (!TextUtils.isEmpty(m40669h)) {
                bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
            }
            ZaloWebView.m87105iS(m92692wK(), str, bundle);
            m60020gQ().mo60832x4(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jE */
    public void mo60064jE(boolean z11) {
        int i11;
        ChatSearchBarView chatSearchBarView = this.f56857h2;
        if (chatSearchBarView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            chatSearchBarView.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jG */
    public void mo60065jG() {
        try {
            C11603g0 c11603g0 = this.f56792R0;
            if (c11603g0 != null && c11603g0.m64568x1() != null) {
                this.f56792R0.m64568x1().m104021w(this.f56796S0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: jU */
    public void m60066jU() {
        ChatEmptyView chatEmptyView = this.f56775M1;
        if (chatEmptyView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatEmptyView, "alpha", 0.3f, 1.0f);
            ofFloat.setDuration(300L);
            this.f56775M1.setVisibility(0);
            ofFloat.start();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ja */
    public String mo60067ja() {
        return ((C2876h0) this.f56904t1).m13823Q();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jg */
    public void mo60068jg(C27675hd c27675hd) {
        this.f56872l1 = (LandingPageView) m92649TI().m92996E0("LandingPageViewTag");
        m59607DQ();
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.m64824v0() != null) {
            this.f56793R1.m64824v0().m88339e(8388613);
        }
        invalidateOptionsMenu();
        C32119t6.m155009c().m155020l();
        C11621p0 c11621p02 = this.f56793R1;
        if (c11621p02 != null) {
            c11621p02.m64791k3(this.f56784P0.mo60801ta());
            C27856ub c27856ub = this.f56884o1;
            if (c27856ub != null) {
                this.f56793R1.m64765d3(c27856ub.f130053K);
            }
        }
        if (c27675hd != null) {
            m59285IT(c27675hd);
        }
        m60160pP(m60020gQ().mo60615Oc().m17944I0());
        mo60043hy();
        mo60149oe();
        m59634FP();
        mo59628Et();
        m59606DP(null);
        m59650GP();
        this.f56782O2.m74687C((ViewGroup) m92656bJ());
        this.f56784P0.mo60708e5();
        if (this.f56793R1 != null && !mo59559A2()) {
            C21373a c21373a = C21373a.f104231a;
            if (c21373a.m110797i()) {
                if (AbstractC28025b8.m141453i("tip.mycloud.attachment.flow3.step1").m142169h()) {
                    mo78955kl(new Runnable() { // from class: v50.a8
                        public /* synthetic */ RunnableC27565a8() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatView.this.m59436hS();
                        }
                    }, 800L);
                } else {
                    c21373a.m110787J(false);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jj */
    public void mo60069jj(String str, String str2, Integer num) {
        try {
            if (!mo60316zw(411)) {
                mo60056iu(411, new Object[]{str, str2, num});
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jk */
    public void mo60070jk() {
        C32100s1.m154953d().m154968r();
        ActionBarMenuItem actionBarMenuItem = this.f56878m3;
        if (actionBarMenuItem != null && actionBarMenuItem.getParent() == m92647RI()) {
            this.f56878m3.setIcon(m59350SP(m92689tK(), AbstractC16803z.icn_header_voicecall_white));
            if (this.f56878m3.getVisibility() != 0) {
                this.f56878m3.setVisibility(0);
            }
            this.f56878m3.setNotiRedotMarginRight(AbstractC23136l9.m118742r(16.0f));
            this.f56784P0.mo60657Wa("tip.csc.call");
        } else {
            this.f56878m3 = m78952hL(AbstractC6918a0.menu_call, m59350SP(m92689tK(), AbstractC16803z.icn_header_voicecall_white));
        }
        ActionBarMenuItem actionBarMenuItem2 = this.f56878m3;
        if (actionBarMenuItem2 != null && this.f56918w3 != null) {
            actionBarMenuItem2.getIconView().setImageBitmap(this.f56918w3);
        }
        this.f56784P0.mo60835xa(1000L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jm */
    public void mo60071jm(int i11) {
        ActionBarMenuItem actionBarMenuItem = this.f56874l3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setNotiRedotMarginRight(AbstractC23136l9.m118742r(i11));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jt */
    public boolean mo60072jt() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75574B()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jv */
    public void mo60073jv() {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65192r4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jw */
    public void mo60074jw(int i11) {
        m59456kP(m60020gQ().mo60798sp());
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64783i2(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: jy */
    public void mo60075jy(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            MediaItem mediaItem = (MediaItem) list.get(i11);
            if (mediaItem != null) {
                arrayList.add(mediaItem);
            }
        }
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75606u(arrayList);
            this.f56819X3.m75605s(arrayList);
            this.f56819X3.m75591U(arrayList);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: k */
    public ZaloView mo60076k() {
        return this;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: k1 */
    public void mo60077k1() {
        if (this.f56796S0 == null) {
            return;
        }
        this.f56796S0.m9866X1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: k5 */
    public void mo60078k5(int i11) {
        if (this.f56846e3 == 0 && i11 != 0) {
            mo59706Ka(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: k6 */
    public boolean mo60079k6() {
        return this.f56793R1.m64802o1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: k9 */
    public void mo60080k9() {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65166NM(this.f56784P0.mo60615Oc(), this.f56784P0.mo60837xo());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: kA */
    public void mo60081kA() {
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            this.f56886o3 = null;
            this.f56894q3 = null;
            this.f56890p3 = null;
            this.f56882n3 = null;
            this.f56878m3 = null;
            this.f56874l3 = null;
            this.f56902s3 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: kF */
    public void mo60082kF(int i11) {
        try {
            C31887d9 m155014e = C32119t6.m155009c().m155014e(i11);
            if (m155014e != null && this.f56793R1 != null) {
                this.f56784P0.mo60626Qb(true, m155014e, "", null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: kH */
    public void mo60083kH(C31973j5 c31973j5, int i11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", c31973j5.m153781r());
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("title")) {
                    bundle.putString("EXTRA_POST_CONTENT", jSONObject.optString("title"));
                }
                if (jSONObject.has("trackingSrc") && i11 == -2) {
                    bundle.putInt("INT_EXTRA_TRACKING_SOURCE", jSONObject.optInt("trackingSrc", -2));
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        bundle.putBoolean("extra_pin_post", false);
        m59538wU(GroupPostComposeViewV2.class, bundle, 1);
    }

    /* renamed from: kU */
    public void m60084kU() {
        try {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_min_time_record);
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            View m92656bJ = m92656bJ();
            if (m92676n2 != null && !m92676n2.isFinishing() && m92656bJ != null) {
                Snackbar m90634w = Snackbar.m90634w(m92656bJ, m118743r0, -1);
                m90634w.m90644J(C27280g.m139659b(m92689tK(), AbstractC23322a.zds_ic_info_circle_solid_24, AbstractC2808b.f150820b50));
                m90634w.m90639E(this.f56824Z0);
                m90634w.m90648N();
            } else {
                ToastUtils.showMess(m118743r0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ka */
    public void mo60085ka(int i11) {
        C23493c.m123315o(m92662fJ(), i11, m60020gQ().mo60615Oc().m17944I0());
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: kc */
    public void mo60086kc(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f56890p3;
        if (actionBarMenuItem != null && actionBarMenuItem.getParent() == m92647RI()) {
            if (z11) {
                this.f56890p3.setIcon(AbstractC16803z.icn_header_search);
                if (this.f56890p3.getVisibility() != 0) {
                    this.f56890p3.setVisibility(0);
                    return;
                }
                return;
            }
            this.f56890p3.setVisibility(8);
            return;
        }
        this.f56890p3 = m78952hL(AbstractC6918a0.menu_chat_search_msg, m59350SP(m92689tK(), AbstractC16803z.icn_header_search));
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: kg */
    public void mo60087kg(String str, MessageId messageId, EnumC18030a enumC18030a, String str2, String str3) {
        this.f56816X0 = ChatDetailsView.m62774SM(str, messageId, enumC18030a, str2, str3);
        m92649TI().m93060e2(this.f56793R1.f60408d.getId(), this.f56816X0, "fragment_chat_details", 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ki */
    public void mo60088ki() {
        int i11 = this.f56846e3;
        if (i11 != 0 && i11 != 9) {
            mo60094l7(0, false);
        }
        if (this.f56846e3 == 9) {
            ChatComposePanelNew chatComposePanelNew = this.f56819X3;
            if (chatComposePanelNew == null || chatComposePanelNew.m75603q()) {
                mo60094l7(0, false);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ko */
    public void mo60089ko() {
        JumpDownFloatingView jumpDownFloatingView = this.f56768J3;
        if (jumpDownFloatingView != null) {
            jumpDownFloatingView.m65421a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0001, B:10:0x0080, B:11:0x0086, B:13:0x0092, B:15:0x009a, B:17:0x00a8, B:18:0x00ad, B:22:0x000f, B:23:0x0066, B:25:0x006e, B:27:0x0076, B:29:0x007a, B:31:0x002c, B:33:0x0046, B:35:0x004e, B:37:0x0056), top: B:2:0x0001 }] */
    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: kr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo60090kr(ContactProfile contactProfile, boolean z11, C31922g c31922g, boolean z12, boolean z13, boolean z14, boolean z15, int i11, InterfaceC21485c interfaceC21485c) {
        View view;
        try {
            int m153382d = c31922g.m153382d();
            if (m153382d != 0) {
                if (m153382d != 1) {
                    if (m153382d == 2) {
                        this.f56868k1 = this.f56793R1.m64828w3(contactProfile, mo60124n3(), c31922g, z11, z13, z14, z15, interfaceC21485c);
                    } else {
                        mo60256vl();
                        invalidateOptionsMenu();
                        this.f56784P0.mo60773nk(i11, contactProfile.f42394Y0);
                        if (z12 && !this.f56784P0.mo60789r6() && m60020gQ().mo60615Oc().m17936A0() != null) {
                            this.f56784P0.mo60646Ua();
                        }
                        this.f56784P0.mo60647Ub();
                    }
                } else if (z12) {
                    this.f56868k1 = this.f56793R1.m64828w3(contactProfile, mo60124n3(), c31922g, z11, z13, z14, z15, interfaceC21485c);
                }
                if (this.f56784P0.mo60741i0() && this.f56784P0.mo60583J0() && (view = this.f56868k1) != null) {
                    view.setVisibility(8);
                }
                this.f56784P0.mo60773nk(i11, contactProfile.f42394Y0);
                if (z12) {
                    this.f56784P0.mo60646Ua();
                }
                this.f56784P0.mo60647Ub();
            }
            if (!z11 && !this.f56784P0.mo60789r6() && !this.f56784P0.mo60839yb()) {
                this.f56868k1 = this.f56793R1.m64831x3(z13, z14, z15, interfaceC21485c);
                if (this.f56784P0.mo60741i0()) {
                    view.setVisibility(8);
                }
                this.f56784P0.mo60773nk(i11, contactProfile.f42394Y0);
                if (z12) {
                }
                this.f56784P0.mo60647Ub();
            }
            mo60256vl();
            invalidateOptionsMenu();
            this.f56784P0.mo60773nk(i11, contactProfile.f42394Y0);
            if (z12) {
            }
            this.f56784P0.mo60647Ub();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ku */
    public void mo60091ku(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", str);
        bundle.putString("STR_SOURCE_START_VIEW", "csc_right_menu");
        m59538wU(StorageUsageDetailView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: kz */
    public void mo60092kz() {
        this.f56779N2.removeCallbacks(this.f56866j3);
        this.f56779N2.removeCallbacks(this.f56862i3);
    }

    @Override // com.zing.zalo.p077ui.chat.widget.inputbar.PageMenuView.InterfaceC11746a
    /* renamed from: l2 */
    public void mo60093l2(AbstractC27282a abstractC27282a) {
        this.f56784P0.mo60757l2(abstractC27282a);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: l7 */
    public void mo60094l7(int i11, boolean z11) {
        m59803RT(i11, z11, false, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: l8 */
    public void mo60095l8(ArrayList arrayList) {
        ChatFilterSearchAdapter chatFilterSearchAdapter = this.f56877m2;
        if (chatFilterSearchAdapter != null) {
            chatFilterSearchAdapter.m65595Q(arrayList);
            this.f56877m2.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: lC */
    public void mo60096lC() {
        this.f56832b1.setTextSize(1, 16.0f);
        this.f56785P1 = 0;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: lF */
    public void mo60097lF() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64826v3(25, new WalkThroughOnboardView.InterfaceC13300b() { // from class: v50.ta
                public /* synthetic */ C27841ta() {
                }

                @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
                /* renamed from: a */
                public final void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
                    ChatView.this.m59242CS(walkThroughOnboardView);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: lG */
    public boolean mo60098lG() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.m64758b1()) {
            return true;
        }
        return false;
    }

    /* renamed from: lP */
    public void m60099lP(boolean z11) {
        this.f56784P0.mo60673Yo(z11);
    }

    /* renamed from: lQ */
    public ZaloView m60100lQ() {
        if (m92662fJ() != null) {
            return m92662fJ().m93012K0();
        }
        return null;
    }

    /* renamed from: lT */
    public void m60101lT(C17945a0 c17945a0) {
        this.f56784P0.mo60593K5(c17945a0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ld */
    public void mo60102ld(int i11) {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65191ld(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: le */
    public void mo60103le(int i11) {
        try {
            if (i11 == 0) {
                this.f56779N2.postDelayed(this.f56780N3, 400L);
            } else if (i11 == 1 || i11 == 3) {
                this.f56779N2.removeCallbacks(this.f56780N3);
                m60307zU();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: lf */
    public void mo60104lf() {
        boolean z11;
        mo59710Km();
        if ((this.f56784P0.mo60624Q7() && AbstractC0924m0.m3539W9()) || ((this.f56784P0.mo60587Jf() || this.f56784P0.mo60540Bd()) && AbstractC0924m0.m3568X9())) {
            m60020gQ().mo60813uj();
        }
        View view = this.f56868k1;
        if (view != null) {
            view.setVisibility(0);
        }
        ChatSettingBanner chatSettingBanner = this.f56804U0;
        if (chatSettingBanner != null) {
            chatSettingBanner.setVisibility(0);
        }
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0.f60398W != null) {
            int i11 = this.f56846e3;
            if (i11 != 0 && i11 != 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            c11621p0.m64808p3(z11);
        }
        FloatingPromoteTrendingStickerModulesView floatingPromoteTrendingStickerModulesView = this.f56793R1.f60435q0;
        if (floatingPromoteTrendingStickerModulesView != null) {
            floatingPromoteTrendingStickerModulesView.setVisibility(0);
        }
        StickyNotiLiveStreamingBar stickyNotiLiveStreamingBar = this.f56793R1.f60396U;
        if (stickyNotiLiveStreamingBar != null) {
            stickyNotiLiveStreamingBar.setVisibility(0);
        }
        E2eeWarningBanner e2eeWarningBanner = this.f56876m1;
        if (e2eeWarningBanner != null) {
            e2eeWarningBanner.setVisibility(0);
        }
        mo59573BB(true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ll */
    public void mo60105ll() {
        View view = this.f56740C3;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: lr */
    public void mo60106lr(int i11, boolean z11) {
        this.f56779N2.removeMessages(123460);
        if (i11 > 0) {
            Handler handler = this.f56779N2;
            handler.sendMessageDelayed(handler.obtainMessage(123460, Boolean.valueOf(z11)), i11);
        } else {
            Handler handler2 = this.f56779N2;
            handler2.sendMessage(handler2.obtainMessage(123460, Boolean.valueOf(z11)));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: lv */
    public void mo60107lv(String str) {
        try {
            if (!AbstractC22470k.m116152d(true)) {
                return;
            }
            ZaloView m60100lQ = m60100lQ();
            if (m60100lQ instanceof GroupLiveStreamView) {
                ((GroupLiveStreamView) m60100lQ).m66440NM();
                return;
            }
            AbstractC23647d.m123897g("10008000");
            if (getContext() != null) {
                AbstractC2379w.m12430d(m92692wK().getCurrentFocus());
            }
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", str);
            bundle.putBoolean("EXTRA_MINIMIZE", !mo60124n3());
            m59538wU(GroupLiveStreamView.class, bundle, 1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: m5 */
    public void mo60108m5(C17945a0 c17945a0, C20343i c20343i, EnumC20344j enumC20344j) {
        if (c20343i != null) {
            if (c20343i.m106068h()) {
                this.f56881n2 = c17945a0.m95029V3();
            }
            if (c20343i.m106069i() && this.f56792R0 != null) {
                mo59779Pv(c17945a0.m95029V3());
            }
        }
        this.f56921x2 = enumC20344j;
        mo60171q5();
        m59437hU(c17945a0, c20343i);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: m8 */
    public void mo60109m8(int i11, String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mA */
    public void mo60110mA(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 20);
        bundle.putString("CONVERSATION_ID", this.f56784P0.mo60615Oc().m17944I0());
        bundle.putString("extra_conversation_id", this.f56784P0.mo60615Oc().m17944I0());
        bundle.putString("STR_SOURCE_START_VIEW", str);
        m60278xU(FrameLayoutKeepBtmSheetZaloView.class, bundle, 0, 2, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mB */
    public void mo60111mB(ChatAttachmentContainer.C11728c c11728c) {
        try {
            m59556zQ();
            this.f56856h1.m65315b(c11728c);
            if (!this.f56856h1.m65319h()) {
                mo60235u8(false);
                this.f56784P0.mo60602M5();
                mo60152os();
                mo59677Hq();
                if (c11728c.m65330h() != 4) {
                    if (c11728c.m65330h() == 7) {
                    }
                    m59911YT(this.f56856h1);
                }
                if (mo59878W5()) {
                    C2526d.f10270a.m12730w(C17988o1.a.f91106q, this.f56793R1.f60438s.getQuickReplyGlobalMsgId());
                }
                mo60183qw();
                m59911YT(this.f56856h1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: mP */
    public void m60112mP(C17945a0 c17945a0) {
        this.f56784P0.mo60531Aa(c17945a0);
    }

    /* renamed from: mQ */
    public String m60113mQ() {
        return this.f56784P0.mo60554Dn();
    }

    /* renamed from: mU */
    public void m60114mU(int i11, int i12, boolean z11, int i13) {
        if (!mo60249vF() && m92672lJ() && this.f56792R0 != null && i11 >= 0 && i11 < mo59968co()) {
            if (this.f56853g2) {
                this.f56784P0.mo60653Vc();
            }
            this.f56784P0.mo60543Bm();
            C28201u4.m141792b().m141795d();
            C28771c c28771c = (C28771c) this.f56792R0.m60492f0(i11);
            if (c28771c == null) {
                return;
            }
            if (c28771c.m143962v()) {
                this.f56730A1 = c28771c.m143953m(i12);
            } else {
                this.f56730A1 = c28771c.m143954n();
            }
            if (this.f56730A1 != null) {
                C23081g9.m118410g(30L);
                this.f56796S0.requestDisallowInterceptTouchEvent(true);
                MessageContextMenuView m62693fM = MessageContextMenuView.m62693fM(this.f56789Q1.m153886E(), this.f56730A1, mo60287y(), z11, i13, i12, c28771c.m143959s(), m60020gQ(), "csc", m60004fQ(), this.f56792R0.m64569z1(i11));
                this.f56820Y0 = m62693fM;
                m62693fM.m88275hL(new C11301q());
                m59790QT(true);
                m92649TI().m93060e2(0, this.f56820Y0, "MessageContextMenuView", 0, false);
                this.f56792R0.m64556Z1();
                mo59806Rh();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mg */
    public void mo60115mg() {
        ChatDetailsView chatDetailsView = this.f56816X0;
        if (chatDetailsView != null) {
            chatDetailsView.m62807S1();
        }
        mo59806Rh();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mh */
    public boolean mo60116mh(String str) {
        View m59441iQ = m59441iQ(str);
        if (m59441iQ != null && m59441iQ.isEnabled() && m59441iQ.getVisibility() == 0 && m59441iQ.getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mi */
    public void mo60117mi(boolean z11) {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65177YM(z11);
            C23744a.m124114c().m124116d(15003, Integer.valueOf(!z11 ? 1 : 0));
            if (z11) {
                if (this.f56812W0 instanceof MyCloudQuotaManagementView) {
                    C0697c0.Companion.m1048b().m1043u("mycloud_storage_visit");
                } else {
                    C0697c0.Companion.m1048b().m1043u("ChatInfoView");
                }
                m59718LT();
                this.f56776M2 = true;
                return;
            }
            if (this.f56776M2) {
                this.f56776M2 = false;
                if (this.f56812W0 instanceof MyCloudQuotaManagementView) {
                    C0697c0.Companion.m1048b().m1035h("mycloud_storage_visit");
                }
                C0697c0.Companion.m1048b().m1043u("ChatView");
                m59761OT();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mj */
    public void mo60118mj() {
        if (this.f56870k3) {
            invalidateOptionsMenu();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mo */
    public void mo60119mo(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f56886o3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setNotiRedotMarginTop(AbstractC23136l9.m118742r(12.0f));
            this.f56886o3.setNotiRedotMarginRight(AbstractC23136l9.m118742r(8.0f));
            this.f56886o3.setRedDotColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.badge_background_red));
            this.f56886o3.setReddotRadius(AbstractC23222t7.f112558f);
            this.f56886o3.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mu */
    public boolean mo60120mu() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null && abstractPushToTalkControl.m87657j()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mv */
    public void mo60121mv(String str, String str2) {
        AbstractC23211s7.m119572e(str, m92676n2(), str2);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: my */
    public void mo60122my(boolean z11) {
        try {
            mo60057iy(true, true);
            if (m92649TI().m92996E0("fragment_chat_details") != null) {
                mo59702KH("fragment_chat_details");
                invalidateOptionsMenu();
                C23744a.m124114c().m124116d(2, new Object[0]);
            }
            mo59580Bi();
            this.f56816X0 = null;
            this.f56784P0.mo60816v5("tip.any");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: mz */
    public void mo60123mz(String str) {
        ChatSearchBarView chatSearchBarView = this.f56857h2;
        if (chatSearchBarView != null) {
            chatSearchBarView.setPlaceholderSearchEditText(str);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: n3 */
    public boolean mo60124n3() {
        if (m92676n2() != null && m92676n2().mo35576n3()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: n5 */
    public void mo60125n5() {
        if (!this.f56784P0.mo60789r6() && !this.f56784P0.mo60839yb()) {
            ActionBarMenuItem actionBarMenuItem = this.f56874l3;
            if (actionBarMenuItem != null && actionBarMenuItem.getParent() == m92647RI()) {
                this.f56874l3.setIcon(m59350SP(m92689tK(), m59382XP()));
                if (this.f56874l3.getVisibility() != 0) {
                    this.f56874l3.setVisibility(0);
                }
                this.f56874l3.bringToFront();
                return;
            }
            this.f56874l3 = m78952hL(AbstractC6918a0.menu_drawer, m59350SP(m92689tK(), m59382XP()));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nA */
    public boolean mo60126nA() {
        WhereLeftJumpFloatingView whereLeftJumpFloatingView = this.f56764I3;
        if (whereLeftJumpFloatingView != null && whereLeftJumpFloatingView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nB */
    public boolean mo60127nB() {
        ReactJumpFloatingView reactJumpFloatingView = this.f56760H3;
        if (reactJumpFloatingView != null && reactJumpFloatingView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nD */
    public void mo60128nD(String str) {
        if (this.f56864j1 == null) {
            this.f56864j1 = m59299KP();
        }
        this.f56864j1.setText(str);
        m59385XT(true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nI */
    public void mo60129nI(MessageId messageId) {
        int top;
        int mo59914Yh = mo59914Yh(messageId) + this.f56792R0.m60491e0();
        View mo9732P = this.f56800T0.mo9732P(mo59914Yh);
        if (mo9732P == null) {
            top = 0;
        } else {
            top = mo9732P.getTop();
        }
        int paddingTop = top - this.f56796S0.getPaddingTop();
        mo60268wf(false);
        if (mo9732P != null) {
            this.f56800T0.m9721B2(mo59914Yh, paddingTop);
        }
    }

    /* renamed from: nP */
    public void m60130nP() {
        boolean z11;
        int i11;
        try {
            if (this.f56818X2 || !this.f56784P0.mo60587Jf()) {
                return;
            }
            this.f56818X2 = true;
            if (!AbstractC23309i.m122017ie()) {
                return;
            }
            int m122092ke = AbstractC23309i.m122092ke();
            int m122054je = AbstractC23309i.m122054je();
            if (m122092ke > 0 && m122092ke <= 100 && m122054je >= 0) {
                C3535c mo60615Oc = this.f56784P0.mo60615Oc();
                boolean m121979he = AbstractC23309i.m121979he();
                C26393b m136076v = mo60615Oc.m136076v();
                int i12 = 0;
                if (m136076v != null) {
                    int m136016p = m136076v.m136016p();
                    z11 = false;
                    i11 = 0;
                    while (i12 < m136076v.m136016p()) {
                        C17945a0 c17945a0 = (C17945a0) m136076v.m136006f(i12);
                        if (c17945a0.m95042W5()) {
                            i11++;
                            if (i12 == m136016p - 1 && c17945a0.m95074Z6()) {
                                z11 = true;
                            }
                        }
                        i12++;
                    }
                    i12 = m136016p;
                } else {
                    z11 = false;
                    i11 = 0;
                }
                if ((i12 > 0 && i11 * 100 >= i12 * m122092ke) || (m121979he && z11)) {
                    C20024r.m103937c().m103958x(mo60615Oc.m17944I0(), m122054je);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: nQ */
    public C3554v m60131nQ() {
        return this.f56784P0.mo60654Vm();
    }

    /* renamed from: nT */
    public void m60132nT(boolean z11) {
        RedDotImageButton redDotImageButton = this.f56810V2;
        if (redDotImageButton != null) {
            redDotImageButton.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: na */
    public void mo60133na() {
        int i11;
        Set<ChatAttachmentContainer.C11728c> mediaAttachment;
        try {
            String m17944I0 = m60020gQ().mo60615Oc().m17944I0();
            if (C32037n9.f147516a.m154560t(m17944I0)) {
                i11 = AbstractC8020f0.str_input_disappearing_message;
            } else if (this.f56784P0.mo60624Q7() && this.f56784P0.mo60559F5()) {
                i11 = AbstractC8020f0.chat_default_send_broadcast_text;
            } else {
                C31986k3 c31986k3 = C31986k3.f147083a;
                if ((c31986k3.m154108R1(m17944I0) || (c31986k3.m154121a2(m17944I0) && c31986k3.m154098K2(m17944I0))) && c31986k3.m154110T1()) {
                    i11 = AbstractC8020f0.encrypted_msg;
                } else {
                    i11 = AbstractC8020f0.chat_default_text;
                }
                if (mo59907YG() && (mediaAttachment = this.f56856h1.getMediaAttachment()) != null && mediaAttachment.size() > 0) {
                    Iterator<ChatAttachmentContainer.C11728c> it = mediaAttachment.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ChatAttachmentContainer.C11728c next = it.next();
                        if (next != null) {
                            switch (next.m65330h()) {
                                case 1:
                                case 2:
                                case 6:
                                case 7:
                                    i11 = AbstractC8020f0.str_chat_hint_photo_caption;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    break;
                                default:
                                    throw new IllegalArgumentException("Unsupported attachment type:" + next.m65330h());
                            }
                        }
                    }
                }
            }
            ChatInputBar chatInputBar = this.f56824Z0;
            if (chatInputBar != null) {
                chatInputBar.setInputHint(i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nc */
    public void mo60134nc(boolean z11, boolean z12) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64799n2(z11, z12);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nh */
    public boolean mo60135nh(String str, C28212v6 c28212v6) {
        View m59441iQ = m59441iQ(str);
        if (m59441iQ != null && m59441iQ.isShown()) {
            return m60224tU(c28212v6, m59441iQ);
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nk */
    public void mo60136nk() {
        ChatSearchToolbarView chatSearchToolbarView = this.f56869k2;
        if (chatSearchToolbarView != null) {
            chatSearchToolbarView.setVisibility(8);
            this.f56793R1.f60408d.removeView(this.f56869k2);
            this.f56793R1.f60408d.f56678M = null;
            this.f56869k2 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: no */
    public void mo60137no(String str) {
        Spanned m119746j = AbstractC23244v8.m119746j(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_msg_success), str));
        if (!TextUtils.isEmpty(m119746j)) {
            ToastUtils.showMess(false, (CharSequence) m119746j);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: nx */
    public void mo60138nx() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.f60417h0) {
            c11621p0.m64794m0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ny */
    public boolean mo60139ny() {
        ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
        if (chatAttachmentContainer != null && chatAttachmentContainer.m65317e(3)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: o2 */
    public void mo60140o2(String str) {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null && actionEditText.getText() != null) {
            int mo59889Wr = mo59889Wr();
            this.f56832b1.getText().replace(Math.min(this.f56763I2, mo59889Wr), mo59889Wr, str);
            this.f56832b1.setSelection(mo59889Wr());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: o4 */
    public void mo60141o4(C3535c c3535c) {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            c11603g0.m64563k2(c3535c);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: oB */
    public boolean mo60142oB() {
        return this.f56924y1;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: oF */
    public void mo60143oF(boolean z11, boolean z12) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("showUpdateProfileHint", z11);
        bundle.putBoolean("update", z12);
        m60278xU(UpdateUserInfoZView.class, bundle, 1023, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: oG */
    public void mo60144oG(int i11, ContactProfile contactProfile, String str) {
        this.f56784P0.mo60565Fn(EnumC11304r0.VIDEO_CALL_OA, i11, contactProfile, str);
    }

    /* renamed from: oQ */
    public void m60145oQ(String str, long j11) {
        this.f56784P0.mo60738hj(str, j11);
    }

    /* renamed from: oT */
    void m60146oT() {
        try {
            C29630g.m147299E0().m147320W0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: oU */
    public void m60147oU(String str) {
        int m40666e = TrackingSource.m40666e();
        String m40669h = TrackingSource.m40669h(m40666e);
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_WEB_URL", str);
        bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
        if (!TextUtils.isEmpty(m40669h)) {
            bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
        }
        C31944h6.m153534S(m92692wK(), str, bundle);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ob */
    public boolean mo60148ob() {
        PageMenuView pageMenuView = this.f56840d1;
        if (pageMenuView != null && pageMenuView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: oe */
    public void mo60149oe() {
        try {
            mo59702KH("MessageContextMenuView");
            m59790QT(false);
            this.f56820Y0 = null;
            this.f56730A1 = null;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: oi */
    public void mo60150oi() {
        try {
            mo59807Rk(true);
            this.f56858h3 = 1;
            m59705KT(true);
            mo59938ah(0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x02c4, code lost:            mo59706Ka(0);     */
    @Override // com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11;
        ChatInfoView chatInfoView;
        if (i12 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            String m17944I0 = m60020gQ().mo60615Oc().m17944I0();
            if (AbstractC25495a.m132079d(m17944I0)) {
                this.f56784P0.mo60573Hj(m17944I0);
            }
            if (i11 == 1002) {
                this.f56784P0.mo60745if(z11);
            } else if (i11 == 1004) {
                this.f56784P0.mo60574Hk(z11, DrawDoodleResult.m65301a(intent));
            } else if (i11 == 10001) {
                this.f56784P0.mo60552Da(z11, C20354t.m106099a(intent));
            } else if (i11 == 1013) {
                this.f56784P0.mo60683ab(z11, C20351q.m106091a(intent));
            } else if (i11 == 1010) {
                this.f56784P0.mo60670Y5(z11, C20349o.m106085a(intent));
            } else if (i11 == 1018) {
                if (z11) {
                    this.f56784P0.mo60605Me(C20341g.m106053a(intent));
                } else if (i12 == 2017) {
                    this.f56784P0.mo60534Ai(true, C20356v.m106104a(intent));
                }
            } else if (i11 == 1044) {
                if (i12 == 2017) {
                    this.f56784P0.mo60534Ai(true, C20356v.m106104a(intent));
                }
            } else if (i11 == 1023) {
                this.f56784P0.mo60665X7();
            } else if (i11 == 1019) {
                this.f56784P0.mo60737hi(z11, GalleryPickerView.m71440ZM(intent));
            } else if (i11 == 1045) {
                this.f56784P0.mo60677Ze(z11, C20347m.m106079a(intent));
            } else if (i11 == 1020) {
                this.f56784P0.mo60775np(z11, C20355u.m106100a(intent));
            } else if (i11 == 1025) {
                this.f56784P0.mo60534Ai(z11, C20356v.m106104a(intent));
                if (mo60273x4() && (chatInfoView = this.f56812W0) != null) {
                    chatInfoView.m65202zM();
                }
            } else if (i11 == 1026) {
                if (Build.VERSION.SDK_INT >= 29) {
                    this.f56784P0.mo60541Bg(C20352r.m106094a(intent));
                } else {
                    this.f56784P0.mo60630R4(i12, C20353s.m106098a(intent));
                }
                if (intent != null) {
                    mo59612De();
                }
            } else if (i11 == 1027) {
                this.f56784P0.mo60588Jg(z11, GalleryPickerView.m71440ZM(intent));
            } else if (i11 == 1029) {
                this.f56784P0.mo60560F7(z11, C20337c.m106042a(intent));
            } else if (i11 == 1030) {
                this.f56784P0.mo60705df(z11, C20337c.m106042a(intent));
            } else if (i11 == 1032) {
                if (z11) {
                    this.f56784P0.mo60702d5(C20345k.m106073a(intent));
                } else if (i12 == 1001) {
                    m59494qQ(intent);
                }
            } else if (i11 != 1033 && i11 != 1050) {
                if (i11 == 1034) {
                    if (z11 && intent != null) {
                        this.f56784P0.mo60832x4(true);
                    }
                } else if (i11 == 1035) {
                    this.f56901s2 = true;
                } else {
                    if (i11 != 300 && i11 != 1040) {
                        if (i11 == 1036) {
                            if (i12 == 1001) {
                                m59494qQ(intent);
                            }
                        } else if (i11 == 1037) {
                            if (i12 == AbstractC2335a.f9831a) {
                                this.f56784P0.mo60780pe(C20346l.m106076a(intent));
                            }
                        } else if (i11 == 1052) {
                            if (i12 == AbstractC2335a.f9831a) {
                                this.f56784P0.mo60580If(C20348n.m106082a(intent));
                            }
                        } else if (i11 == 1038) {
                            this.f56784P0.mo60700co(z11, C20335a.m106030a(intent));
                        } else if (i11 == 1039) {
                            this.f56812W0.onActivityResult(i11, i12, intent);
                        } else if (i11 == 1041) {
                            this.f56784P0.mo60656W4(z11, C20336b.m106035b(intent));
                        } else if (i11 == 1049) {
                            this.f56812W0.onActivityResult(i11, i12, intent);
                        } else if (i11 == 1051) {
                            this.f56812W0.onActivityResult(i11, i12, intent);
                        } else if (i11 == 1042) {
                            this.f56784P0.mo60551D9(z11, C20340f.m106052a(intent));
                        } else if (i11 == 1043) {
                            if (z11) {
                                ToastUtils.m89266n(AbstractC8020f0.str_hint_send_invite_success, new Object[0]);
                            }
                        } else if (i11 == 1046) {
                            this.f56784P0.mo60713ei(z11);
                        } else if (i11 == 1047) {
                            if (z11) {
                                ToastUtils.m89266n(AbstractC8020f0.feedback_thanks, new Object[0]);
                            }
                        } else if (i11 == 1048) {
                            if (z11) {
                                this.f56784P0.mo60543Bm();
                                this.f56784P0.mo60777oa();
                                this.f56784P0.mo60725gc(intent);
                            }
                        } else if (i11 == 1060) {
                            if (z11) {
                                this.f56784P0.mo60774nn(intent);
                            }
                        } else if (i11 == 1054) {
                            m59472mT(i12, C24696p.Companion.m128265a(intent));
                        } else if (i11 == 1055) {
                            if (z11) {
                                this.f56784P0.mo60537B9(intent);
                            }
                        } else if (i11 == 1061) {
                            if (z11) {
                                mo59612De();
                            }
                        } else if (i11 == 11115) {
                            if (z11) {
                                this.f56784P0.mo60692bi(intent);
                            }
                        } else if (i11 == 1062) {
                            if (z11) {
                                this.f56784P0.mo60832x4(true);
                                this.f56784P0.mo60548Cn(true);
                            }
                        } else if (i11 == 1063 && z11) {
                            this.f56784P0.mo60806tn(intent);
                        }
                    }
                    if (i12 != -1) {
                        if (i12 != 10) {
                            if (i12 == 1001) {
                                m59494qQ(intent);
                            }
                        } else {
                            m60145oQ(intent.getStringExtra("extra_mention_name"), intent.getLongExtra("extra_mention_uid", 0L));
                        }
                    } else {
                        mo59686If(0L);
                    }
                }
            }
            ChatComposePanelNew chatComposePanelNew = this.f56819X3;
            if (chatComposePanelNew != null) {
                chatComposePanelNew.m75585O(i11, i12, intent);
            }
            if (this.f56872l1 != null && mo59873Vj()) {
                this.f56872l1.onActivityResult(i11, i12, intent);
            }
            if (this.f56793R1.m64829x0() != null) {
                this.f56793R1.m64829x0().m70167X0(i11, i12);
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.chatinput_text) {
                this.f56784P0.mo60719f9();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo59590CG(false);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent) || (m60100lQ() instanceof ZaloCameraView)) {
            return true;
        }
        if (mo59727Ly() && this.f56816X0.onKeyUp(i11, keyEvent)) {
            return true;
        }
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null && c11603g0.m64555W1(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            try {
                mo59917Yo("tip.any");
                if (this.f56872l1 != null && mo59873Vj()) {
                    this.f56872l1.onKeyUp(i11, keyEvent);
                    return true;
                }
                if (this.f77813M0) {
                    if (m92656bJ() != null) {
                        m92656bJ().onKeyUp(i11, keyEvent);
                    }
                    return true;
                }
                if (this.f56793R1.m64805p0()) {
                    return true;
                }
                if (mo59728M6()) {
                    AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
                    if ((abstractPushToTalkControl instanceof PushToTalkSpeechToText) && abstractPushToTalkControl.onKeyUp(i11, keyEvent)) {
                        return true;
                    }
                }
                if (mo60273x4()) {
                    ChatInfoView chatInfoView = this.f56812W0;
                    if (chatInfoView != null && chatInfoView.onKeyUp(i11, keyEvent)) {
                        return true;
                    }
                    mo59686If(0L);
                    AbstractC23647d.m123898h("20004", mo60287y());
                    return true;
                }
                if (m59866VQ()) {
                    m59788QP();
                    return true;
                }
                ChatComposePanelNew chatComposePanelNew = this.f56819X3;
                if (chatComposePanelNew != null && (chatComposePanelNew.m75578F() || this.f56819X3.m75574B())) {
                    if (!this.f56819X3.onKeyUp(i11, keyEvent)) {
                        C11621p0 c11621p0 = this.f56793R1;
                        if (c11621p0.f60417h0) {
                            c11621p0.m64794m0();
                            AbstractC23647d.m123897g("924004");
                            return true;
                        }
                        mo59706Ka(0);
                    }
                    return true;
                }
                if (this.f56793R1.m64770f0()) {
                    return true;
                }
                return this.f56784P0.mo60623Q();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        boolean m60005fR = m60005fR();
        if (i11 != 100) {
            if (i11 != 109) {
                if (i11 != 133) {
                    if (i11 != 152) {
                        if (i11 != 117) {
                            if (i11 != 118) {
                                if (i11 != 125) {
                                    if (i11 != 126) {
                                        if (i11 != 135) {
                                            if (i11 != 136) {
                                                switch (i11) {
                                                    case 111:
                                                        String[] m118181u = AbstractC23034c6.m118181u();
                                                        if (getContext() != null && AbstractC23034c6.m118167n(getContext(), m118181u) == 0) {
                                                            this.f56801T1 = true;
                                                            break;
                                                        }
                                                        break;
                                                    case 112:
                                                        if (mo59769P0()) {
                                                            this.f56805U1 = true;
                                                        }
                                                        this.f56905t2 = false;
                                                        break;
                                                    case 113:
                                                        if (AbstractC23034c6.m118136V(iArr) && mo59769P0()) {
                                                            this.f56809V1 = true;
                                                            break;
                                                        } else {
                                                            AbstractC23034c6.m118166m0(this, 113);
                                                            break;
                                                        }
                                                }
                                            } else if (AbstractC23034c6.m118136V(iArr) && m59879W8()) {
                                                this.f56825Z1 = true;
                                            } else {
                                                AbstractC23034c6.m118166m0(this, 136);
                                            }
                                        } else if (AbstractC23034c6.m118136V(iArr) && m59879W8()) {
                                            this.f56821Y1 = true;
                                        } else {
                                            AbstractC23034c6.m118162k0(this, 135);
                                        }
                                    } else if (AbstractC23034c6.m118136V(iArr) && m59879W8()) {
                                        AbstractC3102n.m15598q(this.f72421L0, 98, this.f56747E2);
                                        this.f56747E2 = null;
                                    } else {
                                        AbstractC23034c6.m118162k0(this, 126);
                                    }
                                } else if (AbstractC23034c6.m118136V(iArr) && m59879W8()) {
                                    AbstractC3102n.m15598q(this.f72421L0, 97, this.f56747E2);
                                    this.f56747E2 = null;
                                } else {
                                    AbstractC23034c6.m118162k0(this, 125);
                                }
                            } else if (m59266GQ()) {
                                m59421eU();
                            }
                        } else if (AbstractC23034c6.m118136V(iArr) && m59879W8()) {
                            this.f56813W1 = true;
                        } else {
                            AbstractC23034c6.m118162k0(this, 117);
                        }
                    } else if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112033j) == 0) {
                        this.f56829a2 = true;
                    } else {
                        AbstractC23034c6.m118166m0(this, 152);
                    }
                } else if (AbstractC23034c6.m118136V(iArr) && mo59769P0()) {
                    this.f56817X1 = true;
                } else {
                    AbstractC23034c6.m118166m0(this, 133);
                }
            } else {
                this.f56784P0.mo60732h4();
                if (this.f56793R1.m64774g1() && this.f56793R1.m64829x0() != null) {
                    this.f56793R1.m64829x0().m70177e1();
                }
            }
        } else {
            C31849b1.m153097n().m153106h(true);
            if (!AbstractC23309i.m120973Ge() && m60005fR) {
                C28020b3.f130648a.m141203t();
            }
        }
        if (m59407bR()) {
            if (!this.f56833b2) {
                this.f56833b2 = true;
                AbstractC0852x.m2338O(new SensitiveData("phonebook_sync_scan_in_csc", "phonebook_sync"));
            }
        } else {
            this.f56833b2 = false;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        int i11;
        ActionEditText actionEditText;
        C27240a m139381b = AbstractC27241b.m139381b("10000008");
        long m139378c = m139381b.m139378c();
        super.onResume();
        m59269GU();
        this.f56784P0.mo60830wn(m92683qJ());
        Conversation m17971y0 = m60020gQ().mo60615Oc().m17971y0();
        this.f56784P0.mo60844z9(m17971y0.f42893q);
        this.f56784P0.mo60781ph();
        this.f56784P0.mo60599Lf();
        if (this.f56762I1 != null) {
            mo59990em();
        }
        this.f56905t2 = false;
        if (m92676n2() instanceof Activity) {
            mo59785Q6();
            m92676n2().mo35554O(18);
        }
        m60020gQ().mo60644U7(true);
        try {
            AbstractC23306f.m120562A().m2562t0(AbstractC23309i.m121106K());
            this.f56742D1 = true;
            this.f56793R1.m64744Q3();
            this.f56793R1.m64746R3(m60020gQ().mo60615Oc(), !this.f56784P0.mo60741i0());
            this.f56793R1.m64733K3();
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl != null) {
                abstractPushToTalkControl.mo87658k();
            }
            m59448jP();
            if (this.f56785P1 > 0 && (actionEditText = this.f56832b1) != null) {
                actionEditText.setTextSize(1, 16.0f);
                mo60133na();
                C28652r.m143349v().m143362X(mo59808Rl(), this.f56832b1.getTextSize());
                this.f56832b1.invalidate();
                this.f56785P1 = 0;
            }
            m59236BT();
            m59229AU();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        if (m92662fJ() != null && !m92662fJ().m93039V0()) {
            this.f56792R0.m64557a2();
        }
        this.f56793R1.m64768e2();
        m59592CT();
        if (this.f56797S1) {
            this.f56797S1 = false;
            this.f56833b2 = m59407bR();
            String[] m118173q = AbstractC23034c6.m118173q();
            if (m118173q.length > 0 && getContext() != null && AbstractC23034c6.m118167n(getContext(), m118173q) != 0 && ((!mo60124n3() || Math.abs(System.currentTimeMillis() - AbstractC23309i.m121076J6()) > 3600000) && m92648SI() != null && AbstractC23034c6.m118167n(m92648SI(), m118173q) != 0)) {
                AbstractC23034c6.m118184v0(this, m118173q, 100);
            }
        }
        if (this.f56801T1) {
            this.f56801T1 = false;
            try {
                if (!m59424fP(false)) {
                    return;
                }
                if (AbstractC23309i.m121069J() == 1) {
                    m60146oT();
                }
                mo60028gz();
                if (this.f56924y1) {
                    mo59706Ka(0);
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra_input_contact_profile", this.f56784P0.mo60615Oc().m17971y0());
                CameraInputParams m39201k = CameraInputParams.m39201k(mo60244v2());
                m39201k.f41138w0 = new SensitiveData("csc_attachment_camera", "comm_csc");
                AbstractC22470k.m116168t(m92676n2(), 0, 1, m39201k, bundle);
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
        if (this.f56805U1) {
            mo60107lv(m60020gQ().mo60615Oc().m17944I0());
        }
        this.f56805U1 = false;
        if (this.f56809V1 && AbstractC23309i.m120999H3() && AbstractC3102n.m15588g(this.f56747E2)) {
            mo59855Ua(this.f56743D2, this.f56747E2);
            this.f56747E2 = null;
        }
        this.f56809V1 = false;
        if (this.f56813W1 && AbstractC3102n.m15588g(this.f56747E2)) {
            mo59614Dk(this.f56739C2, this.f56747E2);
            this.f56747E2 = null;
        }
        this.f56813W1 = false;
        if (this.f56817X1) {
            this.f56784P0.mo60662Wo();
            this.f56817X1 = false;
        }
        if (this.f56821Y1) {
            mo60243uy(this.f56739C2, this.f56747E2, this.f56751F2);
        }
        this.f56821Y1 = false;
        if (this.f56825Z1) {
            mo60144oG(this.f56743D2, this.f56747E2, this.f56751F2);
        }
        this.f56825Z1 = false;
        if (this.f56829a2) {
            m60020gQ().mo60746ih();
        }
        this.f56829a2 = false;
        ShowcaseView showcaseView = this.f56786P2;
        if (showcaseView != null && showcaseView.getParent() != null) {
            this.f56786P2.m74635p();
        }
        if (mo60124n3()) {
            i11 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        } else {
            i11 = 200;
        }
        mo59933aH(123458, "tip.any", i11);
        mo60182qv(false);
        C17945a0 c17945a0 = FileDownloadBannerView.f69220v;
        if (c17945a0 != null && c17945a0.mo95039W2() != null && m60020gQ().mo60718f4(FileDownloadBannerView.f69220v.mo95039W2())) {
            FileDownloadBannerView.f69220v = null;
        }
        if (this.f56841d2 && System.currentTimeMillis() - this.f56845e2 < AbstractC23309i.m120774B0()) {
            AbstractC23309i.m122188my(System.currentTimeMillis() + AbstractC23309i.m122488v0());
        }
        this.f56841d2 = false;
        if (!this.f56784P0.mo60546Cc()) {
            if (m60100lQ() == this) {
                mo59915Yi();
            }
            if (AbstractC2379w.m12431e()) {
                this.f56919w4 = true;
                this.f56779N2.postDelayed(new Runnable() { // from class: v50.b8
                    public /* synthetic */ RunnableC27580b8() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.this.m59364UR();
                    }
                }, 200L);
            }
            if (!m17971y0.m41013q()) {
                C32299k.f149103a.m156155c(m92676n2(), m17971y0.f42893q);
            }
        }
        if (this.f56776M2) {
            C0697c0.Companion.m1048b().m1043u("ChatInfoView");
            m59718LT();
        } else {
            C0697c0.Companion.m1048b().m1043u("ChatView");
            m59761OT();
        }
        m139381b.m139376a(m139378c);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        this.f56784P0.mo60709e6(charSequence, i11, i12, i13);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: oq */
    public void mo60151oq(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                MediaItem mediaItem = (MediaItem) list.get(i11);
                if (mediaItem != null) {
                    arrayList.add(mediaItem);
                }
            }
        }
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null) {
            chatComposePanelNew.m75606u(arrayList);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: os */
    public void mo60152os() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64721G0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ot */
    public void mo60153ot() {
        this.f56779N2.removeMessages(12344);
        this.f56779N2.removeMessages(12345);
        if (!this.f56779N2.hasMessages(123456)) {
            this.f56779N2.sendEmptyMessageDelayed(123456, 100L);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: oz */
    public void mo60154oz(String str, C24277c c24277c, String str2, int i11, int i12) {
        AnimChat animChat;
        boolean z11;
        try {
            mo59990em();
            if (!TextUtils.isEmpty(str) && (animChat = this.f56762I1) != null) {
                String str3 = c24277c.f117241b;
                float f11 = c24277c.f117243d;
                if (c24277c.f117240a == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                animChat.m76103L(str3, f11, str2, z11, i11, i12, c24277c.f117245f, c24277c.f117247h);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: p3 */
    public void mo60155p3(C17945a0 c17945a0) {
        C32027n c32027n;
        String str;
        if (c17945a0.m95239r4() != null) {
            c32027n = c17945a0.m95239r4().f91143e;
        } else {
            c32027n = null;
        }
        if (c32027n == null) {
            return;
        }
        MessageId m41037d = MessageId.m41037d(c32027n.m154460a(), c32027n.m154463d(), c32027n.m154462c(), String.valueOf(c32027n.m154472m()));
        if (this.f88760a0.getTitle() != null) {
            str = this.f88760a0.getTitle();
        } else {
            str = "";
        }
        ChatOpenParam chatOpenParam = new ChatOpenParam(false, m41037d, new ChatWindowReference(this.f56784P0.mo60615Oc().m17944I0(), str, c17945a0.m95029V3(), true), "", "");
        if (c32027n.m154474o() == 6) {
            AbstractC23211s7.m119574g(String.valueOf(c32027n.m154473n()), m92676n2(), chatOpenParam);
        } else {
            AbstractC23211s7.m119571d(String.valueOf(c32027n.m154473n()), m92676n2(), chatOpenParam);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: p4 */
    public void mo60156p4(int i11) {
        ChatInputBar chatInputBar = this.f56824Z0;
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        View m92656bJ = m92656bJ();
        if (m92656bJ != null && m92676n2 != null) {
            AbstractC18884d.m99012i(i11, m92676n2, m92656bJ, chatInputBar);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: p5 */
    public void mo60157p5() {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.m65393F();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: p6 */
    public void mo60158p6(String str) {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.setCaption(str);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: pB */
    public boolean mo60159pB() {
        ChatComposePanelNew chatComposePanelNew = this.f56819X3;
        if (chatComposePanelNew != null && chatComposePanelNew.m75581I()) {
            return true;
        }
        return false;
    }

    /* renamed from: pP */
    void m60160pP(String str) {
        try {
            this.f56916w1 = false;
            if (mo59860Uy()) {
                C11621p0 c11621p0 = this.f56793R1;
                if (c11621p0 != null && c11621p0.f60408d != null && !m92683qJ()) {
                    mo59686If(0L);
                    mo59916Ym();
                    if (!m59419eR()) {
                        mo59714LA();
                    }
                    mo60026gi();
                    mo59702KH("zaloview_code_lock_msg");
                    CodeLockMessageView codeLockMessageView = new CodeLockMessageView();
                    codeLockMessageView.m78881AM(new CodeLockMessageView.InterfaceC14170f() { // from class: v50.f8
                        public /* synthetic */ C27640f8() {
                        }

                        @Override // com.zing.zalo.p077ui.zviews.CodeLockMessageView.InterfaceC14170f
                        /* renamed from: a */
                        public final void mo78897a() {
                            ChatView.this.m59576BP();
                        }
                    });
                    codeLockMessageView.m78882BM(str);
                    this.f56916w1 = true;
                    m92649TI().mo89693h2(codeLockMessageView, "zaloview_code_lock_msg", 0, true);
                    return;
                }
                return;
            }
            if (C21927m.m114302u().m114345m(m60020gQ().mo60615Oc().m17944I0()) && !this.f56799S3) {
                this.f56799S3 = true;
                AbstractC23647d.m123897g("5801140");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: pQ */
    public boolean m60161pQ(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3 || action == 6) {
                    m59973dP();
                    mo60118mj();
                }
            } else {
                mo60118mj();
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: pT */
    public void m60162pT() {
        mo60074jw(-1);
    }

    /* renamed from: pU */
    public void m60163pU(InterfaceC11475g0 interfaceC11475g0, String str) {
        try {
            if (this.f56838c3 == null) {
                AnimReactionCounterView animReactionCounterView = new AnimReactionCounterView(getContext(), this);
                this.f56838c3 = animReactionCounterView;
                this.f56793R1.f60408d.addView(animReactionCounterView, new FrameLayout.LayoutParams(-1, -1));
            }
            InterfaceC11475g0 interfaceC11475g02 = this.f56842d3;
            if (interfaceC11475g02 != null && interfaceC11475g02 != interfaceC11475g0) {
                mo59863VD();
            }
            this.f56784P0.mo60695bo(str);
            this.f56842d3 = interfaceC11475g0;
            int[] iArr = new int[2];
            interfaceC11475g0.getChatRowView().getLocationInWindow(iArr);
            Rect reactionRect = interfaceC11475g0.getReactionRect();
            if (reactionRect != null) {
                int width = reactionRect.left + (reactionRect.width() / 2);
                int height = iArr[1] + reactionRect.top + (reactionRect.height() / 2);
                if (mo60124n3() && m92656bJ() != null) {
                    height -= m92656bJ().getTop();
                }
                this.f56838c3.m76702g(width, height, interfaceC11475g0.getMyReactionCount() + 1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: pg */
    public void mo60164pg(int i11) {
        if (this.f56876m1 == null) {
            C11284h0 c11284h0 = new C11284h0();
            E2eeWarningBanner m59212w = this.f56793R1.f60408d.m59212w();
            this.f56876m1 = m59212w;
            m59212w.setE2eeBannerListener(c11284h0);
        }
        this.f56876m1.m75688X(i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: pn */
    public void mo60165pn() {
        if (RetryMsgPopupActivity.m56950X3() != null) {
            RetryMsgPopupActivity.m56954u4(false);
            RetryMsgPopupActivity.m56950X3().finish();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: pp */
    public void mo60166pp(MessageId messageId) {
        this.f56779N2.sendMessage(this.f56779N2.obtainMessage(123457, messageId));
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: pq */
    public void mo60167pq(C25630b c25630b) {
        C25630b m16487l;
        C3246i0.a aVar = this.f56908u1;
        if (aVar != null && (m16487l = aVar.m16487l()) != null && m16487l.m132429g() == c25630b.m132429g()) {
            m59592CT();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ps */
    public void mo60168ps(C31902e9 c31902e9) {
        try {
            if (Build.VERSION.SDK_INT >= 26 && mo60124n3() && this.f56846e3 == 1) {
                mo59706Ka(2);
            }
            mo59714LA();
            Bundle bundle = new Bundle();
            bundle.putSerializable("search_inline_result", c31902e9);
            mo60056iu(202, bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: px */
    public void mo60169px(C3535c c3535c) {
        this.f56779N2.post(new Runnable() { // from class: v50.da
            public /* synthetic */ RunnableC27612da() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59411cS();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: q2 */
    public void mo60170q2(C26365a c26365a, int i11) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), c26365a, i11, 1));
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: q5 */
    public void mo60171q5() {
        if (this.f56792R0 == null) {
            return;
        }
        this.f56792R0.m64561h2();
        SwipeItemListView swipeItemListView = this.f56796S0;
        if (swipeItemListView != null) {
            swipeItemListView.m76943m2();
        }
        TooltipView tooltipView = this.f56794R2;
        if (tooltipView != null && tooltipView.isShown() && TextUtils.equals(this.f56794R2.getTooltipId(), "tip.zcloud.file.status")) {
            this.f56794R2.m90727Q();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qA */
    public boolean mo60172qA() {
        if (AbstractC2379w.m12431e() && (mo60120mu() || mo60072jt() || this.f56919w4)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qB */
    public void mo60173qB(C31862c c31862c) {
        this.f56793R1.m64834y3(c31862c, this);
        int i11 = this.f56846e3;
        boolean z11 = true;
        if (i11 != 1 && (i11 != 5 || !this.f56924y1)) {
            z11 = false;
        }
        this.f56793R1.m64804o3(z11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qF */
    public void mo60174qF() {
        E2eeWarningBanner e2eeWarningBanner = this.f56876m1;
        if (e2eeWarningBanner != null) {
            e2eeWarningBanner.setVisibility(8);
            this.f56793R1.f60408d.removeView(this.f56876m1);
            this.f56793R1.f60408d.f56688W = null;
            this.f56876m1 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qI */
    public void mo60175qI() {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.setText("");
        }
    }

    /* renamed from: qT */
    public void m60176qT(C17945a0 c17945a0, int i11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.ca

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f129582q;

            /* renamed from: r */
            public final /* synthetic */ int f129583r;

            public /* synthetic */ RunnableC27597ca(C17945a0 c17945a02, int i112) {
                r2 = c17945a02;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59396ZR(r2, r3);
            }
        });
    }

    /* renamed from: qU */
    public void m60177qU(C17945a0 c17945a0, C24751d c24751d) {
        if (c24751d != null && c24751d.m128572p() != 0) {
            AbstractC2379w.m12430d(this.f56788Q0);
            mo59922Z6();
            m92649TI().m93060e2(0, ReactionDetailView.m76795pL(getContext(), c17945a0, c24751d, new C11270a0(c17945a0), 0), "ReactionDetailView", 0, false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qd */
    public int mo60178qd() {
        return this.f56785P1;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qm */
    public void mo60179qm(String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", str);
            bundle.putInt("EXTRA_SOURCE_LINK", 0);
            ZaloWebView.m87105iS(m92692wK(), str, bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qp */
    public void mo60180qp() {
        boolean z11;
        ChatSearchToolbarView chatSearchToolbarView = this.f56869k2;
        if (chatSearchToolbarView != null) {
            if (this.f56784P0.mo60624Q7() && !this.f56784P0.mo60800t9()) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatSearchToolbarView.m65610c(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qu */
    public C17945a0 mo60181qu() {
        int mo59967cn;
        List mo60200rp = mo60200rp();
        if (mo60200rp == null || mo60200rp.size() == 0 || (mo59967cn = mo59967cn()) < 0 || mo59967cn >= mo60200rp.size()) {
            return null;
        }
        return ((C28771c) mo60200rp.get(mo59967cn)).m143954n();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qv */
    public void mo60182qv(boolean z11) {
        if (AbstractC26681b.f126378w) {
            this.f56793R1.m64735L3(z11);
        } else if (C32090r5.m154810i().m154824o() && C32090r5.m154810i().m154822m()) {
            C32090r5.m154810i().m154814d();
            ToastUtils.showMess(true, m92689tK().getString(AbstractC8020f0.str_all_photo_video_saved));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qw */
    public void mo60183qw() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64723H0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qx */
    public boolean mo60184qx() {
        if (m92676n2() != null && m92676n2().mo35567d1()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: qy */
    public void mo60185qy() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.f60408d.setPaddingBottom(AbstractC23309i.m122007i5(m92689tK()));
            this.f56793R1.f60408d.requestLayout();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rB */
    public boolean mo60186rB() {
        SwipeItemListView swipeItemListView = this.f56796S0;
        if (swipeItemListView != null && swipeItemListView.m76946p2()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rC */
    public void mo60187rC(InterfaceC1764d0 interfaceC1764d0) {
        if (m92656bJ() != null) {
            C32600p.f150676a.m157898e().m157929r().m9219j(m92657cJ(), interfaceC1764d0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rE */
    public void mo60188rE(boolean z11) {
        this.f56905t2 = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rH */
    public void mo60189rH(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f56882n3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setRedDotColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.badge_background_red));
            this.f56882n3.setReddotRadius(AbstractC23222t7.f112558f);
            this.f56882n3.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rI */
    public void mo60190rI(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", str);
        bundle.putString("extra_display_name", str2);
        bundle.putString("STR_SOURCE_START_VIEW", "rmenu");
        m59538wU(InviteToMultiGroupView.class, bundle, 1);
    }

    /* renamed from: rQ */
    public void m60191rQ(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11280f0 c11280f0 = new C11280f0(this, m92676n2(), true);
            C22688w c22688w = new C22688w();
            c22688w.mo117295a(c11280f0);
            c22688w.m117350h(str, 5);
        }
    }

    /* renamed from: rT */
    public void m60192rT(List list, List list2, int i11, NewMultiPhotoSuggestView newMultiPhotoSuggestView) {
        if (newMultiPhotoSuggestView != null && list != null) {
            try {
                if (list.size() != 0) {
                    this.f56872l1 = new LandingPageView(LandingPageView.m71644lP(24, EnumC22962a.f111694r, i11, 0, ((MediaItem) list.get(i11)).m41166q0(), m60020gQ().mo60615Oc().m17971y0().m41000c(true, true, true), m60020gQ().mo60615Oc().m17971y0().f42893q, "", "chat_photosuggest"), list, list2);
                    m59607DQ();
                    m59478nU();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: rU */
    public void m60193rU(C17945a0 c17945a0, Point point, boolean z11, boolean z12) {
        MessageId messageId;
        String str;
        if (point == null) {
            return;
        }
        if (c17945a0 != null) {
            messageId = c17945a0.m95029V3();
            str = c17945a0.mo95039W2();
        } else {
            messageId = null;
            str = "";
        }
        this.f56796S0.requestDisallowInterceptTouchEvent(true);
        Bundle bundle = new Bundle();
        bundle.putInt("arrow_x", point.x);
        bundle.putInt("arrow_y", point.y);
        bundle.putBoolean("direction_up", z11);
        bundle.putParcelable("message_id", messageId);
        bundle.putString("message_owner", str);
        bundle.putBoolean("show_dim", z12);
        mo60056iu(203, bundle);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rc */
    public int mo60194rc() {
        return this.f56846e3;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rf */
    public void mo60195rf() {
        boolean z11;
        try {
            this.f56793R1.m64833y2();
            this.f56793R1.m64816s2();
            this.f56796S0.setEnableMultiSelection(false);
            this.f56863i4 = null;
            this.f56875l4 = null;
            this.f56879m4 = null;
            this.f56871k4 = null;
            this.f56883n4 = null;
            this.f56887o4 = null;
            this.f56891p4 = null;
            this.f56895q4 = null;
            this.f56899r4 = null;
            this.f56796S0.setEnableSwipeItem(true);
            mo60094l7(0, false);
            mo59580Bi();
            AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
            if (abstractPushToTalkControl != null) {
                abstractPushToTalkControl.setRecordSupport(true);
            }
            if (this.f56772L1 != null) {
                m60020gQ().mo60813uj();
            }
            View view = this.f56868k1;
            if (view != null) {
                view.setVisibility(0);
            }
            ChatSettingBanner chatSettingBanner = this.f56804U0;
            if (chatSettingBanner != null) {
                chatSettingBanner.setVisibility(0);
            }
            C11621p0 c11621p0 = this.f56793R1;
            if (c11621p0.f60398W != null) {
                int i11 = this.f56846e3;
                if (i11 != 0 && i11 != 2) {
                    z11 = false;
                    c11621p0.m64808p3(z11);
                }
                z11 = true;
                c11621p0.m64808p3(z11);
            }
            FloatingPromoteTrendingStickerModulesView floatingPromoteTrendingStickerModulesView = this.f56793R1.f60435q0;
            if (floatingPromoteTrendingStickerModulesView != null) {
                floatingPromoteTrendingStickerModulesView.setVisibility(0);
            }
            StickyNotiLiveStreamingBar stickyNotiLiveStreamingBar = this.f56793R1.f60396U;
            if (stickyNotiLiveStreamingBar != null) {
                stickyNotiLiveStreamingBar.setVisibility(0);
            }
            E2eeWarningBanner e2eeWarningBanner = this.f56876m1;
            if (e2eeWarningBanner != null) {
                e2eeWarningBanner.setVisibility(0);
            }
            mo59573BB(true);
            if (this.f56915v4 != null) {
                this.f56793R1.m64830x2();
                this.f56915v4 = null;
            }
            if (C21373a.f104231a.m110807w().m110825b() && m59312MQ()) {
                this.f56793R1.m64829x0().getCarouselMyCloudCollectionView().m70000w(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rj */
    public void mo60196rj(String str, String str2, String str3) {
        FeedActionZUtils.m47536X(str, str2, str3, m92676n2(), new Bundle[0]);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rm */
    public void mo60197rm(String str, String str2, int i11) {
        boolean z11;
        int i12;
        int i13;
        LinearLayout linearLayout = new LinearLayout(m92648SI());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C31973j5 m4472f = C0943w.m4462l().m4472f(str);
        if (m4472f != null && m4472f.m153747Y()) {
            z11 = true;
        } else {
            z11 = false;
        }
        View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.photo_hd_caution_not_show_again_view, (ViewGroup) linearLayout, false);
        inflate.setMinimumHeight(AbstractC23136l9.m118742r(30.0f));
        CheckBox checkBox = (CheckBox) inflate.findViewById(AbstractC6918a0.cbNotShowAgain);
        checkBox.setDuplicateParentStateEnabled(true);
        checkBox.setBackgroundColor(0);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tvNotShowAgain);
        if (z11) {
            i12 = AbstractC8020f0.str_community_blacklist;
        } else {
            i12 = AbstractC8020f0.str_group_blacklist;
        }
        textView.setText(i12);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: v50.l8

            /* renamed from: p */
            public final /* synthetic */ CheckBox f129815p;

            public /* synthetic */ ViewOnClickListenerC27727l8(CheckBox checkBox2) {
                r1 = checkBox2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatView.m59521uS(r1, view);
            }
        });
        linearLayout.addView(inflate, layoutParams);
        View inflate2 = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.photo_hd_caution_not_show_again_view, (ViewGroup) linearLayout, false);
        inflate2.setMinimumHeight(AbstractC23136l9.m118742r(30.0f));
        CheckBox checkBox2 = (CheckBox) inflate2.findViewById(AbstractC6918a0.cbNotShowAgain);
        checkBox2.setDuplicateParentStateEnabled(true);
        checkBox2.setBackgroundColor(0);
        ((TextView) inflate2.findViewById(AbstractC6918a0.tvNotShowAgain)).setText(AbstractC8020f0.profile_reportabuse);
        inflate2.setOnClickListener(new View.OnClickListener() { // from class: v50.m8

            /* renamed from: p */
            public final /* synthetic */ CheckBox f129843p;

            public /* synthetic */ ViewOnClickListenerC27741m8(CheckBox checkBox22) {
                r1 = checkBox22;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatView.m59530vS(r1, view);
            }
        });
        if (m4472f != null && m4472f.m153740S() == 2) {
            linearLayout.addView(inflate2, layoutParams);
        }
        C8009j.a aVar = new C8009j.a(m92648SI());
        int m118712h = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 24.0f);
        int m118712h2 = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 8.0f);
        C8009j.a m43159h = aVar.m43159h(1);
        if (z11) {
            i13 = AbstractC8020f0.str_ask_to_remove_from_community;
        } else {
            i13 = AbstractC8020f0.str_ask_to_remove_from_group;
        }
        m43159h.m43162k(AbstractC23136l9.m118743r0(i13)).m43150A(linearLayout, m118712h, m118712h2, m118712h, 0).m43164m(AbstractC8020f0.str_no, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_yes, new InterfaceC17463d.d() { // from class: v50.n8

            /* renamed from: q */
            public final /* synthetic */ String f129867q;

            /* renamed from: r */
            public final /* synthetic */ CheckBox f129868r;

            /* renamed from: s */
            public final /* synthetic */ int f129869s;

            /* renamed from: t */
            public final /* synthetic */ CheckBox f129870t;

            public /* synthetic */ C27755n8(String str22, CheckBox checkBox22, int i112, CheckBox checkBox222) {
                r2 = str22;
                r3 = checkBox22;
                r4 = i112;
                r5 = checkBox222;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                ChatView.this.m59536wS(r2, r3, r4, r5, interfaceC17463d, i14);
            }
        });
        C8009j m43152a = aVar.m43152a();
        this.f56859h4 = m43152a;
        m43152a.mo13822K();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rn */
    public boolean mo60198rn(C17945a0 c17945a0) {
        return m59291JQ(c17945a0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ro */
    public void mo60199ro(String str, int i11, int i12) {
        try {
            if (mo59684IE()) {
                this.f56779N2.post(new Runnable() { // from class: v50.d9

                    /* renamed from: q */
                    public final /* synthetic */ String f129602q;

                    /* renamed from: r */
                    public final /* synthetic */ int f129603r;

                    /* renamed from: s */
                    public final /* synthetic */ int f129604s;

                    public /* synthetic */ RunnableC27611d9(String str2, int i112, int i122) {
                        r2 = str2;
                        r3 = i112;
                        r4 = i122;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.this.m59402aS(r2, r3, r4);
                    }
                });
            } else {
                mo59990em();
                if (this.f56762I1 != null && !TextUtils.isEmpty(str2)) {
                    this.f56762I1.m76123v0(str2, i112, (this.f56793R1.f60408d.getHeight() - this.f56793R1.f60408d.getPaddingBottom()) - i122, 50.0f, 7);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rp */
    public List mo60200rp() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            return c11603g0.m60494h0();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: rw */
    public void mo60201rw() {
        ReactJumpFloatingView reactJumpFloatingView = this.f56760H3;
        if (reactJumpFloatingView != null) {
            reactJumpFloatingView.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: s4 */
    public void mo60202s4(int i11) {
        AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112029f, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sB */
    public void mo60203sB(C17945a0 c17945a0, String str, int i11) {
        int i12;
        if (c17945a0 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("bol_extra_group_forwarding", true);
        bundle.putParcelable("forwardMessageId", c17945a0.m95029V3());
        bundle.putString("forwardMessageOwnerUid", c17945a0.mo95039W2());
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putBoolean("btn_extra_show_hide_post_feed", true);
        if (c17945a0.m94847A6()) {
            i12 = 8;
        } else {
            i12 = 6;
        }
        bundle.putString("extra_tracking_source_feed", new TrackingSource(i12).m40686z());
        bundle.putString("STR_SOURCE_START_VIEW", str);
        bundle.putString("STR_LOG_CHAT_TYPE", this.f56784P0.mo60638S2());
        bundle.putInt("INT_LOG_MSG_INDEX", i11);
        m59538wU(ShareView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sD */
    public void mo60204sD() {
        ActionBarMenuItem actionBarMenuItem = this.f56894q3;
        if (actionBarMenuItem != null && actionBarMenuItem.getParent() == m92647RI()) {
            if (this.f56894q3.getVisibility() != 0) {
                this.f56894q3.setVisibility(0);
            }
        } else {
            ActionBarMenuItem m78952hL = m78952hL(AbstractC6918a0.menu_chat_media_store, m59350SP(m92689tK(), AbstractC16803z.icn_kho_media));
            this.f56894q3 = m78952hL;
            AbstractC23201r8.m119532b(m78952hL, AbstractC8020f0.tb_open_chat_media_store_single);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sF */
    public void mo60205sF(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", str);
        bundle.putString("STR_SOURCE_START_VIEW", "csc_msgmenu");
        bundle.putBoolean("BOL_EXTRA_OPENED_AFTER_PIN", true);
        m59538wU(EditPinBoardView.class, bundle, 2);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sG */
    public void mo60206sG() {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.mo65183d0();
        }
    }

    /* renamed from: sQ */
    public void m60207sQ(C17945a0 c17945a0) {
        this.f56784P0.mo60706dl(c17945a0);
    }

    /* renamed from: sT */
    public void m60208sT(C17945a0 c17945a0) {
        float f11;
        if (c17945a0 != null) {
            try {
                if (c17945a0.m94929K2() != null) {
                    String str = c17945a0.m94929K2().f91017v;
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("streamUrlPlayback");
                        String optString2 = jSONObject.optString("streamUrlLive");
                        if (((C17999s0) c17945a0.m94929K2()).f91170D > 0 && ((C17999s0) c17945a0.m94929K2()).f91171E > 0) {
                            f11 = (((C17999s0) c17945a0.m94929K2()).f91170D * 1.0f) / ((C17999s0) c17945a0.m94929K2()).f91171E;
                        } else {
                            f11 = 0.0f;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("extra_live_url", optString2);
                        bundle.putString("extra_playback_url", optString);
                        bundle.putString("extra_thumb_url", c17945a0.m94929K2().f91013r);
                        bundle.putString("extra_uid_live_streaming", c17945a0.m94862C4());
                        bundle.putString("extra_ownerid_live", c17945a0.mo95039W2());
                        bundle.putLong("extra_timestamp_live", c17945a0.m94974P4());
                        bundle.putParcelable("extra_message_id_live", c17945a0.m95029V3());
                        bundle.putString("extra_streamId", ((C17999s0) c17945a0.m94929K2()).f91173G);
                        bundle.putString("extra_group_id", c17945a0.mo95039W2());
                        bundle.putBoolean("extra_bol_ended_live", ((C17999s0) c17945a0.m94929K2()).f91168B);
                        bundle.putFloat("extra_video_ratio", f11);
                        bundle.putBoolean("EXTRA_MINIMIZE", !mo60124n3());
                        m59538wU(GroupLiveStreamPlaybackView.class, bundle, 1);
                        m60020gQ().mo60832x4(false);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatView", e11);
            }
        }
    }

    /* renamed from: sU */
    public void m60209sU(List list) {
        m59650GP();
        Bundle m83780qM = RolledMediaBottomSheet.m83780qM(list);
        m83780qM.putString("CONVERSATION_ID", this.f56784P0.mo60615Oc().m17944I0());
        m92676n2().mo35579p().mo89694j2(RolledMediaBottomSheet.class, m83780qM, 0, "RolledMediaBottomSheet", 0, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sa */
    public void mo60210sa() {
        m60278xU(NearbyZView.class, null, 0, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    public void setKeepScreenOn(boolean z11) {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            AbstractC23059e9.m118319H(m92676n2, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sf */
    public void mo60211sf(boolean z11) {
        ChatInputBar chatInputBar = this.f56824Z0;
        if (chatInputBar != null) {
            chatInputBar.setLockInputBar(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sl */
    public void mo60212sl(String str) {
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sm */
    public void mo60213sm(JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_FEATURE_ID", C18613b.f93607z);
        intent.putExtra("extra_param_info", jSONObject.toString());
        m60278xU(ZaloWebView.class, intent.getExtras(), -1, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sv */
    public void mo60214sv(CharSequence charSequence) {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText != null) {
            actionEditText.append(charSequence);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sw */
    public boolean mo60215sw() {
        ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
        if (chatAttachmentContainer != null && chatAttachmentContainer.m65317e(4)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: sy */
    public boolean mo60216sy() {
        ChatAttachmentContainer chatAttachmentContainer = this.f56856h1;
        if (chatAttachmentContainer != null && chatAttachmentContainer.m65318f()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: t5 */
    public void mo60217t5(String str, String str2, String str3, String str4) {
        if (C32600p.f150676a.m157895b(true)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("EXTRA_QUICK_MESSAGE_KEYWORD", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("EXTRA_QUICK_MESSAGE_TEXT", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("EXTRA_QUICK_MESSAGE_PHOTO_LOCAL_PATH", str3);
        }
        bundle.putString("STR_SOURCE_START_VIEW", str4);
        m59538wU(QuickMessageCreatingView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: t9 */
    public void mo60218t9(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f56886o3;
        if (actionBarMenuItem != null && actionBarMenuItem.getParent() == m92647RI()) {
            if (this.f56886o3.getVisibility() != 0) {
                this.f56886o3.setVisibility(0);
            }
        } else {
            int i12 = AbstractC6918a0.menu_chat_add_member;
            Context m92689tK = m92689tK();
            if (z11) {
                i11 = AbstractC16803z.ic_create_group_white_24;
            } else {
                i11 = AbstractC16803z.ic_add_member_white_24;
            }
            this.f56886o3 = m78952hL(i12, m59350SP(m92689tK, i11));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tB */
    public void mo60219tB() {
        MentionJumpFloatingView mentionJumpFloatingView = this.f56756G3;
        if (mentionJumpFloatingView != null) {
            mentionJumpFloatingView.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tD */
    public void mo60220tD() {
        C3334c.f14156a.m16810d(getContext(), AbstractC8020f0.str_popup_title_limit_group_members, AbstractC8020f0.str_popup_subtitle_upgrade_to_community, AbstractC23322a.zds_il_community_upgrade_spot_1_1, AbstractC8020f0.str_popup_btn_upgrade_to_community, Integer.valueOf(AbstractC8020f0.str_popup_btn_close), this.f56784P0.getGroupId(), this, new InterfaceC18494a() { // from class: v50.ia
            public /* synthetic */ C27687ia() {
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                C24848g0 m59294JT;
                m59294JT = ChatView.this.m59294JT();
                return m59294JT;
            }
        }, "csc");
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tG */
    public String mo60221tG(CharSequence charSequence, C7907e c7907e) {
        if (charSequence == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        try {
            MentionSpan[] mentionSpanArr = (MentionSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), MentionSpan.class);
            if (mentionSpanArr.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (MentionSpan mentionSpan : mentionSpanArr) {
                    C7907e.a aVar = new C7907e.a();
                    int i11 = mentionSpan.f54785p;
                    long j11 = mentionSpan.f54788s;
                    int i12 = mentionSpan.f54786q;
                    aVar.m40868f(i11, j11, i12, mentionSpan.f54787r - i12);
                    aVar.f42797g = mentionSpan.f54789t;
                    aVar.f42796f = mentionSpan.f54790u;
                    arrayList.add(aVar);
                }
                Collections.sort(arrayList, new Comparator() { // from class: v50.t9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m59513tR;
                        m59513tR = ChatView.m59513tR((C7907e.a) obj, (C7907e.a) obj2);
                        return m59513tR;
                    }
                });
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    C7907e.a aVar2 = (C7907e.a) arrayList.get(i13);
                    int length = aVar2.f42797g.length() - aVar2.f42796f.length();
                    if (length != 0) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            ((C7907e.a) arrayList.get(i14)).f42795e += length;
                        }
                    }
                    int i15 = aVar2.f42795e;
                    sb2.replace(i15, aVar2.f42794d + i15, aVar2.f42797g);
                    C7907e.a aVar3 = new C7907e.a();
                    aVar3.f42792b = aVar2.f42792b;
                    aVar3.f42795e = aVar2.f42795e;
                    aVar3.f42794d = aVar2.f42797g.length();
                    aVar3.f42791a = aVar2.f42791a;
                    c7907e.m40852b(aVar3);
                }
                if (arrayList.size() == 1) {
                    if (((C7907e.a) arrayList.get(0)).f42795e == 0) {
                        AbstractC23647d.m123897g("1000310");
                    } else {
                        AbstractC23647d.m123897g("1000311");
                    }
                } else if (((C7907e.a) arrayList.get(0)).f42795e == 0) {
                    AbstractC23647d.m123897g("1000312");
                } else {
                    AbstractC23647d.m123897g("1000313");
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
        return sb2.toString();
    }

    /* renamed from: tQ */
    public void m60222tQ() {
        ChatEmptyView chatEmptyView = this.f56775M1;
        if (chatEmptyView != null) {
            chatEmptyView.setVisibility(8);
        }
    }

    /* renamed from: tT */
    public void m60223tT(EnumC2344e0 enumC2344e0, String str, Conversation conversation) {
        if (!m60020gQ().mo60783qa()) {
            ToastUtils.m89260h(17007, conversation.m41012p());
            return;
        }
        Bundle bundle = new Bundle();
        new CreateMediaStoreParam(conversation.f42893q, EnumC2363o.f9889p, null).m40913f(bundle);
        bundle.putString("extra_media_store_source_local", str);
        bundle.putInt("extra_type_id", enumC2344e0.ordinal());
        bundle.putString("STR_LOG_CHAT_TYPE", this.f56784P0.mo60638S2());
        m60278xU(MediaStoreView.class, bundle, 1025, 1, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: tU */
    boolean m60224tU(C28212v6 c28212v6, View view) {
        C28212v6.a aVar;
        if (c28212v6 == null || !c28212v6.f131579e || ((!c28212v6.m142166e() && ((aVar = c28212v6.f131584j) == null || !aVar.m142172a())) || view == 0 || !view.isShown())) {
            return false;
        }
        String m142164c = c28212v6.m142164c();
        if ("tip.csc.sticker.trending".equals(m142164c)) {
            return m59523uU(c28212v6);
        }
        if (!"tip.zcloud.file.status".equals(m142164c) && !"tip.csc.voice.to.text".equals(m142164c)) {
            if ("tip.community.auto_upgrade".equals(m142164c)) {
                return m60253vU(c28212v6, view);
            }
            if (Arrays.asList(AbstractC28025b8.f130845b).contains(m142164c)) {
                this.f56782O2.m74687C((ViewGroup) m92656bJ());
            } else {
                this.f56782O2.m74687C(this.f56793R1.f60408d);
            }
            C26203c m134769a = C26203c.m134769a(view.getContext());
            m134769a.m134770b(c28212v6, view.getContext());
            m134769a.f124524o = view;
            m142164c.hashCode();
            char c11 = 65535;
            switch (m142164c.hashCode()) {
                case -2021862077:
                    if (m142164c.equals("tip.search.bysender.entry")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1444933852:
                    if (m142164c.equals("tip.group.summary")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1441895916:
                    if (m142164c.equals("tip.file_persist.save_file")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -1420102874:
                    if (m142164c.equals("tip.csc.headername")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case -1377754772:
                    if (m142164c.equals("tip.csc.call")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case -1157425028:
                    if (m142164c.equals("tip.csc.nickname")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case -1130174775:
                    if (m142164c.equals("tip.csc.reaction.button")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case -1023000389:
                    if (m142164c.equals("tip.quickmessage.onboard_done")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case -985269459:
                    if (m142164c.equals("tip.csc.rightmenu")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case -949129045:
                    if (m142164c.equals("tip.csc.ttl.rightmenu")) {
                        c11 = '\t';
                        break;
                    }
                    break;
                case -691687729:
                    if (m142164c.equals("tip.csc.grouppinbar")) {
                        c11 = '\n';
                        break;
                    }
                    break;
                case -523397399:
                    if (m142164c.equals("tip.file_persist.download_file")) {
                        c11 = 11;
                        break;
                    }
                    break;
                case -220238999:
                    if (m142164c.equals("tip.mycloud.attachment.flow3.step1")) {
                        c11 = '\f';
                        break;
                    }
                    break;
                case -204920476:
                    if (m142164c.equals("tip.pinboard.expand")) {
                        c11 = '\r';
                        break;
                    }
                    break;
                case 190187379:
                    if (m142164c.equals("tip.csc.liveicon")) {
                        c11 = 14;
                        break;
                    }
                    break;
                case 238545312:
                    if (m142164c.equals("tip.groupcall.csc.group")) {
                        c11 = 15;
                        break;
                    }
                    break;
                case 240155518:
                    if (m142164c.equals("tip.csc.have.request.joingroup")) {
                        c11 = 16;
                        break;
                    }
                    break;
                case 262238436:
                    if (m142164c.equals("tip.csc.sticker.promotion")) {
                        c11 = 17;
                        break;
                    }
                    break;
                case 667264682:
                    if (m142164c.equals("tip.mycloud.attachment.flow4.step1")) {
                        c11 = 18;
                        break;
                    }
                    break;
                case 667264683:
                    if (m142164c.equals("tip.mycloud.attachment.flow4.step2")) {
                        c11 = 19;
                        break;
                    }
                    break;
                case 725827834:
                    if (m142164c.equals("tip.csc.rightmenu.addmember")) {
                        c11 = 20;
                        break;
                    }
                    break;
                case 897562730:
                    if (m142164c.equals("tip.csc.reaction.add")) {
                        c11 = 21;
                        break;
                    }
                    break;
                case 1118471464:
                    if (m142164c.equals("tip.csc.rightmenu.groupboard")) {
                        c11 = 22;
                        break;
                    }
                    break;
                case 1139900623:
                    if (m142164c.equals("tip.csc.rightmenu.setalias")) {
                        c11 = 23;
                        break;
                    }
                    break;
                case 1286169602:
                    if (m142164c.equals("tip.csc.plus.hd")) {
                        c11 = 24;
                        break;
                    }
                    break;
                case 1314314285:
                    if (m142164c.equals("tip.csc.addmember")) {
                        c11 = 25;
                        break;
                    }
                    break;
                case 1916496651:
                    if (m142164c.equals("tip.csc.videocall")) {
                        c11 = 26;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                case '\n':
                    m134769a.f124513d = -AbstractC23136l9.m118742r(2.0f);
                    break;
                case 1:
                case 5:
                    m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                    m134769a.f124508E = 250;
                    break;
                case 2:
                case 11:
                case 21:
                    if (view instanceof InterfaceC11475g0) {
                        m134769a.f124528s = ((InterfaceC11475g0) view).getBubbleRect();
                        m134769a.f124513d = -AbstractC23136l9.m118742r(4.0f);
                        break;
                    }
                    break;
                case 3:
                    if (this.f56790Q2) {
                        return false;
                    }
                    m134769a.f124513d = 0;
                    this.f56790Q2 = true;
                    break;
                case 4:
                case '\b':
                case '\t':
                case 15:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                case 22:
                case 23:
                case 25:
                case 26:
                    m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                    m134769a.f124508E = 350;
                    break;
                case 6:
                    if (view instanceof InterfaceC11475g0) {
                        m134769a.f124528s = ((InterfaceC11475g0) view).getReactionRect();
                        m134769a.f124513d = AbstractC23136l9.m118742r(2.0f);
                        break;
                    }
                    break;
                case 7:
                    m134769a.f124528s = new Rect(AbstractC23136l9.m118742r(30.0f), 0, AbstractC23136l9.m118742r(30.0f), 0);
                    break;
                case '\f':
                case 18:
                case 19:
                    m134769a.f124513d = AbstractC23222t7.f112556e;
                    m134769a.f124518i = 14;
                    break;
                case '\r':
                    m134769a.f124528s = this.f56772L1.getExpandBtnRect();
                    m134769a.f124513d = AbstractC23136l9.m118742r(4.0f);
                    break;
                case 14:
                    m134769a.f124513d = AbstractC23136l9.m118742r(4.0f);
                    m134769a.f124506C = true;
                    break;
                case 17:
                    m134769a.f124513d = AbstractC23136l9.m118742r(4.0f);
                    break;
                case 20:
                    m134769a.f124528s = ((ChatInfoModuleViews$SettingHorizontalModuleView) view).m69700V(60);
                    break;
                case 24:
                    m134769a.f124513d = (-view.getPaddingTop()) / 2;
                    break;
                default:
                    m134769a.f124513d = -AbstractC23136l9.m118742r(7.0f);
                    break;
            }
            ShowcaseView showcaseView = new ShowcaseView(view.getContext());
            this.f56786P2 = showcaseView;
            showcaseView.setConfigs(m134769a);
            this.f56786P2.setShowcaseId(m142164c);
            this.f56786P2.setShowcaseManager(this.f56782O2);
            this.f56786P2.m74637r();
            this.f56786P2.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: v50.m7

                /* renamed from: b */
                public final /* synthetic */ String f129841b;

                /* renamed from: c */
                public final /* synthetic */ C28212v6 f129842c;

                public /* synthetic */ C27740m7(String m142164c2, C28212v6 c28212v62) {
                    r2 = m142164c2;
                    r3 = c28212v62;
                }

                @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                /* renamed from: a */
                public final void mo39159a(ShowcaseView showcaseView2, int i11, int i12, boolean z11) {
                    ChatView.this.m59275HS(r2, r3, showcaseView2, i11, i12, z11);
                }
            });
            return true;
        }
        return m60253vU(c28212v62, view);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tc */
    public void mo60225tc() {
        this.f56793R1.m64809q0();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: td */
    public void mo60226td(String str, boolean z11) {
        mo70710wy(new Runnable() { // from class: v50.ga

            /* renamed from: q */
            public final /* synthetic */ String f129678q;

            /* renamed from: r */
            public final /* synthetic */ boolean f129679r;

            public /* synthetic */ RunnableC27657ga(String str2, boolean z112) {
                r2 = str2;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59357TR(r2, r3);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tk */
    public void mo60227tk(int i11) {
        try {
            AbstractC28025b8.m141442M("tip.csc.sticker.trending");
            this.f56784P0.mo60657Wa("tip.csc.sticker.trending");
            this.f56793R1.m64810q2();
            Runnable runnable = this.f56930z3;
            if (runnable != null) {
                this.f56779N2.removeCallbacks(runnable);
                this.f56930z3 = null;
            }
            this.f56732A3 = false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tm */
    public void mo60228tm() {
        this.f56832b1.setText(this.f56843d4);
        this.f56832b1.setSelection(this.f56843d4.length());
        this.f56843d4 = "";
        mo60235u8(false);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tn */
    public void mo60229tn() {
        this.f56784P0.mo60710e9();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tt */
    public void mo60230tt(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", str);
        bundle.putString("extra_display_name", str2);
        bundle.putString("STR_SOURCE_START_VIEW", str3);
        m59538wU(GroupInCommonView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: tu */
    public boolean mo60231tu() {
        ActionEditText actionEditText = this.f56832b1;
        if (actionEditText == null || actionEditText.getSelectionStart() != this.f56832b1.getSelectionEnd()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ty */
    public void mo60232ty(String str, C7904b c7904b) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", str);
        bundle.putString("extra_group_topic_info_json", c7904b.m40780r().toString());
        bundle.putString("STR_SOURCE_START_VIEW", "csc_msgmenu");
        m60278xU(UnpinTopicPinBoardView.class, bundle, 1053, 2, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: u2 */
    public void mo60233u2(int i11) {
        AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112033j, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: u6 */
    public void mo60234u6(int i11, String str, Conversation conversation, String str2, String str3) {
        this.f56851f4 = ManageGroupView.m66557kO(str, conversation, this.f56855g4, i11, str2, m60004fQ(), str3);
        m92693xK().m93058d2(AbstractC6918a0.zalo_view_container, this.f56851f4, 1032, "ManageGroupView", 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: u8 */
    public void mo60235u8(boolean z11) {
        try {
            String mo59611Dd = mo59611Dd();
            if (mo59728M6() && z11) {
                mo59749Nb();
            } else if (this.f56784P0.mo60836xi() && !mo59907YG()) {
                mo60053il();
            } else if (!TextUtils.isEmpty(mo59611Dd)) {
                mo59871Vf();
            } else if (mo59907YG() && !this.f56856h1.m65317e(4)) {
                mo59871Vf();
            } else {
                mo60150oi();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: uH */
    public void mo60236uH(String str) {
        if (m92662fJ() != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
            bundle.putString("KEY_OWNER_ID", str);
            m92662fJ().m93069k2(E2EESettingView.class, bundle, 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ub */
    public void mo60237ub(C3538f c3538f, C3538f c3538f2, String str) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64730J3(c3538f, c3538f2, str);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: uh */
    public void mo60238uh(C17945a0 c17945a0, String str, long j11) {
        if (this.f56756G3 == null) {
            this.f56756G3 = this.f56793R1.f60408d.m59194j();
        }
        this.f56756G3.m65427b();
        this.f56756G3.m65428c(str);
        this.f56756G3.m65429d(c17945a0);
        this.f56756G3.setTag(c17945a0.m95029V3());
        this.f56756G3.setOnClickListener(new View.OnClickListener() { // from class: v50.na

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f129873q;

            public /* synthetic */ ViewOnClickListenerC27757na(C17945a0 c17945a02) {
                r2 = c17945a02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatView.this.m59459kS(r2, view);
            }
        });
        mo78955kl(new Runnable() { // from class: v50.oa
            public /* synthetic */ RunnableC27771oa() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59465lS();
            }
        }, j11);
        this.f56756G3.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: uk */
    public void mo60239uk() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 16);
        this.f56897r2 = this.f56846e3;
        m60278xU(SettingMessageV2View.class, bundle, 1035, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ul */
    public ChatDialogView mo60240ul(int i11) {
        return mo60056iu(i11, null);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: uq */
    public void mo60241uq() {
        mo70710wy(new Runnable() { // from class: v50.d8
            public /* synthetic */ RunnableC27610d8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59228AS();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ut */
    public void mo60242ut(boolean z11) {
        KeyEvent.Callback m59441iQ = m59441iQ("tip.csc.plus");
        if (m59441iQ instanceof InterfaceC25728a) {
            ((InterfaceC25728a) m59441iQ).setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: uy */
    public void mo60243uy(int i11, ContactProfile contactProfile, String str) {
        this.f56784P0.mo60565Fn(EnumC11304r0.CALL_OA, i11, contactProfile, str);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: v2 */
    public boolean mo60244v2() {
        if (m92676n2() != null && m92676n2().mo35586v2()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: v6 */
    public void mo60245v6() {
        try {
            if (!m59266GQ()) {
                AbstractC23034c6.m118184v0(this, AbstractC23034c6.m118177s(), 118);
            } else if (AbstractC23238v2.m119727l()) {
                m59421eU();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: v8 */
    public void mo60246v8() {
        this.f56779N2.postDelayed(this.f56866j3, 1000L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vA */
    public void mo60247vA(boolean z11) {
        this.f56925y2 = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vD */
    public void mo60248vD(String str, String str2, String str3) {
        m92693xK().mo89692g2(SetNicknamePopupView.m56957OK(str, "", str2, str3, 50), 1051, 2, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vF */
    public boolean mo60249vF() {
        return this.f56928z1;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vG */
    public void mo60250vG() {
        try {
            this.f56793R1.m64734L2(false);
            mo59580Bi();
            mo59915Yi();
            if (this.f56872l1 != null) {
                m92649TI().mo92702G1(this.f56872l1, 2);
                this.f56872l1 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vH */
    public void mo60251vH(boolean z11) {
        this.f56767J2 = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vI */
    public void mo60252vI(C31862c c31862c, boolean z11) {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65175XM(c31862c, z11);
        }
    }

    /* renamed from: vU */
    public boolean m60253vU(C28212v6 c28212v6, View view) {
        try {
            if (getContext() != null) {
                C17945a0 m59363UP = m59363UP(c28212v6, view);
                if (m59363UP != null) {
                    C27145l1.f127862a.m139249c(m92689tK(), c28212v6, m59363UP);
                }
                C25297f m59273HP = m59273HP(c28212v6, view);
                TooltipView tooltipView = new TooltipView(getContext());
                this.f56794R2 = tooltipView;
                tooltipView.setTooltipId(c28212v6.f131577c);
                this.f56794R2.setConfigs(m59273HP);
                this.f56794R2.m90734d0();
                this.f56794R2.setTooltipManager(this.f56782O2);
                this.f56794R2.setButtonLeftClickListener(new View.OnClickListener() { // from class: v50.e9

                    /* renamed from: q */
                    public final /* synthetic */ C28212v6 f129626q;

                    /* renamed from: r */
                    public final /* synthetic */ C17945a0 f129627r;

                    public /* synthetic */ ViewOnClickListenerC27626e9(C28212v6 c28212v62, C17945a0 m59363UP2) {
                        r2 = c28212v62;
                        r3 = m59363UP2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatView.this.m59301KS(r2, r3, view2);
                    }
                });
                this.f56794R2.setOnTooltipShowHideListener(new C11271b(c28212v62, m59363UP2));
                this.f56794R2.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: v50.g9

                    /* renamed from: b */
                    public final /* synthetic */ C28212v6 f129675b;

                    /* renamed from: c */
                    public final /* synthetic */ C17945a0 f129676c;

                    public /* synthetic */ C27656g9(C28212v6 c28212v62, C17945a0 m59363UP2) {
                        r2 = c28212v62;
                        r3 = m59363UP2;
                    }

                    @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
                    /* renamed from: a */
                    public final void mo66113a(TooltipView tooltipView2, int i11, int i12, boolean z11) {
                        ChatView.this.m59308LS(r2, r3, tooltipView2, i11, i12, z11);
                    }
                });
                this.f56794R2.m90733c0();
                if (c28212v62.f131575a == 0) {
                    AbstractC28025b8.m141440K(c28212v62.f131577c, true);
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: va */
    public void mo60254va(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("uid_set_hidden_chat", str);
        bundle.putInt("case_passcode_process", 2);
        m60278xU(CodeLockMessageView.class, bundle, 1042, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vk */
    public void mo60255vk(boolean z11) {
        int i11;
        if (this.f56853g2) {
            ChatSearchToolbarView chatSearchToolbarView = this.f56869k2;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            chatSearchToolbarView.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vl */
    public void mo60256vl() {
        try {
            this.f56793R1.m64819t2();
            this.f56793R1.m64822u2();
            this.f56868k1 = null;
            m60020gQ().mo60618P7(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vm */
    public boolean mo60257vm() {
        return this.f56793R1.m64806p1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vu */
    public void mo60258vu() {
        if (m60020gQ().mo60581Ij(true)) {
            m92649TI().m93060e2(0, SelfDeleteConversationConfigView.Companion.m84035a(m60020gQ().mo60615Oc().m17944I0()), "SelfDeleteConversationC", 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: vy */
    public void mo60259vy() {
        C11621p0 c11621p0;
        ChatFrameLayout chatFrameLayout;
        if (!this.f56769K1 && (c11621p0 = this.f56793R1) != null && (chatFrameLayout = c11621p0.f60408d) != null) {
            chatFrameLayout.m59160C0();
            this.f56769K1 = true;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: w5 */
    public boolean mo60260w5() {
        JumpDownFloatingView jumpDownFloatingView = this.f56768J3;
        if (jumpDownFloatingView != null && jumpDownFloatingView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: w7 */
    public void mo60261w7(ArrayList arrayList, String str) {
        Bundle bundle = new Bundle();
        bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 9);
        bundle.putStringArrayList("STR_EXTRA_SELECTED_UIDS", arrayList);
        bundle.putString("extra_preload_data", QuickCreateGroupView.m83234GM(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_select_member)));
        bundle.putString("STR_SOURCE_START_VIEW", str);
        bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
        m59538wU(QuickCreateGroupView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: w9 */
    public boolean mo60262w9() {
        return this.f56793R1.m64795m1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: wD */
    public void mo60263wD(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 25);
        bundle.putString("USER_ID_TO_UN_MUTE", str);
        bundle.putString("USER_NAME_TO_UN_MUTE", str2);
        m60278xU(FrameLayoutKeepBtmSheetZaloView.class, bundle, 0, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: wE */
    public void mo60264wE(boolean z11) {
        ChatInfoView chatInfoView = this.f56812W0;
        if (chatInfoView != null) {
            chatInfoView.m65173WM(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: wG */
    public void mo60265wG(String str, ArrayList arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_BOOLEAN_FORWARD_MULTI_MESSAGES", true);
        bundle.putParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING", arrayList);
        bundle.putString("forwardMessageOwnerUid", str);
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putBoolean("btn_extra_show_hide_post_feed", true);
        bundle.putString("STR_SOURCE_START_VIEW", "csc_msg_multiselect");
        bundle.putString("STR_LOG_CHAT_TYPE", this.f56784P0.mo60638S2());
        AbstractC19656s0.m103072o(m92692wK(), bundle, 1048);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: wJ */
    public boolean mo49160wJ() {
        return true;
    }

    /* renamed from: wP */
    public void m60266wP() {
        Rect reactionRect;
        if (AbstractC28025b8.f130838O) {
            this.f56779N2.removeMessages(123459);
            ShowcaseView showcaseView = this.f56786P2;
            if (showcaseView != null && showcaseView.isShown() && (this.f56786P2.getTargetView() instanceof InterfaceC11475g0) && TextUtils.equals(this.f56786P2.getShowcaseId(), "tip.csc.reaction.button") && ((reactionRect = ((InterfaceC11475g0) this.f56786P2.getTargetView()).getReactionRect()) == null || reactionRect.isEmpty())) {
                mo59917Yo("tip.csc.reaction.button");
            } else {
                this.f56779N2.sendEmptyMessageDelayed(123459, 200L);
            }
        }
    }

    /* renamed from: wQ */
    public void m60267wQ() {
        PinTopicBanner pinTopicBanner = this.f56772L1;
        if (pinTopicBanner != null && pinTopicBanner.getVisibility() != 8) {
            this.f56772L1.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: wf */
    public void mo60268wf(boolean z11) {
        int top;
        if (this.f56792R0 != null && this.f56800T0 != null && !mo60294yp()) {
            int mo59968co = mo59968co();
            int i11 = 0;
            if (!z11 && !this.f56784P0.mo60764m8()) {
                int m9745c2 = this.f56800T0.m9745c2();
                View mo9732P = this.f56800T0.mo9732P(m9745c2);
                if (mo9732P != null) {
                    i11 = mo9732P.getTop();
                }
                int paddingTop = i11 - this.f56796S0.getPaddingTop();
                mo60171q5();
                this.f56800T0.m9721B2(m9745c2, paddingTop);
                return;
            }
            int m9745c22 = this.f56800T0.m9745c2();
            View mo9732P2 = this.f56800T0.mo9732P(m9745c22);
            if (mo9732P2 == null) {
                top = 0;
            } else {
                top = mo9732P2.getTop();
            }
            int paddingTop2 = top - this.f56796S0.getPaddingTop();
            mo60171q5();
            this.f56800T0.m9721B2(m9745c22 + (mo59968co() - mo59968co), paddingTop2);
            this.f56784P0.mo60635Rl(false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: wl */
    public void mo60269wl() {
        TextView textView = this.f56752F3;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: wn */
    public void mo60270wn(List list, int i11) {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null) {
            c11621p0.m64820t3(list, i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: wv */
    public void mo60271wv(String str, String str2, AbstractC28207v1.h0 h0Var, C31877d c31877d) {
        m60291yT(this, str, 3, str2, h0Var, "", mo59777Pp(str, str2), c31877d);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: ww */
    public void mo60272ww() {
        if (mo59727Ly()) {
            this.f56816X0.m62814aN();
        } else {
            mo60171q5();
        }
        MessageContextMenuView messageContextMenuView = this.f56820Y0;
        if (messageContextMenuView != null) {
            messageContextMenuView.m62731vM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        this.f56784P0.mo60643U(i11, objArr);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: x4 */
    public boolean mo60273x4() {
        C11621p0 c11621p0 = this.f56793R1;
        if (c11621p0 != null && c11621p0.m64753Y0()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: x5 */
    public void mo60274x5(int i11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_asset_path", str);
        bundle.putInt("extra_effect_type", i11);
        bundle.putString("extra_metadata_name", "metadata");
        bundle.putString("extra_play_params", "");
        bundle.putBoolean("extra_keyboard_showing", false);
        m59538wU(Cocos2dxLoadingView.class, bundle, 0);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: x7 */
    public void mo60275x7() {
        C2852a1.m13746d();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        C23475l.m123241e((byte) 3, "onActivityCreated");
        this.f56784P0.mo60533Af(C27675hd.m140768a(bundle));
        this.f56784P0.mo60785qd();
        C23475l.m123240d().m123242a("onActivityCreated");
        C23475l.m123240d().m123243b();
    }

    /* renamed from: xQ */
    public void m60276xQ() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null) {
            abstractPushToTalkControl.mo87651d();
        }
    }

    /* renamed from: xT */
    public void m60277xT(C25630b c25630b, int i11, boolean z11, boolean z12) {
        try {
            Bundle bundle = new Bundle();
            bundle.putSerializable("gifInfo", c25630b);
            bundle.putBoolean("showButtons", z11);
            bundle.putBoolean("canceledOnTouchOutside", z12);
            bundle.putInt("source", i11);
            m59537wT(bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: xU */
    public void m60278xU(Class cls, Bundle bundle, int i11, int i12, boolean z11) {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(cls, bundle, i11, i12, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xa */
    public boolean mo60279xa(String str) {
        ShowcaseView showcaseView = this.f56786P2;
        if (showcaseView != null && showcaseView.getParent() != null && TextUtils.equals(this.f56786P2.getShowcaseId(), str)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xe */
    public Object mo60280xe(int i11) {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null) {
            return c11603g0.m60492f0(i11);
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xj */
    public void mo60281xj() {
        C27043b c27043b = this.f56793R1.f60448x;
        if (c27043b != null) {
            c27043b.m139207R(-1);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xk */
    public void mo60282xk() {
        try {
            m60020gQ().mo60698ch(-1);
            mo59692Ji(true);
            if (this.f56853g2) {
                mo59580Bi();
                this.f56853g2 = false;
                mo59646G9();
                invalidateOptionsMenu();
                this.f56784P0.mo60701cp();
                mo59663H7("");
                mo59806Rh();
                mo59573BB(true);
                if (this.f56924y1) {
                    mo59915Yi();
                    if (this.f56784P0.mo60837xo() && mo60148ob()) {
                        mo60094l7(0, false);
                    } else {
                        mo60094l7(1, false);
                    }
                }
                if (m59312MQ()) {
                    if (!this.f56793R1.m64829x0().m70159S0()) {
                        AbstractC2379w.m12430d(this.f56788Q0);
                    }
                    this.f56793R1.m64829x0().m70141E0();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xm */
    public void mo60283xm(boolean z11) {
        this.f56793R1.m64736M2(z11);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xo */
    public void mo60284xo(ArrayList arrayList, String str, String str2) {
        C23459d.f113954a.m123168j(this.f72421L0, arrayList, str, str2);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xq */
    public void mo60285xq(String str) {
        AnimChat animChat = this.f56762I1;
        if (animChat != null) {
            animChat.m76124w0(str);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: xs */
    public void mo60286xs(int i11, String str, String str2, int i12) {
        try {
            if (i12 == 1) {
                m59290JP(i11, str, str2, this.f56882n3);
            } else if (i12 == 2) {
                this.f56882n3.m92774j(AbstractC23136l9.m118721k(m92689tK(), i11, str, str2));
            } else {
                m59290JP(i11, str, "", this.f56882n3);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: y */
    public String mo60287y() {
        return this.f72829D0;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: y5 */
    public void mo60288y5() {
        try {
            mo60240ul(132);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: y6 */
    public void mo60289y6() {
        PackageManager packageManager = MainApplication.getAppContext().getPackageManager();
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        if (intent.resolveActivityInfo(packageManager, 0) != null && !mo60124n3()) {
            startActivityForResult(intent, 1026);
        } else {
            ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
        }
    }

    /* renamed from: yQ */
    public void m60290yQ(boolean z11) {
        if (this.f56789Q1 != null && this.f56784P0.mo60837xo()) {
            this.f56793R1.m64707B0(z11);
        }
    }

    /* renamed from: yT */
    public void m60291yT(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
        try {
            this.f56784P0.mo60645U9(zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yb */
    public void mo60292yb() {
        Editable editableText;
        try {
            ActionEditText actionEditText = this.f56832b1;
            if (actionEditText == null || (editableText = actionEditText.getEditableText()) == null) {
                return;
            }
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editableText.getSpans(0, editableText.length(), ForegroundColorSpan.class);
            if (foregroundColorSpanArr != null) {
                for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                    if (!(foregroundColorSpan instanceof MentionSpan)) {
                        editableText.removeSpan(foregroundColorSpan);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yc */
    public void mo60293yc(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f56902s3;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setNotiRedotMarginTop(AbstractC23136l9.m118742r(12.0f));
            this.f56902s3.setNotiRedotMarginRight(AbstractC23136l9.m118742r(8.0f));
            this.f56902s3.setRedDotColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.badge_background_red));
            this.f56902s3.setReddotRadius(AbstractC23222t7.f112558f);
            this.f56902s3.setEnableNoti(z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yp */
    public boolean mo60294yp() {
        if (!m92677nJ() && !m92681pJ()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yu */
    public void mo60295yu(String str, String str2, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        bundle.putString("STR_LOG_CHAT_TYPE", m60004fQ());
        bundle.putBoolean("EXTRA_IS_COMMUNITY", z11);
        m59538wU(GroupCalendarView.class, bundle, 1);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yv */
    public boolean mo60296yv() {
        return this.f56793R1.m64786j1();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: z */
    public void mo60297z(boolean z11, List list) {
        int i11;
        String m118743r0;
        int i12;
        if (z11) {
            if (list == null) {
                return;
            }
            int size = list.size();
            View m92691vK = m92691vK();
            if (size > 1) {
                if (this.f56784P0.mo60540Bd()) {
                    i12 = AbstractC8020f0.str_snackbar_title_undo_deleting_multiple_items;
                } else {
                    i12 = AbstractC8020f0.str_snackbar_title_undo_deleting_multiple_messages;
                }
                m118743r0 = AbstractC23136l9.m118746s0(i12, Integer.valueOf(size));
            } else {
                if (this.f56784P0.mo60540Bd()) {
                    i11 = AbstractC8020f0.str_snackbar_title_undo_deleting_single_item;
                } else {
                    i11 = AbstractC8020f0.str_snackbar_title_undo_deleting_single_message;
                }
                m118743r0 = AbstractC23136l9.m118743r0(i11);
            }
            C31950hc c31950hc = C31950hc.f146830a;
            this.f56773L2 = Snackbar.m90634w(m92691vK, m118743r0, c31950hc.m153645x());
            if (mo59907YG()) {
                m59911YT(this.f56856h1);
            } else {
                C11621p0 c11621p0 = this.f56793R1;
                if (c11621p0 != null && c11621p0.m64789k1()) {
                    this.f56793R1.m64749U2();
                } else {
                    m59911YT(this.f56824Z0);
                }
            }
            this.f56773L2.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: v50.v7

                /* renamed from: q */
                public final /* synthetic */ List f130105q;

                public /* synthetic */ ViewOnClickListenerC27866v7(List list2) {
                    r2 = list2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatView.this.m59550yS(r2, view);
                }
            });
            this.f56773L2.m90641G(true);
            this.f56773L2.m90648N();
            c31950hc.m153638L("csc_msgmenu", 1, "msg_chat_delete_undo_toast", list2, null);
            return;
        }
        Snackbar snackbar = this.f56773L2;
        if (snackbar != null) {
            snackbar.m90655n();
        }
    }

    /* renamed from: z3 */
    public void m60298z3(int i11) {
        ChatComposePanelNew chatComposePanelNew;
        try {
            this.f56924y1 = true;
            if (m92672lJ()) {
                ChatComposePanelNew chatComposePanelNew2 = this.f56819X3;
                if (chatComposePanelNew2 != null) {
                    if (!chatComposePanelNew2.m75574B() && !this.f56819X3.m75575C() && !this.f56819X3.m75577E()) {
                    }
                }
                if (!AbstractC22470k.m116161m() && !mo59873Vj() && !m59772PQ()) {
                    RemindChatMessageView remindChatMessageView = this.f56827Z3;
                    if (remindChatMessageView != null && remindChatMessageView.m92672lJ()) {
                        return;
                    }
                    this.f56784P0.mo60616Og();
                    if (i11 > 0 && (chatComposePanelNew = this.f56819X3) != null) {
                        chatComposePanelNew.m75602i0();
                    }
                    int i12 = this.f56846e3;
                    if (i12 == 4 || i12 == 0 || i12 == 6 || i12 == 7 || i12 == 8 || i12 == 9 || mo60148ob()) {
                        if (this.f56853g2) {
                            mo60094l7(5, false);
                        } else if ((this.f56793R1.m64824v0() == null || !this.f56793R1.m64824v0().m88353z(8388613)) && this.f56819X3 != null && !(this.f56788Q0.findFocus() instanceof ZinstantInputText)) {
                            mo60094l7(1, false);
                        }
                    }
                    mo60028gz();
                    try {
                        if (m92676n2() != null && m92676n2().getWindow() != null) {
                            C24559a.m127933c("[KeyboardInfo]", "onKeyboardShown, softInputMode: " + m92676n2().getWindow().getAttributes().softInputMode + "currentStateInput: " + mo60194rc());
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    this.f56793R1.m64808p3(false);
                    return;
                }
            }
            C22423y.m115857j(new InterfaceC18494a() { // from class: v50.ha
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m59339QR;
                    m59339QR = ChatView.m59339QR();
                    return m59339QR;
                }
            });
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ChatView", e12);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: z5 */
    public void mo60299z5() {
        mo78955kl(new Runnable() { // from class: v50.e8
            public /* synthetic */ RunnableC27625e8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59319NR();
            }
        }, 300L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: z8 */
    public void mo60300z8() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.remove("STR_EXTRA_JUMP_TO_MESSAGE_ID");
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zB */
    public boolean mo60301zB() {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f56860i1;
        if (abstractPushToTalkControl != null && abstractPushToTalkControl.m87656i()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zD */
    public void mo60302zD(String str, String str2, String str3) {
        AbstractC23152n3.m119065r(m92676n2(), str, str2, str3);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zG */
    public void mo60303zG(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("case_passcode_process", 3);
        bundle.putString("EXTRA_MSG_RESULT_VERIFY", str);
        m60278xU(PasscodeView.class, bundle, 1060, 1, true);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zI */
    public void mo60304zI(MessageId messageId) {
        if (this.f56792R0 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setWhereLeftSeparator(");
        sb2.append(messageId);
        sb2.append(")");
        this.f56792R0.m60477I0(messageId);
        if (messageId != null) {
            this.f56792R0.m64561h2();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: zK */
    public void mo60305zK(Bundle bundle) {
        super.mo60305zK(bundle);
        try {
            if (bundle == null) {
                CoreUtility.m93148a().mo100074a(new Exception("Wrong chat argument: Argument is null. Current uid empty? " + TextUtils.isEmpty(CoreUtility.f89233i)));
            } else if (TextUtils.isEmpty(bundle.getString("extra_chat_profile_uid"))) {
                CoreUtility.m93148a().mo100074a(new Exception("Wrong chat argument: UID is null or empty. Current uid empty? " + TextUtils.isEmpty(CoreUtility.f89233i)));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: zT */
    public void m60306zT(boolean z11) {
        try {
            if (z11) {
                AbstractC23309i.m122299px(1);
                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_hint_enable_smsIntegration_success));
            } else {
                mo60240ul(120);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: zU */
    void m60307zU() {
        try {
            ActionEditText actionEditText = this.f56832b1;
            if (actionEditText != null) {
                actionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f56832b1.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zb */
    public void mo60308zb() {
        this.f56793R1.m64807p2();
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zf */
    public boolean mo60309zf() {
        C11603g0 c11603g0 = this.f56792R0;
        if (c11603g0 != null && c11603g0.m60495i0() != mo59736Mm()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zg */
    public void mo60310zg(int i11) {
        if (this.f56808V0 == null) {
            this.f56808V0 = this.f56793R1.f60408d.m59168H();
        }
        this.f56808V0.f60982M.mo89109M0(new C16719g.c() { // from class: v50.ua

            /* renamed from: q */
            public final /* synthetic */ int f130042q;

            public /* synthetic */ C27855ua(int i112) {
                r2 = i112;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ChatView.this.m59450jR(r2, c16719g);
            }
        });
        this.f56808V0.f60983N.mo89109M0(new C16719g.c() { // from class: v50.va

            /* renamed from: q */
            public final /* synthetic */ int f130109q;

            public /* synthetic */ C27869va(int i112) {
                r2 = i112;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ChatView.this.m59458kR(r2, c16719g);
            }
        });
        this.f56808V0.f60980K.mo44614b1(0);
        this.f56808V0.setType(i112);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zk */
    public void mo60311zk(int i11, C8969o c8969o) {
        if (this.f56796S0 != null) {
            for (int i12 = 0; i12 < this.f56796S0.getChildCount(); i12++) {
                View childAt = this.f56796S0.getChildAt(i12);
                if (childAt instanceof ChatRowLiveLocation) {
                    ChatRowLiveLocation chatRowLiveLocation = (ChatRowLiveLocation) childAt;
                    if (chatRowLiveLocation.getMessage() != null && chatRowLiveLocation.getMessage().m94929K2() != null && (chatRowLiveLocation.getMessage().m94929K2() instanceof C17996r0) && ((C17996r0) chatRowLiveLocation.getMessage().m94929K2()).f91147B == c8969o.f47980a) {
                        if (i11 == 2) {
                            C23744a.m124114c().m124116d(4, m60020gQ().mo60615Oc().m17944I0());
                            return;
                        } else {
                            C23744a.m124114c().m124116d(5, m60020gQ().mo60615Oc().m17944I0());
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zq */
    public void mo60312zq(String str) {
        mo78955kl(new Runnable() { // from class: v50.w7

            /* renamed from: q */
            public final /* synthetic */ String f130131q;

            public /* synthetic */ RunnableC27880w7(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatView.this.m59558zS(r2);
            }
        }, 500L);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zr */
    public void mo60313zr() {
        NotifyCallSettingBanner notifyCallSettingBanner = this.f56808V0;
        if (notifyCallSettingBanner != null) {
            notifyCallSettingBanner.setVisibility(8);
            this.f56793R1.f60408d.removeView(this.f56808V0);
            this.f56793R1.f60408d.f56687V = null;
            this.f56808V0 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zu */
    public boolean mo60314zu() {
        PinTopicBanner pinTopicBanner = this.f56772L1;
        if (pinTopicBanner != null && pinTopicBanner.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zv */
    public void mo60315zv() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_csc_group_menu_avatar", "group_avatar"));
        AbstractC23211s7.m119589v(m92676n2(), 1019, 7, true, bundle);
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zw */
    public boolean mo60316zw(int i11) {
        KeyEventCallbackC17462c m92594JK;
        try {
            ZaloView m92996E0 = m92649TI().m92996E0("CHAT_DIALOG_VIEW_" + i11);
            if (!(m92996E0 instanceof ChatDialogView) || (m92594JK = ((ChatDialogView) m92996E0).m92594JK()) == null) {
                return false;
            }
            if (!m92594JK.m92868m()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: zz */
    public boolean mo60317zz() {
        return this.f56819X3.m75573A();
    }
}
