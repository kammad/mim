package org.motechproject.nms.api.web;

import org.apache.commons.lang.NotImplementedException;

import org.motechproject.nms.api.web.contract.mobileAcademy.BookmarkRequest;
import org.motechproject.nms.api.web.contract.mobileAcademy.BookmarkResponse;
import org.motechproject.nms.api.web.contract.mobileAcademy.CallDetails;
import org.motechproject.nms.api.web.contract.mobileAcademy.CourseResponse;
import org.motechproject.nms.api.web.contract.mobileAcademy.CourseVersionResponse;
import org.motechproject.nms.mobileacademy.service.MobileAcademyService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Mobile Academy controller
 */
@RequestMapping("mobileacademy")
@Controller
public class MobileAcademyController extends BaseController {

    /**
     * MA service to handle all business logic
     */
    private MobileAcademyService mobileAcademyService;

    /**
     * Get course
     * @return course response object
     */
    @RequestMapping(
            value = "/course",
            method = RequestMethod.GET)
    @ResponseBody
    public CourseResponse getCourse() {

        return new CourseResponse();
    }

    /**
     * Get the version of the course
     * @return Integer represting the timestamp since epoch
     */
    @RequestMapping(
            value = "/courseVersion",
            method = RequestMethod.GET)
    @ResponseBody
    public CourseVersionResponse getCourseVersion() {
        
        return new CourseVersionResponse(mobileAcademyService.getCourseVersion());
    }

    /**
     * Get bookmark for a user
     * @param callingNumber number of the caller
     * @param callId unique tracking id for the call
     * @return serialized json bookmark response
     */
    @RequestMapping(
            value = "/bookmarkWithScore",
            method = RequestMethod.GET)
    public BookmarkResponse getBookmarkWithScore(@RequestParam Long callingNumber,
                                                 @RequestParam Long callId) {

        return new BookmarkResponse();
    }

    /**
     * Save a bookmark for a user
     * @param bookmarkRequest info about the user for bookmark save
     * @return OK or exception
     */
    @RequestMapping(
            value = "/bookmarkWithScore",
            method = RequestMethod.POST)
    @ResponseBody
    public void saveBookmarkWithScore(@RequestBody BookmarkRequest bookmarkRequest) {

        // placeholder for void returns
        throw new NotImplementedException();
    }

    /**
     * Save call related metadata after the completion of the call
     * @param callDetails call details
     * @return OK or exception
     */
    @RequestMapping(
            value = "/callDetails",
            method = RequestMethod.POST)
    @ResponseBody
    public void saveCallDetails(@RequestBody CallDetails callDetails) {

        // placeholder for void returns
        throw new NotImplementedException();
    }

}
