package com.bam.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.bam.exception.CustomException;

@Aspect
@Component
public class LoggerClass {

	
	//Created Logger for Intercepting Methods and logging that Information
	private static final Logger logger = LogManager.getRootLogger();


	private String intercepted = "intercepted method : ";
	private String interceptedArg = "intercepted arguments : ";
	private String dataRequest = "data request made at ";
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

	
	/**
	 * Logging Methods from the Batch service class
	 * addOrUpdateBranch()
	 * getBatchById()
	 * getBatchAll()
	 * getBatchByTrainer()
	 * @author Jonathan Layssard
	 * @throws CustomException
	 */
	@Around("execution(* com.bam.service.BatchService.addOrUpdateBatch(..))")
	public void hijackAddOrUpdateBranch(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());


		} catch ( Throwable e) {//NOSONAR
			throw new CustomException(e);
			

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.BatchService.getBatchById(..))")
	public void hijackGetBatchById(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));	
	}
	
	@Around("execution(* com.bam.service.BatchService.getBatchAll(..))")
	public void hijackGetBatchAll(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.BatchService.getBatchByTrainer(..))")
	public void hijackGetBatchByTrainer(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	
	/**
	 * Logging methods from the Curriculum Service Class
	 * getAllCurriculum()
	 * @author Jonathan Layssard
	 */
	@Around("execution(* com.bam.service.CurriculumService.getAllCurriculum(..))")
	public void hijackGetAllCurriculum(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	/**
	 * Logging methods from the EmailRun Class
	 * getUser()
	 * setUser()
	 * @author Jonathan Layssard
	 */
	@Around("execution(* com.bam.service.EmailRun.getUser(..))")
	public void hijackGetUser(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);
		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.EmailRun.setUser(..))")
	public void hijackSetUser(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);
		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	/**
	 * Logging methods from the MailService Class
	 * sendMail()
	 * @author Jonathan Layssard
	 */

	@Around("execution(* com.bam.service.MailService.sendMail(..))")
	public void hijackSendMail(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	/**
	 * Logging methods from the PasswordGenerator Class
	 * makePassword()
	 * @author Jonathan Layssard
	 */
	@Around("execution(* com.bam.service.PasswordGenerator.makePassword(..))")
	public void hijackMakePassword(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	/**
	 * Logging methods from the SubtopicService class
	 * addSubtopic()
	 * getSubtopicByBatch()
	 * getSubtopicByBatchId()
	 * updateSubtopic()
	 * getStatus()
	 * @author Jonathan Layssard
	 */
	@Around("execution(* com.bam.service.Subtopic.addSubtopic(..))")
	public void hijackAddSubtopic(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.Subtopic.getSubtopicByBatch(..))")
	public void hijackGetSubtopicByBatch(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.Subtopic.getSubtopicByBatchId(..))")
	public void hijackGetSubtopicByBatchId(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.Subtopic.updateSubtopic(..))")
	public void hijackUpdateSubtopic(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.Subtopic.getStatus(..))")
	public void hijackGetStatus(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	/**
	 * Logging Methods from the TopicService 
	 * addTopic()
	 * getTopicByBatch()
	 * getTopicByBatchId()
	 * getTopics()
	 * addOrUpdateTopicName()
	 * @author Jonathan Layssard
	 */
	@Around("execution(* com.bam.service.TopicService.addTopic(..))")
	public void hijackAddTopic(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.TopicService.getTopicByBatch(..))")
	public void hijackGetTopicByBatch(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.TopicService.getTopicByBatchId(..))")
	public void hijackGetTopicByBatchId(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.TopicService.getTopics(..))")
	public void hijackGetTopics(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.TopicService.addOrUpdateTopicName(..))")
	public void hijackAddOrUpdateTopicName(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	/**
	 * Logging Methods from UsersDetailsService class
	 * addOrUpdateUser()
	 * findAllUsers()
	 * findByRole()
	 * findUserById()
	 * findUserByEmail()
	 * findUsersInBatch()
	 * findUsersNotInBatch()
	 * loadUserByUsername()
	 * buildUserForAuthentication()
	 * buildUserAuthority()
	 * @author Jonathan Layssard
	 */
	@Around("execution(* com.bam.service.UsersDetailsService.loadUserByUsername(..))")
	public void hijackLoadUserByUsername(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.UsersDetailsService.buildUserForAuthentication(..))")
	public void hijackBuildUserForAuthentication(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.UsersDetailsService.buildUserAuthority(..))")
	public void hijackBuildUserAuthority(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.UsersService.addOrUpdateUser(..))")
	public void hijackAddOrUpdateUser(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	
	@Around("execution(* com.bam.service.UsersService.findAllUsers(..))")
	public void hijackFindAllUsers(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	

	@Around("execution(* com.bam.service.UsersDetailsService.findByRole(..))")
	public void hijackFindByRole(ProceedingJoinPoint jp)throws CustomException {
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	

	@Around("execution(* com.bam.service.UsersDetailsService.findUserById(..))")
	public void hijackFindUserById(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}


	@Around("execution(* com.bam.service.UsersDetailsService.findUserByEmail(..))")
	public void hijackFindUserByEmail(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		}
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	

	@Around("execution(* com.bam.service.UsersDetailsService.findUserInBatch(..))")
	public void hijackFindUserInBatch(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			throw new CustomException(e);

		} 
		logger.info(dataRequest + simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
  

	@Around("execution(* com.bam.service.UsersDetailsService.findUserNotInBatch(..))")
	public void hijackFindUserNotInBatch(ProceedingJoinPoint jp)throws CustomException{
		logger.info(intercepted + jp.getSignature().getName());
		logger.info(interceptedArg + Arrays.toString(jp.getArgs()));
		try {
			logger.info(jp.proceed());
		} catch (Throwable e) {//NOSONAR
			
			throw new CustomException(e);

		}
		logger.info(dataRequest +simpleDateFormat.format(new Date(System.currentTimeMillis())));
	}
	



  // Created Logger for Intercepting Methods and logging that Information 


  /**
   * Logging Methods from the Batch service class
   * addOrUpdateBranch()
   * getBatchById()
   * getBatchAll()
   * getBatchByTrainer()
   * 
   * @author Jonathan Layssard and Troy King
   */
  @Around("execution(* com.bam.service.*.*(..))")
  public Object interceptService(ProceedingJoinPoint pjp) throws Exception {
    // return to always return join point objects so they are not consumed
    Object proceedObj = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    String baseString = "(" + simpleDateFormat.format(new Date(System.currentTimeMillis())) + ")"
                        + ": " + pjp.getSignature().getDeclaringTypeName()
                        + " -> " + pjp.getSignature().getName()
                        + " " + Arrays.toString(pjp.getArgs())
                        + " => ";

    try {
      proceedObj = pjp.proceed();
      logger.info(baseString + proceedObj);
    } catch (Throwable e) {
      logger.error(baseString + e);
    }

    return proceedObj;
  }

  @Around("execution(* com.bam.controller.*.*(..))")
  public Object interceptController(ProceedingJoinPoint pjp) throws Exception {
    Object proceedObj = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    String baseString = "(" + simpleDateFormat.format(new Date(System.currentTimeMillis())) + ")"
                        + ": " + pjp.getSignature().getDeclaringTypeName()
                        + " -> " + pjp.getSignature().getName()
                        + " " + Arrays.toString(pjp.getArgs())
                        + " => ";

    try {
      proceedObj = pjp.proceed();
      logger.info(baseString + proceedObj);
    } catch (Throwable e) {
      logger.error(baseString + e);
    }

    return proceedObj;
  }

}